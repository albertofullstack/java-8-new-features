package com.java.eight.features.functionalinterfaces.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

  public static void main(String[] args) {

    Set<String> s = new HashSet<>();
    s.add("Sunny");
    s.add("Bunny");
    s.add("Chinny");
    s.add("Sunny");
    System.out.println(s);
  }
}
