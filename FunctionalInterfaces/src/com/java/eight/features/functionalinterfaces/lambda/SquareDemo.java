package com.java.eight.features.functionalinterfaces.lambda;

import com.java.eight.features.functionalinterfaces.nolambda.SquareInt;
import com.java.eight.features.functionalinterfaces.nolambda.SquareIntImpl;

public class SquareDemo {

  public static void main(String[] args) {
    SquareInt squareInt = x -> x * x;
    System.out.printf("%s %s%n", "with lambda exp: ", squareInt.squareIt(10));
    System.out.printf("%s %s%n", "with lambda exp: ", squareInt.squareIt(50));
  }
}
