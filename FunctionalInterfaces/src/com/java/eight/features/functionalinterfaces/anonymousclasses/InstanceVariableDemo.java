package com.java.eight.features.functionalinterfaces.anonymousclasses;

public class InstanceVariableDemo {

  interface Interf {
    void m1();
  }

  public static void main(String[] args) {
    int x = 888;
    Interf i = new Interf() {
      int x = 999;
      @Override
      public void m1() {
        System.out.println(x); // 999
      }
    };
    i.m1();
  }
}
