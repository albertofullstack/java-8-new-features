package com.java.eight.features.functionalinterfaces.predicates;

public class SoftwareEngineer {

  private String name;
  private Integer age;
  private boolean hasGirlfriend;

  public SoftwareEngineer(String name, Integer age, boolean hasGirlfriend) {
    this.name = name;
    this.age = age;
    this.hasGirlfriend = hasGirlfriend;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public boolean isHasGirlfriend() {
    return hasGirlfriend;
  }

  @Override
  public String toString() {
    return this.name + " " + this.age + " " + (this.hasGirlfriend? "has girlfriend": "single");
  }
}
