package com.java.eight.features.functionalinterfaces.twoargsinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample {

  public static void main(String[] args) {

    BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
    System.out.println(p.test(2, 4)); //even
    System.out.println(p.test(1, 2)); //odd
    System.out.println(p.test(5, 0)); //odd
  }

}
