package com.twu.authentication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldReturnUserDetails() {
        User user = new User("Name", "email", "phone", "logid", "pwd", "user");

        String userDetails = user.returnDetails();

        assertEquals("\nYour Details\nName|email|phone", userDetails);
    }

    @Test
    public void shouldMatchUserIdAndPassword() {
        User user = new User("Name", "email", "phone", "logid", "pwd", "role");

        Boolean actualResult = user.match("logid", "pwd");

        assertEquals(true, actualResult);
    }

    @Test
    public void shouldCheckIfLibrarian() {
        User user = new User("Name", "email", "phone", "logid", "pwd", "Librarian");

        Boolean actualResult = user.isLibrarian();

        assertEquals(true, actualResult);
    }
}