package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {

  public static void main(String[] args) {

    List<Integer> numberList = new ArrayList<>();
    numberList.add(0);
    numberList.add(10);
    numberList.add(20);
    numberList.add(5);
    numberList.add(15);
    numberList.add(25);
    System.out.println(numberList);

    List<Integer> naturalSortedList = numberList.stream().sorted().collect(Collectors.toList());
    System.out.println("List according to natural sorting order: " + naturalSortedList);

    List<Integer> sortedListWithComparator = numberList.stream()
        .sorted((i1, i2) -> i2.compareTo(i1))
        .collect(Collectors.toList());
    System.out.println("List according to reverse sorting order: " + sortedListWithComparator);
  }

}
