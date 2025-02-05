package com.java.eight.features.functionalinterfaces.twoargsinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

  public static void main(String[] args) {

    BiConsumer<String, String> joinTwoStrings = (str1, str2) -> System.out.println(str1 + str2);
    joinTwoStrings.accept("hola", "amigo");
  }

}
