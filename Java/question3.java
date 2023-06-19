public class question3 {
    public static void main(String[] args) {
        int intType = 231;
        long longType = intType;
        long newLongType = 342546333;
        int newIntType = (int)newLongType;
        System.out.println("int to long: "+ longType);
        System.out.println("long to int: "+ newIntType);
    }
}
