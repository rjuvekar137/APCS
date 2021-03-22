package com.richa;

public class PersonArray {

    Person[] people = null;

    public PersonArray() {
    }

    public void addPerson(String name, int age) {
        if ( people == null ) {
            people = new Person[1];
            people[0] = new Person(name, age);
        } else {
            Person[] people2 = new Person[people.length+1];
            for (int i=0; i<people.length; i++) {
                people2[i] = people[i];
            }
            people2[people.length] = new Person(name, age);
            people = people2;
        }
    }

    public int getNumPeople() {
        if ( people == null ) {
            return 0;
        }
        return people.length;
    }

    private Person[] selectionSortByName() {

        if ( people == null ) {
            return null;
        }

        // copy persons into new array to sort
        Person[] sortedPeople = new Person[people.length];
        for ( int i=0; i < people.length; i++ ) {
            sortedPeople[i] = people[i];
        }

        if ( sortedPeople.length <= 1 ) {
            return sortedPeople; // nothing to sort
        }

        int n = sortedPeople.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (sortedPeople[j].getName().compareToIgnoreCase(sortedPeople[min_idx].getName()) < 0) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            Person temp = sortedPeople[min_idx];
            sortedPeople[min_idx] = sortedPeople[i];
            sortedPeople[i] = temp;
        }

        return sortedPeople;
    }

    public void printAllPeopleByName() {

        if (getNumPeople() == 0) {
            System.out.println("There is currently no persons available. ");
            return;
        }

        Person[] sortedPeople = selectionSortByName();

        for (int i = 0; i < sortedPeople.length; i++) {
            Person person = sortedPeople[i];
            System.out.format("%-20s %-4d %n", person.getName(), person.getAge());
        }

    }

}
