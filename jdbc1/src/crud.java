
import java.sql.*;
import java.util.Scanner;



public class crud {

    static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info", "root", "root5113");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    static Scanner sc = new Scanner(System.in);
    static crud obj = new crud();


    public static void main(String[] args) {


        System.out.println("choose option:  1.create table .2.insert data .3.readdata .4.read data by id .5.update data .6.delete data .7.drop table");
        int opt = Integer.parseInt(sc.nextLine());
        switch (opt) {
            case 1:
                obj.create();
                break;
            case 2:
                obj.insertdata();
                break;
            case 3:
                obj.read();
            case 4:
                obj.readdata();
                break;
            case 5:
                obj.updatedata();
                break;
            case 6:
                obj.deletedata();
                break;
            case 7:
                obj.drop();
                break;

        }

    }

    //create table
    public void create() {
        try {
            System.out.println("enter table name and structure to create ");
            Statement st = con.createStatement();
            String str = sc.nextLine();
            String stm = "create table " + str;
            st.executeUpdate(stm);
            System.out.println("table created succesfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //insert data into table
    public void insertdata() {

        try {
            String sql_st = "insert into emp values(?,?,?);";

            PreparedStatement st = con.prepareStatement(sql_st);


            System.out.println("enter employee id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("enter employee name:");
            String name = sc.nextLine();
            System.out.println("enter employee salary:");
            int sal = Integer.parseInt(sc.nextLine());

            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, sal);

            int row = st.executeUpdate();
            if (row > 0) {
                System.out.println("data inserted");
            } else {
                System.out.println("not inserted");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    //read data from table
    public void read() {
        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int sal = rs.getInt(3);
                System.out.println("id=" + id + "name=" + name + "salary=" + sal);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //read data from table based on id
    public void readdata() {

        try {
            System.out.println("enter employee id");
            int empid = Integer.parseInt(sc.next());

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp where id = " + empid);

            if (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int sal = rs.getInt(3);
                System.out.println("id:" + id + "name:" + name + "sal:" + sal);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //update table
    public void updatedata() {
        String sql = "UPDATE emp SET name = ?, sal = ? WHERE id = ?";
        try (PreparedStatement st = con.prepareStatement(sql)) {
            System.out.println("Enter employee ID to update: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Enter new name: ");
            String name = sc.nextLine();
            System.out.println("Enter new salary: ");
            int sal = Integer.parseInt(sc.nextLine());

            st.setString(1, name);
            st.setInt(2, sal);
            st.setInt(3, id);

            int row = st.executeUpdate();
            if (row > 0) {
                System.out.println("Data updated successfully.");
            } else {
                System.out.println("Failed to update data or employee not found.");
            }
        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
        }
    }

    //delete rows from tables based on id
    public void deletedata() {
        try {
            System.out.println("enter employee id");
            int id = sc.nextInt();
            String sql_st = "delete from emp where id = ?";
            PreparedStatement st = con.prepareStatement(sql_st);
            st.setInt(1, id);
            int row = st.executeUpdate();

            if (row > 0) {
                System.out.println("data deleted");
            } else {
                System.out.println(" data not deleted");
            }

            System.out.println("deleted succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void drop(){
        try {
            Statement st = con.createStatement();
            String sql_st = sc.next();
            String stm = "drop table " + sql_st;
            st.executeUpdate(stm);
            System.out.println("table dropped succesfully ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
