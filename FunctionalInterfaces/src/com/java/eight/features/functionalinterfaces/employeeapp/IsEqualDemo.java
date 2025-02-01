package com.java.eight.features.functionalinterfaces.employeeapp;

import java.util.function.Predicate;

public class IsEqualDemo {

  public static void main(String[] args) {
    Predicate<String> p = Predicate.isEqual("ALBERTO");
    System.out.println(p.test("Alberto"));
    System.out.println(p.test("ALBERTO"));
  }
}
