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
        String products="";
        for (Category category : Category.values()) {
            productsInStore.add(groupProducts(category));
        }
        for (String product:productsInStore) {
            products+=product+"\n";
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
        return searchProduct(productName);
    }

    private String searchProduct(String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product.getDetails();
            }
        }
        return PRODUCT_NOT_FOUND;
    }

    String addItemToCart(Product product) {
        if (hasProduct(product)) {
            cart.addItem(product);
            return SUCCESSFULL_ADDITION_TO_CART;
        }
        return PRODUCT_NOT_FOUND;
    }

    private boolean hasProduct(Product product) {
        return products.contains(product);
    }

    String removeItemFromCart(Product product) {
        if (cart.hasProduct(product)) {
            cart.removeItem(product);
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
