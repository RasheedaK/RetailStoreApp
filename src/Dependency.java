class Dependency {
    RetailStoreApp initializeRetailStore() {
        RetailStoreApp retailStoreApp = new RetailStoreApp();
        retailStoreApp.addProduct(new Product(Category.ELECTRONICS, "Television", 20000));
        retailStoreApp.addProduct(new Product(Category.ELECTRONICS, "Vacuum Cleaner", 3000));
        retailStoreApp.addProduct(new Product(Category.ELECTRONICS, "Microwave Oven", 3500));
        retailStoreApp.addProduct(new Product(Category.FURNITURE, "Chair", 900));
        retailStoreApp.addProduct(new Product(Category.FURNITURE, "Table", 1500));
        retailStoreApp.addProduct(new Product(Category.FURNITURE, "Almirah", 5000));
        return retailStoreApp;
    }

    Menu setMenu() {
        Menu menu = new Menu();
        menu.addOption("1. Display Products");
        menu.addOption("2. Display Product Details");
        menu.addOption("3. Add Item To Cart");
        menu.addOption("4. Remove Item From Cart");
        menu.addOption("5. View Cart");
        menu.addOption("6. Exit");
        return menu;
    }
}
