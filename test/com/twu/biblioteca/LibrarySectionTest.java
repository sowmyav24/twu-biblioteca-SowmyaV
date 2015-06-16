package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibrarySectionTest {

    @Test
    public void shouldReturnListOfBookDetails() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualList = librarySection.toString();

        assertEquals("The Monk Who Sold His Ferrari, Robin Sharma, 2007\n", actualList);
    }

    @Test
    public void shouldReturnIfBookIsAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualResult = librarySection.checkoutBook("The Monk Who Sold His Ferrari");

        assertEquals("Thank you! Enjoy the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookIsNotAvailable() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(bookList,new ArrayList<Book>());

        String actualResult = librarySection.checkoutBook("The  Who Sold His Ferrari");

        assertEquals("That book is not available", actualResult);
    }

    @Test
    public void shouldReturnIfBookCanBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList);

        String actualResult = librarySection.returnBook("The Monk Who Sold His Ferrari");

        assertEquals("Thank you for returning the book", actualResult);
    }

    @Test
    public void shouldReturnFalseIfBookCannotBeReturned() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007"));
        LibrarySection librarySection = new LibrarySection(new ArrayList<Book>(),bookList);

        String actualResult = librarySection.returnBook("The Monk  Sold His Ferrari");

        assertEquals("That is not a valid book to return", actualResult);
    }
}