package ChakarsJavaTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week10SortAscendingArrayList {

    //write a method that can sort the arraylist in ascending order without using sort method

    public static List<Integer> ascendingOrder(List<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6,3,8,56,1,-34,-5,2,54,32,-4,0));
        System.out.println(list);
        System.out.println(ascendingOrder(list));
    }
}

