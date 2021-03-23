package com.richa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        people.addPerson("Sixth Person", 18);
        people.addPerson("Seventh Person", 16);
        people.addPerson("Eighth Person", 21);
        people.addPerson("Ninth Person", 20);
        people.addPerson("Tenth Person", 22);
    }

    @org.junit.jupiter.api.Test
    void printAllPeople() {
        people.printAllPeopleByName();
    }

    @Test
    void search() {
        people.sequentialSearch("Eighth Person");
        people.binarySearch("Eighth Person");
    }
}