package com.richa;

/**
 * @author : rjuvekar
 * @created : 2/2/21, Tuesday
 **/
public class Person {

    String name = null;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {

        System.out.println("Name: " + name);

    }

}

