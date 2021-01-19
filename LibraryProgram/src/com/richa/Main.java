package com.richa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        library.addBook("Cat In The Hat","Dr. Seuss");
        library.addBook("The Grapes of Wrath", "John Steinbeck");
        library.addBook("To Kill A Mockingbird", "Harper Lee");
        library.addBook("Webster's Dictionary", "Webster");

        while (true) {

            // present menu of choices to user
            System.out.println(" ");
            System.out.println("Please select an option: ");
            System.out.println("1) Show all current book titles under an author's name in the library. ");
            System.out.println("2) Search for a book by title. ");
            System.out.println("3) Loan a book out.");
            System.out.println("4) Return a book. ");
            System.out.println("5) Show all book titles of borrowed books.  ");
            System.out.println("6) Show all book titles which are over two weeks late. ");
            System.out.println("7) Show the total number of books in the library at a given date. ");
            System.out.println("8) Quit the program. ");
            System.out.print("Choice: ");

            // read user's choice
            Scanner scanner = new Scanner(System.in);
            int userChoice = 0;
            try {
                userChoice = scanner.nextInt();
                scanner.nextLine();
            } catch(Exception e) {
                System.out.println("Bad input. Please enter a number between 1 and 8.");
                continue;
            }

            if (userChoice == 1) {

                library.printAllBooks();

            } else if (userChoice == 2) {

                System.out.println("Enter the title you would like to search for: ");
                String title = scanner.nextLine();

                library.searchBookByTitle(title);

            } else if (userChoice == 3) {

                System.out.println("Enter the title of the book that is to be loaned out: ");
                String title = scanner.nextLine();

                if (library.isBookAvailable(title)) {

                    System.out.println("Enter the borrower's name: ");
                    String borrowerName = scanner.nextLine();

                    int monthBorrowed=0, dayBorrowed=0, yearBorrowed=0;
                    while (true) {
                        try {
                            System.out.println("Enter the numerical month in which the book was borrowed: ");
                            monthBorrowed = scanner.nextInt();

                            System.out.println("Enter the numerical day on which the book was borrowed: ");
                            dayBorrowed = scanner.nextInt();

                            System.out.println("Enter the numerical year in which the book was borrowed: ");
                            yearBorrowed = scanner.nextInt();

                            if ( monthBorrowed < 1 || monthBorrowed > 12 ) {
                                System.out.println("Bad input for month. Try again.");
                                continue;
                            }
                            if ( dayBorrowed < 1 || dayBorrowed > 31 ) {
                                System.out.println("Bad input for day. Try again.");
                                continue;
                            }
                            if ( yearBorrowed < 2000 || yearBorrowed > 2021 ) {
                                System.out.println("Bad input for year. Try again.");
                                continue;
                            }
                            break;
                        } catch (Exception ex) {
                            System.out.println("Bad input for date. Try again.");
                        }
                    }
                    Date dateBorrowed = new Date(monthBorrowed, dayBorrowed, yearBorrowed);
                    dateBorrowed.verifyDate();

                    if (library.loanOutBook(title, borrowerName, dateBorrowed)) {

                        System.out.println("This book has been successfully loaned out. ");

                    } else {

                        System.out.println("Something went wrong. Try again. ");

                    }

                } else {

                    System.out.println("This book is not available at the time. ");

                }

            } else if (userChoice == 4) {

                System.out.println("Enter the title of the book that is to be returned: ");
                String title = scanner.nextLine();

                if (library.isBookBorrowed(title)) {

                   if (library.returnBook(title)) {
                       System.out.println("The book has been returned. ");
                   } else {

                    System.out.println("Something went wrong. Try again. ");

                   }

                } else {

                    System.out.println("This book is not loaned out at the time or does not exist. ");

                }

            } else if (userChoice == 5) {

                library.printBorrowedBooks();

            } else if (userChoice == 6) {
                int month, day, year;
                while (true) {
                    try {
                        System.out.println("Enter the numerical month for date: ");
                        month = scanner.nextInt();

                        System.out.println("Enter the numerical day for date: ");
                        day = scanner.nextInt();

                        System.out.println("Enter the numerical year for date: ");
                        year = scanner.nextInt();

                        if ( month < 1 || month > 12 ) {
                            System.out.println("Bad input for month. Try again.");
                            continue;
                        }
                        if ( day < 1 || day > 31 ) {
                            System.out.println("Bad input for day. Try again.");
                            continue;
                        }
                        if ( year < 2000 || year > 2021 ) {
                            System.out.println("Bad input for year. Try again.");
                            continue;
                        }
                        break;
                    } catch (Exception ex) {
                        System.out.println("Bad input for date. Try again.");
                    }
                }
                Date fromDate = new Date(month, day, year);
                fromDate.verifyDate();

                library.printLateBooks(fromDate);

            } else if (userChoice == 7) {

                library.printNotBorrowedBooks();

            } else if (userChoice == 8) {

                System.out.println("");
                System.out.println("Program is ending.");
                break; // end loop by breaking out

            } else {
                // ask user to enter proper choice
                System.out.println("Error: Please input a number between 1 and 8.");
            }
        }
    }
}
