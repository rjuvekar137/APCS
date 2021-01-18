package com.richa;
import java.util.ArrayList;

/**
 * @author : rjuvekar
 * @created : 1/12/21, Tuesday
 **/
public class Library {

    ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author) {

        Book book = new Book(title, author);
        books.add(book);

    }

    public void printAllBooks() {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.format("Title: %-30s Author: %s%n", book.title, book.author);
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book.title);
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no title that matches your search.");
        }
    }

    public boolean isBookAvailable(String title) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title.equalsIgnoreCase(title) && book.getBorrowerName() == null) {
                return true;
            }
        }

        return false;

    }

    public boolean loanOutBook(String title, String borrowerName, Date borrowedDate) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title.equalsIgnoreCase(title) && book.getBorrowerName() == null) {
                book.setBorrowerName(borrowerName);
                book.setDateBorrowed(borrowedDate);
                return true;
            }
        }

        return false;

    }

    public boolean returnBook(String title) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title.equalsIgnoreCase(title) && book.getBorrowerName() != null) {
                book.setBorrowerName(null);
                book.setDateBorrowed(null);
                return true;
            }
        }

        return false;

    }

    public boolean isBookBorrowed(String title) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.title.equalsIgnoreCase(title) && book.getBorrowerName() != null) {
                return true;
            }
        }

        return false;

    }
}