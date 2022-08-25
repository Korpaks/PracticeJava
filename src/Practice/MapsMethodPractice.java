package Practice;

import java.util.*;

public class MapsMethodPractice {
    /*
    Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:









     */

   public static void main(String[] args) {

        Map<String, Double> map = new HashMap<>();

        map.put("Igor", 150000.4);
        map.put("Dusan", 170000.0);
        map.put("Luka", 120000.2);
        map.put("Djordje", 110000.5);
        map.put("Ahmed", 80000.0);
        map.put("Elena", 130000.8);
        map.put("Gina", 115200.8);
        map.put("Eda", 117000.2);
        map.put("Zohra", 90000.9);
        map.put("Galina", 100000.3);
        System.out.println(map);
        System.out.println("---------------------------------");

//        1.1 who has the maximum salary?

        Double biggestSalary = 0.0;
        String biggestName = "";

        for(Map.Entry<String, Double> eachEntry : map.entrySet()){
            if(eachEntry.getValue() > biggestSalary){
                biggestSalary = eachEntry.getValue();
                biggestName = eachEntry.getKey();
            }

        }

        System.out.println(biggestName + " : " +  biggestSalary);

        System.out.println("--------------------------------");

//        1.2 who has the minimum salary?

        Double smallestSalary = Double.MAX_VALUE;
        String smallestName = "";

        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() < smallestSalary){
                smallestSalary = eachEntry.getValue();
                smallestName = eachEntry.getKey();
            }
        }
        System.out.println(smallestName + " : " + smallestSalary);
        System.out.println("-------------------------------------");

//        1.3 how many employees has the salary between 120k ~ 150K?
            int count = 0;
        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() >= 120000 && eachEntry.getValue() <= 150000){
                count++;
            }
        }
        System.out.println(count + " employees have salary between 120k and 150k");
        System.out.println("------------------------------------------");

//        1.3.1 get the names of the employees who has salary between 120k and 150j and store them in ArrayList <String>
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<String, Double> eachEntry : map.entrySet()) {
            if(eachEntry.getValue() >= 120000 && eachEntry.getValue() <= 150000){
                names.add(eachEntry.getKey());
            }
        }
        System.out.println(names);
       System.out.println("------------------------------------------");

//       1.4 display the names of the employees who are making less than 118k?
//       1.4.1 Store value of each employee in ArrayList<String> who has less than 118k

        ArrayList<String> namesLess118k = new ArrayList<>();

       for (Map.Entry<String, Double> eachEntry : map.entrySet()){
           if(eachEntry.getValue() < 118000){
               namesLess118k.add(eachEntry.getKey());
           }
       }
       System.out.println(namesLess118k);
       System.out.println("-----------------------------------");

//       1.5 increase the salary of each employee by 10K

       for (Map.Entry<String, Double> eachEntry : map.entrySet()){
          map.put(eachEntry.getKey(), eachEntry.getValue() + 10000.0);
       }
       System.out.println(map);
       System.out.println("-----------------------------------");





    }
}
