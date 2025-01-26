package com.java.eight.features.functionalinterfaces.runnable;

public class MyRunnable implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Child thread");
    }
  }
}
