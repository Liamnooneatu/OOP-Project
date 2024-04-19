package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Gamespassapp extends Gamepass{
    public static void main(String[] args) {
        System.out.println("Welcome to the our GamePass");
        System.out.println();


        double totalCost = 0.0;
        // perform 1 or more selections
      //  @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the Game you would like to purchase: ");
            String GamepassCode = sc.nextLine();


            Gamepass g = GamepassDB.getGamepass(GamepassCode);

            System.out.println();
            if (g != null) {
                System.out.println("Description \n" + g.toString());
                totalCost += g.getPrice();
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("GamePass count: " + Gamepass.getCount() + "\n");
            System.out.println("Total Cost so far: " + totalCost);

            // see if the user wants to continue
            System.out.print("Continue adding more games (y/n): ");
            choice = sc.nextLine();
            System.out.println();


        }
        // Display the final total cost after the user finishes adding games
        System.out.println("You have bought: " + Gamepass.getCount() + " Games");
        System.out.println("Final Total Cost: " + totalCost);
        System.out.println("Thank you for using our GamePass App \nWe hope you enjoyed your experience.");
        System.out.println();

        System.out.print("could you please rate our Gamepass App out of 10 :) ");
        String GamepassCode = sc.nextLine();
        System.out.print("Thank you for your cooperation");

    }

}