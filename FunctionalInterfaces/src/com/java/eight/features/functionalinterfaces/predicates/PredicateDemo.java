package com.java.eight.features.functionalinterfaces.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) {
    IntPredicate intPredicate = p -> p > 10;
    System.out.println(intPredicate.test(100)); //true
    System.out.println(intPredicate.test(5));  //false

    Predicate<String> stringPredicate = s -> s.length() > 5;
    System.out.println(stringPredicate.test("abcdef")); //true
    System.out.println(stringPredicate.test("abc")); //false

    Predicate<Collection> predicate = c -> c.isEmpty();
    List<String> students = new ArrayList<>();
    students.add("Juan");
    System.out.println(predicate.test(students)); //false
    System.out.println(predicate.test(new ArrayList())); //true
  }
}
