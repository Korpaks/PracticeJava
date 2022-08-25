package ChakarsJavaTasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Week10MapSortByValues {

    // write a method that can sort the map by values

    public static Map<String, Integer> sortedByValue(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet()); // put the map inside the List
        list.sort(Map.Entry.comparingByValue());  // method to sort comparing by Value

        Map<String, Integer> sorted = new LinkedHashMap<>(); // creating new Map as a Linked Hash Map to preserve insertion order
        for (Map.Entry<String, Integer> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        return sorted;
    }

    public static Map <String, Integer> sortedByValue2(Map<String, Integer> map) {
       return  map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k1, v2) -> k1, LinkedHashMap::new));
        //TODO not working
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Two", 2);
        map.put("Twenty", 20);
        map.put("Thirty five", 35);
        map.put("One", 1);
        map.put("Five", 5);
        map.put("Eight", 8);
        map.put("Twelve", 12);
        map.put("-Six", -6);
        map.put("Eighteen", 18);

        System.out.println("Unsorted" + map);
        System.out.println("Sorted" + sortedByValue(map));

    }
}
