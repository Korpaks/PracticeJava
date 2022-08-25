package ChakarsJavaTasks;

public class Week4FrequencyOfCharacters {
    /*
    String - frequency of characters
    Write a return method that can find the frequency of characters
    Ex: ("AAABBBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);

            int count = 0;

            if(result.contains("" + letter)){
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                char eachLetter = str.charAt(j);

                if(letter == eachLetter){
                    count++;
                }
            }
            result += letter + String.valueOf(count);

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBBBBCCCDDE"));
    }

}
