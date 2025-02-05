package com.java.eight.features.functionalinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomPasswordExample {

  public static void main(String[] args) {

    Supplier<Integer> getDigit = () -> {
      Random r = new Random();
      return r.nextInt(10);
    };

    String symbols = "ABCDEFGHIJKLMNOPQRSTUVWYZ@#$";
    Supplier<Character> getCharacter = () -> {
      Random r = new Random();
      return symbols.charAt(r.nextInt(28));
    };

    Supplier<String> randomPassword = () -> {
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = 0; i < 8; i++) {
        if (i % 2 == 0) {
          stringBuilder.append(getDigit.get());
        } else {
          stringBuilder.append(getCharacter.get());
        }
      }
      return stringBuilder.toString();
    };
    System.out.println(randomPassword.get());
    System.out.println(randomPassword.get());
    System.out.println(randomPassword.get());
  }

}
