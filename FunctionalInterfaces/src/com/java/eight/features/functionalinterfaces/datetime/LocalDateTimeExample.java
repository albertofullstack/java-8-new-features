package com.java.eight.features.functionalinterfaces.datetime;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

  public static void main(String[] args) {

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    int dd = localDateTime.getDayOfMonth();
    int mm = localDateTime.getMonthValue();
    int yyyy = localDateTime.getYear();
    System.out.printf("%d-%d-%d%n", dd, mm, yyyy);

    int hh = localDateTime.getHour();
    int m = localDateTime.getMinute();
    int s = localDateTime.getSecond();
    int ns = localDateTime.getNano();
    System.out.printf("%d:%d:%d:%d", hh, m, s, ns);

    // localdatetime of certain date
    LocalDateTime certainDate = LocalDateTime.of(2022, Month.APRIL, 2, 3, 3);
    System.out.println(certainDate);
    System.out.println("After 6 months: " + certainDate.plusMonths(6));
    System.out.println("Before 6 months: " + certainDate.minusMonths(6));
  }
}
