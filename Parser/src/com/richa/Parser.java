package com.richa;

public class Parser {

    final int MAX_TERMS = 100;
    double num[] = new double[MAX_TERMS]; // store numbers from expression
    int numCounter = 0;
    char op[] = new char[MAX_TERMS]; // store operations from expression
    int opCounter = 0;
    int startCounter = 0;
    int endCounter = 0;

    public void getOperation(String expression) throws Exception {

        // read character and throw exception if not one of four operations
        char operation = expression.charAt(startCounter);
        if (operation != '+' && operation != '-' && operation != '*'  && operation != '/' ) {
            throw new Exception("Unexpected operation: " + operation);
        }

        // store this operation
        op[opCounter] = operation;
        opCounter++;

        // move counters to next number
        startCounter ++;
        endCounter ++;
    }

    public void getNumber(String expression) throws Exception {

        // if we reached end of expression then throw exception
        if (endCounter >= expression.length()) {
            throw new Exception("Incomplete expression, no number after operation.");
        }

        // skip a starting negative if valid
        if (expression.charAt(endCounter) == '-') {
            if ( opCounter > 0 ) {
                if ( op[opCounter-1] == '+' || op[opCounter-1] == '-') {
                    throw new Exception("Unexpected negative after " + op[opCounter-1]);
                }
            }
            endCounter++;
        }

        // read until we see digits (0-9) and decimal point '.'
        for (int i = endCounter; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.') {
                endCounter++;
            } else {
                break;
            }
        }

        // convert string number into number
        String number = expression.substring(startCounter, endCounter);
        if ( number.length() == 0 ) {
            throw new Exception ("No number at position " + startCounter);
        }
        double value = Double.parseDouble(number);

        // store the number read
        num[numCounter] = value;
        numCounter++;

        // move counters to next operation
        startCounter = endCounter;
    }

    public double getAnswer(String expression) throws Exception {

        // final answer
        double answer = 0;

        // make sure expression starts with '='
        expression = expression.trim();
        if (expression.charAt(0) != '=') {
            throw new Exception("Error: Please start your expression with an '=' sign.\n" + expression);
        }
        startCounter++;
        endCounter++;

        // now break up into number and operations
        getNumber(expression);
        while (endCounter < expression.length()) {
            getOperation(expression);
            getNumber(expression);
        }

        // calculate the answer
        for (int i = 0; i < opCounter; i++) {
            // first calculate for multiplication and division
            if ( op[i] == '*' || op[i] == '/') {
                if ( op[i] == '*') {
                    num[i] = num[i] * num[i + 1]; // multiplication
                }
                if ( op[i] == '/') {
                    num[i] = num[i] / num[i+1]; // division
                }
                // remove num[i]
                for (int j=i+1; j<numCounter; j++) {
                    num[j] = num[j+1];
                }
                numCounter--;
                // remove op[i]
                for (int j=i; j<opCounter; j++) {
                    op[j] = op[j+1];
                }
                opCounter--;
                i--;
            }
        }
        for (int i = 0; i < opCounter; i++) {
            // next calculate for addition and subtraction
            if ( op[i] == '+' || op[i] == '-') {
                if (op[i] == '+') {
                    num[i] = num[i] + num[i + 1]; // addition
                }
                if (op[i] == '-') {
                    num[i] = num[i] - num[i + 1]; // subtraction
                }
                // remove num[i]
                for (int j = i + 1; j < numCounter; j++) {
                    num[j] = num[j + 1];
                }
                numCounter--;
                // remove op[i]
                for (int j = i; j < opCounter; j++) {
                    op[j] = op[j + 1];
                }
                opCounter--;
                i--;
            }
        }

        answer = num[0]; // num[0] is the final answer

        return answer;
    }

}
