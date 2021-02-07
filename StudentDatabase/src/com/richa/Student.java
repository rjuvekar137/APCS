package com.richa;

public class Student extends Person {

    long studentID = 0;

    public Student(String name, long studentID) {
        super(name);
        personType = 1;
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public void print() {
        super.print();
        System.out.println("Student ID: " + studentID);
    }

}
