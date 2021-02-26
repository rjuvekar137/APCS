package com.richa;

import com.sun.jdi.InvalidTypeException;

public class Integer implements Number {

    int number = 0;

    public Integer(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Number add(Number num) {
        Integer intNum = (Integer)num;
        return new Integer(this.number + intNum.getNumber());
    }

    @Override
    public Number subtract(Number num) {
        Integer intNum = (Integer)num;
        return new Integer(this.number - intNum.getNumber());
    }

    @Override
    public Number multiply(Number num) {
        Integer intNum = (Integer)num;
        return new Integer(this.number * intNum.getNumber());
    }

    @Override
    public Number divide(Number num) {
        Integer intNum = (Integer)num;
        return new Integer(this.number / intNum.getNumber());
    }

    @Override
    public boolean isNegative() {
        if ( number < 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isZero() {
        if ( number == 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + number;
    }

}
