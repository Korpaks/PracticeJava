package ChakarsJavaTasks;

import static java.lang.String.valueOf;

public class Week3ArmstrongNum {

    public static void armstrongNumOrNot(int num){
        int a = 0;
        int b = 0;
        int c = 0;

        String number = Integer.toString(num); // 153 = "153"
        char [] arr = number.toCharArray(); // char[] arr = {'1','5','3'}
        a = Integer.parseInt(valueOf(arr[0]));
        b = Integer.parseInt(valueOf(arr[1]));
        c = Integer.parseInt(valueOf(arr[2]));

        if((a*a*a + b*b*b + c*c*c) == num){
            System.out.println(num + " is armstrong number");
        }else {
            System.out.println(num + " is not armstrong number");
        }

    }

    public static void main(String[] args) {
        armstrongNumOrNot(155);
    }

}
