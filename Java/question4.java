

public class question4 {
    public static void main(String[] args) {
        char[] arrayChar = {'f','s','g','h','j'};
        String arrayCharToString = new String(arrayChar);
        String stringType = "fdsgfdsg";
        char[] stringToArrayChar = stringType.toCharArray();
        System.out.println("Array Char to string: " + arrayCharToString);
        System.out.println("String to char array: ");
        for(char element : stringToArrayChar){
            System.out.println(element);
        }
        
    }
}
