import org.junit.Test;

import static org.junit.Assert.*;
public class CartTest {
    @Test
    public void shouldReturnTotalPriceAs5400IfSumOfProductPricesIs5400() {
        Cart cart=new Cart();
        cart.addItem(new MicrowaveOven(Category.ELECTRONICS,"Microwave Oven",3400));
        cart.addItem(new VaccumCleaner(Category.ELECTRONICS,"Vaccum cleaner",2000));
        assertTrue(5400==cart.getTotalPrice());
    }
    @Test
    public void shouldNotReturnTotalPriceAs400IfSumOfProductPricesIs400() {
        Cart cart=new Cart();
        cart.addItem(new MicrowaveOven(Category.ELECTRONICS,"Microwave Oven",3400));
        cart.addItem(new VaccumCleaner(Category.ELECTRONICS,"Vaccum cleaner",2000));
        assertFalse(400==cart.getTotalPrice());
    }
}