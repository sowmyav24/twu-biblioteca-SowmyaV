package com.twu.biblioteca;

public class BibliotecaApp {

    public void displayWelcomeMessage(Messages message) {
        System.out.println(message.greetUser());
    }

    public void displayMenu(Messages message) {
        System.out.println(message.displayMenu());
    }
}

