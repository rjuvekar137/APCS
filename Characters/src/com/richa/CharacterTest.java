package com.richa;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 12/19/20, Saturday
 **/
class CharacterTest {

    @org.junit.jupiter.api.Test
    void parseTest() {
        Character ch = new Character();
        try {
            ch.parse("And    he   came 2 school.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ch.printData();
    }

    @org.junit.jupiter.api.Test
    void parseTest2() {
        Character ch = new Character();
        try {
            ch.parse("The dog and the cat ran and ran.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ch.printData();
    }
}