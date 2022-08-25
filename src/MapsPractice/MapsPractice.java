package MapsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice {

    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Arthur");
        map.put(20, "George");
        map.put(3, "Jack");
        map.put(40, "Emma");
        map.put(5, "Isabella");

        // Iterate by keys : keySet() rasssssssssss s sssssssss   deturn all keys, we use Set because we can't have duplicate

        for (Integer eachKey : map.keySet()) {
            System.out.println(eachKey);
        }
        System.out.println("-----------------------------");

        // Iterate by values : values() returns all values of the map as Collection

        for(String eachValue: map.values()){
            System.out.println(eachValue);
        }

        System.out.println("-----------------------------");
        // Iterate by entries : entrySet() : returns al; entries of map as Set

        for (Map.Entry<Integer, String> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
            System.out.println(eachEntry.getKey());// from each entry now it would give us each Key
            System.out.println(eachEntry.getValue());// from each entry now it would give us each Value
        }

    }
}
