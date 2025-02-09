package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorExample {

  public static void main(String[] args) {

    BinaryOperator<String> concatenateStrings = (s1, s2) -> s1 + s2;
    System.out.println(concatenateStrings.apply("Hello ", "Juan"));

    IntBinaryOperator sumInts = (i1, i2) -> i1 + i2;
    System.out.println(sumInts.applyAsInt(3, 4));
  }
}
