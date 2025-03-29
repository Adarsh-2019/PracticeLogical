package org.logical.emp;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsMain {
    public static void main(String[] args) {
        Student stud1=new Student("Rohit",101,"Social",50.89);
        Student stud2=new Student("Ajay",104,"Math",84.89);
        Student stud3=new Student("Shalu",102,"Home",60.89);
        Student stud4=new Student("John",105,"computer",87.89);
        Student stud5=new Student("Vikas",106,"Science",81.89);

        List<Student> studentList=new ArrayList<>();
        studentList.add(stud1);
        studentList.add(stud2);
        studentList.add(stud3);
        studentList.add(stud4);
        studentList.add(stud5);

        //Given a list of students, write a Java 8 code to partition the students who got above 60% from those who didn’t?
        Map<Boolean, List<Student>> studentPartitionBy = studentList.stream().collect(Collectors.partitioningBy(stud -> stud.getPercentage() > 60));
        Set<Map.Entry<Boolean, List<Student>>>  entries= studentPartitionBy.entrySet();
        /*for (Map.Entry<Boolean, List<Student>> entry:entries){
            if (entry.getKey()){
                System.out.println(entry.getValue());
            }
        }*/

        // Given a list of students, write a Java 8 code to get the names of top 3 performing students?
        List<Student> topThreeStudents = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
        //System.out.println(topThreeStudents);

        //Given a list of students, how do you get the name and percentage of each student?
        Map<String, Double> studentByNameAndPercentage = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));

        //System.out.println(studentByNameAndPercentage);
        //studentList.stream().map(Student::getSubject).collect(Collectors.toSet()).forEach(System.out::println);

        //Given a list of students, write a Java 8 code to get highest, lowest and average percentage of students?
        DoubleSummaryStatistics studentStats  = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        /*System.out.println("Highest :"+studentStats.getMax());
        System.out.println("Average :"+studentStats.getAverage());
        System.out.println("Lowest :"+studentStats.getMin());*/

        // How do you get the students grouped by subject from the given list of students?
        Map<String, List<Student>> collect = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(collect);
    }
}
