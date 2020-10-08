package com.richa;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        final int SEQ_SIZE = 25;                    //defines maximum number of slots in sequence
        int[] sequence = new int[SEQ_SIZE];         //array to store the sequence
        int seqCounter = 0;                         //number of slots filled currently

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
                sequence[seqCounter] = userNumInput;
                seqCounter++;
                System.out.println("The number has been added to the sequence.");
            } else if (userChoice == 2) {
                System.out.print("The current sequence is ");
                for (int i = 0; i < seqCounter; i++) {
                    System.out.print(sequence[i] + " ");
                }
                System.out.println(" ");
            } else if (userChoice == 3) {
                System.out.println("eee");
            } else if (userChoice == 4) {
                seqCounter = 0;
                System.out.println("The sequence has been reset.");
            } else if (userChoice == 5) {
                System.out.println("Program has been ended.");
                break;
            } else {
                System.out.println("Error: Please only input a number between 1 and 5.");
            }
        }
    }
}
