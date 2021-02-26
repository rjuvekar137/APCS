package com.richa;

public class Double implements Number {

    double number = 0;

    public Double(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public Number add(Number num) {
        Double dblNum = (Double)num;
        return new Double(this.number + dblNum.getNumber());
    }

    @Override
    public Number subtract(Number num) {
        Double dblNum = (Double)num;
        return new Double(this.number - dblNum.getNumber());
    }

    @Override
    public Number multiply(Number num) {
        Double dblNum = (Double)num;
        return new Double(this.number * dblNum.getNumber());
    }

    @Override
    public Number divide(Number num) {
        Double dblNum = (Double)num;
        return new Double(this.number / dblNum.getNumber());
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
        return String.format("%.2f", number);
    }

}
