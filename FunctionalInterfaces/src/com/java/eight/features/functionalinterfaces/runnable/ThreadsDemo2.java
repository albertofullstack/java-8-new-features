package com.java.eight.features.functionalinterfaces.runnable;

public class ThreadsDemo2 {

  public static void main(String[] args) {
    Runnable r = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Child thread");
      }
    };
    Thread thr = new Thread(r);
    thr.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }
  }
}
