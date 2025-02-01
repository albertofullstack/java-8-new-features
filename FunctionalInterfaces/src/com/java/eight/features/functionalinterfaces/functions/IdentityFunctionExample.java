package com.java.eight.features.functionalinterfaces.functions;

import java.util.function.Function;

public class IdentityFunctionExample {

  public static void main(String[] args) {

    Function<String, String> f1 = Function.identity();
    System.out.println(f1.apply("algo")); // devuelve 'algo'
  }
}
