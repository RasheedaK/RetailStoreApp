public class AppRunner {
    private static final int DISPLAY_PRODUCTS = 1;
    private static final int DISPLAY_PRODUCT_DETAILS = 2;
    private final RetailStoreApp retailStoreApp;

    AppRunner(RetailStoreApp retailStoreApp) {
        this.retailStoreApp = retailStoreApp;
    }

    void run(int userOption) {
        switch (userOption){
            case DISPLAY_PRODUCTS:{
                retailStoreApp.displayProducts();
            }
            case DISPLAY_PRODUCT_DETAILS:{
                retailStoreApp.displayProductDetails("Vacuum Cleaner");
            }
        }

    }
}
