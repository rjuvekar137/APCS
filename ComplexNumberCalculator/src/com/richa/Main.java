package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            System.out.println(" ");
            System.out.println("What type of number?");
            System.out.println("1) Fraction ");
            System.out.println("2) Complex");
            System.out.println("3) Quit program");
            System.out.print("Enter choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 3.");
                continue;
            }

            if (userChoice == 1) { // Fraction

                int num1=0, den1=0, num2=0, den2=0;

                try {
                    System.out.print("Enter Fraction 1 numerator: ");
                    num1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Fraction 1 denominator: ");
                    den1 = scanner.nextInt();
                    scanner.nextLine();
                    if (den1 == 0) {
                        System.out.println("Denominator cannot be zero.");
                        continue;
                    }

                    System.out.print("Enter Fraction 2 numerator: ");
                    num2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Fraction 2 denominator: ");
                    den2 = scanner.nextInt();
                    scanner.nextLine();
                    if (den2 == 0) {
                        System.out.println("Denominator cannot be zero.");
                        continue;
                    }

                } catch (Exception e) {
                    System.out.println("Bad input. Please enter an integer as input");
                    continue;
                }

                System.out.println ("Choose operation: ");
                System.out.println ("1) Addition: ");
                System.out.println ("2) Subtraction ");
                System.out.println ("3) Multiplication ");
                System.out.println ("4) Division ");

                int userOperChoice = 0;
                try {
                    userOperChoice = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter a number between 1 and 4.");
                    continue;
                }

                Fraction frac1 = new Fraction(num1, den1);
                Fraction frac2 = new Fraction(num2, den2);

                if (userOperChoice == 1 ) { //add
                    System.out.println ( frac1 + " + " + frac2 + " = " + frac1.add(frac2));
                } else if (userOperChoice == 2) { //subtract
                    System.out.println ( frac1 + " - " + frac2 + " = " + frac1.subtract(frac2));
                } else if (userOperChoice == 3) { //multiply
                    System.out.println ( frac1 + " * " + frac2 + " = " + frac1.multiply(frac2));
                } else if (userOperChoice == 4) { //divide
                    System.out.println ( frac1 + " / " + frac2 + " = " + frac1.divide(frac2));
                } else {
                    System.out.println("Bad input. Please enter a number between 1 and 4.");
                    continue;
                }

            } else if (userChoice == 2) { // Complex

                System.out.println(" ");
                System.out.println("How do you want to input the real and imaginary part?");
                System.out.println("1) Double ");
                System.out.println("2) Fraction");
                System.out.print("Enter choice: ");

                int userTypeChoice = 0;
                try {
                    userTypeChoice = scanner.nextInt();
                    scanner.nextLine();
                } catch(Exception e) {
                    System.out.println("Bad input. Please enter a number 1 or 2.");
                    continue;
                }

                if ( userTypeChoice == 1 ) { // double values

                    double real1 = 0, imag1 = 0, real2 = 0, imag2 = 0;

                    try {
                        System.out.print("Enter Complex Number 1 real part: ");
                        real1 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 1 imaginary part: ");
                        imag1 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 real part: ");
                        real2 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 imaginary part: ");
                        imag2 = scanner.nextDouble();
                        scanner.nextLine();

                    } catch (Exception e) {
                        System.out.println("Bad input. Please enter a number as input");
                        continue;
                    }

                    System.out.println("Choose operation: ");
                    System.out.println("1) Addition: ");
                    System.out.println("2) Subtraction ");
                    System.out.println("3) Multiplication ");
                    System.out.println("4) Division ");

                    int userOperChoice = 0;
                    try {
                        userOperChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Bad input. Please enter a number between 1 and 4.");
                        continue;
                    }

                    ComplexNumber comp1 = new ComplexNumber(real1, imag1);
                    ComplexNumber comp2 = new ComplexNumber(real2, imag2);

                    if (userOperChoice == 1) { //add
                        System.out.println(comp1 + " + " + comp2 + " = " + comp1.add(comp2));
                    } else if (userOperChoice == 2) { //subtract
                        System.out.println(comp1 + " - " + comp2 + " = " + comp1.subtract(comp2));
                    } else if (userOperChoice == 3) { //multiply
                        System.out.println(comp1 + " * " + comp2 + " = " + comp1.multiply(comp2));
                    } else if (userOperChoice == 4) { //divide
                        System.out.println(comp1 + " / " + comp2 + " = " + comp1.divide(comp2));
                    } else {
                        System.out.println("Bad input. Please enter a number between 1 and 4.");
                        continue;
                    }
                } else if (userTypeChoice == 2) { // Fraction

                    int realNum1 = 0, realDen1 = 0, imagNum1 = 0, imagDen1 = 0;
                    int realNum2 = 0, realDen2 = 0, imagNum2 = 0, imagDen2 = 0;

                    try {
                        System.out.print("Enter Complex Number 1 real part numerator: ");
                        realNum1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 1 real part denominator: ");
                        realDen1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 1 imaginary part numerator: ");
                        imagNum1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 1 imaginary part denominator: ");
                        imagDen1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 real part numerator: ");
                        realNum2 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 real part denominator: ");
                        realDen2 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 imaginary part numerator: ");
                        imagNum2 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Complex Number 2 imaginary part denominator: ");
                        imagDen2 = scanner.nextInt();
                        scanner.nextLine();

                    } catch (Exception e) {
                        System.out.println("Bad input. Please enter an integer as input");
                        continue;
                    }

                    System.out.println("Choose operation: ");
                    System.out.println("1) Addition: ");
                    System.out.println("2) Subtraction ");
                    System.out.println("3) Multiplication ");
                    System.out.println("4) Division ");

                    int userOperChoice = 0;
                    try {
                        userOperChoice = scanner.nextInt();
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Bad input. Please enter a number between 1 and 4.");
                        continue;
                    }

                    ComplexNumber comp1 = new ComplexNumber(new Fraction(realNum1, realDen1), new Fraction(imagNum1, imagDen1));
                    ComplexNumber comp2 = new ComplexNumber(new Fraction(realNum2, realDen2), new Fraction(imagNum2, imagDen2));

                    if (userOperChoice == 1) { //add
                        System.out.println(comp1 + " + " + comp2 + " = " + comp1.add(comp2));
                    } else if (userOperChoice == 2) { //subtract
                        System.out.println(comp1 + " - " + comp2 + " = " + comp1.subtract(comp2));
                    } else if (userOperChoice == 3) { //multiply
                        System.out.println(comp1 + " * " + comp2 + " = " + comp1.multiply(comp2));
                    } else if (userOperChoice == 4) { //divide
                        System.out.println(comp1 + " / " + comp2 + " = " + comp1.divide(comp2));
                    } else {
                        System.out.println("Bad input. Please enter a number between 1 and 4.");
                        continue;
                    }

                } else {
                    System.out.println("Bad input. Please enter a number 1 or 2.");
                    continue;
                }

            } else if (userChoice == 3) {
                // done break out of the loop
                break;
            } else {
                // ask user to enter proper choice
                System.out.println("Error: Please input a number between 1 and 3.");
            }
        }

    }
}
