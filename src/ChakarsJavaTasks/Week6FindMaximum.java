package ChakarsJavaTasks;

public class Week6FindMaximum {

    /*
    return method find maximum number from int array
     */

    public static int maxNumInArray(int[] numArr) {
        int maxNum = Integer.MIN_VALUE;
        for (int each : numArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {

        int [] arr = {4,87,34,23,245,667,-543,24,-78,34};
        System.out.println(maxNumInArray(arr));
    }

}
