package com.java.eight.features.functionalinterfaces.lambda;

public class GetLenghtTest {

  public static void main(String[] args) {

    // the functional interface is the type of the lambda expression
    GetLenghtInterf i = String::length;
    System.out.println(i.getLenght("Hello"));
    System.out.println(i.getLenght("without Lambda"));
  }
}