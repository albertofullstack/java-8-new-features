package com.java.eight.features.functionalinterfaces.functions;

import com.java.eight.features.functionalinterfaces.employeeapp.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeSalaryDemo {

  public static final String DEVELOPER = "Developer";

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
    populate(employeeList);
    System.out.println(employeeList);

    Function<List<Employee>, Double> getTotalSalary = employeeList1 -> {
      double totalSalary = .0;
      for (Employee employee: employeeList1) {
        totalSalary += employee.getSalary();
      }
      return totalSalary;
    };
    System.out.printf("Total salary of the company: %.2f", getTotalSalary.apply(employeeList));
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

  public static void display(Predicate<Employee> p, List<Employee> employeeList) {
    for (Employee employee : employeeList) {
      if (p.test(employee)) {
        System.out.println(employee);
      }
    }
    System.out.println("*******************************************************");
  }
}
