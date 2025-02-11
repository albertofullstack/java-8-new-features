package com.java.eight.features.functionalinterfaces.datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeExample {

  public static void main(String[] args) {

    LocalDate currentDate = LocalDate.now();
    System.out.println(currentDate);

    int dd = currentDate.getDayOfMonth();
    int mm = currentDate.getMonthValue();
    int yyyy = currentDate.getYear();

    System.out.println(dd + "..." + mm + "..." + yyyy);
    System.out.printf("%d-%d-%d%n", dd, mm, yyyy);

    LocalTime currentTime = LocalTime.now();
    System.out.println(currentTime);

    int h = currentTime.getHour();
    int m = currentTime.getMinute();
    int s = currentTime.getSecond();
    int ns = currentTime.getNano();
    System.out.printf("%d:%d:%d:%d%n", h, m, s, ns);
  }

}
