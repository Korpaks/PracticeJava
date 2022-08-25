package ChakarsJavaTasks;

import Practice.Season;

import java.util.Arrays;

public class Week4SameLetter {
    /*
    Write a return method that check if a string is a build out of the same letter in another string
     */

    public static boolean Anagram(String one, String two){

        one = one.replaceAll(" ", "");
        two = two.replaceAll(" ", "");

        if(one.length() != two.length()){
            return false;
        }else {
            for (int i = 0; i < one.length(); i++) {
                char each = one.charAt(i);

                two.replaceFirst(each+"", "");
            }

        }
        return two.isEmpty();
    }

    public static boolean Anagram2 (String one, String two){

        char[] first = one.toCharArray();
        char[] second = two.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static boolean Anagram3 (String str1, String str2){
        str1.replaceAll(" ", "").trim();
        str2.replaceAll(" ", "").trim();

        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            char each1 = str1.charAt(i);

            for (int j = 0; j < str2.length(); j++) {
                char each2 = str2.charAt(j);

                if(each1 == each2){
                    count++;
                    if(count==1){
                        continue;
                    }
                }
            }
        }
        return count == str1.length();
    }

    public static void main(String[] args) {

        System.out.println(Anagram3("abc", "cab"));
        System.out.println(Anagram("abc", "cab"));
        System.out.println(Anagram2("debit card", "bad credit"));

    }
}
