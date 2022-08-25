package MapsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapsPractice2 {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Arthur"); // put() method that will place the new value to the Map, we need 2 arguments first one is key and second is value
        map.put(20, "George");
        map.put(3, "Jack");
        map.put(40, "Emma");
        map.put(5, "Isabella");

        // size() : return the size of the method, number of pairs
        System.out.println(map.size());

        // get(key) : return the value of the given key from the map, because the key has to be unique
        System.out.println(map.get(20));

        //replace(key, value) : replace the value of the given key
        map.replace(10, "Igor");
        System.out.println(map);

        //remove(key) : removes the given key, and it's value from the map
        //map.remove(3); // size decreases by 1
        System.out.println(map);

        //containsKey(key) : checks if the given key is contained in the map, returns boolean
        System.out.println(map.containsKey(25)); // false because we don't have 25 in the map
        System.out.println(map.containsKey(5)); // true because we have 5 in the map

        //containsValue(value) : checks if the given value is contained in the map, returns boolean
        System.out.println(map.containsValue("James")); //false because we don't have "James" in the map
        System.out.println(map.containsValue("Emma")); //true because we have "Emma" in the map

        //isEmpty() : checks if the size of the map is 0, returns boolean
        System.out.println(map.isEmpty()); // false because we have values and keys in it

        //equals(MapObject) : checks if the map is equal o the given map in the args, returns boolean
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(10, "Igor");
        map2.put(20, "George");
        map2.put(3, "Jack");
        map2.put(40, "Emma");
        map2.put(5, "Isabella");

        System.out.println(map.equals(map2)); // will return true because the key are matching the values in both maps

        //clear() : removes all keys and values from the map, size will be set to 0
        map.clear();
        System.out.println(map);// map is empty
        System.out.println(map.size());// map size is 0
    }
}
