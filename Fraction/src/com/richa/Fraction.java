package com.richa;
import java.util.*;

public class Fraction {
    // variables to store user input
    double num1 = 0, num2 = 0, denom1 = 0, denom2 = 0;

    public void readUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Please enter the first numerator value: ");
        num1 = scanner.nextDouble();

        System.out.print ("Please enter the first denominator value: ");
        denom1 = scanner.nextDouble();

        System.out.print ("Please enter the second numerator value: ");
        num2 = scanner.nextDouble();

        System.out.print ("Please enter the second denominator value: ");
        denom2 = scanner.nextDouble();
    }

    public boolean checkUserInput() {
        boolean validInt = true;
        if (num1 != (int)num1 || num2 != (int)num2 || denom1 != (int)denom1 || denom2 != (int)denom2) {
            validInt = false;
        }

        boolean validDenom = false;
        if (denom1 != 0 || denom2 != 0) {
            validDenom = true;
        }

        boolean errorCheck = true;
        if ((validInt == true) && (validDenom == true)) {
            errorCheck = false;
        }
        return errorCheck;
    }

    public int calculateGCF(int n1, int n2) {
        // figures out smaller and greater value between denominator product and numerator product
        int min = n1, max = n2;
        if (n1 > n2) {
            max = n1;
            min = n2;
        }

        // calculates GCF
        int gcf = min;
        while (max % gcf != 0 || min % gcf != 0) {
            gcf = gcf - 1;
        }
        return gcf;
    }

    public int countNegatives() {
        // counts number of negative numbers to determine sign
        int numNeg = 0;
        if (num1 < 0) {
            numNeg++;
        }
        if (num2 < 0) {
            numNeg++;
        }
        if (denom1 < 0) {
            numNeg++;
        }
        if (denom2 < 0) {
            numNeg++;
        }
        return numNeg;
    }

    public void printProduct() {
        // calculates product of numerators and denominators
        double numProduct = Math.abs(num1*num2);
        double denomProduct = Math.abs(denom1*denom2);

        // simplifies numerator and denominator by dividing by GCF
        int gcf = calculateGCF((int)numProduct,(int)denomProduct);
        numProduct = numProduct/gcf;
        denomProduct = denomProduct/gcf;

        // if the denominator is 1, just print the numerator
        int numNeg = countNegatives();
        if (denomProduct == 1) {
            if (numNeg == 1 || numNeg == 3) {
                // prints negative sign
                System.out.println( "-" + (int)numProduct);
            } else {
                System.out.println((int)numProduct);
            }
        } else {
            // if denominator is larger than numerator. prints product in improper form
            if (denomProduct > numProduct) {
                if (numNeg == 1 || numNeg == 3) {
                    // prints negative sign
                    System.out.println( "-" + (int)numProduct + "/" + (int)denomProduct);
                } else {
                    System.out.println((int)numProduct + "/" + (int)denomProduct);
                }
            } else {
                // if numerator is larger than denominator, prints product in mixed form
                int wholeNum = 0;
                while (numProduct > denomProduct) {
                    numProduct = numProduct - denomProduct;
                    wholeNum = wholeNum ++;
                }
                if (numNeg == 1 || numNeg == 3) {
                    // prints negative sign
                    System.out.println("-" + wholeNum + " " + (int)numProduct + "/" + (int)denomProduct);
                } else {
                    System.out.println(wholeNum + " " + (int)numProduct + "/" + (int)denomProduct);
                }
            }

        }
    }

    public static void main(String[] args) {
        // creates fraction object
        Fraction fraction = new Fraction();

        // gets user input and stores in variables
        fraction.readUserInput();

        // checking inputs against conditions (error checking)
       boolean errorCheck = fraction.checkUserInput();

        // in case of error, prints error message; if no errors, calculates product
        if (errorCheck == true) {
            System.out.println ("Please enter integer values only and make sure you do not input 0 for either of the denominator values.");
        } else {
            fraction.printProduct();
        }
    }
}
