package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PersonArray people = new PersonArray();

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new person's information. ");
            System.out.println("2) Search for person by name. ");
            System.out.println("3) Print names of all people in alphabetical order. ");
            System.out.println("4) Quit the program. ");
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

                String name = null;
                int age = 0;

                try {

                    System.out.print("Enter the person's name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter the person's age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();

                } catch(Exception e) {

                    System.out.println("Bad input. Please enter an appropriate response to the prompts.");
                    continue;

                }

                people.addPerson(name, age);

            } else if (userChoice == 2) {

                // TODO

            } else if (userChoice == 3) {

                people.printAllPeopleByName();

            } else if (userChoice == 4) { // Quit the program

                break; // break out of the loop to exit the program

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 4.");
                continue;

            }

        }

    }
}
