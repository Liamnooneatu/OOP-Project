package JDBC;

import java.sql.*;
import java.util.Scanner;

public class PlaystationInsert {
    public static void main(String[] args) throws SQLException {

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gamepass", "root", "password");

        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO game (Title,Description,Cost,size_GB,Release_Date,Rating,Original_Language,Platform) VALUES (?,?,?,?,?,?,?,?)");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter new game information:\n");
            System.out.println("Title: ");
            String Title = scanner.nextLine();
            stmt.setString(1,Title);

            System.out.println("Description: ");
            String Desc = scanner.nextLine();
            stmt.setString(2,Desc);

            System.out.println("Cost: ");
            String Cost = scanner.nextLine();
            stmt.setString(3,Cost);

            System.out.println("Size(GB): ");
            String size_GB = scanner.nextLine();
            stmt.setString(4,size_GB);

            System.out.println("Release Date: ");
            String Release_Date = scanner.nextLine();
            stmt.setString(5,Release_Date);

            System.out.println("Rating: ");
            String Rating = scanner.nextLine();
            stmt.setString(6,Rating);

            System.out.println("Language: ");
            String Original_Language = scanner.nextLine();
            stmt.setString(7,Original_Language);

            stmt.setString(8,"Playstation");
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
