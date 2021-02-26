package com.richa;

public class ComplexNumber implements Number {

    Number real = null;
    Number imaginary = null;

    public ComplexNumber(double real, double imaginary) {
        this.real = new Double(real);
        this.imaginary = new Double(imaginary);
    }

    public ComplexNumber(Fraction real, Fraction imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Number getReal() {
        return real;
    }

    public void setReal(Number real) {
        this.real = real;
    }

    public Number getImaginary() {
        return imaginary;
    }

    public void setImaginary(Number imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public Number add(Number num) {
        ComplexNumber complexNum = (ComplexNumber)num;
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = this.real.add(complexNum.real);
        result.imaginary = this.imaginary.add(complexNum.imaginary);
        return result;
    }

    @Override
    public Number subtract(Number num) {
        ComplexNumber complexNum = (ComplexNumber)num;
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = this.real.subtract(complexNum.real);
        result.imaginary = this.imaginary.subtract(complexNum.imaginary);
        return result;
    }

    @Override
    public Number multiply(Number num) {
        ComplexNumber complexNum = (ComplexNumber)num;
        ComplexNumber result = new ComplexNumber(0,0);
        result.real = this.real.multiply(complexNum.real).subtract(this.imaginary.multiply(complexNum.imaginary));
        result.imaginary = this.real.multiply(complexNum.imaginary).add(this.imaginary.multiply(complexNum.real));
        return result;
    }

    @Override
    public Number divide(Number num) {
        ComplexNumber complexNum = (ComplexNumber)num;
        ComplexNumber result = null;
        if ( this.real instanceof Double ) {
            Double real1 = (Double)this.real;
            Double imaginary1 = (Double)this.imaginary;
            Double real2 = (Double)complexNum.real;
            Double imaginary2 = (Double)complexNum.imaginary;
            Double numReal = (Double)this.real.multiply(complexNum.real).add(this.imaginary.multiply(complexNum.imaginary));;
            Double numImaginary = (Double)this.imaginary.multiply(complexNum.real).subtract(this.real.multiply(complexNum.imaginary));;;
            Double den = (Double)real2.multiply(real2).add(imaginary2.multiply(imaginary2));
            numReal = (Double)numReal.divide(den);
            numImaginary = (Double)numImaginary.divide(den);
            result = new ComplexNumber(numReal.getNumber(), numImaginary.getNumber());
        }
        if ( this.real instanceof Fraction ) {
            Fraction real1 = (Fraction)this.real;
            Fraction imaginary1 = (Fraction)this.imaginary;
            Fraction real2 = (Fraction)complexNum.real;
            Fraction imaginary2 = (Fraction)complexNum.imaginary;
            Fraction numReal = (Fraction)this.real.multiply(complexNum.real).add(this.imaginary.multiply(complexNum.imaginary));;
            Fraction numImaginary = (Fraction)this.imaginary.multiply(complexNum.real).subtract(this.real.multiply(complexNum.imaginary));;;
            Fraction den = (Fraction)real2.multiply(real2).add(imaginary2.multiply(imaginary2));
            numReal = (Fraction)numReal.divide(den);
            numImaginary = (Fraction)numImaginary.divide(den);
            result = new ComplexNumber(numReal, numImaginary);
        }
        return result;
    }

    @Override
    public boolean isNegative() {
        return false;
    }

    @Override
    public boolean isZero() {
        if ( real.isZero() && imaginary.isZero() ) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if ( isZero() ) {
            return "0";
        }
        if ( real.isZero() ) {
            return "" + imaginary + "i";
        }
        if ( imaginary.isZero() ) {
            return "" + real;
        }
        if ( imaginary.isNegative() ) {
            return "" + real + imaginary + "i";
        }
        return "" + real + "+" + imaginary + "i";
    }

}
