package com.richa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> people = new ArrayList<Person>();

    public static void main(String[] args) {

        //test data
        people.add(new Person("Test 1"));
        people.add(new Student("Test 2", 2));
        people.add(new Student("Test 3", 3));
        people.add(new Undergrad("Test 11", 11, "freshman"));
        people.add(new Undergrad("Test 12", 12, "senior"));
        people.add(new Undergrad("Test 14", 14, "freshman"));
        people.add(new Grad("Test 21", 21, "biology"));
        people.add(new Grad("Test 23", 23, "art"));
        people.add(new Grad("Test 24", 24, "art"));

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

            if (userChoice == 1) { // add a person

                if (people.size() >= 10) {
                    System.out.println("You have reached the max number of people you can add (10). ");
                    continue;
                }

                System.out.println(" ");
                System.out.println("What type of person information would you like to input? (person (1), student (2), undergrad (3), grad (4)) ");
                int personChoice;
                try {
                    personChoice = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid person type. Please input 1, 2, 3, or 4. ");
                    continue;
                }

                if (personChoice < 1 || personChoice > 4) {
                    System.out.println("Invalid person type. Please input 1, 2, 3, or 4. ");
                    continue;
                }

                System.out.print("Name: ");
                String name = scanner.nextLine();

                if (personChoice ==  1) {
                    Person p = new Person(name);
                    people.add(p);
                    continue;
                }

                long studentID = 0;
                if (personChoice == 2 || personChoice == 3 || personChoice == 4) {
                    System.out.print("Student ID: ");
                    try {
                        studentID = scanner.nextLong();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid student ID. Please input a number. ");
                        continue;
                    }

                    if (personChoice == 2) {
                        Student s =  new Student(name, studentID);
                        people.add(s);
                        continue;
                    }
                }

                if (personChoice == 3) {

                    System.out.print("Grade level (freshman (1), sophomore (2), junior (3), senior (4)): ");
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
                    } else if (gradeLevelChoice == 2) {
                        gradeLevel = "sophomore";
                    } else if (gradeLevelChoice == 3) {
                        gradeLevel = "junior";
                    } else if (gradeLevelChoice == 4) {
                        gradeLevel = "senior";
                    } else {
                        System.out.println("Invalid student grade level. Please input either 1, 2, 3, or 4.");
                        continue;
                    }

                    Undergrad ug = new Undergrad(name, studentID, gradeLevel);
                    people.add(ug);

                } else if (personChoice == 4) {

                    System.out.print("Major: ");
                    String major = scanner.nextLine();

                    Grad g = new Grad(name, studentID, major);
                    people.add(g);

                }

            } else if (userChoice == 2) { // print all persons

                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if( p.getPersonType() == 0 ) {
                        found = true;
                        p.print();
                        System.out.println("");
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 3) { // print all students

                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if( p.getPersonType() == 1 ) {
                        found = true;
                        p.print();
                        System.out.println("");
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 4) { // print all undergraduates

                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if( p.getPersonType() == 2 ) {
                        found = true;
                        p.print();
                        System.out.println("");
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 5) { // print all graduates

                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if( p.getPersonType() == 3 ) {
                        found = true;
                        p.print();
                        System.out.println("");
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 6) { // search by grade level

                System.out.print("Input the grade level you want to compare (freshman (1), sophomore (2), junior (3), senior (4)): ");
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

                Undergrad fakeUG = new Undergrad("", 0, gradeLevel);
                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if (p.getPersonType() == 2) {
                        Undergrad ug = (Undergrad)p;
                        if (ug.equals(fakeUG)) {
                            found = true;
                            p.print();
                            System.out.println("");
                        }
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 7) { // search by major

                System.out.print("Major: ");
                String major =  scanner.nextLine();

                Grad fakeG = new Grad("", 0, major);
                boolean found = false;
                for (int i = 0; i < people.size(); i++) {
                    Person p = people.get(i);
                    if (p.getPersonType() == 3) {
                        Grad g = (Grad) p;
                        if (g.equals(fakeG)) {
                            found = true;
                            p.print();
                            System.out.println("");
                        }
                    }
                }
                if (!found) {
                    System.out.println("There are no matches to your search. ");
                }

            } else if (userChoice == 8) { // exit the program

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
