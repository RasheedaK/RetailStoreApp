public abstract class Product {
    private Category category;
    private String name;
    private double price;

    Product(Category category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name;
    }

    String getDetails() {
        return toString();
    }

    double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Category:" + category + "\nName:" + name + "\nPrice:" + price;
    }
}
