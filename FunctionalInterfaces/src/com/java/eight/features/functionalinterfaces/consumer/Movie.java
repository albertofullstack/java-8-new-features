package com.java.eight.features.functionalinterfaces.consumer;

public class Movie {

  private String name;
  private String hero;
  private String villain;

  public Movie(String name, String hero, String villain) {
    this.name = name;
    this.hero = hero;
    this.villain = villain;
  }

  public String getName() {
    return name;
  }

  public String getHero() {
    return hero;
  }

  public String getVillain() {
    return villain;
  }
}
