package com.java.eight.features.functionalinterfaces.twoargsinterfaces;

import java.util.function.BiFunction;

public class EmployeeDemo {

  public static void main(String[] args) {
    Employee employee = new Employee(1233, "albert", 35.6);
    TimeSheet timeSheet = new TimeSheet(1233, 35);

    BiFunction<Employee, TimeSheet, Double> calculateMonthlySalary = (emp, timesheet) ->
        emp.dailyWage * timesheet.days;
    System.out.println("Monthly salary: " + calculateMonthlySalary.apply(employee, timeSheet));
  }
}
