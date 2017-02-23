public class Product {
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
        return "Category:" + category + "\nName:" + name + "\nPrice:" + price;
    }

    double getPrice() {
        return this.price;
    }

    boolean isSameCategory(Category category) {
        return this.category.equals(category);
    }
}
