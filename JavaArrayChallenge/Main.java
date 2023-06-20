import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        exceptionHandle arr = new exceptionHandle();
        try {
            System.out.println(Arrays.toString(arr.convert(args)));
        } catch (Exception e) {
           System.out.println("Have an exception: "+ e.getMessage());
        }
        
    }
}