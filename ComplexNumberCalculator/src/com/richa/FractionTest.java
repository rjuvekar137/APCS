package com.richa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 2/25/21, Thursday
 **/
class FractionTest {

    Number n1 = new Fraction(5, 7);
    Number n2 = new Fraction( 6, 4);
    Number n3 = new Fraction(5, -5);
    Number n4 = new Fraction( 0, 2);
    Number n5 = new Fraction( 15, -3);
    Number n6 = new Fraction( -4, -2);

    @Test
    void fractionPrint() {
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
        System.out.println ( "" + n1 + "+" + n2 + "=" + add);

        add = n1.add(n3);
        System.out.println ( "" + n1 + "+" + n3 + "=" + add);

        add = n1.add(n4);
        System.out.println ( "" + n1 + "+" + n4 + "=" + add);

        add = n1.add(n5);
        System.out.println ( "" + n1 + "+" + n5 + "=" + add);

        add = n1.add(n6);
        System.out.println ( "" + n1 + "+" + n6 + "=" + add);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Number subtract = n1.subtract(n2);
        System.out.println ( "" + n1 + "-" + n2 + "=" + subtract);

        subtract = n1.subtract(n3);
        System.out.println ( "" + n1 + "-" + n3 + "=" + subtract);

        subtract = n1.subtract(n4);
        System.out.println ( "" + n1 + "-" + n4 + "=" + subtract);

        subtract = n1.subtract(n5);
        System.out.println ( "" + n1 + "-" + n5 + "=" + subtract);

        subtract = n1.subtract(n6);
        System.out.println ( "" + n1 + "-" + n6 + "=" + subtract);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Number multiply = n1.multiply(n2);
        System.out.println ( "" + n1 + "*" + n2 + "=" + multiply);

        multiply = n1.multiply(n3);
        System.out.println ( "" + n1 + "*" + n3 + "=" + multiply);

        multiply = n1.multiply(n4);
        System.out.println ( "" + n1 + "*" + n4 + "=" + multiply);

        multiply = n1.multiply(n5);
        System.out.println ( "" + n1 + "*" + n5 + "=" + multiply);

        multiply = n1.multiply(n6);
        System.out.println ( "" + n1 + "*" + n6 + "=" + multiply);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Number divide = n1.divide(n2);
        System.out.println ( "" + n1 + "/" + n2 + "=" + divide);

        divide = n1.divide(n3);
        System.out.println ( "" + n1 + "/" + n3 + "=" + divide);

        divide = n1.divide(n4);
        System.out.println("" + n1 + "/" + n4 + "=" + divide);

        divide = n1.divide(n5);
        System.out.println ( "" + n1 + "/" + n5 + "=" + divide);

        divide = n1.divide(n6);
        System.out.println ( "" + n1 + "/" + n6 + "=" + divide);
    }
}