import org.junit.Test;

import static org.junit.Assert.*;
public class ProductTest {
    @Test
    public void shouldReturnProductDetailsOnCallingGetDetails() {
        Product product=new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        String expectedString="Category:ELECTRONICS\nName:Vaccum Cleaner\nPrice:3400.0";
        assertEquals(expectedString,product.getDetails());
    }
    @Test
    public void shouldReturnNameAsVacuumCleanerIfProductNameIsVacuumCleaner() {
        Product product=new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        String expectedString="Vacuum Cleaner";
        assertEquals(expectedString,product.getName());
    }
    @Test
    public void shouldNotReturnNameAsTelevisionIfProductNameIsVacuumCleaner() {
        Product product=new Product(Category.ELECTRONICS, "Vaccum Cleaner", 3400);
        String expectedString="Television";
        assertNotEquals(expectedString,product.getName());
    }
    @Test
    public void shouldReturnPriceAs3400IfProductPriceis3400() {
        Product product=new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        double expectedPrice=3400.0;
        assertEquals(expectedPrice,product.getPrice(),0.1);
    }
    @Test
    public void shouldNotReturnPriceAs400IfProductPriceis3400() {
        Product product=new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3400);
        double expectedPrice=400.0;
        assertNotEquals(expectedPrice,product.getPrice(),0.1);
    }
}