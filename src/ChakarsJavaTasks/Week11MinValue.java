package ChakarsJavaTasks;
import java.util.HashMap;
import java.util.Map;

public class Week11MinValue {

    //write a method that will return the minimum value from the map

    public static Map<String, Integer> minimumValue (Map<String,Integer> map){

        Map<String,Integer> minValueMap = new HashMap<>();
        int minValue = Integer.MAX_VALUE;

        for(Map.Entry<String,Integer> eachEntry : map.entrySet()){
            if(eachEntry.getValue()<minValue){
                minValue = eachEntry.getValue();
                minValueMap.put(eachEntry.getKey(), eachEntry.getValue());
            }
        }
        return minValueMap;
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

        System.out.println(minimumValue(map));

    }
}
