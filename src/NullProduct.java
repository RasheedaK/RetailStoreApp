public class NullProduct implements RetailProduct{
    public String getName() {
        return "No Product";
    }

    public String getDetails() {
        return "Product Not Found";
    }

    public double getPrice() {
        return 0;
    }

    public boolean isSameCategory(Category category) {
        return false;
    }


}
