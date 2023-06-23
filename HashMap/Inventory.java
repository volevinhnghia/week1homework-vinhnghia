import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    HashMap<String, List<Product>> products = new HashMap<>();
    void put(Product product){
        if (products.containsKey(product.name)) {
            products.get(product.name).add(product);
        }else{
            products.put(product.name, new ArrayList<>(List.of(product)));
        }
    }
    List<Product> getProduct(String name){
        return products.get(name);
    } 
    void removeProduct(String name){
        products.remove(name);
    }
    double totalPrice(String name){
        double total = 0;
        for (Product product : products.get(name)) {
            total += product.price;
        }
        return total;
    }
    int totalCount(String name){
        return products.get(name).size();
    }

}
