package com.java.eight.features.functionalinterfaces.defaultmethods;

public class DefaultTest2 implements Interf {

  @Override
  public void m1() {
    System.out.println("My own implementation");
  }

  public static void main(String[] args) {
    DefaultTest2 defaultTest2 = new DefaultTest2();
    defaultTest2.m1();
  }
}
