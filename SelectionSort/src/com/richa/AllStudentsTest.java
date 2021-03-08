package com.richa;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 3/7/21, Sunday
 **/
class AllStudentsTest {

    AllStudents students = new AllStudents();

    @BeforeEach
    void setUp() {
        students.addStudent("Bhaji", 2023,97);
        students.addStudent("Bob", 2022,79.9);
        students.addStudent("Billy", 2023,73);
        students.addStudent("Brian", 2023,82);
        students.addStudent("Pratham", 2018,87.45);
        students.addStudent("Pratbob", 2023,67);
        students.addStudent("Joe", 2022,97);
        students.addStudent("Mike", 2023,87);
        students.addStudent("Jose", 2023,97.9);
        students.addStudent("Peter", 2020,87);
        students.addStudent("Mary", 2023,84.2);
        students.addStudent("Steve", 2019,86);
        students.addStudent("Aaron", 2023,92);
        students.addStudent("Zoe", 1999,90);
        students.addStudent("Jake", 2010,72);
        students.addStudent("John", 2026,98);
    }

    @org.junit.jupiter.api.Test
    void printAllStudentsByName() {
        students.printAllStudentsByName();
    }

    @org.junit.jupiter.api.Test
    void printAllStudentsByFinalAverage() {
        students.printAllStudentsByFinalAverage();
    }
}