package Practice;

public class Practice {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        x = x + y;
        System.out.println(x);
        y = x-y;
        System.out.println(y);
        x = x-y;
        System.out.println(x);
        System.out.println("=======================");

        int one = 5;
        int two = 10;
        int three = 0;//5
        three = one;
        one = two;
        two = three;

        System.out.println(one);
        System.out.println(two);

    }
}
