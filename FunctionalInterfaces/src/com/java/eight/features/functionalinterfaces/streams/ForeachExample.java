package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {

  public static void main(String[] args) {

    List<String> stringList = new ArrayList<>();
    stringList.add("A");
    stringList.add("BB");
    stringList.add("CCC");

    stringList.stream().forEach(System.out::println);
  }
}
