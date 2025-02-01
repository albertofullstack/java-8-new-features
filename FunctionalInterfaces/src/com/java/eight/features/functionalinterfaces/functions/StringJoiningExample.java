package com.java.eight.features.functionalinterfaces.functions;

import java.util.function.Function;

public class StringJoiningExample {



  public static void main(String[] args) {

    Function<String, String> f1 = s -> s.toUpperCase();
    Function<String, String> f2 = s -> s.substring(0, 8);
    System.out.println(f1.andThen(f2).apply("antoniolobato"));
    System.out.println(f2.compose(f1).apply("antoniolobato"));
  }

}
