package ChakarsJavaTasks;

import java.util.HashMap;
import java.util.Map;

public class Week11MapFrequencyOfChar {

    public static Map<String, Integer> frequencyOfChar(String str) {
       Map<String, Integer> map = new HashMap<>();
       String[] arr = str.split("");
        for (String each : arr){

            if(map.containsKey(each)){
                map.put(each, map.get(each) + 1);
            }else if(each.equals(" ")){
                continue;
            }else{
                map.put(each, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(frequencyOfChar(str));
    }
}

