package ChakarsJavaTasks;

public class Week2DivideWithoutOperator {

    // write a method that can divide two numbers without using division operators

    public static int divideWithoutOperator(int dividend, int divisor) {

        int result = 0;
        int divisorFirst = divisor;

        if (dividend > divisor) {
            while (dividend >= divisor) {

                divisor += divisorFirst;
                result++;
            }
            return result;
        } else if (dividend == 0){
            System.out.println("Dividend should not be zero");
        }else{

        }
    return -1;
    }


    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(8, 10));
    }
}
