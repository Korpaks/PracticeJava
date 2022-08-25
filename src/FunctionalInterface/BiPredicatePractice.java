package FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicatePractice {
    public static void main(String[] args) {

        BiPredicate<int[], Integer> contains  = (array, num) -> {

            boolean result = false;
            for(int each : array){
                if(each == num){
                    result = true;
                    break;
                }
            }
            return result;
        };

        int[] arr = {1,5,8,3,5,22,87,54};
        System.out.println(contains.test(arr, 4));
    }
}
