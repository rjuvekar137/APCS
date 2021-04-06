package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        while (true) {

            System.out.println("");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new number. ");
            System.out.println("2) Merge sort and output the current numbers. ");
            System.out.println("3) Search for a specific number. ");
            System.out.println("4) Quit. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 4.");
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

                numbers.printMergeSortedArray();

            } else if (userChoice == 3) {

                int num = 0;

                try {
                    System.out.print("Enter a number to search: ");
                    num = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter an appropriate response to the prompt.");
                    continue;
                }

                int index = numbers.searchNumber(num);
                if ( index == -1 ) {
                    System.out.println("Number " + num + " NOT FOUND in array");
                } else {
                    System.out.println("Number " + num + " FOUND in array");
                }

            } else if (userChoice == 4) {

                break; // quit so break out of the loop

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                continue;

            }

        }

    }
}
