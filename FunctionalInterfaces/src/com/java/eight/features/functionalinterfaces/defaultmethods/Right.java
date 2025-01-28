package com.java.eight.features.functionalinterfaces.defaultmethods;

public interface Right {

  default void m1() {
    System.out.println("Right implementation");
  }
}
