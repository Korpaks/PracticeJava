package ChakarsJavaTasks;

public class Week2FINRA {

    // write method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3 print"FIN" instead of number. For numbers which are multiple of 5 print "RA" and for both print "FINRA"

    public static void finra(){
        for (int i = 1; i <= 30; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print("FINRA ");
            }else if(i % 5 == 0){
                System.out.print("RA ");
            }else if(i % 3 == 0){
                System.out.print("FIN ");
            }else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        finra();
    }
}
