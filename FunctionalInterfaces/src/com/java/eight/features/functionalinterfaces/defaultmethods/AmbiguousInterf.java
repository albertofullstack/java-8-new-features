package com.java.eight.features.functionalinterfaces.defaultmethods;

public class AmbiguousInterf implements Left, Right {

  @Override
  public void m1() {
//    System.out.println("My own implementation");
    Left.super.m1();
  }

  public static void main(String[] args) {
    AmbiguousInterf ambiguousInterf = new AmbiguousInterf();
    ambiguousInterf.m1();
  }
}
