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
    Menu setMenu(){
        Menu menu=new Menu();
        menu.addOption("Display Products");
        menu.addOption("Display Product Details");
        menu.addOption("Add Item To Cart");
        menu.addOption("Remove Item From Cart");
        menu.addOption("View Cart");
        menu.addOption("Exit");
        return menu;
    }
}
