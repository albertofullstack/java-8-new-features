package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayExample {

  public static void main(String[] args) {

    List<Integer> numberList = new ArrayList<>();
    numberList.add(0);
    numberList.add(10);
    numberList.add(20);
    numberList.add(5);
    numberList.add(15);
    numberList.add(25);
    System.out.println(numberList);

    Integer[] array = numberList.stream().toArray(Integer[]::new);
    for (Integer integer : array) {
      System.out.println(integer);
    }

    System.out.println();

    // Stream for group of values
    Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
    s.forEach(System.out::println);

    System.out.println();

    // Stream for arrays
    Double[] doubles = {10.0, 10.1, 10.2, 10.3, 10.4};
    Stream<Double> doubleStream = Stream.of(doubles);
    doubleStream.forEach(System.out::println);
  }
}
