package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean userContinue = true;
        do {

            // initialize terminal
            Scanner scanner = new Scanner(System.in);
            String userInput = null;

            // prompt user to enter expression
            System.out.println("Please input an expression to process.");
            System.out.println("Make sure the expression starts with an equal sign and has a valid arithmetic expression.");
            System.out.println("Example: =-56+2.5*4-6/2");
            userInput = scanner.next();

            // create parser object
            Parser parser = new Parser();
            try {

                // call getAnswer with userInput
                double answer = parser.getAnswer(userInput);
                System.out.format("%-10.2f %n", answer); // display answer

            } catch(Exception e) {

                // exception happened so print message
                System.out.println(e.getMessage());

            }

            // ask user if they want to enter another expression
            System.out.println("Do you want to input another expression? (y/n)");
            userInput = scanner.next();
            if ( userInput.charAt(0) == 'n' || userInput.charAt(0) == 'N' ) {
                userContinue = false;
            }

        } while (userContinue);

    }

}
