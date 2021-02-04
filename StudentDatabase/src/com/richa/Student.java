package com.richa;

/**
 * @author : rjuvekar
 * @created : 2/3/21, Wednesday
 **/
public class Student extends Person {

    long studentID = 0;
    int studentType = 0;        //1 is undergrad, 2 is grad

    public Student(String name, long studentID) {
        super(name);
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public int getStudentType() {
        return studentType;
    }

    public void print() {

        super.print();
        System.out.println("Student ID: " + studentID);

    }

}
