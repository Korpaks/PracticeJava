package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UsingEmployee {
    public static void main(String[] args) throws InterruptedException {

//        Employee obj1 = new Employee("Igor", "23@ghr4", "SDET", 150000);
//        obj1.salary = 200000;
//
//        obj1.goToMeeting();
//        System.out.println(obj1);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ducko", "ciganZvezda123", "SDET", 75000,true));
        employees.add(new Employee("Luka", "crnogotskaAjkula", "Developer", 160000, true));
        employees.add(new Employee("Fika", "pusimVutruCeoDan", "SDET", 130000, true));
        employees.add(new Employee("Djole", "kodMiJeSjajan", "Developer", 145000, true));
        employees.add(new Employee("Gibonni", "seremKaoFoka", "SDET", 90000, false));

        ArrayList<Employee> salaryOver80k = new ArrayList<>(employees);
        salaryOver80k.removeIf(each -> each.salary < 80000);
        System.out.println(salaryOver80k);

        System.out.println();

        double biggestSalary = 0;

        for(Employee each : employees){
            if(each.salary > biggestSalary){
                biggestSalary = each.salary;
            }
        }
        System.out.println("Biggest salary is: " + biggestSalary);

        ArrayList<Employee> maxSalary = new ArrayList<>(employees);
        double finalBiggestSalary = biggestSalary;
        maxSalary.removeIf(each -> each.salary!= finalBiggestSalary);
        System.out.println(maxSalary);// works but needs shorter way to do it

        System.out.println("=================================");

        EmployeeTester obj1 = new EmployeeTester("Igor","34rsfg", 123000, true);

        EmployeeDeveloper obj2 = new EmployeeDeveloper("Marko", "34dgdfg", 231110, true);

        obj1.bugsFound = 10;
        obj1.test();
        obj1.work();

        obj2.featuresCreated = 6;
        obj2.develop();

    }
}
