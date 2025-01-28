package com.java.eight.features.functionalinterfaces.defaultmethods;

public class StaticInterfDemo implements StaticInterf {

  public static void main(String[] args) {
    StaticInterf inter = new StaticInterfDemo();
//    inter.m1();
//    StaticInterfDemo.m1();
    StaticInterf.m1();
  }
}
