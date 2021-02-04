package com.richa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> people = new ArrayList<Person>();

    public static void main(String[] args) {

        while (true) {

            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Add a person information. ");
            System.out.println("2) Print all people. ");
            System.out.println("3) Print all students. ");
            System.out.println("4) Print all undergraduates. ");
            System.out.println("5) Print all graduate students.  ");
            System.out.println("6) Print all people in the same grade. ");
            System.out.println("7) Print all people in the same major. ");
            System.out.println("8) Quit the program. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 8.");
                continue;
            }

            if (userChoice == 1) {

                if (people.size() == 10) {

                    System.out.println("You have reached the max number of people you can add (10). ");
                    continue;

                }

                System.out.println("Name: ");
                String name = scanner.nextLine();

                System.out.println("Student ID: ");
                long studentID;
                try {
                    studentID = scanner.nextLong();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid student ID. Please input a number. ");
                    continue;
                }

                System.out.println("Undergraduate (1) or graduate (2): ");
                int studentType;
                try {
                    studentType = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid student type. Please input 1 or 2. ");
                    continue;
                }

                if (studentType == 1) {

                    System.out.println("Grade level (freshman (1), sophomore (2), junior (3), senior (4)): ");
                    int gradeLevelChoice;
                    try {
                        gradeLevelChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid student grade level. Please input 1, 2, 3, or 4. ");
                        continue;
                    }

                    String gradeLevel = "";

                    if (gradeLevelChoice == 1) {

                        gradeLevel = "freshman";

                    } else if (gradeLevelChoice ==  2) {

                        gradeLevel = "sophomore";

                    } else if (gradeLevelChoice ==  3) {

                        gradeLevel = "junior";

                    } else if (gradeLevelChoice == 4) {

                        gradeLevel = "senior";

                    } else {

                        System.out.println("Invalid student grade level. Please input either 1, 2, 3, or 4.");
                        continue;

                    }

                    Undergrad ug = new Undergrad(name, studentID, gradeLevel);
                    people.add(ug);

                } else if (studentType == 2) {

                    System.out.println("Major: ");
                    String major =  scanner.nextLine();

                    Grad g = new Grad(name, studentID, major);
                    people.add(g);

                } else {

                    System.out.println("Invalid student type. Please input either 1 or 2. ");
                    continue;

                }

            } else if (userChoice == 2) {

                for (int i = 0; i < people.size(); i++) {

                    Person p = people.get(i);
                    p.print();
                    System.out.println("");

                }

            } else if (userChoice == 3) {

                for (int i = 0; i < people.size(); i++) {

                    Student s = (Student)people.get(i);
                    s.print();
                    System.out.println("");

                }

            } else if (userChoice == 4) {

                for (int i = 0; i < people.size(); i++) {

                    Student s = (Student)people.get(i);

                    if (s.getStudentType() == 1) {

                        s.print();
                        System.out.println("");

                    }

                }

            } else if (userChoice == 5) {

                for (int i = 0; i < people.size(); i++) {

                    Student s = (Student)people.get(i);

                    if (s.getStudentType() == 2) {

                        s.print();
                        System.out.println("");

                    }

                }

            } else if (userChoice == 6) {



            } else if (userChoice == 7) {



            } else if (userChoice == 8) {

                System.out.println("");
                System.out.println("Program is ending.");
                break; // end loop by breaking out

            } else {
                // ask user to enter proper choice
                System.out.println("Error: Please input a number between 1 and 8.");
            }

        }

    }

}
