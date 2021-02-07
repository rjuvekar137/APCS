package com.richa;

public class Undergrad extends Student {

    String gradeLevel = "";

    public Undergrad(String name, long studentID, String gradeLevel) {
        super(name, studentID);
        personType = 2;
        this.gradeLevel = gradeLevel;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void print() {
        super.print();
        System.out.println("Grade level: " + gradeLevel);
    }

    public boolean equals(Undergrad other) {

        return this.gradeLevel.equals(other.getGradeLevel());

    }

}
