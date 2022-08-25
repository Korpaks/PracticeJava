package ChakarsJavaTasks;

import java.util.Arrays;

public class Week8ArraySumUpToZero {

    //given an integer n return an array containing n unique integers that sum up to 0
    public static int[] sumUpToZero(int num){ //6

        int[] arr = new int[num];
        int sum = 0;

        for (int i = 0; i < arr.length-1; i++) { //5
            arr[i] = i;
            sum += i;
        }
        arr[arr.length-1] = -sum; //10 {0,1,2,3,4,-10}
        return  arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumUpToZero(8)));
    }
}

