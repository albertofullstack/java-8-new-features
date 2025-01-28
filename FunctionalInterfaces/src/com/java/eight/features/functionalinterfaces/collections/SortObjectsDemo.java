package com.java.eight.features.functionalinterfaces.collections;

import java.util.ArrayList;
import java.util.List;

public class SortObjectsDemo {

  public static void main(String[] args) {

    Employee e1 = new Employee(100, "Alberto");
    System.out.println(e1);

    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(200, "Jose"));
    employees.add(new Employee(400, "Maria"));
    employees.add(new Employee(300, "Antonio"));
    employees.add(new Employee(100, "Isabel"));
    System.out.println("Before sorting: " + employees);

    List<Employee> sortedEmployees = new ArrayList<>();
    sortedEmployees.add(new Employee(200, "Jose"));
    sortedEmployees.add(new Employee(400, "Maria"));
    sortedEmployees.add(new Employee(300, "Antonio"));
    sortedEmployees.add(new Employee(100, "Isabel"));
    sortedEmployees.sort((Employee e, Employee e2) ->
        e.getNumber() > e2.getNumber()? -1: e.getNumber() < e2.getNumber()? 1: 0);
    System.out.println("After sorting by number (descending order): " + sortedEmployees);

    sortedEmployees.sort((Employee e, Employee e2) -> e2.getName().compareTo(e.getName()));
    System.out.println("After sorting by name (descending order): " + sortedEmployees);
  }
}
