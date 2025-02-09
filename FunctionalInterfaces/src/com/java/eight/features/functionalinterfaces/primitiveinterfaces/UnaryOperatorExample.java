package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

  public static void main(String[] args) {

    UnaryOperator<Integer> calculateSquare = i -> i * i;
    System.out.println(calculateSquare.apply(10));

    IntUnaryOperator calculateSquare2 = i -> i * i;
    System.out.println(calculateSquare2.applyAsInt(20));
  }
}
