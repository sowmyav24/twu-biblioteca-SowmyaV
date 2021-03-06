package com.twu.menuactions;

import com.twu.menuoptions.InvalidMenuOption;
import com.twu.menuoptions.ListItems;
import org.junit.Test;

import java.util.HashMap;

import static org.mockito.Mockito.*;

public class MenuTest {
    @Test
    public void shouldCallTheAppropriateAction() {
        HashMap<String, MenuActionPerformed> menuActionPerformed = new HashMap<>();
        ListItems listItems = mock(ListItems.class);
        menuActionPerformed.put("List LibrarySection", listItems);
        Menu menu = new Menu(menuActionPerformed);

        menu.compute("List LibrarySection", "abc");

        verify(listItems, times(1)).compute("abc");
    }

    @Test
    public void shouldCallTheInvalidOption() {
        HashMap<String, MenuActionPerformed> menuActionPerformed = new HashMap<>();
        ListItems listItems = mock(ListItems.class);
        InvalidMenuOption invalidMenuOption = mock(InvalidMenuOption.class);

        menuActionPerformed.put("List LibrarySection", listItems);
        menuActionPerformed.put("Invalid", invalidMenuOption);

        Menu menu = new Menu(menuActionPerformed);

        menu.compute("valid", "abc");

        verify(invalidMenuOption, times(1)).compute("abc");
    }
}