package FunctionalInterface;

import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {

        Predicate<Integer> isEven = n-> {

            return n % 2 == 0;

        };

        System.out.println(isEven.test(300));

        Predicate<String> isPalindrome = str -> {

            String reverse = "";

            for (int i = str.length()-1; i >=0 ; i--) {
                reverse+= str.charAt(i);
            }
            return reverse.equals(str);
        };

        System.out.println(isPalindrome.test("racecar"));


    }
}
