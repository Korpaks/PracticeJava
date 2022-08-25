package ChakarsJavaTasks;

public class Week2T1_OddEvenNumbers {

    //write a method which can identify given number is even or odd

  public static void oddOrEven (int num){

     if(num % 2 == 0){
         System.out.println("Even");
     }else {
         System.out.println("Odd");
     }
   }

    public static void main(String[] args) {
        oddOrEven(5);
    }
}
