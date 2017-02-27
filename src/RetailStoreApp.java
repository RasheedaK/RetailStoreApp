import java.util.ArrayList;
import java.util.List;

class RetailStoreApp {
    private Cart cart;
    private List<Product> products;

    RetailStoreApp() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
    }

    String addProduct(Product product) {
        products.add(product);
        return StringConstants.SUCCESSFULL_ADDITION;
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
        return searchProduct(productName).toString();
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
            return StringConstants.SUCCESSFULL_ADDITION_TO_CART;
        }
        return StringConstants.PRODUCT_NOT_FOUND;
    }

    String removeItemFromCart(String productName) {
        RetailProduct result = searchProduct(productName);
        if (cart.hasProduct(result)) {
            cart.removeItem(result);
            return StringConstants.SUCCESSFULL_REMOVAL_FROM_CART;
        }
        return StringConstants.PRODUCT_NOT_IN_CART;
    }

    String viewCart() {
        return "Items\n"+cart.showItems() + "\nTotal Price:" + cart.getTotalPrice();
    }

    void Exit() {
        System.exit(0);
    }
}
