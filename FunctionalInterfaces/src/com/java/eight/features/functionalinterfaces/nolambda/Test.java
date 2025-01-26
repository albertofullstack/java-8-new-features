package com.java.eight.features.functionalinterfaces.nolambda;

public class Test {

  public static void main(String[] args) {

    Interf i = new Demo();
    System.out.println(i.getLenght("Hello"));
    System.out.println(i.getLenght("without Lambda"));
  }
}