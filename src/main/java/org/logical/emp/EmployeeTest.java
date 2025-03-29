package org.logical.emp;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeTest {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;

}
