package com.richa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    Number n1 = new ComplexNumber(1, 2);
    Number n2 = new ComplexNumber( 3, 0);
    Number n3 = new ComplexNumber(0, -5);
    Number n4 = new ComplexNumber( 0,0);
    Number n5 = new ComplexNumber( new Fraction(1,2), new Fraction(-2,1));
    Number n6 = new ComplexNumber( new Fraction(6,3), new Fraction(2,4));

    @Test
    void complexPrint() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }

    @org.junit.jupiter.api.Test
    void add() {
        Number add = n1.add(n2);
        System.out.println ( "" + n1 + " + " + n2 + " = " + add);

        add = n1.add(n3);
        System.out.println ( "" + n1 + " + " + n3 + " = " + add);

        add = n1.add(n4);
        System.out.println ( "" + n1 + " + " + n4 + " = " + add);

        add = n5.add(n6);
        System.out.println ( "" + n5 + " + " + n6 + " = " + add);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Number subtract = n1.subtract(n2);
        System.out.println ( "" + n1 + " - " + n2 + " = " + subtract);

        subtract = n1.subtract(n3);
        System.out.println ( "" + n1 + " - " + n3 + " = " + subtract);

        subtract = n1.subtract(n4);
        System.out.println ( "" + n1 + " - " + n4 + " = " + subtract);

        subtract = n5.subtract(n6);
        System.out.println ( "" + n5 + " - " + n6 + " = " + subtract);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Number multiply = n1.multiply(n2);
        System.out.println ( "" + n1 + " * " + n2 + " = " + multiply);

        multiply = n1.multiply(n3);
        System.out.println ( "" + n1 + " * " + n3 + " = " + multiply);

        multiply = n1.multiply(n4);
        System.out.println ( "" + n1 + " * " + n4 + " = " + multiply);

        multiply = n5.multiply(n6);
        System.out.println ( "" + n5 + " * " + n6 + " = " + multiply);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Number divide = n1.divide(n2);
        System.out.println ( "" + n1 + " / " + n2 + " = " + divide);

        divide = n1.divide(n3);
        System.out.println ( "" + n1 + " / " + n3 + " = " + divide);

        divide = n1.divide(n4);
        System.out.println("" + n1 + " / " + n4 + " = " + divide);

        divide = n5.divide(n6);
        System.out.println ( "" + n5 + " / " + n6 + " = " + divide);
    }
}