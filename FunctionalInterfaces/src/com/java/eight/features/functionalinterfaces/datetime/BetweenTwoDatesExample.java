package com.java.eight.features.functionalinterfaces.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class BetweenTwoDatesExample {

  public static void main(String[] args) {

    LocalDate birthDay = LocalDate.of(1995, Month.AUGUST, 1);
    LocalDate today = LocalDate.now();
    Period p = Period.between(birthDay, today);
    System.out.printf("Your age is %d years %d months and %d days%n", p.getYears(), p.getMonths(), p.getDays());

    LocalDate deathDate = LocalDate.of(1995 + 67, 8, 20);
    Period p1 = Period.between(today, deathDate);
    int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
    System.out.printf("You will be on earth only %d Days, Hurry up to do the most important things!!!", d);
  }

}
