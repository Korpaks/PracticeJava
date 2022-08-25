package Maps2Practice;

import java.util.HashMap;
import java.util.Map;

public class CodingBetTask06 {
    /*
    Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.


pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */
    public Map<String, String> pairs(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (String each : strings){
            map.put(each.substring(0,1), each.substring(each.length()-1));
        }
        return map;
    }
}
