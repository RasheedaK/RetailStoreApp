import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
    @Test
    public void shouldReturnTotalPriceAs5400IfSumOfProductPricesIs5400() {
        Cart cart = new Cart();
        cart.addItem(new Product(Category.ELECTRONICS, "Microwave Oven", 3400));
        cart.addItem(new Product(Category.ELECTRONICS, "Vaccum cleaner", 2000));
        assertTrue(5400 == cart.getTotalPrice());
    }

    @Test
    public void shouldNotReturnTotalPriceAs400IfSumOfProductPricesIs400() {
        Cart cart = new Cart();
        cart.addItem(new Product(Category.ELECTRONICS, "Microwave Oven", 3400));
        cart.addItem(new Product(Category.ELECTRONICS, "Vaccum cleaner", 2000));
        assertFalse(400 == cart.getTotalPrice());
    }

    @Test
    public void shouldReturnAllProductsNamesOnCallingShowItems() {
        Product vacuumCleaner = new Product(Category.ELECTRONICS, "VacuumCleaner", 2300);
        Cart cart = new Cart();
        cart.addItem(vacuumCleaner);
        String expectedString = "VacuumCleaner";
        assertEquals(expectedString, cart.showItems());
    }

    @Test
    public void shouldReturnAsCartIsEmptyOnCallingShowItemsIfCartIsEmpty() {
        Cart cart = new Cart();
        String expectedString = "Cart Is Empty";
        assertEquals(expectedString, cart.showItems());
    }
    @Test
    public void shouldRemoveVaccumCleanerFromTheCartOnCallinRemoveItem() {
        Cart cart=new Cart();
        Product vaccumCleaner=new Product(Category.ELECTRONICS,"Vacuum Cleaner",4000);
        cart.addItem(vaccumCleaner);
        Product vacuumCleaner1=new Product(Category.ELECTRONICS,"Vacuum Cleaner",4000);
        cart.removeItem(vacuumCleaner1);
        assertFalse(cart.hasProduct(vaccumCleaner));
    }
    @Test
    public void shouldReturnTrueIfCartHasVaccumCleaneOnCallinhasProductOnVacuumCleaner() {
        Cart cart=new Cart();
        Product vaccumCleaner=new Product(Category.ELECTRONICS,"Vacuum Cleaner",4000);
        cart.addItem(vaccumCleaner);
        Product vacuumCleaner1=new Product(Category.ELECTRONICS,"Vacuum Cleaner",4000);
        assertTrue(cart.hasProduct(vacuumCleaner1));
    }
    @Test
    public void shouldAddItemToCartOnCallingAddItem() {
        Cart cart=new Cart();
        Product chair = new Product(Category.FURNITURE, "Chair", 2000);
        cart.addItem(chair);
        assertTrue(cart.hasProduct(chair));
    }
    @Test
    public void shouldRemoveItemToCartOnCallingRemoveItem() {
        Cart cart=new Cart();
        Product chair = new Product(Category.FURNITURE, "Chair", 2000);
        cart.removeItem(chair);
        assertFalse(cart.hasProduct(chair));
    }
}