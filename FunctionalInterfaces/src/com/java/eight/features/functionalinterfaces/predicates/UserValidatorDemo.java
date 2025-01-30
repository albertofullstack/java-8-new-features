package com.java.eight.features.functionalinterfaces.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

public class UserValidatorDemo {

  public static void main(String[] args) {

    User user = new User("alberto", "Java");
    Predicate<User> isValidUser = s -> false;
    while (!isValidUser.test(user)) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce name: ");
      String userName = sc.next();
      System.out.println("Introduce password: ");
      String password = sc.next();
      isValidUser = u -> u.getName().equals("Alberto") && u.getPassword()
          .equals("Java");
      user = new User(userName, password);
      if (isValidUser.test(user)) {
        break;
      }
      System.out.println("Not valid user, please log again");

    }
    System.out.println("Valid user, you have access to all services!!!");
  }

}
