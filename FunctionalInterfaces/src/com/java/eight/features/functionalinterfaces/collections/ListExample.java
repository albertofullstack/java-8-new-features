package com.java.eight.features.functionalinterfaces.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();
    l.add("Sunny");
    l.add("Bunny");
    l.add("Chinny");
    l.add("Sunny");
    System.out.println(l);
  }
}
