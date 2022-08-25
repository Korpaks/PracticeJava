package Practice;

public class Employee {

    String name;
    String id;
    String jobTitle;
    double salary;
    boolean isFullTime;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, String id, String jobTitle, double salary, boolean isFullTime) {
        this(name, id);
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }
    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        String info = "\n\nName of the employee is " + name;
        if (id != null){
            info += "\nId of " + name + " is " + id;
        }
        if(jobTitle != null){
            info += "\nJob title of " + name + " is " + jobTitle;
        }
        if(salary != 0){
            info += "\nSalary of " + name + " is " + salary;
        }
        return info;
    }
}
