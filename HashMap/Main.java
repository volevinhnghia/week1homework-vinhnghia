import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterCount count = new CharacterCount();
        count.wordCounter("aaabcc");
        count.wordCounter("xyz");
        count.wordCounter("");

        Inventory inv = new Inventory();
        Product myProduct1 = new Product("book", 12d);
        Product myProduct2 = new Product("pen", 6d);
        Product myProduct3 = new Product("notebook", 10d);
        Product myProduct4 = new Product("book", 12d);
        inv.put(myProduct1);
        inv.put(myProduct4);

        inv.put(myProduct3);
        inv.put(myProduct2);
        List<Product> listProductByName = inv.getProduct("book");
        if (listProductByName != null) {
            for (Product product : listProductByName) {
                System.out.println(product.name + "   " + product.price);
            }
        }
    }
}