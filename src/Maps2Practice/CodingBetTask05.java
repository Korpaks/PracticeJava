package Maps2Practice;

import java.util.HashMap;
import java.util.Map;

public class CodingBetTask05 {
    /*
    Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.


firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
     */
    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for(String each : strings){
            String addOnEach = "";
            if(map.containsKey(each.startsWith(each.substring(0,1)))) {
                each+=addOnEach;
                map.put(each.substring(0,1), each);
                addOnEach = each;
            }else {
                map.put(each.substring(0,1), each);
            }
        }
        return map; // TODO: 5/25/2022 not finished
    }
}
