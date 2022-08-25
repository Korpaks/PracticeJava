package Practice;

public class EmployeeTester extends Employee {

    public EmployeeTester(String name, String id, double salary, boolean isFullTime) {
        super(name, id, "Tester", salary, isFullTime);
    }
    int bugsFound;

    public void test(){
        System.out.println("Running regression test");
    }

}
