package com.java.eight.features.functionalinterfaces.consumer;

import com.java.eight.features.functionalinterfaces.functions.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradesTest {

  public static void main(String[] args) {

    Predicate<Student> gradeIsGreaterThan60 = student -> student.getMark() >= 6;

    Function<Student, String> getGrade = s -> {
      if (s.getMark() >= 8) {
        return "A [Distinction]";
      } else if (s.getMark() >= 6) {
        return "B [First class]";
      } else if (s.getMark() >= 5) {
        return "C [Second class]";
      } else if (s.getMark() >= 3.5) {
        return "D [Third class]";
      }
      return "E [Failed]";
    };

    Consumer<Student> displayStudentInfo = student -> {
      System.out.println("Name: " + student.getName());
      System.out.println("Mark: " + student.getMark());
      System.out.println("Grade: " + getGrade.apply(student));
      System.out.println();
    };

    List<Student> students = new ArrayList<>();
    populate(students);

    for (Student student: students) {
      if (gradeIsGreaterThan60.test(student)) {
        displayStudentInfo.accept(student);
      }
    }
  }

  private static void populate(List<Student> studentList) {
    studentList.add(new Student("Antonio", 4.5));
    studentList.add(new Student("Juan", 10.0));
    studentList.add(new Student("Isabel", 6.1));
    studentList.add(new Student("Toño", 8.1));
    studentList.add(new Student("Maria", 5.0));
    studentList.add(new Student("Ana", 1.2));
  }
}
