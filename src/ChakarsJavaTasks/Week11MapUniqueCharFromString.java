package ChakarsJavaTasks;

import java.util.HashMap;
import java.util.Map;

public class Week11MapUniqueCharFromString {

    public static Map<String, Integer> uniqueChar(String str) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> unique = new HashMap<>();
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
        for(Map.Entry<String, Integer> eachEntry : map.entrySet()){
            if(eachEntry.getValue()==1){
                unique.put(eachEntry.getKey(), eachEntry.getValue());
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(uniqueChar(str));
    }
}
