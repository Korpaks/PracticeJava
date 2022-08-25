package Practice;

public class UsingRectangle {
    public static void main(String[] args) {

        Rectangle obj = new Rectangle(12, 23);
        obj.calculateArea();
        obj.calculatePerimeter();
        System.out.println("========================");
        obj.base = 23;
        obj.calculateArea();
        obj.calculatePerimeter();
        System.out.println(obj.toString());

    }
}
