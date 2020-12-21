package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean userContinue = true;
        do {

            Scanner scanner = new Scanner(System.in);
            String userInput = null;

            System.out.println("Please input a string to process: ");
            userInput = scanner.nextLine();

            Character ch = new Character();
            try {
                ch.parse(userInput);
                ch.printData();
            } catch (Exception e){
                System.out.println("There was an error parsing this string. Try again.");
            }

            // ask user if they want to enter another expression
            System.out.println("Do you want to input another string? (y/n)");
            userInput = scanner.nextLine();
            if ( userInput.charAt(0) == 'n' || userInput.charAt(0) == 'N' ) {
                userContinue = false;
            }

        } while (userContinue);

    }
}
