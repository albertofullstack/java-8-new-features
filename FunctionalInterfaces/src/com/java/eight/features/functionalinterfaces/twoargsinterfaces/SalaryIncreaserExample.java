package com.java.eight.features.functionalinterfaces.twoargsinterfaces;

import com.java.eight.features.functionalinterfaces.employeeapp.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class SalaryIncreaserExample {

  public static void main(String[] args) {
    List<Employee> employeeList = new ArrayList<>();
    BiFunction<String, Double, Employee> createEmployee = (name, salary) -> new Employee(name, salary);

    employeeList.add(createEmployee.apply("sancho", 5656.2));
    employeeList.add(createEmployee.apply("quijote", 99999.03));
    employeeList.add(createEmployee.apply("dulcinea", 44555.67));
    employeeList.add(createEmployee.apply("molinos", 667676767.5));

    BiConsumer<Employee, Double> increaseSalary = (emp, increase) ->  {
      emp.setSalary(emp.getSalary() + increase);
    };

    for (Employee employee: employeeList) {
      System.out.println("Employee before increase: " + employee);
      increaseSalary.accept(employee, 36.0);
      System.out.println("Employee after increase: " + employee);
      System.out.println();
    }
  }


}
