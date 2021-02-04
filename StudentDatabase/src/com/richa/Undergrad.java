package com.richa;

/**
 * @author : rjuvekar
 * @created : 2/3/21, Wednesday
 **/
public class Undergrad extends Student {

    String gradeLevel = null;

    public Undergrad(String name, long studentID, String gradeLevel) {
        super(name, studentID);
        super.studentType = 1;
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

}
