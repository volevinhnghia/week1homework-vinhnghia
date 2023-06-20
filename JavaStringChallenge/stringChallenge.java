
public class stringChallenge {
    public String[] dedupe(String str) {
        char[] charArray = str.toCharArray();
        int[] asciiNumb = new int[100];
        
        int resultSize = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                continue;
            }
            asciiNumb[(int) charArray[i] - 32] += 1;
            if (asciiNumb[(int) charArray[i] -32] == 2) {
                resultSize++;
            }
        }
        String[] result = new String[resultSize];
        int j = 0;
        for (int i = 0; i < asciiNumb.length; i++) {
            //System.out.println((char) (i+32) + " = " + asciiNumb[i]);
            if (asciiNumb[i] > 1) {
                result[j] = String.valueOf((char) (i+32));
                j++;
            }
        }
        return result;
    }
    public char findChar(String str, int n) {
        if (str == null || str == "") {
            return '0';
        }
        char[] charArray = str.toCharArray();
        return charArray[n];
    }
    public String replace(String str, String param){
        if (str == "" || str == null) {
            return "null";
        }
        return str.replace("{}", param);
    }

}
