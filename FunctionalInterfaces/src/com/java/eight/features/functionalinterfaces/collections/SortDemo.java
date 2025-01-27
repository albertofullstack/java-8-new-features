package com.java.eight.features.functionalinterfaces.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

  public static void main(String[] args) {
    // List without order
    List<Integer> l = new ArrayList<>();
    l.add(10);
    l.add(0);
    l.add(15);
    l.add(15);
    l.add(5);
    l.add(20);
    System.out.println("Before sorting: " + l);

    Collections.sort(l);
    System.out.println("After sorting: " + l);

    Collections.sort(l, new MyComparator());
    System.out.println("After sorting in reverse order: " + l);
  }

}
