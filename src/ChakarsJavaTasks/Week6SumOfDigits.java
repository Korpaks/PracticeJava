package ChakarsJavaTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Week6SumOfDigits {

    /*
    return method sum od digits in a string
     */

    public static int sumOfDigits(String str) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                list.add(Integer.parseInt("" + str.charAt(i)));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

        String str = "242j43kdfgk345jsg";
        System.out.println(sumOfDigits(str));
    }
}
