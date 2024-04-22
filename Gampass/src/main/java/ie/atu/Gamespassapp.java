package ie.atu;

import java.sql.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Gamespassapp extends Gamepass{
        public static void main(String[]args) {
            String url = "jdbc:mysql://localhost:3306/gamepass";
            String username = "root";
            String password = "password";

            System.out.println("Welcome to the our GamePass");
            System.out.println();

            System.out.println("Please select what platform you would like to Search For:\nA-XBOX\nB-PC\nC-Playstation");
            Scanner userInput = new Scanner(System.in);
            String input = userInput.nextLine();

            if (input.equalsIgnoreCase("A")) {

                String selectSQL = "SELECT * FROM game WHERE Platform = 'XBOX';";

                try (Connection connection = DriverManager.getConnection(url, username, password);
                     Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(selectSQL)) {

                    while (resultSet.next()) {
                        String Title = resultSet.getString("Title");
                        String Des = resultSet.getString("Description");
                        String cost = resultSet.getString("Cost");
                        String size = resultSet.getString("size_GB");

                        System.out.println("Title: " + Title + ", Description " + Des + ", Cost: " + cost + ", Size GB: " + size);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(input.equalsIgnoreCase("B")){
                String selectSQL = "SELECT * FROM game WHERE Platform = 'PC';";

                try (Connection connection = DriverManager.getConnection(url, username, password);
                     Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(selectSQL)) {

                    while (resultSet.next()) {
                        String Title = resultSet.getString("Title");
                        String Des = resultSet.getString("Description");
                        String cost = resultSet.getString("Cost");
                        String size = resultSet.getString("size_GB");

                        System.out.println("Title: " + Title + ", Description " + Des + ", Cost: " + cost + ", Size GB: " + size);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if(input.equalsIgnoreCase("C")){
                String selectSQL = "SELECT * FROM game WHERE Platform = 'Playstation';";

                try (Connection connection = DriverManager.getConnection(url, username, password);
                     Statement statement = connection.createStatement();
                     ResultSet resultSet = statement.executeQuery(selectSQL)) {

                    while (resultSet.next()) {
                        String Title = resultSet.getString("Title");
                        String Des = resultSet.getString("Description");
                        String cost = resultSet.getString("Cost");
                        String size = resultSet.getString("size_GB");

                        System.out.println("Title: " + Title + ", Description " + Des + ", Cost: " + cost + ", Size GB: " + size);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }