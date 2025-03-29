package org.logical.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1987, 9, 05);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDay,today));
    }
}
