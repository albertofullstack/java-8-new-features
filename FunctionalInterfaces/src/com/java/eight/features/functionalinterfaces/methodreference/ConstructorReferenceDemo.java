package com.java.eight.features.functionalinterfaces.methodreference;

import com.java.eight.features.functionalinterfaces.anonymousclasses.InterfaceDemo;

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
