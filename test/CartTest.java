import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CartTest {
    @Test
    public void shouldReturnTotalPriceAs5400IfSumOfProductPricesIs5400() {
        Cart cart=new Cart();
        cart.addItem(new Product(Category.ELECTRONICS,"Microwave Oven",3400));
        cart.addItem(new Product(Category.ELECTRONICS,"Vaccum cleaner",2000));
        assertTrue(5400==cart.getTotalPrice());
    }
    @Test
    public void shouldNotReturnTotalPriceAs400IfSumOfProductPricesIs400() {
        Cart cart=new Cart();
        cart.addItem(new Product(Category.ELECTRONICS,"Microwave Oven",3400));
        cart.addItem(new Product(Category.ELECTRONICS,"Vaccum cleaner",2000));
        assertFalse(400==cart.getTotalPrice());
    }
    @Test
    public void shouldReturnAllProductDetailsOnCallingShowItems() {
        Product dummy=mock(Product.class);
        Cart cart=new Cart();
        cart.addItem(dummy);
        cart.showItems();
        verify(dummy,times(1)).getName();
    }
}