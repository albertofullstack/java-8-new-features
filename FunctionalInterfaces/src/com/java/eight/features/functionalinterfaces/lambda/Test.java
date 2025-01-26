package com.java.eight.features.functionalinterfaces.lambda;

public class Test {

  public static void main(String[] args) {

    Interf i = String::length;
    System.out.println(i.getLenght("Hello"));
    System.out.println(i.getLenght("without Lambda"));
  }
}