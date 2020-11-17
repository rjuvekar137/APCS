package com.richa;

import java.util.Scanner;

public class Main {


    static final int MAX_EMPLOYEES = 10;                         // maximum number of employees
    static Employee[] employees = new Employee[MAX_EMPLOYEES];  // array to store employees
    static int counter = 0;                                     // count of employees stored

    public static void main(String[] args) {

        while (true) {

            // present menu of choices to user
            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Input information for a new employee. ");
            System.out.println("2) Output all current employee information. ");
            System.out.println("3) Output the information for a specific employee.");
            System.out.println("4) Output the name of the employee(s) with the highest sales and highest sales amount. ");
            System.out.println("5) Output the name of the employee(s) with the lowest sales and lowest sales amount.  ");
            System.out.println("6) Quit the program. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            if (userChoice == 1) { // Input information for a new employee.

                // check if we reached limit
                if (counter < MAX_EMPLOYEES) {

                    // read the employee information
                    System.out.println("Enter the employee's name: ");
                    String employeeName = scanner.next();

                    System.out.println("Enter the sales for quarter 1: ");
                    double quarter1 = scanner.nextDouble();

                    System.out.println("Enter the sales for quarter 2: ");
                    double quarter2 = scanner.nextDouble();

                    System.out.println("Enter the sales for quarter 3: ");
                    double quarter3 = scanner.nextDouble();

                    System.out.println("Enter the sales for quarter 4: ");
                    double quarter4 = scanner.nextDouble();

                    // create employee object and store information
                    Employee emp = new Employee(employeeName);
                    emp.setSalesQ1(quarter1);
                    emp.setSalesQ2(quarter2);
                    emp.setSalesQ3(quarter3);
                    emp.setSalesQ4(quarter4);

                    // add to the array
                    employees[counter] = emp;
                    counter++;

                } else {

                    System.out.println("You have reached the maximum for employee inputs.");

                }

            } else if (userChoice == 2) { // Output all current employee information.

                System.out.format("%-20s %-11s %-11s %-11s %-11s %-11s \n","Employee", "Q1 Sales", "Q2 Sales", "Q3 Sales",
                        "Q4 Sales", "Total Sales");
                for (int i = 0; i < counter; i++){

                    Employee emp = employees[i];
                    System.out.format("%-20s $%-10.2f $%-10.2f $%-10.2f $%-10.2f $%-10.2f \n",emp.getName(), emp.getSalesQ1(),
                            emp.getSalesQ2(), emp.getSalesQ3(), emp.getSalesQ4(), emp.getTotalSales());

                }

            } else if (userChoice == 3) { // Output the information for a specific employee.

                System.out.println("What is the name of the employee? ");
                String employeeName = scanner.next();

                // find the employee
                boolean found = false;
                for (int i = 0; i < counter; i++) {

                    Employee emp = employees[i];
                    if (emp.getName().equals(employeeName)) {

                        // print employee information
                        System.out.format("%-20s %-11s %-11s %-11s %-11s %-11s \n","Employee", "Q1 Sales", "Q2 Sales", "Q3 Sales",
                                "Q4 Sales", "Total Sales");
                        System.out.format("%-20s $%-10.2f $%-10.2f $%-10.2f $%-10.2f $%-10.2f \n",emp.getName(), emp.getSalesQ1(),
                                emp.getSalesQ2(), emp.getSalesQ3(), emp.getSalesQ4(), emp.getTotalSales());
                        found = true;

                    }
                }

                if (found == false) {

                    System.out.println("This name does not correspond with an employee.");

                }

            } else if (userChoice == 5) { // Output the name of the employee(s) with the lowest sales and lowest sales amount.

                // find the lowest sales
                double minSales = employees[0].getTotalSales();
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getTotalSales() < minSales) {
                        minSales = employees[i].getTotalSales();
                    }
                }
                // print employees with lowest sales
                System.out.println("The following employees have the lowest sales at " + String.format("$%-10.2f", minSales) + ": ");
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getTotalSales() == minSales) {
                        System.out.println(employees[i].getName());
                    }
                }

                // find the lowest sales amount
                double minSalesAmount = employees[0].getSalesQ1();
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getSalesQ1() < minSalesAmount) {
                        minSalesAmount = employees[i].getSalesQ1();
                    }

                    if (employees[i].getSalesQ2() < minSalesAmount) {
                        minSalesAmount = employees[i].getSalesQ2();
                    }

                    if (employees[i].getSalesQ3() < minSalesAmount) {
                        minSalesAmount = employees[i].getSalesQ3();
                    }

                    if (employees[i].getSalesQ4() < minSalesAmount) {
                        minSalesAmount = employees[i].getSalesQ4();
                    }
                }
                // print employees with lowest sales amount
                System.out.println("The following employees have the lowest sales amount at " + String.format("$%-10.2f", minSalesAmount) + ": ");
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getSalesQ1() == minSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ2() == minSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ3() == minSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ4() == minSalesAmount) {
                        System.out.println(employees[i].getName());
                    }
                }


            } else if (userChoice == 4) { // Output the name of the employee(s) with the highest sales and highest sales amount.

                // find highest sales
                double maxSales = employees[0].getTotalSales();
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getTotalSales() > maxSales) {
                        maxSales = employees[i].getTotalSales();
                    }
                }
                // print employees with highest sales
                System.out.println("The following employees have the highest sales at " + String.format("$%-10.2f", maxSales) + ": ");
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getTotalSales() == maxSales) {
                        System.out.println(employees[i].getName());
                    }
                }

                // print highest sales amount
                double maxSalesAmount = employees[0].getSalesQ1();
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getSalesQ1() > maxSalesAmount) {
                        maxSalesAmount = employees[i].getSalesQ1();
                    }

                    if (employees[i].getSalesQ2() > maxSalesAmount) {
                        maxSalesAmount = employees[i].getSalesQ2();
                    }

                    if (employees[i].getSalesQ3() > maxSalesAmount) {
                        maxSalesAmount = employees[i].getSalesQ3();
                    }

                    if (employees[i].getSalesQ4() > maxSalesAmount) {
                        maxSalesAmount = employees[i].getSalesQ4();
                    }
                }
                // print employees with highest sales amount
                System.out.println("The following employees have the highest sales amount at " + String.format("$%-10.2f", maxSalesAmount) + ": ");
                for (int i = 0; i < counter; i++) {
                    if (employees[i].getSalesQ1() == maxSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ2() == maxSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ3() == maxSalesAmount) {
                        System.out.println(employees[i].getName());
                    }

                    if (employees[i].getSalesQ4() == maxSalesAmount) {
                        System.out.println(employees[i].getName());
                    }
                }

            } else if (userChoice == 6) { // Quit the program.

                System.out.println("");
                System.out.println("Program is ending.");
                break; // end loop by breaking out

            } else {

                // ask user to enter proper choice
                System.out.println("Error: Please input a number between 1 and 6.");

            }

        }

    }

}
