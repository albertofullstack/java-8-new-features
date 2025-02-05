package com.java.eight.features.functionalinterfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SystemDateSupplier {

  public static void main(String[] args) {

    Supplier<Date> getDate = () -> new Date();
    System.out.println(getDate.get());
  }

}
