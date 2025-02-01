package com.java.eight.features.functionalinterfaces.functions;

import java.util.function.Function;

public class StringNoSpaceExample {

  public static void main(String[] args) {


    String withSpaces = "Soy un     caraco l l l l l l l l l l";
    System.out.printf("The string with spaces is: %s%n", withSpaces);

    Function<String, String> removeSpaces = s -> s.replace(" ", "");
    System.out.println();
    System.out.printf("The string without spaces is: %s%n", removeSpaces.apply(withSpaces));

    // Count number of spaces in the given string (length of the string - length of string without spaces)
    Function<String, Integer> countNumberOfSpaces = s -> s.length() - s.replace(" ", "").length();
    System.out.println();
    System.out.println("The number of spaces is: ");
    System.out.println(countNumberOfSpaces.apply(withSpaces));
  }
}
