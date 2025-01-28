package com.java.eight.features.functionalinterfaces.defaultmethods;

public class StaticInterfDemo implements StaticInterf {

  public static void main(String[] args) {
    StaticInterf inter = new StaticInterfDemo();
//    inter.m1();
//    StaticInterfDemo.m1();
    StaticInterf.m1();
    StaticInterfDemo.m1();
  }

  private static void m1() {
    System.out.println("I am m1 method in the implementation class!!!");
  }
}
