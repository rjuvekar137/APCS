package com.richa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 3/21/21, Sunday
 **/
class PersonArrayTest {

    PersonArray people = new PersonArray();

    @BeforeEach
    void setUp() {
        people.addPerson("First Person", 17);
        people.addPerson("Second Person", 18);
        people.addPerson("Third Person", 20);
        people.addPerson("Fourth Person", 16);
        people.addPerson("Fifth Person", 19);
    }

    @org.junit.jupiter.api.Test
    void printAllPeople() {
        people.printAllPeopleByName();
    }
}