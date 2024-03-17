/*
 * Class: CMSC203 
  * Instructor: Dr. Grigoriy grinberg
 * Assignment 1
 * Description: (ESPGame is the class that represents the main logic of the ESP (Extra Sensory Perception) game. 
 It facilitates interaction with the user through the command line interface.)
 * Due: 02/12/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   
* any source. I have not given my code to any student.
 * Print your Name here: ALAZAR WUBET
*/

import java.util.Scanner;
public class ESPGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        // Ask for the student's "MC M#"
        System.out.println("MC M#:"); 
        String mcMNumber = scanner.nextLine();
        
        // Prompt the user to describe themselves
        System.out.println("Describe yourself:");
        String description = scanner.nextLine();
        
        // Validate and ask for the due date in the format "MM/DD/YYYY"
        String dueDate;
        boolean validDate = false;
        do {
            System.out.println("Due Date (MM/DD/YYYY):");
            dueDate = scanner.nextLine();
            // Check if the entered date matches the format "MM/DD/YYYY"
            if (dueDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
                validDate = true;
            } else {
                System.out.println("Invalid date format. Please enter the date in MM/DD/YYYY format.");
            }
        } while (!validDate);
        
        // Display introductory message for the game
        System.out.println("CMSC203 Assignment1: Test your ESP skills!");
        System.out.println("Round 1\n");
        
        // Array to store the available colors
        final String[] COLORS = {"Red", "Green", "Blue", "Orange", "Yellow", "Purple", "Pink"};
        
        int correctGuesses = 0;
        int maxRounds = 11; // Maximum number of rounds
        for (int i = 1; i <= maxRounds; i++) {
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, Yellow, Purple, or Pink?");
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();
            
            // Validate user's guess
            boolean validGuess = false;
            for (String color : COLORS) {
                if (guess.equalsIgnoreCase(color)) {
                    validGuess = true;
                    break;
                }
            }
            
            if (!validGuess) {
                System.out.println("Invalid color choice. Please choose from the given options.");
                continue; // Restart the loop if the guess is invalid
            }
            
            // Generate a random number to select a color from the array
            int randomNumber = (int) (Math.random() * COLORS.length);
            String color = COLORS[randomNumber];
            
            if (guess.equalsIgnoreCase(color)) {
                System.out.println("I was thinking of " + color + ".\n");
                correctGuesses++;
            } else {
                System.out.println("You entered incorrect color.");
                System.out.println("The correct color was " + color + ".\n");
            }
            
            System.out.println("Round " + i + "\n");
        }
        
        // Display game over message
        System.out.println("Game Over\n");
        // Display the number of correct guesses out of the maximum rounds
        System.out.println("You guessed " + correctGuesses + " out of " + maxRounds + " colors correctly.");
        // Display user's name, MC M#, description, and due date
        System.out.println("Student Name: " + name);
        System.out.println("MC M#: " + mcMNumber);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
        // Print the programmer's name
        System.out.println("Programmed by: Alazar Wubet");
        
        scanner.close(); // Close the scanner object
    }
}
