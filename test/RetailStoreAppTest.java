import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class RetailStoreAppTest {
    @Test
    public void shouldDisplayAllProductsOnCallingDisplayProducts() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3000);
        retailStoreApp.addProduct(vaccumCleaner);
        String expectedString = "Vaccum Cleaner\n";
        assertEquals(expectedString, retailStoreApp.displayProducts());
    }

    @Test
    public void shouldDisplaySuccesfullMessageOnCallingAddProduct() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3000);
        String expectedString = "Successfully Added To Store";
        assertEquals(expectedString, retailStoreApp.addProduct(vaccumCleaner));
    }

    @Test
    public void shouldDisplayProductDetailsOnCallingDisplayProductDetails() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vaccumCleaner);
        String actualString = retailStoreApp.getProductDetails("Vaccum Cleaner");
        assertEquals("Category:ELECTRONICS\nName:Vaccum Cleaner\nPrice:3400.0", actualString);
    }

    @Test
    public void shouldDisplaySuccessfullMessageOnCallingAddItemToCart() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vaccumCleaner);
        String actualString = retailStoreApp.addItemToCart(vaccumCleaner);
        assertEquals("Item Successfully Added", actualString);
    }

    @Test
    public void shouldNotDisplaySuccessfullMessageOnCallingAddItemToCartIfProductIsNotInStore() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        String actualString = retailStoreApp.addItemToCart(vaccumCleaner);
        assertNotEquals("Item Successfully Added", actualString);
    }

    @Test
    public void shouldDisplaySuccessfullMessageOnCallingDeleteItemFromCart() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vaccumCleaner);
        retailStoreApp.addItemToCart(vaccumCleaner);
        String actualString = retailStoreApp.removeItemFromCart(vaccumCleaner);
        assertEquals("Item Successfully Removed", actualString);
    }

    @Test
    public void shouldNotDisplaySuccessfullMessageOnCallingDeleteItemFromCartIfItemIsNotAdded() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vaccumCleaner);
        String actualString = retailStoreApp.removeItemFromCart(vaccumCleaner);
        assertNotEquals("Item Successfully Removed", actualString);
    }
}