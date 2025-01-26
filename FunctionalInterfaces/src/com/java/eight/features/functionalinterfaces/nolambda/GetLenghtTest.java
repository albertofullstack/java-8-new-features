package com.java.eight.features.functionalinterfaces.nolambda;

public class GetLenghtTest {

  public static void main(String[] args) {

    GetLenghtInterf i = new GetLenghtDemo();
    System.out.println(i.getLenght("Hello"));
    System.out.println(i.getLenght("without Lambda"));
  }
}