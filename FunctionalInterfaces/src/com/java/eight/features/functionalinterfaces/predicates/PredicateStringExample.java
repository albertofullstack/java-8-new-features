package com.java.eight.features.functionalinterfaces.predicates;

import java.util.function.Predicate;

public class PredicateStringExample {

  public static void main(String[] args) {
    String[] names = {"Kumar", "Juan", "Kiko", "Antonio", "Kara", "Rodrigo", "Paco"};
    Predicate<String> p1 = i -> i.startsWith("K");
    for (String name: names) {
      if (p1.test(name)) {
        System.out.println(name);
      }
    }
  }
}
