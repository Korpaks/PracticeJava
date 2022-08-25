package Practice;

public class UsingComputer {
    public static void main(String[] args) {

        Computer obj1 = new Computer();
        obj1.color = "Red";
        obj1.brand = "Asus";
        obj1.price = 1200;

        System.out.println(Computer.hasBattery);
        System.out.println(Computer.hasMemory);
        System.out.println(Computer.hasScreen);

    }
}
