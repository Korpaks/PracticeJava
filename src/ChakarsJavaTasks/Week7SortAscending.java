package ChakarsJavaTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class Week7SortAscending {

    public static int[] sortAscending(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortDescending(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr ={ 6, 8, 7, 4, 312, 78, 54, 9, 12, 100, 89, 74 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Sort Ascending Array " + Arrays.toString(sortAscending(arr)));
        System.out.println("Sort Descending Array " + Arrays.toString(sortDescending(arr)));

    }
}
