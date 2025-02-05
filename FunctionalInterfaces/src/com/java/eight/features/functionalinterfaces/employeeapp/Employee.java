package com.java.eight.features.functionalinterfaces.employeeapp;

public class Employee {

  private String name;
  private String designation;
  private double salary;
  private String city;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public Employee(String name, String designation, double salary, String city) {
    this.name = name;
    this.designation = designation;
    this.salary = salary;
    this.city = city;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("(%s,%s,%.2f,%s)", this.name, this.designation, this.salary, this.city);
  }

  public String getName() {
    return name;
  }

  public String getDesignation() {
    return designation;
  }

  public double getSalary() {
    return salary;
  }

  public String getCity() {
    return city;
  }

  @Override
  public boolean equals(Object o) {

    // If the object is compared with itself then return true
    if (o == this) {
      return true;
    }

    Employee emp = (Employee) o;
    return this.getName().equals(emp.getName()) && this.getDesignation()
        .equals(emp.getDesignation()) && this.getSalary() == emp.getSalary() && this.getCity()
        .equals(emp.getCity());
  }
}
