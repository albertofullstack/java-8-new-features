package com.java.eight.features.functionalinterfaces.runnable;

public class ThreadsLambdaDemo {

  public static void main(String[] args) {
    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Child thread");
        }
      }
    };
    Thread th = new Thread(r);
    th.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread");
    }

    // With lambda expression
    Thread thl = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Child thread with lambda");
      }
    });
    thl.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Main thread with lambda");
    }

  }
}
