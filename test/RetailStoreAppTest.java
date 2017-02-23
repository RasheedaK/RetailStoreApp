import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RetailStoreAppTest {
    @Test
    public void shouldDisplayAllCategoryWiseProductsOnCallingDisplayProducts() {
        RetailStoreApp retailStoreApp = initializeRetailStore();
        List<String> products = retailStoreApp.displayProducts();
        assertEquals(2,products.size());
        assertEquals("Vacuum Cleaner\nTelevision\n",products.get(0));
        assertEquals("Chair\nTable\n",products.get(1));
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
        String actualString = retailStoreApp.displayProductDetails("Vaccum Cleaner");
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

    @Test
    public void shouldDisplayProductsInCartOnCallingViewCart() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vacuumCleaner);
        retailStoreApp.addItemToCart(vacuumCleaner);
        String expectedString = "Vacuum Cleaner";
        assertEquals(expectedString, retailStoreApp.viewCart());
    }
    private RetailStoreApp initializeRetailStore() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3000);
        Product chair=new Product(Category.FURNITURE,"Chair",400);
        Product television=new Product(Category.ELECTRONICS,"Television",20000);
        Product table=new Product(Category.FURNITURE,"Table",1000);
        retailStoreApp.addProduct(vacuumCleaner);
        retailStoreApp.addProduct(chair);
        retailStoreApp.addProduct(television);
        retailStoreApp.addProduct(table);
        return retailStoreApp;
    }
}