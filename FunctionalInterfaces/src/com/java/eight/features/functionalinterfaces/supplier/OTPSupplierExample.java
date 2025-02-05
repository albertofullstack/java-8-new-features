package com.java.eight.features.functionalinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class OTPSupplierExample {

  public static void main(String[] args) {

    Supplier<String> getOTP = () -> {
      Random r = new Random();
      StringBuilder password = new StringBuilder();
      for (int i = 0; i < 6; i++) {
        password.append(r.nextInt(10));
      }
      return password.toString();
    };

    System.out.println(getOTP.get());
    System.out.println(getOTP.get());
    System.out.println(getOTP.get());
  }
}
