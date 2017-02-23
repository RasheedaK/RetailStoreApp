import java.util.ArrayList;
import java.util.List;

class RetailStoreApp {
    private Cart cart;
    private List<Product> products;

    RetailStoreApp() {
        this.products = new ArrayList<>();
        this.cart = new Cart();
    }

    String addProduct(Product product) {
        products.add(product);
        return "Successfully Added To Store";
    }

    List<String> displayProducts() {
        List<String> productsInStore=new ArrayList<>();
        for (Category category:Category.values()) {
            productsInStore.add(groupProducts(category));
        }
      return productsInStore;
    }

    private String groupProducts(Category category) {
        String groupedProducts = "";
        for (Product product : products) {
            if(product.isSameCategory(category)) {
                groupedProducts += product.getName()+"\n";
            }
        }
        return groupedProducts;
    }

    String displayProductDetails(String productName) {
        String output = "";
        return searchProduct(productName, output);
    }

    private String searchProduct(String productName, String output) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                output += product.getDetails();
            } else {
                output += "Product Not Found";
            }
        }
        return output;
    }

    String addItemToCart(Product product) {
        if (hasProduct(product)) {
            cart.addItem(product);
            return "Item Successfully Added";
        } else {
            return "Item not found";
        }
    }

    private boolean hasProduct(Product product) {
        return products.contains(product);
    }

    String removeItemFromCart(Product product) {
        if (cart.hasProduct(product)) {
            cart.removeItem(product);
            return "Item Successfully Removed";
        } else {
            return "Item not in cart";
        }
    }

    String viewCart() {
        return cart.showItems();
    }
}
