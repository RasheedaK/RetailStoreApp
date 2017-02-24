import java.util.List;

public class AppRunner {
    private static final int DISPLAY_PRODUCTS = 1;
    private static final int DISPLAY_PRODUCT_DETAILS = 2;
    private static final int ADD_ITEM_TO_CART = 3;
    private static final int REMOVE_ITEM_FROM_CART = 4;
    private static final int VIEW_CART = 5;
    private static final int EXIT = 6;
    private final RetailStoreApp retailStoreApp;
    private final OutputConsole outputConsole;

    AppRunner(RetailStoreApp retailStoreApp,OutputConsole outputConsole) {
        this.retailStoreApp = retailStoreApp;
        this.outputConsole = outputConsole;
    }

    void run(int userOption) {
        switch (userOption) {
            case 1:
                outputConsole.print(retailStoreApp.displayProducts());
                break;

            case DISPLAY_PRODUCT_DETAILS: {
                outputConsole.print(retailStoreApp.displayProductDetails("Vacuum Cleaner"));
                break;
            }
            case ADD_ITEM_TO_CART: {
                outputConsole.print(retailStoreApp.addItemToCart(new Product(Category.ELECTRONICS, "Tv", 20000)));
                break;
            }
            case REMOVE_ITEM_FROM_CART: {
                outputConsole.print(retailStoreApp.removeItemFromCart(new Product(Category.ELECTRONICS, "Tv", 20000)));
                break;
            }
            case VIEW_CART: {
                outputConsole.print(retailStoreApp.viewCart());
                break;
            }
            case EXIT: {
                retailStoreApp.Exit();
                break;
            }
        }

    }
}
