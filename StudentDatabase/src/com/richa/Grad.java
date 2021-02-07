package com.richa;

public class Grad extends Student{

    String major = "";

    public Grad(String name, long studentID, String major) {
        super(name, studentID);
        personType = 3;
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

    public boolean equals(Grad other) {
        return this.major.equals(other.getMajor());
    }

}
