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

    public Person sequentialSearch(String name) {
        int nComparisons = 0;
        if ( people == null ) {
            System.out.println(name + " not found with sequential search because there are no persons");
            return null; // empty array
        }
        for (int i=0; i<people.length; i++) {
            nComparisons++;
            if ( people[i].getName().equalsIgnoreCase(name) ) {
                System.out.println(name + " found with sequential search with "+nComparisons+" comparisons");
                return people[i];
            }
        }
        System.out.println(name + " not found with sequential search with "+nComparisons+" comparisons");
        return null; // not found
    }

    public Person binarySearch(String name) {
        int nComparisons = 0;
        if ( people == null ) {
            System.out.println(name + " not found with binary search because there are no persons");
            return null; // empty array
        }

        // get sorted list for binary search
        Person[] sortedPeople = selectionSortByName();

        // do the binary search
        int low = 0, high = sortedPeople.length-1;
        while ( low <= high ) {
            nComparisons++;
            int mid = (low+high)/2;
            if ( sortedPeople[mid].getName().compareToIgnoreCase(name) < 0 ) {
                low = mid + 1;
            } else if ( sortedPeople[mid].getName().compareToIgnoreCase(name) > 0 ) {
                high = mid - 1;
            } else if ( sortedPeople[mid].getName().compareToIgnoreCase(name) == 0 ) {
                System.out.println(name + " found with binary search with "+nComparisons+" comparisons");
                return sortedPeople[mid];
            }
        }

        System.out.println(name + " not found with binary search with "+nComparisons+" comparisons");
        return null; // not found
    }

    public void printAllPeopleByName() {

        if (getNumPeople() == 0) {
            System.out.println("There are currently no persons available. ");
            return;
        }

        Person[] sortedPeople = selectionSortByName();

        for (int i = 0; i < sortedPeople.length; i++) {
            Person person = sortedPeople[i];
            System.out.format("%-20s %-4d %n", person.getName(), person.getAge());
        }

    }

    public boolean  modify(String oldName, String newName, int newAge) {

        if ( people == null ) {
            return false; // no persons, not found
        }

        // find and modify the person
        for (int i=0; i<people.length; i++) {
            if ( people[i].getName().equalsIgnoreCase(oldName) ) {
                people[i].setName(newName);
                people[i].setAge(newAge);
                return true; // found
            }
        }

        return false; // not found
    }

    public boolean delete(String name) {

        if ( people == null ) {
            return false; // no persons, not found
        }
        if ( people.length == 1) {
            if ( people[0].getName().equalsIgnoreCase(name) ) {
                people = null; // only one entry to make array null
                return true; // found
            }
            return false; // not found
        }

        // find and delete the person
        for (int i=0; i<people.length; i++) {
            if ( people[i].getName().equalsIgnoreCase(name) ) {

                Person[] people2 = new Person[people.length-1];
                for (int j=0; j<i; j++) {
                    people2[j] = people[j]; // copy over
                }
                for (int j=i+1; j<people.length; j++) {
                    people2[j-1] = people[j]; // copy over
                }
                people = people2; // replace array with new array
                return true; // found
            }
        }

        return false; // not found
    }

}
