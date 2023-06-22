import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    HashMap<String, List<Product>> products = new HashMap<>();
    void put(Product product){
        List<Product> listOfProducts = new ArrayList<>(products.get(product.name));
        listOfProducts.add(product);
        System.out.println(products.get(product.name));
        System.out.println(listOfProducts);
    }
}
