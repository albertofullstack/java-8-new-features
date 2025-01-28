package com.java.eight.features.functionalinterfaces.collections;

public class Employee {

  private Integer number;
  private String name;

  public Employee(Integer number, String name) {
    this.number = number;
    this.name = name;
  }

  @Override
  public String toString() {
    return number + ": " + name;
  }

  public Integer getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }
}
