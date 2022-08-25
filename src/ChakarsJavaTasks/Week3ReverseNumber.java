package ChakarsJavaTasks;

public class Week3ReverseNumber {

    public static int reverseNum(int num){

        String number = String.valueOf(num);

        char[] arr = number.toCharArray();

        String reverseNumText = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if(Character.isDigit(arr[i])) {
                reverseNumText += arr[i];
            }
        }
        int reverseNumber = Integer.parseInt(reverseNumText);
        return reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reverseNum(-12345));
    }

}
