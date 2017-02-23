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
}