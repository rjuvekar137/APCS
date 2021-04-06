package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Print the '#' symbol based on the number you input  ");
            System.out.println("2) Print the factorial based on the number you input. ");
            System.out.println("3) Quit the program. ");
            System.out.print("Choice: ");

            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;
            }

            if (userChoice == 1) { // Print the '&' symbol

                int num = 0;

                try {

                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter an appropriate response to the prompt.");
                    continue;

                }

                Symbols symbols = new Symbols();
                symbols.printSymbol(num, 1);


            } else if (userChoice == 2) { // Print the factorial

                int num = 0;

                try {

                    System.out.print("Enter a number: ");
                    num = scanner.nextInt();
                    scanner.nextLine();

                } catch (Exception e) {

                    System.out.println("Bad input. Please enter an appropriate response to the prompt.");
                    continue;

                }

                Factorial factorial = new Factorial();
                int f = factorial.factorial(num);
                System.out.println(f);

            } else if (userChoice == 3) { // Quit

                break;

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;


            }

        }

    }
}
