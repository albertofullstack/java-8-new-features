package com.java.eight.features.functionalinterfaces.employeeapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeDemo {

  public static final String DEVELOPER = "Developer";

  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<>();
    populate(employeeList);
    System.out.println(employeeList);

    Predicate<Employee> p1 = employee -> ("manager").equalsIgnoreCase(employee.getDesignation());
    System.out.println();
    System.out.println("Managers information");
    display(p1, employeeList);
    System.out.println("Employees from Madrid");
    Predicate<Employee> p2 = employee -> ("madrid").equalsIgnoreCase(employee.getCity());
    display(p2, employeeList);
    System.out.println("Employees whose salary < 20000");
    Predicate<Employee> p3 = employee -> employee.getSalary() < 20000;
    display(p3, employeeList);
    System.out.println("All managers from Madrid");
    display(p1.and(p2), employeeList);
    System.out.println("Employees who are managers or whose salary is less than 20000");
    display(p1.or(p3), employeeList);
    System.out.println("Employees who are not managers");
    display(p1.negate(), employeeList);

    // isEqual -- the object Employee must override equal method
    System.out.println("Employee equal to the predicate object");
    Predicate<Employee> isEqualPredicate = Predicate.isEqual(new Employee("Antonio", "CEO", 356000.05, "Malaga"));
    display(isEqualPredicate, employeeList);
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
