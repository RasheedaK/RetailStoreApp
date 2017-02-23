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
}
