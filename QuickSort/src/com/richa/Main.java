package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        while (true) {

            System.out.println("");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new number. ");
            System.out.println("2) Quick sort and output numbers. ");
            System.out.println("3) Quit. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;
            }

            if (userChoice == 1) { // Input a number

                int num = 0;

                try {
                    System.out.print("Enter the new number: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter an appropriate response to the prompt.");
                    continue;
                }

                numbers.addNumber(num);

            } else if (userChoice == 2) {

                numbers.printQuickSorted();

            } else if (userChoice == 3) {

                break; // quit so break out of the loop

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;

            }

        }

    }
}
