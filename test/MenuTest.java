import org.junit.Test;

import static org.junit.Assert.*;
public class MenuTest {
    @Test
    public void shouldAddMenuOptionOnCallingAddOption() {
        Menu menu=new Menu();
        menu.addOption("1. View Products\n");
        assertEquals("1. View Products",menu.showOptions());
    }
}