package com.java.eight.features.functionalinterfaces.anonymousclasses;

interface Ifc {
  public void m1();
}

class InstanceVariableLambdaDemo {
  int x = 888;

  public void m2() {
    Ifc i = () -> {
      int x = 999;
      System.out.println(x);
      System.out.println(this.x);
    };
    i.m1();
  }

  public static void main(String[] args) {
    InstanceVariableLambdaDemo t = new InstanceVariableLambdaDemo();
    t.m2();
  }
}