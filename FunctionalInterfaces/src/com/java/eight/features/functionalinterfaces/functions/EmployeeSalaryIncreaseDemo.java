package com.java.eight.features.functionalinterfaces.functions;

import com.java.eight.features.functionalinterfaces.employeeapp.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeSalaryIncreaseDemo {

  public static final String DEVELOPER = "Developer";

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
    populate(employeeList);
    System.out.println("Employees before increase");
    System.out.println(employeeList);

    Predicate<Employee> hasSalaryIncrease = emp -> emp.getSalary() < 100000;
    Function<Employee, Employee> increaseSalary = empl-> {
      empl.setSalary(empl.getSalary() + 35000);
      return empl;
    };

    List<Employee> employeesSalaryIncrease = new ArrayList<>();
    for (Employee employee : employeeList) {
      if (hasSalaryIncrease.test(employee)) {
        increaseSalary.apply(employee);
        employeesSalaryIncrease.add(employee);
      }
    }
    System.out.println("Employees after incrase");
    System.out.println(employeeList);
    System.out.println("Employees with salary increase");
    System.out.println(employeesSalaryIncrease);
  }

  private static void populate(List<Employee> employeeList) {
    employeeList.add(new Employee("Antonio", "CEO", 356000.05, "Malaga"));
    employeeList.add(new Employee("Juan", "Manager", 2034434.45, "Madrid"));
    employeeList.add(new Employee("Toño", "Manager", 1035434.45, "Linares"));
    employeeList.add(new Employee("Maria", "Lead", 934434.45, "Madrid"));
    employeeList.add(new Employee("Ana", "Lead", 834434.45, "Calabria"));
    employeeList.add(new Employee("Roberto", DEVELOPER, 93443.45, "Ibiza"));
    employeeList.add(new Employee("Alvaro", DEVELOPER, 83443.45, "Murcia"));
    employeeList.add(new Employee("Daniel", DEVELOPER, 21443.45, "Almeria"));
    employeeList.add(new Employee("Mopongo", "Cleaner", 254.45, "Nigeria"));
  }
}
