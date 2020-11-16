package com.richa;

public class Employee {

    private String name = null;
    private double salesQ1 = 0;
    private double salesQ2 = 0;
    private double salesQ3 = 0;
    private double salesQ4 = 0;

    public Employee(String n) {

        name = n;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getSalesQ1() {

        return salesQ1;
    }

    public void setSalesQ1(double salesQ1) {

        this.salesQ1 = salesQ1;
    }

    public double getSalesQ2() {

        return salesQ2;
    }

    public void setSalesQ2(double salesQ2) {

        this.salesQ2 = salesQ2;
    }

    public double getSalesQ3() {

        return salesQ3;
    }

    public void setSalesQ3(double salesQ3) {

        this.salesQ3 = salesQ3;
    }

    public double getSalesQ4() {

        return salesQ4;
    }

    public void setSalesQ4(double salesQ4) {

        this.salesQ4 = salesQ4;
    }

    public double getTotalSales() {

        double totalSales = salesQ1 + salesQ2 + salesQ3 + salesQ4;
        return totalSales;
        
    }
}
