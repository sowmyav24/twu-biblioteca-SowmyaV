package com.twu.items;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void shouldReturnBookDetails() {
        Book book = new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007");

        String actualDetails = book.toString();

        assertThat(actualDetails, is(equalTo("The Monk Who Sold His Ferrari | Robin Sharma | 2007")));
    }

    @Test
    public void shouldCheckIfBookNamesMatch() {
        Book book = new Book("BookName", "BookAuthor", "Year");

        Boolean actualResult = book.match("BookName");

        assertEquals(true, actualResult);
    }

    @Test
    public void shouldCheckIfBookNamesDoesNotMatch() {
        Book book = new Book("BookName", "BookAuthor", "Year");

        Boolean actualResult = book.equals(new String("Book"));

        assertEquals(false, actualResult);
    }
}
