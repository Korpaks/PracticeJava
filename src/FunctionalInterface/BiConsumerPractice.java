package FunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerPractice {
    public static void main(String[] args) {

        BiConsumer<String, Integer> printMultipleTimes = (str, num) -> {

            for (int i = 0; i < num; i++) {
                System.out.println(str);
            }
        };
        printMultipleTimes.accept("string", 5);
    }
}
