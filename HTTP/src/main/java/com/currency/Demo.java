package com.currency;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class Demo {

    public static void main(String[] args) {

        LocalDate start = LocalDate.parse("2016-08-01");
        LocalDate end = LocalDate.parse("2016-01-01");

        System.out.println(YEARS.between(end,start));

    }
}
