package org.logical.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp1=new Employee(101,"Ramu","Patna",78687);
        Employee emp2=new Employee(112,"Ajay","Vns",45636);
        Employee emp3=new Employee(111,"Bhanu","Btt",31000);
        Employee emp4=new Employee(121,"John","Sc",87877);
        Employee emp5=new Employee(131,"Sohan","Del",988997);

        List<Employee> employees=new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        //System.out.println(collect);
        List<Employee> collect1 = employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        //System.out.println(collect1);
        List<Employee> collect2 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect2);
        
    }
}
