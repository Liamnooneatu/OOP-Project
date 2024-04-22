package JDBC;

import java.sql.*;
import java.util.Scanner;

public class CustomerInsert {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gamepass", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO customer (First_Name,last_name,age,email,Username,Phone,Gender,Date_of_birth) VALUES (?,?,?,?,?,?,?,?)");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Customer information:\n");
            System.out.println("First Name: ");
            String fName = scanner.nextLine();
            stmt.setString(1,fName);

            System.out.println("Last Name: ");
            String lName = scanner.nextLine();
            stmt.setString(2,lName);

            System.out.println("Age: ");
            String Age = scanner.nextLine();
            stmt.setString(3,Age);

            System.out.println("Email: ");
            String email = scanner.nextLine();
            stmt.setString(4,email);

            System.out.println("Username: ");
            String uName = scanner.nextLine();
            stmt.setString(5,uName);

            System.out.println("Phone: ");
            String phoneNo = scanner.nextLine();
            stmt.setString(6,phoneNo);

            System.out.println("Gender: ");
            String Gender = scanner.nextLine();
            stmt.setString(7,Gender);

            System.out.println("Date of Birth: ");
            String dob = scanner.nextLine();
            stmt.setString(8,dob);
            stmt.executeUpdate();

            System.out.println("Insert completed successfully");
        } catch(SQLException ex){
            System.out.println("Record insert failed");
            ex.printStackTrace();
        }
        conn.close();
    }

    private static int getLastInsertId(Connection conn) throws SQLException{
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID()");
        rs.next();
        int id = rs.getInt(1);
        rs.close();
        stmt.close();
        return id;
    }
}
