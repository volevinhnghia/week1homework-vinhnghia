
public class Main {
    public static void main(String[] args) {
        CharacterCount count = new CharacterCount();
        count.wordCounter("aaabcc");
        count.wordCounter("xyz");


        Inventory inv = new Inventory();
        Product newProd = new Product();
        newProd.name = "fgsga";
        newProd.price = 543.32;
        inv.put(newProd);
    }
}