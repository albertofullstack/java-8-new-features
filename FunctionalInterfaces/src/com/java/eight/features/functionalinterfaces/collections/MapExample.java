package com.java.eight.features.functionalinterfaces.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

  public static void main(String[] args) {
    Map<String, String> m = new HashMap<>();
    m.put("A", "Apple");
    m.put("Z", "Zebra");
    m.put("D", "Dinosaur");
    m.put("B", "Boy");
    m.put("T", "Tiger");
    System.out.println(m);
  }
}
