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

                System.out.print("Enter the name of person to find: ");
                String name = scanner.nextLine();

                System.out.println("Which kind of search do you want?");
                System.out.println("1) Sequential search");
                System.out.println("2) Binary search");
                System.out.print("Choice: ");

                int searchChoice = 0;
                try {
                    searchChoice = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter either 1 or 2.");
                    continue;
                }

                Person person = null;
                if ( searchChoice == 1 ) {
                    person = people.sequentialSearch(name);
                } else if ( searchChoice == 2 ) {
                    person = people.binarySearch(name);
                } else {
                    System.out.println("Bad input. Please enter either 1 or 2.");
                    continue;
                }

                // person found so allow user to edit or delete
                if ( person != null ) {

                    System.out.println("What do you want do with this person?");
                    System.out.println("1) Modify");
                    System.out.println("2) Delete");
                    System.out.print("Choice: ");

                    int editChoice = 0;
                    try {
                        editChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch(Exception e) {
                        System.out.println("Bad input. Please enter either 1 or 2.");
                        continue;
                    }

                    if ( editChoice == 1 ) {

                        String newName = null;
                        int newAge = 0;

                        try {

                            System.out.print("Enter the person's new name: ");
                            newName = scanner.nextLine();

                            System.out.print("Enter the person's new age: ");
                            newAge = scanner.nextInt();
                            scanner.nextLine();

                        } catch(Exception e) {
                            System.out.println("Bad input. Please enter an appropriate response to the prompts.");
                            continue;
                        }

                        if ( people.modify(name, newName, newAge) ) {
                            System.out.println("Person modify success.");
                        } else {
                            System.out.println("Person modify failed.");
                        }
                    } else if ( editChoice == 2 ) {
                        if ( people.delete(name) ) {
                            System.out.println("Person delete success.");
                        } else {
                            System.out.println("Person delete failed.");
                        }
                    } else {
                        System.out.println("Bad input. Please enter either 1 or 2.");
                        continue;
                    }
                }

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
