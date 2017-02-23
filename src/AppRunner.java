public class AppRunner {
    private static final int DISPLAY_PRODUCTS = 1;
    private static final int DISPLAY_PRODUCT_DETAILS = 2;
    private static final int ADD_ITEM_TO_CART = 3;
    private static final int REMOVE_ITEM_FROM_CART = 4;
    private static final int VIEW_CART = 5;
    private final RetailStoreApp retailStoreApp;

    AppRunner(RetailStoreApp retailStoreApp) {
        this.retailStoreApp = retailStoreApp;
    }

    void run(int userOption) {
        switch (userOption) {
            case DISPLAY_PRODUCTS: {
                retailStoreApp.displayProducts();
            }
            case DISPLAY_PRODUCT_DETAILS: {
                retailStoreApp.displayProductDetails("Vacuum Cleaner");
            }
            case ADD_ITEM_TO_CART: {
                retailStoreApp.addItemToCart(new Product(Category.ELECTRONICS, "Tv", 20000));
            }
            case REMOVE_ITEM_FROM_CART: {
                retailStoreApp.removeItemFromCart(new Product(Category.ELECTRONICS, "Tv", 20000));
            }
            case VIEW_CART: {
                retailStoreApp.viewCart();
            }
        }

    }
}
