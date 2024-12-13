import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("enter table name and structure to create ");
            Scanner sc = new Scanner(System.in);
            String stm = sc.nextLine();

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","root5113");
            String sql_st = "create table "+stm;
            Statement ps = con.createStatement();
            ps.executeUpdate(sql_st);
            System.out.println("table created succesfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}