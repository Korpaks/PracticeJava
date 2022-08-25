package Practice;

public class ProductOfElements {

    public static int[] product(int [] nums){

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int num = 1;
            for (int k = 0; k < nums.length; k++) {
                if(i!=k){
                    num*= nums[i];
                }
            }
            arr[i] = num;
        }
        return arr;
    }
}
