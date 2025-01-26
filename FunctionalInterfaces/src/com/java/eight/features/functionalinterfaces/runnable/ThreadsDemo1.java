package com.java.eight.features.functionalinterfaces.runnable;

public class ThreadsDemo1 {

  public static void main(String[] args) {
    Runnable r = new MyRunnable();
    Thread th = new Thread(r);
    th.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
