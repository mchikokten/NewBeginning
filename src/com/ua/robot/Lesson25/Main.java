package com.ua.robot.Lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;

        while (!validInput) {
            System.out.print("Enter a number: ");
            String userInput = input.nextLine();

            try {
                number = Integer.parseInt(userInput);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("You entered the number " + number);
    }
}
