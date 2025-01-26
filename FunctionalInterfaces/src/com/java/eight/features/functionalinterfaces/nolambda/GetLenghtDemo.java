package com.java.eight.features.functionalinterfaces.nolambda;

public class GetLenghtDemo implements GetLenghtInterf {

  @Override
  public int getLenght(String s) {
    return s.length();
  }
}
