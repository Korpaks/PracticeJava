package ChakarsJavaTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Week9RemoveAhmed {

    public static void main(String[] args) {

//given a list of people names "Ahmed" "John" "Eric" "Ahmed" write a java operation to remove all the names named "Ahmed"
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Ahmed"));

        //method 1
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            String str = itr.next();
            if (str.equals("Ahmed"))
                itr.remove();
        }
        System.out.println("Method 1" +names);

        //method 2
        List<String> removeAhmed = new ArrayList<>(names);
        removeAhmed.removeIf(each -> each.equals("Ahmed"));
        System.out.println("Method 2" + removeAhmed);
    }
}
