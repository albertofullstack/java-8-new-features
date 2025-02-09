package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class SquareIntFunctionExample {

  public static void main(String[] args) {

    IntFunction<Integer> intFunction = i -> i * i;
    System.out.println(intFunction.apply(5));

    ToIntFunction<String> getStrLenght = String::length;
    System.out.println(getStrLenght.applyAsInt("albert"));

    IntToDoubleFunction squareRoot = Math::sqrt;
    System.out.println(squareRoot.applyAsDouble(25));
    System.out.println(squareRoot.applyAsDouble(7));

  }
}
