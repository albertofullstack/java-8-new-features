package com.java.eight.features.functionalinterfaces.methodreference;

public class MethodRefDemo {

  public interface Interf {
    void m1();
  }

  public static void m2() {
    System.out.println("Implementation by method reference");
  }

  public static void main(String[] args) {
    Interf i1 = MethodRefDemo::m2;
    i1.m1();
  }

}
