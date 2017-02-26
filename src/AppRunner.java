public class AppRunner {

    private final RetailStoreApp retailStoreApp;
    private final OutputConsole outputConsole;
    private final InputConsole inputConsole;

    AppRunner(RetailStoreApp retailStoreApp, OutputConsole outputConsole, InputConsole inputConsole) {
        this.retailStoreApp = retailStoreApp;
        this.outputConsole = outputConsole;
        this.inputConsole = inputConsole;
    }

    void run(int userOption) {
        switch (userOption) {
            case StringConstants.DISPLAY_PRODUCTS: {
                outputConsole.print(retailStoreApp.displayProducts());
                break;
            }
            case StringConstants.DISPLAY_PRODUCT_DETAILS: {
                outputConsole.print(StringConstants.USER_MESSAGE);
                outputConsole.print(retailStoreApp.displayProductDetails(inputConsole.takeInput()));
                break;
            }
            case StringConstants.ADD_ITEM_TO_CART: {
                outputConsole.print(StringConstants.USER_MESSAGE);
                outputConsole.print(retailStoreApp.addItemToCart(inputConsole.takeInput()));
                break;
            }
            case StringConstants.REMOVE_ITEM_FROM_CART: {
                outputConsole.print(StringConstants.USER_MESSAGE);
                outputConsole.print(retailStoreApp.removeItemFromCart(inputConsole.takeInput()));
                break;
            }
            case StringConstants.VIEW_CART: {
                outputConsole.print(retailStoreApp.viewCart());
                break;
            }
            case StringConstants.EXIT: {
                retailStoreApp.Exit();
                break;
            }
        }

    }
}
