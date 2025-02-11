package com.java.eight.features.functionalinterfaces.datetime;

import java.time.Year;
import java.util.Scanner;

public class YearExample {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year:");
    int year = sc.nextInt();
    Year y = Year.of(year);
    if (y.isLeap()) {
      System.out.printf("%d Year is leap year%n", y.getValue());
    } else {
      System.out.printf("%d Year is not leap year%n", y.getValue());
    }
  }

}
