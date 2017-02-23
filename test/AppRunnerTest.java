import org.junit.Test;

import static org.mockito.Mockito.*;

public class AppRunnerTest {
    @Test
    public void shouldCallDisplayProductsIfUserChoosesToDisplay() {
        RetailStoreApp retailStoreApp=mock(RetailStoreApp.class);
        AppRunner appRunner=new AppRunner(retailStoreApp);
        appRunner.run(1);
        verify(retailStoreApp,times(1)).displayProducts();
    }
    @Test
    public void shouldCallDisplayProductDetailsIfUserChoosesToDisplayAPArticularProductDetails() {
        RetailStoreApp retailStoreApp=mock(RetailStoreApp.class);
        AppRunner appRunner=new AppRunner(retailStoreApp);
        appRunner.run(2);
        verify(retailStoreApp,times(1)).displayProductDetails(anyString());
    }
    @Test
    public void shouldCallAddItemToCartIfUserChoosesToAdd() {
        RetailStoreApp retailStoreApp=mock(RetailStoreApp.class);
        AppRunner appRunner=new AppRunner(retailStoreApp);
        appRunner.run(3);
        verify(retailStoreApp,times(1)).addItemToCart(isA(Product.class));
    }
    @Test
    public void shouldCallRemoveItemFromCartIfUserChoosesToRemove() {
        RetailStoreApp retailStoreApp=mock(RetailStoreApp.class);
        AppRunner appRunner=new AppRunner(retailStoreApp);
        appRunner.run(4);
        verify(retailStoreApp,times(1)).removeItemFromCart(isA(Product.class));
    }
}