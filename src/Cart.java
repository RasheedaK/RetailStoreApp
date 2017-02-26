import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<RetailProduct> items;
    private final String EMPTY_CART = "Cart Is Empty";

    public Cart() {
        items = new ArrayList<>();
    }

    void addItem(RetailProduct product) {
        items.add(product);
    }

    void removeItem(Product product) {
        items.remove(product);
    }

    double getTotalPrice() {
        int sum = 0;
        for (RetailProduct product : items) {
            sum += product.getPrice();
        }
        return sum;
    }

    String showItems() {
        String addedItems = "";
        if (!isEmpty()) {
            for (RetailProduct product : items) {
                addedItems += product.getName() + "\t" + product.getPrice() + "\n";
            }
        } else
            addedItems += EMPTY_CART;
        return addedItems;
    }

    boolean hasProduct(Product product) {
        return items.contains(product);
    }

    private boolean isEmpty() {
        return items.size() == 0;
    }

}
