package com.java.eight.features.functionalinterfaces.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSortExample {

  public static void main(String[] args) {
    Set<Integer> k = new TreeSet<>();
    k.add(10);
    k.add(0);
    k.add(15);
    k.add(25);
    k.add(5);
    k.add(20);
    System.out.println("With natural order: " + k);

    Set<Integer> orderedSet = new TreeSet<>((Integer i1, Integer i2) -> i1 > i2? -1: i1 < i2? 1: 0);
    orderedSet.add(10);
    orderedSet.add(0);
    orderedSet.add(15);
    orderedSet.add(25);
    orderedSet.add(5);
    orderedSet.add(20);
    System.out.println("With descending order: " + orderedSet);
  }

}
