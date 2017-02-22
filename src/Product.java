public abstract class Product {
    private Category category;
    private String name;
    private double price;

    Product(Category category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getName() {
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
        return "Product{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
