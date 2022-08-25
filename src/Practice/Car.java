package Practice;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void drive(){
        System.out.println("driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank(){
        System.out.println("Filling tank");
        fuelLevel = 100;
    }

    public boolean isLow(){
        return fuelLevel < 25;
    }

    @Override
    public String toString() {
        return "Car model is " + model + " and year is " + year + " with color" + color + "\nAnd is tank low: " + isLow();
    }
}
