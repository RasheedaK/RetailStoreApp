public class AppRunner {
    private static final int DISPLAY_PRODUCTS = 1;
    private final RetailStoreApp retailStoreApp;

    AppRunner(RetailStoreApp retailStoreApp) {
        this.retailStoreApp = retailStoreApp;
    }

    void run(int userOption) {
        switch (userOption){
            case DISPLAY_PRODUCTS:{
                retailStoreApp.displayProducts();
            }
        }

    }
}
