package com.java.eight.features.functionalinterfaces.anonymousclasses;

public class InterfaceClassDemo {

  // this class cannot be used with lambda
  // anonymous class is in a superior level compared to lambda expressions
  // lambda only can be used with functional interfaces (only one abstract method)

  public interface InterfaceDemo {
    public void m1();
    public void m2();
    public void m3();
  }

  public static void main(String[] args) {

    InterfaceDemo test = new InterfaceDemo() {
      @Override
      public void m1() {

      }

      @Override
      public void m2() {

      }

      @Override
      public void m3() {

      }
    };
    test.m1();
    test.m2();
    test.m3();
  }
}
