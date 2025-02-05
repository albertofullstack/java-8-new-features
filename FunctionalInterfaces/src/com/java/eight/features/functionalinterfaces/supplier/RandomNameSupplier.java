package com.java.eight.features.functionalinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNameSupplier {

  public static void main(String[] args) {

    Supplier<String> randomName = () -> {
      String[] names = {"Juan", "Antonio", "Isabel", "Ana", "Carmelo"};
      Random r = new Random();
      return names[r.nextInt(names.length)];
    };
    System.out.println(randomName.get());
    System.out.println(randomName.get());
    System.out.println(randomName.get());
  }

}
