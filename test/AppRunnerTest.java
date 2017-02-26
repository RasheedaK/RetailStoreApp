import org.junit.Test;

import static org.mockito.Mockito.*;

public class AppRunnerTest {
    @Test
    public void shouldCallDisplayProductsIfUserChoosesToDisplay() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);
        appRunner.run(1);
        verify(retailStoreApp, times(1)).displayProducts();
        verify(outputConsole, times(1)).print(anyString());
    }

    @Test
    public void shouldCallDisplayProductDetailsIfUserChoosesToDisplayAPArticularProductDetails() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);
        appRunner.run(2);
        verify(inputConsole, times(1)).takeInput();
        verify(retailStoreApp, times(1)).displayProductDetails(anyString());
        verify(outputConsole, times(1)).print(anyString());
    }

    @Test
    public void shouldCallAddItemToCartIfUserChoosesToAdd() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);
        appRunner.run(3);
        verify(inputConsole, times(1)).takeInput();
        verify(retailStoreApp, times(1)).addItemToCart(anyString());
        verify(outputConsole, times(1)).print(anyString());

    }

    @Test
    public void shouldCallRemoveItemFromCartIfUserChoosesToRemove() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);
        appRunner.run(4);
        verify(inputConsole, times(1)).takeInput();
        verify(retailStoreApp, times(1)).removeItemFromCart(anyString());
        verify(outputConsole, times(1)).print(anyString());

    }

    @Test
    public void shouldCallViewCartIfUserChoosesToViewCart() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);

        appRunner.run(5);
        verify(retailStoreApp, times(1)).viewCart();
    }

    @Test
    public void shouldCallExitIfUserChoosesToExitTheApp() {
        RetailStoreApp retailStoreApp = mock(RetailStoreApp.class);
        OutputConsole outputConsole = mock(OutputConsole.class);
        InputConsole inputConsole = mock(InputConsole.class);
        AppRunner appRunner = new AppRunner(retailStoreApp, outputConsole, inputConsole);
        appRunner.run(6);
        verify(retailStoreApp, times(1)).Exit();
    }
}