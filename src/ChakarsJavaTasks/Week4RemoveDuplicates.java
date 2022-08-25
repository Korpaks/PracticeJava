package ChakarsJavaTasks;

public class Week4RemoveDuplicates {
    /*
    Write a return method that can remove the duplicate values from the string
    EX ("AAABBBCCC") ==> ABC
     */

    public static String removeDuplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;
            if (result.contains("" + letter)) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {

                char eachLetter = str.charAt(j);
                if (letter == eachLetter) {
                    count++;
                }
            }
            if(count>1 && letter != str.charAt(i+1)){
                result+= letter;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBBBCCCDDE"));
    }
}
