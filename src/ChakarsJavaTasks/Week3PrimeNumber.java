package ChakarsJavaTasks;

public class Week3PrimeNumber {

    public static void primeOrNot(int num){
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if(num%i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println(num + " is prime number");
        }else {
            System.out.println(num + " is not prime number");
        }

    }

    public static void main(String[] args) {
        primeOrNot(15);
    }

}
