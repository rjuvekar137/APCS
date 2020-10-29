package com.richa;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gets and checks dimensions
        int dimension = 0;
        do {
            System.out.println("Please input the dimensions of your magic square (between 2 and 8): ");
            dimension = scanner.nextInt();

            if (2 <= dimension && dimension <= 8) {
                break;
            } else {
                System.out.println("Dimensions for the magic square have to be between 2 and 8.");
            }
        } while (true);

        // create magic square object
        MagicSquare ms = new MagicSquare(dimension);

        // if odd, check if user wants program to solve square
        boolean fillMagicSquare = false;
        if (dimension%2 == 1) {
            System.out.println("The dimension you input is an odd number. Should I fill in the magic square for you? (Input 1 for yes, any other number for no) ");
            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                fillMagicSquare = true;
            }
        }

        // solves the magic square based on starting number
        if (fillMagicSquare) {
            int startNum = 0;
            do {
                System.out.print("Enter a starting number: ");
                startNum = scanner.nextInt();

                if (startNum > 0) {
                    ms.fillMagicSquare(startNum);
                    break;
                } else {
                    System.out.println("Value for the starting number must be greater than 1.");
                }
            } while (true);

        } else {
            // get user inputs for magic square + check if values are positive
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    int userNumInput = 0;
                    do {
                        System.out.print("Enter a number at [" + i + "," + j + "]: ");
                        userNumInput = scanner.nextInt();

                        if (userNumInput >= 0) {
                            ms.addNumber(i, j, userNumInput);
                            break;
                        } else {
                            System.out.println("Values for the magic square must be positive.");
                        }
                    } while (true);
                }
            }
        }

        //prints contents of magic square
        ms.printMagicSquare();

        // check whether this is a magic square + print constant
        int constant = ms.isMagic();
        if (constant == 0) {
            System.out.println("This is not a magic square.");
        } else {
            System.out.println("This is a magic square with a constant of " + constant + ".");
        }
    }
}
