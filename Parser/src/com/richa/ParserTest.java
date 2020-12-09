package com.richa;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author : rjuvekar
 * @created : 12/5/20, Saturday
 **/
public class ParserTest {

    @Test
    public void getAnswerTest1() {

        Parser parser = new Parser();

        String expression = "=-56+2.5*4-6/2";
        System.out.println(expression);
        try {
            double answer = parser.getAnswer(expression);
            System.out.println("Answer: " + answer);
            Assert.assertTrue(answer == -49);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Test
    public void getAnswerTest2() {

        Parser parser = new Parser();

        String expression = "=5..6";
        System.out.println(expression);
        try {
            double answer = parser.getAnswer(expression);
            System.out.println("Answer: " + answer);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            Assert.assertTrue(e.getMessage().equals("multiple points"));
        }

    }

    @Test
    public void getAnswerTest3() {

        Parser parser = new Parser();

        String expression = "=-56*-1";
        System.out.println(expression);
        try {
            double answer = parser.getAnswer(expression);
            System.out.println("Answer: " + answer);
            Assert.assertTrue(answer == 56);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    @Test
    public void getAnswerTest4() {

        Parser parser = new Parser();

        String expression = "=56+-1";
        System.out.println(expression);
        try {
            double answer = parser.getAnswer(expression);
            System.out.println("Answer: " + answer);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            Assert.assertTrue(e.getMessage().equals("Unexpected negative after +"));
        }

    }

    @Test
    public void getAnswerTest5() {

        Parser parser = new Parser();

        String expression = "=56*/1";
        System.out.println(expression);
        try {
            double answer = parser.getAnswer(expression);
            System.out.println("Answer: " + answer);
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
            Assert.assertTrue(e.getMessage().equals("No number at position 4"));
        }

    }
}