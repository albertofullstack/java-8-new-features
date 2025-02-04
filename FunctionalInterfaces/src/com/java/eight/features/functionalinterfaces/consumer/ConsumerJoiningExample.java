package com.java.eight.features.functionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerJoiningExample {

  public static void main(String[] args) {

    Consumer<Movie> c1 = movie -> System.out.println("The hero of the movie is: " + movie.getHero());
    Consumer<Movie> c2 = movie -> System.out.println("The name of the movie is: " + movie.getName());
    Consumer<Movie> c3 = movie -> System.out.println("The villain of the movie is: " + movie.getVillain());
    Consumer<Movie> chained = c1.andThen(c2).andThen(c3);

    Movie movie = new Movie("Batman", "Batman", "The Joker");
    chained.accept(movie);
  }

}
