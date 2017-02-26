import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<RetailProduct> items;

    public Cart() {
        items = new ArrayList<>();
    }

    void addItem(RetailProduct product) {
        items.add(product);
    }

    void removeItem(RetailProduct product) {
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
                addedItems += product.getName() + "\t" + product.getPrice() ;
            }
        } else
            addedItems += StringConstants.EMPTY_CART;
        return addedItems;
    }

    boolean hasProduct(RetailProduct product) {
        return items.contains(product);
    }

    private boolean isEmpty() {
        return items.size() == 0;
    }

}
