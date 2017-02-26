import java.util.ArrayList;
import java.util.List;

class RetailStoreApp {
    private Cart cart;
    private List<Product> products;
    private final String SUCCESSFULL_ADDITION = "Successfully Added To Store";
    private final String SUCCESSFULL_ADDITION_TO_CART = "Item Successfully Added to Cart";
    private final String SUCCESSFULL_REMOVAL_FROM_CART = "Item Successfully Removed";
    private final String PRODUCT_NOT_FOUND = "Product Not Found";
    private final String PRODUCT_NOT_IN_CART = "Item Not found in cart";

    RetailStoreApp() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
    }

    String addProduct(Product product) {
        products.add(product);
        return SUCCESSFULL_ADDITION;
    }

    String displayProducts() {
        List<String> productsInStore = new ArrayList<>();
        String products = "";
        for (Category category : Category.values()) {
            productsInStore.add(groupProducts(category));
        }
        for (String product : productsInStore) {
            products += product + "\n";
        }
        return products;
    }

    private String groupProducts(Category category) {
        String groupedProducts = "";
        for (Product product : products) {
            if (product.isSameCategory(category)) {
                groupedProducts += product.getName() + "\n";
            }
        }
        return groupedProducts;
    }

    String displayProductDetails(String productName) {
        return searchProduct(productName).getDetails();
    }

    private RetailProduct searchProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return new NullProduct();
    }

    String addItemToCart(String productName) {
        RetailProduct result = searchProduct(productName);
        if (!(result instanceof NullProduct)) {
            cart.addItem(result);
            return SUCCESSFULL_ADDITION_TO_CART;
        }
        return PRODUCT_NOT_FOUND;
    }

    String removeItemFromCart(String productName) {
        RetailProduct result = searchProduct(productName);
        if (cart.hasProduct(result)) {
            cart.removeItem(result);
            return SUCCESSFULL_REMOVAL_FROM_CART;
        }
        return PRODUCT_NOT_IN_CART;
    }

    String viewCart() {
        return cart.showItems() + "\n" + cart.getTotalPrice();
    }

    void Exit() {
        System.exit(1);
    }
}
