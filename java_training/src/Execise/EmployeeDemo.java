package Execise;
import java.util.*;
public class EmployeeDemo {
    public static void main(String[] args) {
        new EmployeeDemo().demo1();
    }

    public void demo1(){
        Employee emp1 = new Employee("Keith", 10);
        Employee emp2 = new Employee("Potehtoh", 5000);
        Employee emp3 = new Employee("Groun", 756);
        List<Employee> list = new ArrayList<>();

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

//        System.out.println(list);
        for (Employee emp: list){
            System.out.printf("Name = %s, Salary = %d\n", emp.name, emp.salary);
        }
    }
}
