import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items;

    public Cart() {
        items=new ArrayList<>();
    }

    void addItem(Product product) {
        items.add(product);
    }

    double getTotalPrice() {
        return getSum();
    }

    private double getSum() {
        int sum=0;
        for (Product product:items) {
            sum+=product.getPrice();
        }
        return sum;
    }
}
