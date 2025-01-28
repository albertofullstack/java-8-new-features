package com.java.eight.features.functionalinterfaces.defaultmethods;

public interface Left {

  default void m1() {
    System.out.println("Left implementation");
  }
}
