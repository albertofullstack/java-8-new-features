package com.java.eight.features.functionalinterfaces.methodreference;

public class RunnableWithMethodRef {

  public void m1() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread");
    }
  }

  public static void main(String[] args) {

    RunnableWithMethodRef t = new RunnableWithMethodRef();
    Runnable r = t::m1;

    Thread th = new Thread(r);
    th.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
