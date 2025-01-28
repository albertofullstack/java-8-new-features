package com.java.eight.features.functionalinterfaces.anonymousclasses;

public class AbstractClassDemo {

  // this class cannot be used with lambda
  // anonymous class is in a superior level compared to lambda expressions
  // lambda only can be used with functional interfaces (only one abstract method)

  public abstract class Test {
    public abstract void m1();
  }

  public void main(String[] args) {

    Test t = new Test(){

      @Override
      public void m1() {
        System.out.println("Hello");
      }
    };
    t.m1();
  }
}
