package com.richa;

/**
 * @author : rjuvekar
 * @created : 2/3/21, Wednesday
 **/
public class Grad extends Student{

    String major = null;

    public Grad(String name, long studentID, String major) {
        super(name, studentID);
        super.studentType = 2;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void print() {

        super.print();
        System.out.println("Major: " + major);

    }

}
