package ChakarsJavaTasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Week8PermutationCombinations {

    //given an array of 3 character print all permutation combinations from the given character

    public static void printPermutation(char[] ch) {

        for(String s: permutation(ch))
            System.out.println(Arrays.toString( s.toCharArray( ) )  ); // HARD ONE!!!
    }

    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", ""); // a b c
        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1)
            set.add(str);
        else
            for (int i=0; i<str.length(); i++){
                String a3 = str.substring(0, i)+ str.substring(i+1); // abc
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2))
                    set.add(str.charAt(i) + permutation);
            }
        return set;
    }

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c'};
        printPermutation(arr);
    }
}
