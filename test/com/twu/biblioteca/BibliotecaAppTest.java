package com.twu.biblioteca;

import com.twu.authentication.LoginAuthentication;
import com.twu.menuactions.MenuController;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    @Test
    public void shouldExitWhenUserEnterQuit() {
        BibliotecaAppView bibliotecaAppViewStub = mock(BibliotecaAppView.class);
        when(bibliotecaAppViewStub.readInput())
                .thenReturn("List Books,Quit", "Quit");
        MenuController menuControllerStub = mock(MenuController.class);
        LoginAuthentication loginAuthentication = mock(LoginAuthentication.class);
        BibliotecaApp bibliotecaApp = new BibliotecaApp(bibliotecaAppViewStub, menuControllerStub,loginAuthentication);

        bibliotecaApp.start("xyz");

        verify(bibliotecaAppViewStub, times(6)).displayMessage(anyString());
    }
}