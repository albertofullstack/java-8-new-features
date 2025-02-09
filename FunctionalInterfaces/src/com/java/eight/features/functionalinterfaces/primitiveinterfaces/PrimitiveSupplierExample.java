package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class PrimitiveSupplierExample {

  public static void main(String[] args) {
    IntSupplier getRandomNumber = () -> new Random().nextInt(10);
    System.out.println(getRandomNumber.getAsInt());

    String otp = "";
    for (int i = 0; i < 10; i++) {
      otp += getRandomNumber.getAsInt();
    }
    System.out.println("OTP code: " + otp);
  }
}
