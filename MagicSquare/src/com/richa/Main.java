package com.richa;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean dimProvided = false;

        do {

            System.out.println("Please input the dimensions of your magic square (between 2 and 8): ");
            int dimension = scanner.nextInt();

            if (2 <= dimension && dimension <= 8) {

                dimProvided = true;
                MagicSquare ms = new MagicSquare(dimension);

                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < dimension; j++) {
                        System.out.print("Enter a number at [" + i + "," + j + "]: ");
                        int userNumInput = scanner.nextInt();
                        ms.addNumber(i, j, userNumInput);
                    }
                }


                int constant = ms.isMagic();
                if (constant == 0) {
                    System.out.println("This is not a magic square.");
                } else {
                    System.out.println("This is a magic square with a constant of " + constant + ".");
                }

            } else {
                System.out.println("Dimensions for the magic square have to be between 2 and 8.");
            }

        } while(!dimProvided);

    }
}
