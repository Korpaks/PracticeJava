package Practice;

public class Computer {

    String brand, color;
    double price;


       static  boolean hasScreen = true;
       static boolean hasBattery = true;
       static boolean hasMemory = true;



    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
