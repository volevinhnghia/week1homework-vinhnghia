import java.util.Arrays;
import java.util.stream.Collectors;

public class exceptionHandle {
    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public double[] convert(String[] numbers) {
        double[] result = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            double sum = 0;
            if (numbers[i].length() > 1 && !isDouble(numbers[i])) {
                String[] newString = numbers[i].chars().boxed().map(Integer::toOctalString)
                        .collect(Collectors.joining("-")).split("-");
                // System.out.println(Arrays.toString(newString));
                for (String string : newString) {
                    sum += Double.parseDouble(string);
                }
                // System.out.println(sum);
                result[i] = sum;
                continue;
            }
            if (isDouble(numbers[i])) {
                result[i] = Double.parseDouble(numbers[i]);
                continue;
            }
            result[i] = Double.parseDouble(numbers[i].chars().boxed().map(Integer::toOctalString)
                    .collect(Collectors.joining("-")));

            // toOctal += numbers[i].chars().boxed().map(Integer::toOctalString)
            // .collect(Collectors.joining("-")) + "-";
            // System.out.println(numbers[i].chars().boxed().map(Integer::toOctalString)
            // .collect(Collectors.joining("-")));
        }
        // System.out.println(toOctal);
        // String[] stringArray = toOctal.split("-");
        // for (int i = 0; i < stringArray.length; i++) {
        // if(isDouble(numbers[i])){
        // result[i] = Double.parseDouble(numbers[i]);
        // continue;
        // }
        // result[i] = Double.parseDouble(stringArray[i]);
        // }
        return result;
    }
}
