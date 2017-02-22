import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    void addItem(Product product) {
        items.add(product);
    }
    void removeItem(Product product) {
        items.remove(product);
    }

    double getTotalPrice() {
        return getSum();
    }

    private double getSum() {
        int sum = 0;
        for (Product product : items) {
            sum += product.getPrice();
        }
        return sum;
    }

    String showItems() {
        String addedItems="";
        for (Product product:items) {
            addedItems+=product.getDetails();
        }
        return addedItems;
    }

    boolean hasProduct(Product product) {
        return items.contains(product);
    }
}
