import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
    public void shouldDisplaySuccesfullMessageOnCallingAddProduct() {
        RetailStoreApp retailStoreApp=new RetailStoreApp();
        Product vaccumCleaner=new VaccumCleaner(Category.ELECTRONICS,"Vaccum Cleaner",3000);
        String expectedString="Successfully Added To Store";
        assertEquals(expectedString,retailStoreApp.addProduct(vaccumCleaner));
    }
    @Test
    public void shouldDisplayProductDetailsOnCallingDisplayProductDetails() {
        VaccumCleaner dummy=new VaccumCleaner(Category.ELECTRONICS,"Vaccum Cleaner",3400);
        RetailStoreApp retailStoreApp=new RetailStoreApp();
        retailStoreApp.addProduct(dummy);
        String actualString=retailStoreApp.getProductDetails("Vaccum Cleaner");
        assertEquals("Category:ELECTRONICS\nName:Vaccum Cleaner\nPrice:3400.0",actualString);
    }
}