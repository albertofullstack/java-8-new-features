package com.java.eight.features.functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieExample {

  public static void main(String[] args) {

    List<Movie> movies = new ArrayList<>();
    populate(movies);
    Consumer<Movie> displayInfo = movie -> {
      System.out.println("Name: " + movie.getName());
      System.out.println("Hero: " + movie.getHero());
      System.out.println("Villain: " + movie.getVillain());
      System.out.println("--------------------------------");
    };
    for (Movie movie : movies) {
      displayInfo.accept(movie);
    }
  }

  public static void populate(List<Movie> movies) {

    movies.add(new Movie("La Roca", "John Mason", "Francis Hummel"));
    movies.add(new Movie("Matrix", "Neo", "Agent Smith"));
    movies.add(new Movie("Lion King", "Simba", "Scar"));
    movies.add(new Movie("Witcher", "Geralt", "Eredin"));
  }
}
