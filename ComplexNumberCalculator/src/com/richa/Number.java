package com.richa;

/**
 * @author : rjuvekar
 * @created : 2/21/21, Sunday
 **/
public interface Number {

    public Number add(Number num);
    public Number subtract(Number num);
    public Number multiply(Number num);
    public Number divide(Number num);

    public boolean isNegative();
    public boolean isZero();
}
