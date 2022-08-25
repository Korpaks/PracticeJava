package ChakarsJavaTasks;

import java.util.Arrays;

public class Week9ConcatArrays {

    //write a return method that can concat two arrays

    public static int [] concatArrays(int[] arr1, int[] arr2){

         int num = arr1.length + arr2.length;

         int[] concat = new int[num];
         int count = 0;

         for(int each : arr1){
             concat[count] = each;
             count++;
         }
        for(int each : arr2){
            concat[count] = each;
            count++;
        }
        return concat;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,5,3,7,5,9};
        int[] arr2 = {23, 54, 56, 34, 77};
        System.out.println(Arrays.toString(concatArrays(arr1, arr2)));
    }
}
