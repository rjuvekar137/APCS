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

    boolean isLeapYear(int year) {
        if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) {
            return true;
        }
        return false;
    }

    int getDaysInMonth(int month, int year) {
        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if ( month == 4 || month == 6 || month == 9 || month == 11 ) {
            return 30;
        } else { // feb
            if (isLeapYear(year) ) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    public int daysTo(Date fromDate) {
        if (fromDate.getYear() > this.getYear()) {
            int days = 0;
            days += getDaysInMonth(this.getMonth(), this.getYear()) - this.getDayOfMonth();
            for (int i = this.getMonth() + 1; i <= 12; i++) {
                days += getDaysInMonth(i, this.getYear());
            }
            for (int i = 1; i < fromDate.getMonth(); i++) {
                days += getDaysInMonth(i, fromDate.getYear());
            }
            days += fromDate.getDayOfMonth();
            return days;
        } else if (fromDate.getYear() == this.getYear()) {
            if (fromDate.getMonth() > this.getMonth()) {
                int days = 0;
                days += getDaysInMonth(this.getMonth(), this.getYear()) - this.getDayOfMonth();
                for (int i = this.getMonth() + 1; i < fromDate.getMonth(); i++) {
                    days += getDaysInMonth(i, this.getYear());
                }
                days += fromDate.getDayOfMonth();
                return days;
            } else if (fromDate.getMonth() == this.getMonth()) {
                return fromDate.getDayOfMonth() - this.getDayOfMonth();
            }
        }
        return 0;
    }

    public boolean verifyDate() {
        if (this.getDayOfMonth() > getDaysInMonth(this.getMonth(), this.getYear())) {
            this.dayOfMonth = getDaysInMonth(this.getMonth(), this.getYear());
            System.out.println("This date is invalid. Setting date to " + this);
        }
        return true;
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
