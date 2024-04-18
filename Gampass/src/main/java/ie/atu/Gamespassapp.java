package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Gamespassapp {
    public static void main(String[] args) {
        System.out.println("Welcome to the our GamePass");
        System.out.println();

        // perform 1 or more selections
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter the Game you would like to purchase: ");
            String GamepassCode = sc.nextLine();  // read the product code

            // get the Product object "p"
            Gamepass g = GamepassDB.getGamepass(GamepassCode);

            System.out.println();
            if (g != null) {
                System.out.println("Description \n" + g.toString());
            } else {
                System.out.println("No product matches this product code.");
            }

            System.out.println();
            System.out.println("GamePass count: " + Gamepass.getCount() + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }

    }
}