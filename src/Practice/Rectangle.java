package Practice;

public class Rectangle {

    double base;
    double height;
    double perimeter;
    double area;


    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void calculatePerimeter(){
        perimeter = (base + height) * 2;
    }

    public void calculateArea(){
        System.out.println(area = base * height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
