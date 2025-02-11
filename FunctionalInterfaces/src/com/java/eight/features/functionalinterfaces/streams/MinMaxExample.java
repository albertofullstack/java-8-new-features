package com.java.eight.features.functionalinterfaces.streams;

import java.util.ArrayList;
import java.util.List;

public class MinMaxExample {

  public static void main(String[] args) {

    List<Integer> numberList = new ArrayList<>();
    numberList.add(0);
    numberList.add(10);
    numberList.add(20);
    numberList.add(5);
    numberList.add(15);
    numberList.add(25);
    System.out.println(numberList);

    Integer min = numberList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("Min value: " + min);

    Integer max = numberList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("Max value: " + max);
  }

}
