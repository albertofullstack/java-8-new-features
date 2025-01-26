package com.java.eight.features.functionalinterfaces.nolambda;

public class SquareDemo {

  public static void main(String[] args) {
    SquareInt squareInt = new SquareIntImpl();
    System.out.printf("%s %s%n", "without lambda exp: ", squareInt.squareIt(2));
    System.out.printf("%s %s%n", "without lambda exp: ", squareInt.squareIt(5));
  }
}
