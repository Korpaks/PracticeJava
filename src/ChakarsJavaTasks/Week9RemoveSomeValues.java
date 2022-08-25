package ChakarsJavaTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Week9RemoveSomeValues {

    public static void main(String[] args) {


        // given list of integers 1,2,3,4,5,6 etc remove all values greater then 100
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 4, 7, 34, 22, 678, 432, 1, 2, 33, 233, 876, 345, 21, 43, 555));

        //method 1
        Iterator<Integer> itr = nums.iterator();

        while (itr.hasNext()) {
            Integer num = itr.next();
            if (num > 100) {
                itr.remove();
            }
        }
        System.out.println(nums);

        //method 2
        List<Integer> removeMoreThen100 = new ArrayList<>(nums);
        removeMoreThen100.removeIf(each -> each > 100);
        System.out.println(removeMoreThen100);
    }
}
