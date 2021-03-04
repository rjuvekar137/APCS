package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IntegerArray integerArray = new IntegerArray();

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a number. ");
            System.out.println("2) Input a list of numbers. ");
            System.out.println("3) Reset all numbers. ");
            System.out.println("4) Print all numbers. ");
            System.out.println("5) Print statistics (mean, median, mode, standard deviation). ");
            System.out.println("6) Quit the program. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 6.");
                continue;
            }

            if (userChoice == 1) { // Input a number

                int num = 0;
                System.out.print("Enter a number (e.g. -10, 0, 55): ");
                try {
                    num = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter a number.");
                    continue;
                }
                integerArray.add(num);

            } else if (userChoice == 2) { // Input a list of numbers

                System.out.print("Enter a list of numbers (e.g. 0, -5, 13, 3): ");
                String numbers = scanner.nextLine();
                integerArray.add(numbers);

            } else if (userChoice == 3) { // Reset all numbers

                integerArray.resetAll();

            } else if (userChoice == 4) { // Print all numbers

                integerArray.printAll();

            } else if (userChoice == 5) { // Print statistics

                integerArray.printStats();

            } else if (userChoice == 6) { // Quit the program

                break; // break out of the loop to exit the program

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 6.");
                continue;

            }

        }


    }
}
