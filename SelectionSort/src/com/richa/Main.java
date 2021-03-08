package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AllStudents students = new AllStudents();

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new students information. ");
            System.out.println("2) Output current students information in ascending order by name. ");
            System.out.println("3) Output current students information in descending order by final average. ");
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
                int gradYear = 0;
                double finalAvg = 0;

                try {
                    System.out.print("Enter the student's name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter the student's graduation year: ");
                    gradYear = scanner.nextInt();

                    System.out.print("Enter the student's final average: ");
                    finalAvg = scanner.nextDouble();

                } catch(Exception e) {
                    System.out.println("Bad input. Please enter an appropriate response to the prompts.");
                    continue;
                }

                students.addStudent(name, gradYear, finalAvg);

            } else if (userChoice == 2) {

                students.printAllStudentsByName();

            } else if (userChoice == 3) {

                students.printAllStudentsByFinalAverage();

            } else if (userChoice == 4) { // Quit the program

                break; // break out of the loop to exit the program

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 6.");
                continue;

            }

        }


    }

}

