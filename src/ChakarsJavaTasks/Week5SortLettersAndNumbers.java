package ChakarsJavaTasks;

import java.util.Arrays;
import java.util.Collections;

public class Week5SortLettersAndNumbers {
    /*
    Given alphanumeric String we need to split the string into substrings of consecutive leeters or numbers sort the individual string and append them back together
    Ex:"DC501GCCCA098911"
    return = "CD015ACCCG011899"
     */

    public static String sort(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length()-1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    result += ",";
                }
            }
            if (Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if (Character.isAlphabetic(str.charAt(i + 1)) ) {
                    result += ",";
                }
            }
        }
        String [] arr = result.split(",");
        String finalResult = "";
        for(String each : arr){
            char[] arrEach = each.toCharArray();// "DC,501,GCCCA,098911"
            Arrays.sort(arrEach); //DC -> [D,C] -> [C,D]
            for(char eachChar : arrEach){
                finalResult += eachChar;
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(sort("DC501GCCCA098911")); //CD015ACCCG011899

    }
}

