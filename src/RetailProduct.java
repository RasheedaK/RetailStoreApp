public interface RetailProduct {
    String getName();
    String getDetails();
    double getPrice();
    boolean isSameCategory(Category category);
}
