package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.addNumber(4);
        numbers.addNumber(7);
        numbers.addNumber(11);
        numbers.addNumber(3);
        numbers.addNumber(2);
        numbers.addNumber(9);
        numbers.addNumber(3);
        numbers.addNumber(12);
        numbers.addNumber(1);

        while (true) {

            System.out.println("");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new number. ");
            System.out.println("2) Quick sort and output the current numbers. ");
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

                int pivotType = 0;

                try {
                    System.out.print("Enter the type of pivot to use: ");
                    System.out.print("1) First");
                    System.out.print("2) Median");
                    System.out.print("3) Random");
                    System.out.print("4) Last");
                    pivotType = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter an appropriate response to the prompt.");
                    continue;
                }

                numbers.printQuickSortedLast();

            } else if (userChoice == 3) {

                break; // quit so break out of the loop

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;

            }

        }

    }
}
