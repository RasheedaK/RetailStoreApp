import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RetailStoreAppTest {
    @Test
    public void shouldDisplayAllCategoryWiseProductsOnCallingDisplayProducts() {
        RetailStoreApp retailStoreApp = initializeRetailStore();
        assertEquals("Vacuum Cleaner\nTelevision\n\nChair\nTable\n\n", retailStoreApp.displayProducts());
    }

    @Test
    public void shouldDisplaySuccessfulMessageOnCallingAddProduct() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3000);
        String expectedString = "Successfully Added To Store\n";
        assertEquals(expectedString, retailStoreApp.addProduct(vacuumCleaner));
    }

    @Test
    public void shouldDisplayProductDetailsOnCallingDisplayProductDetails() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vacuumCleaner);
        String actualString = retailStoreApp.displayProductDetails("Vacuum Cleaner");
        assertEquals("Category:ELECTRONICS\nName:Vacuum Cleaner\nPrice:3400.0\n", actualString);
    }

    @Test
    public void shouldDisplaySuccessfulMessageOnCallingAddItemToCart() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vacuumCleaner);
        String actualString = retailStoreApp.addItemToCart("Vacuum Cleaner");
        assertEquals("Item Successfully Added to Cart\n", actualString);
    }

    @Test
    public void shouldNotDisplaySuccessfulMessageOnCallingAddItemToCartIfProductIsNotInStore() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        String actualString = retailStoreApp.addItemToCart("Vacuum Cleaner");
        assertNotEquals("Item Successfully Added", actualString);
    }

    @Test
    public void shouldDisplaySuccessfulMessageOnCallingDeleteItemFromCart() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vacuumCleaner);
        retailStoreApp.addItemToCart("Vacuum Cleaner");
        String actualString = retailStoreApp.removeItemFromCart("Vacuum Cleaner");
        assertEquals("Item Successfully Removed\n", actualString);
    }

    @Test
    public void shouldNotDisplaySuccessfulMessageOnCallingDeleteItemFromCartIfItemIsNotAdded() {
        Product vaccumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vaccumCleaner);
        String actualString = retailStoreApp.removeItemFromCart("Vacuum Cleaner");
        assertNotEquals("Item Successfully Removed", actualString);
    }

    @Test
    public void shouldDisplayProductsInCartOnCallingViewCart() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(vacuumCleaner);
        retailStoreApp.addItemToCart("vacuum Cleaner");
        String expectedString = "Items\nVacuum Cleaner\t3400.0\nTotal Price:3400.0";
        assertEquals(expectedString, retailStoreApp.viewCart());
    }

    private RetailStoreApp initializeRetailStore() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3000);
        Product chair = new Product(Category.FURNITURE, "Chair", 400);
        Product television = new Product(Category.ELECTRONICS, "Television", 20000);
        Product table = new Product(Category.FURNITURE, "Table", 1000);
        retailStoreApp.addProduct(vacuumCleaner);
        retailStoreApp.addProduct(chair);
        retailStoreApp.addProduct(television);
        retailStoreApp.addProduct(table);
        return retailStoreApp;
    }
}