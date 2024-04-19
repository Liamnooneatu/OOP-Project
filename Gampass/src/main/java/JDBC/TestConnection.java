package JDBC;
import java.sql.*;

public class TestConnection {

    public static void main(String[] args) {

        Connection connection = null;
        try
        {
            // Load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection to the database, hardcoding values for now.
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamepass", "root", "password");
            System.out.println("Connection made to connection pool");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally
        {
            // Close the connection when finished
            if (connection != null) {
                try
                {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
