package com.java.eight.features.functionalinterfaces.predicates;

import java.util.function.Predicate;

public class PredicateStringExample {

  public static void main(String[] args) {
    String[] names = {"Kumar", "Juan", "Kiko", "Antonio", "Kara", "Rodrigo", "Paco"};
//    Predicate<String> startsWithK = i -> i.charAt(0) == 'K'; //another way
    Predicate<String> startsWithK = i -> i.startsWith("K");
    System.out.println("The names starts with K are:");
    for (String name : names) {
      if (startsWithK.test(name)) {
        System.out.println(name);
      }
    }
  }
}
