package com.richa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleTest {

    Number n1 = new Double(5);
    Number n2 = new Double( 2);
    Number n3 = new Double(-5);
    Number n4 = new Double( 0);

    @org.junit.jupiter.api.Test
    void add() {
        Number add = n1.add(n2);
        System.out.println ( "" + n1 + "+" + n2 + "=" + add);

        add = n1.add(n3);
        System.out.println ( "" + n1 + "+" + n3 + "=" + add);

        add = n1.add(n4);
        System.out.println ( "" + n1 + "+" + n4 + "=" + add);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Number subtract = n1.subtract(n2);
        System.out.println ( "" + n1 + "-" + n2 + "=" + subtract);

        subtract = n1.subtract(n3);
        System.out.println ( "" + n1 + "-" + n3 + "=" + subtract);

        subtract = n1.subtract(n4);
        System.out.println ( "" + n1 + "-" + n4 + "=" + subtract);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Number multiply = n1.multiply(n2);
        System.out.println ( "" + n1 + "*" + n2 + "=" + multiply);

        multiply = n1.multiply(n3);
        System.out.println ( "" + n1 + "*" + n3 + "=" + multiply);

        multiply = n1.multiply(n4);
        System.out.println ( "" + n1 + "*" + n4 + "=" + multiply);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Number divide = n1.divide(n2);
        System.out.println ( "" + n1 + "/" + n2 + "=" + divide);

        divide = n1.divide(n3);
        System.out.println ( "" + n1 + "/" + n3 + "=" + divide);

        try {
            divide = n1.divide(n4);
            System.out.println("" + n1 + "/" + n4 + "=" + divide);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}