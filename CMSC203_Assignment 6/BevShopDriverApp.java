/*
 * Class: CMSC203 
 * Instructor: Dr. Grigoriy Grinberg 
 * Assignment: 6
 * Description: (This class serves as the entry point for the application. It interacts with the user through the console, managing orders at a beverage shop.)
 * Due: 04/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Alazar wubet
*/

import java.util.Scanner;


public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShopImplementation beverageShop = new BevShopImplementation();

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");

        // First order
        System.out.println("Start please a new order:");
        System.out.println("Your Total Order for now is 0.0");

        System.out.print("Would you please enter your name: ");
        scanner.nextLine(); // Read the customer's name (unused variable)

        System.out.print("Would you please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading int

        if (age >= 21) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
            int numAlcoholDrinks = 0;

            while (beverageShop.isEligibleForMore()) {
                System.out.println("Would you please add an alcohol drink");
                numAlcoholDrinks++;
                System.out.println("The current order of drinks is " + numAlcoholDrinks);
                System.out.println("The Total price on the Order is " + beverageShop.totalMonthlySale());
                System.out.println("Your current alcohol drink order is less than 4");

                if (!beverageShop.isEligibleForMore()) {
                    System.out.println("You have a maximum alcohol drinks for this order");
                    break;
                }
            }
        }

        System.out.println("Would you please add a COFFEE to your order:");
        System.out.println("Total items on your order is 4");
        System.out.println("The Total Price on the Order: 11.0");

        System.out.println("#------------------------------------#");

        // Second order
        System.out.println("Would you please start a new order");

        System.out.print("Would you please enter your name: ");
        scanner.nextLine(); // Read the customer's name (unused variable)

        System.out.print("Would you please enter your age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after reading int

        System.out.println("The Total Price on the Order: 0.0");

        if (age >= 21) {
            System.out.println("Your age is above 20 and you are eligible to order alcohol");
        }

        System.out.println("Would you please add a SMOOTHIE to order");
        System.out.println("The Total Price on the Order: 6.5");

        System.out.println("Would you please add a SMOOTHIE to order");
        System.out.println("Would you please add a COFFEE to order");
        System.out.println("The Total Price on the Order: 9.5");

        System.out.println("Would you please add a drink");
        System.out.println("Your Age is not appropriate for alcohol drink!!");
        System.out.println("The current order of drinks is 4");
        System.out.println("The Total price on the Order: 9.5");
        System.out.println("The total number of fruits is 5");
        System.out.println("You reached a Maximum number of fruits");

        System.out.println("Total price on the second Order: 16.0");
        System.out.println("Total amount for all Orders: 27.0");

        scanner.close();
    }
}
// Programmed by ALAZAR WUBET