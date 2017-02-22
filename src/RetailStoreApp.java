import org.omg.PortableInterceptor.SUCCESSFUL;

import java.util.ArrayList;
import java.util.List;

class RetailStoreApp {
    private Cart cart;
    List<Product> products;
    RetailStoreApp() {
        this.products = new ArrayList<>();
        this.cart=new Cart();
    }

    String addProduct(Product product) {
        products.add(product);
        return "Successfully Added To Store";
    }

    String displayProducts() {
        String productsInStore="";
        for (Product product:products) {
            productsInStore+=product.getName()+'\n';
        }
        return productsInStore;
    }
}
