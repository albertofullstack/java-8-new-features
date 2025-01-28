package com.java.eight.features.functionalinterfaces.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapSortExample {

  public static void main(String[] args) {
    Map<Integer, String> k = new TreeMap<>();
    k.put(100, "Alberto");
    k.put(600, "Sunny");
    k.put(300, "Bunny");
    k.put(200, "Chinny");
    k.put(700, "Vinny");
    k.put(400, "Pinny");
    System.out.println("With natural order (ascending order): " + k);

    Map<Integer, String> orderedMap = new TreeMap<>(
        (Integer i1, Integer i2) -> i1 > i2 ? -1 : i1 < i2 ? 1 : 0);
    orderedMap.put(100, "Alberto");
    orderedMap.put(600, "Sunny");
    orderedMap.put(300, "Bunny");
    orderedMap.put(200, "Chinny");
    orderedMap.put(700, "Vinny");
    orderedMap.put(400, "Pinny");
    System.out.println("With descending order: " + orderedMap);
  }

}
