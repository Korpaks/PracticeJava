package Practice;

public class EmployeeDeveloper extends Employee{

    public EmployeeDeveloper(String name, String id, double salary, boolean isFullTime) {
        super(name, id, "Developer", salary, isFullTime);
    }
    int featuresCreated;

    public void develop(){
        System.out.println("Creating more features");
    }

}
