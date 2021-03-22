package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AllStudents students = new AllStudents();
        Statistics statistics = new Statistics();

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input a new students information. ");
            System.out.println("2) Output student information in ascending order by name. ");
            System.out.println("3) Output student information in descending order by final average. ");
            System.out.println("4) Output the quarterly average statistics for the class. ");
            System.out.println("5) Quit the program. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 5.");
                continue;
            }

            if (userChoice == 1) { // Input a number

                String name = null;
                int gradYear = 0;
                double finalAvg = 0;
                double q1Avg=0, q2Avg=0, q3Avg=0, q4Avg=0;

                try {
                    System.out.print("Enter the student's name: ");
                    name = scanner.nextLine();

                    System.out.print("Enter the student's graduation year: ");
                    gradYear = scanner.nextInt();
                    scanner.nextLine();

                    // q1, q2, q3, q4
                    System.out.println("Enter the student's quarterly average: ");
                    System.out.print("Q1 average: ");
                    q1Avg = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Q2 average: ");
                    q2Avg = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Q3 average: ");
                    q3Avg = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Q4 average: ");
                    q4Avg = scanner.nextDouble();
                    scanner.nextLine();

                    finalAvg = (q1Avg+q2Avg+q3Avg+q4Avg)/4;

                } catch(Exception e) {
                    System.out.println("Bad input. Please enter an appropriate response to the prompts.");
                    continue;
                }

                students.addStudent(name, gradYear, finalAvg);
                statistics.addQuarterAverages(q1Avg, q2Avg, q3Avg, q4Avg);

            } else if (userChoice == 2) {

                students.printAllStudentsByName();

            } else if (userChoice == 3) {

                students.printAllStudentsByFinalAverage();

            } else if (userChoice == 4) {

                statistics.printStatistics();

            } else if (userChoice == 5) { // Quit the program

                break; // break out of the loop to exit the program

            } else {

                System.out.println("Bad input. Please enter a number between 1 and 5.");
                continue;

            }

        }


    }

}

