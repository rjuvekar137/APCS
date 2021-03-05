package com.richa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 3/3/21, Wednesday
 **/
class IntegerArrayTest {

    @Test
    void printStats() {

        IntegerArray integerArray = new IntegerArray();
        integerArray.add(3);
        integerArray.add(6);
        integerArray.add(-2);
        integerArray.add(6);
        integerArray.add(-1);
        integerArray.add(3);
        integerArray.add(-1);
        integerArray.add(3);
        integerArray.printAll();
        integerArray.printStats();
    }
}