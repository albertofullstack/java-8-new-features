package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();
    names.add("Antonio");
    names.add("Alberto");
    names.add("Jose");
    names.add("Ana");
    names.add("Isabel");
    System.out.println(names);

    List<String> namesFiltered = names.stream().filter(name -> name.length() >= 7)
        .collect(Collectors.toList());
    System.out.println(namesFiltered);

    Long countOfNamesFiltered = names.stream().filter(name -> name.length() >= 7)
        .count();
    System.out.println("Number of names whose length >= 7: " + countOfNamesFiltered);

    List<String> namesToUppercase = names.stream().map(String::toUpperCase)
        .collect(Collectors.toList());
    System.out.println(namesToUppercase);
  }

}
