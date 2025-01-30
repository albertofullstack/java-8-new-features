package com.java.eight.features.functionalinterfaces.predicates;

import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PredicateStringExample {

  private static final Logger LOGGER = Logger.getLogger( PredicateStringExample.class.getName() );

  public static void main(String[] args) {
    String[] names = {"Kumar", "Juan", "Kiko", "Antonio", "Kara", "Rodrigo", "Paco"};
//    Predicate<String> startsWithK = i -> i.charAt(0) == 'K'; //another way
    Predicate<String> startsWithK = i -> i.startsWith("K");
    for (String name: names) {
      if (startsWithK.test(name)) {
        System.out.println(name);
      }
    }
  }
}
