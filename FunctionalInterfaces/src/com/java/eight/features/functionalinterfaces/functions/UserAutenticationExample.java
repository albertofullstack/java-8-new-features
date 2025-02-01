package com.java.eight.features.functionalinterfaces.functions;

import java.util.Scanner;
import java.util.function.Function;

public class UserAutenticationExample {

  public static void main(String[] args) {

    Function<String, String> getInitialChars = s -> s.substring(0, 5);
    Function<String, String> convertToLowercase = String::toLowerCase;

    System.out.println("Enter user");
    Scanner sc = new Scanner(System.in);
    String user = sc.next();

    System.out.println("Enter password");
    String pass = sc.next();

    if ("alber".equals(getInitialChars.andThen(convertToLowercase).apply(user)) &&
        "java".equals(pass)) {
      System.out.println("Valid user");
    } else {
      System.out.println("Invalid user");
    }
  }
}
