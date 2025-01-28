package com.java.eight.features.functionalinterfaces.anonymousclasses;

public class ConcreteClassDemo {

  // this class cannot be used with lambda
  // anonymous class is in a superior level compared to lambda expressions
  // lambda only can be used with functional interfaces (only one abstract method)
  public static class Test {

    public void m1() {
      System.out.println("Hello");
    }
  }

  public static void main(String[] args) {

    Test test = new Test () {};
    test.m1();
  }
}
