import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RetailStoreAppTest {
    @Test
    public void shouldDisplayAllProductsOnCallingDisplayProducts() {
        RetailStoreApp retailStoreApp=new RetailStoreApp();
        Product vaccumCleaner=new VaccumCleaner(Category.ELECTRONICS,"Vaccum Cleaner",3000);
        retailStoreApp.addProduct(vaccumCleaner);
        String expectedString="Vaccum Cleaner\n";
        assertEquals(expectedString,retailStoreApp.displayProducts());
    }
    @Test
    public void shouldDisplaySuccesfulMessageOnCallingAddProduct() {
        RetailStoreApp retailStoreApp=new RetailStoreApp();
        Product vaccumCleaner=new VaccumCleaner(Category.ELECTRONICS,"Vaccum Cleaner",3000);
        String expectedString="Successfully Added To Store";
        assertEquals(expectedString,retailStoreApp.addProduct(vaccumCleaner));
    }
}