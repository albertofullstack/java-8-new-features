package com.java.eight.features.functionalinterfaces.primitiveinterfaces;

import com.java.eight.features.functionalinterfaces.employeeapp.Employee;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

public class PrimitiveConsumerExample {

  public static void main(String[] args) {

    IntConsumer displaySquare = i -> System.out.println("The square of " + i + " is " + i * i);
    displaySquare.accept(10);

    ObjDoubleConsumer<Employee> increaseSalary = (employee1, value) -> employee1.setSalary(employee1.getSalary() + value);
    Employee employee = new Employee("Ernesto", 20013);
    System.out.println("Before increase: " + employee.getSalary());
    increaseSalary.accept(employee, 50000);
    System.out.println("After increase: " + employee.getSalary());
  }
}
