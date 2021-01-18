package com.richa;

/**
 * @author : rjuvekar
 * @created : 1/12/21, Tuesday
 **/
public class Date {

    int month = 0;
    int dayOfMonth = 0;
    int year = 0;

    public Date(int month, int dayOfMonth, int year) {
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.year = year;
    }

    public void verifyDate() {
        //TODO
    }

    public int getMonth() {
        return month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String date = month + "/" + dayOfMonth + "/" + year;
        return date;
    }

}
