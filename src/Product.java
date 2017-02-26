public class Product implements RetailProduct {
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

    public String getDetails() {
        return "Category:" + category + "\nName:" + name + "\nPrice:" + price+"\n";
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isSameCategory(Category category) {
        return this.category.equals(category);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return Double.compare(product.price, price) == 0 && category == product.category && (name != null ? name.equals(product.name) : product.name == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = category != null ? category.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

