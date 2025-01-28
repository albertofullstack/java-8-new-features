package com.java.eight.features.functionalinterfaces.anonymousclasses;

public class FunctionalInterfaceDemo {

  public interface Interface {
    public void m1();
  }

  public static void main(String[] args) {

    // example 1. no lambda
    Interface i = new Interface() {
      @Override
      public void m1() {
        System.out.println("Hello");
      }
    };
    i.m1();

    // example 1. with lambda
    Interface i2 = () -> System.out.println("Hello");
    i2.m1();
  }
}
