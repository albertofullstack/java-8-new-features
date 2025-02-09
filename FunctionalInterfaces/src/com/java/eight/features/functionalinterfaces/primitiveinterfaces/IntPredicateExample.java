package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import java.util.function.IntPredicate;

public class IntPredicateExample {

  public static void main(String[] args) {

    IntPredicate intPredicate = i -> i % 2 == 0;
    int [] x = {3, 5, 8, 10, 21, 34, 545, 55};

    for (int i : x) {
      if (intPredicate.test(i)) {
        System.out.println(i);
      }
    }
  }

}
