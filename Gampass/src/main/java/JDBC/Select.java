package JDBC;

import java.sql.*;

public class Select {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/gamepass";
        String username = "root";
        String password = "password";

        String selectSQL = "SELECT Title, Description, Cost, size_GB FROM game; ";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL)){

            while (resultSet.next()) {
                String Title = resultSet.getString("Title");
                String Des = resultSet.getString("Description");
                String cost = resultSet.getString("Cost");
                String size = resultSet.getString("size_GB");

                System.out.println("Title: " + Title + ", Description " + Des + ", Cost: " + cost + "Size GB: "+ size);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
