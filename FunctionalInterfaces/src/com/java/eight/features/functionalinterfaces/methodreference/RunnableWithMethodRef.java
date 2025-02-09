package com.java.eight.features.functionalinterfaces.methodreference;

public class RunnableWithMethodRef {

  public static void main(String[] args) {

    Test t = new Test();
    Runnable r = t::m1;

    Thread th = new Thread(r);
    th.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
