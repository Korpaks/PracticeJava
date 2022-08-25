package ChakarsJavaTasks;

import java.util.Arrays;

public class Week8MoveZeros {

    public static int[] moveZeros(int[] numbers){
        int[] array = new int[numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]!=0){
                array[count] = numbers[i];
                count++;
            }
        }
        return array;
    }
    public static void main(String[] args) {

        int[] arr = {0,1,6,4,0,3,0,4,2,0,6,5,0,0,2};
        System.out.println("Zeroes moved" + Arrays.toString(moveZeros(arr)));

    }
}
