package com.java.eight.features.functionalinterfaces.defaultmethods;

public interface Interf {

  default void m1() {
    System.out.println("default method");
  }
}
