package Maps2Practice;

import java.util.HashMap;
import java.util.Map;

public class CodingBetTask03 {
    /*
    Given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.


wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap();

        for(String each : strings){
            if(map.containsKey(each)){
                map.put(each, false);
            }else {
                map.put(each, true);
            }
        }
        return map;
    }
}
