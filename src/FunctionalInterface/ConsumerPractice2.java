package FunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsumerPractice2 {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Max", "Josh", "Greg", "Haley", "James", " Igor", "Muhtar"));

        names.forEach(n -> {
            if(n.startsWith("J")){
                System.out.println(n);
            }
        });
    }
}
