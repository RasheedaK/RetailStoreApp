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
}