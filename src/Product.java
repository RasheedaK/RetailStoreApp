public abstract class Product {
    private Category category;
    private String name;
    private double price;
    abstract String getDetails();
    abstract double getPrice();
}
