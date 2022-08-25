package ChakarsJavaTasks;

public class Week7ArrayFindMinimum {

    public static int arrayMin(int[] arr){

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] arr = {1,5,-3,4,8,13,-34,21,-456,345};
        System.out.println("arrayMin(arr) = " + arrayMin(arr));
    }
}
