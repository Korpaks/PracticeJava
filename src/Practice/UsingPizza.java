package Practice;

public class UsingPizza {
    public static void main(String[] args) {


        Pizza obj1 = new Pizza("MEDIUM", 3);
        System.out.println(obj1.calculatePrice());

        Pizza obj2 = new Pizza("LarGE", 2);
        System.out.println(obj2.calculatePrice());

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
