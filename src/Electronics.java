import java.util.List;

public class Electronics implements Category{
    private List<Product> products;

    @Override
    public List<Product> getList() {
        return this.products;
    }
}
