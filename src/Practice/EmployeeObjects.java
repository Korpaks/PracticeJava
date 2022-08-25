package Practice;

public class EmployeeObjects {
    public static void main(String[] args) {


        EmployeeV2 employee = new EmployeeV2("Mike", 'M', 24, 150000);
        System.out.println(employee);

        //employee.salary; it is private so can't access

        //change name

        employee.setName("");
        System.out.println(employee.getName());// check setter

        //Change age

        employee.setAge(15);
        System.out.println(employee.getAge());// check setter

        //change salary

        employee.setSalary(1000000);
        System.out.println(employee.getSalary());

        //increase the salary of employee 20k
        employee.setSalary(employee.getSalary() + 20000);
        System.out.println(employee.getSalary());

        //decrease the salary of employee 20k
        employee.setSalary(employee.getSalary() - 20000);
        System.out.println(employee.getSalary());
    }

}
