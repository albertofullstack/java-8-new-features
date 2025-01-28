package com.java.eight.features.functionalinterfaces.anonymousclasses;

interface Ifc1 {
  public void m1();
}

class InstanceVariableDemo {

  int x = 888;

  public void m2() {
    Ifc1 i = new Ifc1() {
      int x = 999;
      @Override
      public void m1() {
        System.out.println(this.x);
        System.out.println(x);
      }
    };
    i.m1();
  }

  public static void main(String[] args) {
    InstanceVariableDemo t = new InstanceVariableDemo();
    t.m2();
  }
}
