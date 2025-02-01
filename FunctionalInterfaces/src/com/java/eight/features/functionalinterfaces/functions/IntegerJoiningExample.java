package com.java.eight.features.functionalinterfaces.functions;

import java.util.function.Function;

public class IntegerJoiningExample {

  public static void main(String[] args) {

    Function<Integer, Integer> doubleValue = num -> num + num;
    Function<Integer, Integer> cubeValue = num -> num * num * num;

    System.out.println(doubleValue.andThen(cubeValue).apply(2)); //64
    System.out.println(doubleValue.compose(cubeValue).apply(2)); //16
    System.out.println(doubleValue.compose(cubeValue).compose(doubleValue).apply(2)); //128
  }
}
