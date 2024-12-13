//code to insert data into table using loop

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class loop{
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata","root","root5113");
            Statement st = con.createStatement();
           // st.executeUpdate("create table emp(id int primary key, name varchar(32) not null, sal int not null, age int)");
            //System.out.println("table created succesfully");

            //insert data using for loop
            for (int i = 1; i <=10 ; i++) {
                String name = "employee"+i;
                int sal = 25000+(i*369);
                int age = 25+i;
                st.executeUpdate("insert into emp values("+i+",'"+name+"',"+sal+","+age+")");
            }
            System.out.println("table created succesfully");
            st.close();
            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


class dt{
    public static void main(String[] args) {
        try {
            System.out.println("enter table name to drop");
            Scanner sc = new Scanner(System.in);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata","root","root5113");
            Statement st = con.createStatement();
            String stm = sc.next();
            String sql_stm = "drop table " + stm;
            st.executeUpdate(sql_stm);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


class read{
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdata","root","root5113");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int sal = rs.getInt(3);
                float age = rs.getInt(4);
                System.out.println("id="+id+"//name="+name+"//salary="+sal+"//age="+age);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}