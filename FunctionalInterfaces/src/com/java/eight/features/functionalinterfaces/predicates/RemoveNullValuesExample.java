package com.java.eight.features.functionalinterfaces.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveNullValuesExample {
  public static void main(String[] args) {
    String[] names = {"Kumar", "  ", "Juan", null, "Kiko", null, "Antonio", "", "Kara", "Rodrigo", "Paco"};
    Predicate<String> notNullOrEmptyStr = s -> s != null && !s.trim().isEmpty();
    List<String> notNullOrEmptyStrList = new ArrayList<>();
    for (String name: names) {
      if (notNullOrEmptyStr.negate().test(name)) {
        notNullOrEmptyStrList.add(name);
      }
    }
    System.out.println("The list of valid strings:");
    System.out.println(notNullOrEmptyStrList);
  }
}
