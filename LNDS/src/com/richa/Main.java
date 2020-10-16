package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LNDS lnds = new LNDS();

        while(true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input another number to add to the sequence. ");
            System.out.println("2) Output the current sequence. ");
            System.out.println("3) Output the longest non-decreasing sequence. ");
            System.out.println("4) Reset the entire sequence. ");
            System.out.println("5) Quit the program. ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {

                System.out.print("Enter the number you want to add to the sequence: ");
                int userNumInput = scanner.nextInt();

                if ( lnds.addNumber(userNumInput) ) {
                    System.out.println("");
                    System.out.println("The number has been added to the sequence.");
                } else {
                    System.out.println("");
                    System.out.println("The number has could not be added to the sequence. Only 25 allowed.");
                }

            } else if (userChoice == 2) {

                System.out.println("");
                System.out.print("The current sequence is ");
                System.out.print(lnds.getSequence());
                System.out.println("");

            } else if (userChoice == 3) {

                System.out.println("");
                System.out.print("The longest non-decreasing sequence is ");
                System.out.print(lnds.getLongestNonDecreasingSequence());
                System.out.println("");

            } else if (userChoice == 4) {

                lnds.clearSequence();
                System.out.println("");
                System.out.println("The sequence has been reset.");

            } else if (userChoice == 5) {

                System.out.println("");
                System.out.println("Program is ending.");
                break;

            } else {

                System.out.println("Error: Please only input a number between 1 and 5.");

            }
        }
    }
}
