package com.java.eight.features.functionalinterfaces.twoargsinterfaces;


import com.java.eight.features.functionalinterfaces.functions.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionStudentExample {

  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    BiFunction<String, Double, Student> createStudent = Student::new;
    students.add(createStudent.apply("Juan", 2.0));
    students.add(createStudent.apply("Israel", 5.6));

    for (Student student: students) {
      System.out.println(student);
    }
  }
}
