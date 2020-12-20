package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean userContinue = true;
        do {

            Scanner scanner = new Scanner(System.in);
            String userInput = null;

            System.out.println("Please input a string to process: ");
            userInput = scanner.next();

        } while (userContinue);

    }
}
