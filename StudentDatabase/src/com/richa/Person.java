package com.richa;

public class Person {

    String name = "";
    int personType = 0;        //0 is person, 1 is student, 2 is undergrad, 3 is grad

    public Person(String name) {
        this.name = name;
        personType = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonType() {
        return personType;
    }

    public void print() {
        System.out.println("Name: " + name);
    }

}

