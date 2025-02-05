package com.java.eight.features.functionalinterfaces.functions;

public class Student {

  private String name;
  private Double mark;

  public Student(String name, Double grade) {
    this.name = name;
    this.mark = grade;
  }

  public String getName() {
    return this.name;
  }

  public Double getMark() {
    return this.mark;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", mark=" + mark +
        '}';
  }
}
