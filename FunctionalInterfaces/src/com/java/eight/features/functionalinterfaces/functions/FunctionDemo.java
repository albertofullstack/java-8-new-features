package com.java.eight.features.functionalinterfaces.functions;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionDemo {

  public static void main(String[] args) {
    System.out.println("Longitud de cadenas");
    ToIntFunction<String> f1 = String::length;
    System.out.println(f1.applyAsInt("asdfasf")); //7
    System.out.println(f1.applyAsInt("el mapa del señor de los anillos")); //32

    System.out.println();
    System.out.println("Cuadrado de enteros");
    Function<Integer, Integer> square = number -> number * number;
    System.out.println(square.apply(3));
    System.out.println(square.apply(10));
  }
}
