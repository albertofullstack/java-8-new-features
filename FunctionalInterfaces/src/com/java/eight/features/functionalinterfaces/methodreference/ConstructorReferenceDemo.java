package com.java.eight.features.functionalinterfaces.methodreference;

public class ConstructorReferenceDemo {

  public ConstructorReferenceDemo() {
    System.out.println("ConstructorReferenceDemo Constructor Execution & object creation");
  }

  interface Interf {

    ConstructorReferenceDemo get();
  }

  public static void main(String[] args) {

    Interf refDemo = ConstructorReferenceDemo::new;
    ConstructorReferenceDemo referenceDemo = refDemo.get();
  }

}
