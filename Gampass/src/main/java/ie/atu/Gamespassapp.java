package ie.atu;

import java.sql.*;
import java.util.Scanner;

public class Gamespassapp extends Gamepass {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gamepass";
        String username = "root";
        String password = "password";

        System.out.println("Welcome to our GamePass");
        System.out.println();

        // Define the platform options and their corresponding SQL queries
        String[] platforms = {"XBOX", "PC", "Playstation"};
        String[] queries = {
                "SELECT * FROM game WHERE Platform = 'XBOX'",
                "SELECT * FROM game WHERE Platform = 'PC'",
                "SELECT * FROM game WHERE Platform = 'Playstation'"
        };

        // Display platform options
        System.out.println("Please select the platform:");
        for (int i = 0; i < platforms.length; i++) {
            System.out.println((i + 1) + ". " + platforms[i]);
        }

        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();

        if (choice >= 1 && choice <= platforms.length) {
            String selectSQL = queries[choice - 1]; // Get the corresponding SQL query based on user's choice

            try (Connection connection = DriverManager.getConnection(url, username, password);
                 Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSQL)) {

                while (resultSet.next()) {
                    String title = resultSet.getString("Title");
                    String description = resultSet.getString("Description");
                    double cost = resultSet.getDouble("Cost");
                    double sizeGB = resultSet.getDouble("size_GB");

                    System.out.println("Title: " + title + ", Description: " + description + ", Cost: " + cost + ", Size GB: " + sizeGB);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
