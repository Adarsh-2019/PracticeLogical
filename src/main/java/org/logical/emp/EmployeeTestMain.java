package org.logical.emp;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTestMain {
    public static void main(String[] args) {
        List<EmployeeTest> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeTest(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new EmployeeTest(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new EmployeeTest(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new EmployeeTest(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new EmployeeTest(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new EmployeeTest(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new EmployeeTest(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new EmployeeTest(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new EmployeeTest(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new EmployeeTest(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new EmployeeTest(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new EmployeeTest(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new EmployeeTest(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new EmployeeTest(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new EmployeeTest(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new EmployeeTest(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new EmployeeTest(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        //How many male and female employees are there in the organization?
        Map<String, Long> noOfMaleAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getGender, Collectors.counting()));
        //System.out.println(noOfMaleAndFemaleEmployee);

        //Print the name of all departments in the organization?
        //employeeList.stream().map(EmployeeTest::getDepartment).distinct().forEach(System.out::println);

        // What is the average age of male and female employees?
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getGender, Collectors.averagingInt(EmployeeTest::getAge)));
        //System.out.println(collect);

        //Get the details of highest paid employee in the organization?
        EmployeeTest highPaidEmployeeDetails = employeeList.stream().max(Comparator.comparing(EmployeeTest::getSalary)).get();
        //System.out.println(highPaidEmployeeDetails);

        //Get the names of all employees who have joined after 2015?
        //employeeList.stream().filter(emp->emp.getYearOfJoining()>2015).map(EmployeeTest::getName).collect(Collectors.toList()).forEach(System.out::println);

        //Count the number of employees in each department?
        Map<String, Long> noOfEmployeeWithDepartments = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getDepartment, Collectors.counting()));
        //System.out.println(noOfEmployeeWithDepartments);
        Set<Map.Entry<String, Long>> entries = noOfEmployeeWithDepartments.entrySet();
        for (Map.Entry<String, Long> entry : entries) {
            //System.out.println(entry.getKey()+" = "+entry.getValue());
        }

        //What is the average salary of each department?
        Map<String, Double> averageSalaryOfEachDepartment = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getDepartment, Collectors.averagingDouble(EmployeeTest::getSalary)));
        /*Set<Map.Entry<String, Double>> entriesAvg = averageSalaryOfEachDepartment.entrySet();
        for (Map.Entry<String,Double> entry:entriesAvg){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/

        //Get the details of youngest male employee in the product development department?
        EmployeeTest youngestEmployee = employeeList.stream().filter(emp -> emp.getGender() == "Male" && emp.getDepartment() == "Product Development").min(Comparator.comparingInt(EmployeeTest::getAge)).get();
        //System.out.println(youngestEmployee);

        //Who has the most working experience in the organization?
        EmployeeTest mostExperiencedEmp = employeeList.stream().sorted(Comparator.comparing(EmployeeTest::getYearOfJoining)).findFirst().get();
        //System.out.println(mostExperiencedEmp);

        //How many male and female employees are there in the sales and marketing team?
        Map<String, Long> maleAndFemaleEmployee = employeeList.stream().filter(emp -> emp.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(EmployeeTest::getGender, Collectors.counting()));
        //System.out.println(maleAndFemaleEmployee);

        // What is the average salary of male and female employees?
        Map<String, Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getGender, Collectors.averagingDouble(EmployeeTest::getSalary)));
        //System.out.println(averageSalary);

        //List down the names of all employees in each department?
        /*Map<String, List<EmployeeTest>> empEntries = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getDepartment));
        Set<Map.Entry<String, List<EmployeeTest>>> emplist = empEntries.entrySet();
        for (Map.Entry<String, List<EmployeeTest>> entry : emplist) {
            System.out.println("--------------------------------------");

            System.out.println("Employees In " + entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<EmployeeTest> list = entry.getValue();

            for (EmployeeTest e : list) {
                System.out.println(e.getName());
            }
        }*/
        /*Map<String, List<String>> employeeListDetails = employeeList.stream().collect(Collectors.groupingBy(EmployeeTest::getDepartment, Collectors.mapping(EmployeeTest::getName, Collectors.toList())));
        employeeListDetails.forEach((depart,empName)->{
            System.out.println(" ******* "+depart+" ********");
            empName.forEach(System.out::println);
        });*/

        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics summaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeTest::getSalary));
        //System.out.println("Average Salary :"+summaryStatistics.getAverage());
        //System.out.println("Total Salary :"+summaryStatistics.getSum());

        //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<EmployeeTest>> partitionEmployeeByAge = employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() > 25));
        Set<Map.Entry<Boolean, List<EmployeeTest>>> entrySet = partitionEmployeeByAge.entrySet();
       /* for (Map.Entry<Boolean,List<EmployeeTest>> entry:entrySet){
            if (entry.getKey()){
                System.out.println("Employee older than 25 ");
            }else {
                System.out.println("Employee less than 25 ");
            }
            List<EmployeeTest> value = entry.getValue();
            for (EmployeeTest emp:value){
                System.out.println(emp.getName());
            }
        }*/

        //Who is the oldest employee in the organization? What is his age and which department he belongs to?
        EmployeeTest employeeTest = employeeList.stream().max(Comparator.comparingInt(EmployeeTest::getAge)).get();
        System.out.println("Age :"+employeeTest.getAge()+" Department :"+employeeTest.getDepartment());

    }
}
