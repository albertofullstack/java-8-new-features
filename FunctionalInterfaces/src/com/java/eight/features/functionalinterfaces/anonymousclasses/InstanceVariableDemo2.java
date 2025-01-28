package com.java.eight.features.functionalinterfaces.anonymousclasses;

interface Ifc2 {

  public void m1();
}

class InstanceVariableDemo2 {
  int x = 10;

  public void m2() {
    int y = 20;
    Ifc i = () -> {
      // if variable y is try to be instanced from lambda
      // we will get an error, because instanced variables referenced
      // from lambda expressions are effectively final
      System.out.println(x);
      System.out.println(y);

      // y = 10;
    };
    i.m1();
  }

  public static void main(String[] args) {
    InstanceVariableDemo2 t = new InstanceVariableDemo2();
    t.m2();
  }
}
