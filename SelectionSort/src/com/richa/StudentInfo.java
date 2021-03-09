package com.richa;

public class StudentInfo {

    private String name = null;
    private int gradYear = 0;
    private double finalAvg = 0;

    public StudentInfo() {
    }

    public StudentInfo(String name, int gradYear, double finalAvg) {

        this.name = name;
        this.gradYear = gradYear;
        this.finalAvg = finalAvg;

    }

    public String getName() {

        return name;

    }

    public int getGradYear() {

        return gradYear;

    }

    public double getFinalAvg() {

        return finalAvg;

    }


}
