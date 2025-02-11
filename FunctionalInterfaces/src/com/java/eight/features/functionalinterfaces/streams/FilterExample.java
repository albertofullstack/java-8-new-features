package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

  public static void main(String[] args) {

    List<Integer> numberList = new ArrayList<>();
    numberList.add(0);
    numberList.add(10);
    numberList.add(20);
    numberList.add(5);
    numberList.add(15);
    numberList.add(25);
    System.out.println(numberList);

    List<Integer> evenNumbers = numberList.stream()
        .filter(num -> num % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);

    List<Integer> doubleValues = numberList.stream()
        .map(num -> num * 2)
        .collect(Collectors.toList());
    System.out.println(doubleValues);
  }

}
