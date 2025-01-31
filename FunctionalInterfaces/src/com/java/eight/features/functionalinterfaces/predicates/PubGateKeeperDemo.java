package com.java.eight.features.functionalinterfaces.predicates;

import java.util.function.Predicate;

public class PubGateKeeperDemo {

  public static void main(String[] args) {

    SoftwareEngineer[] softwareEngineerList = {
      new SoftwareEngineer("John", 23, false),
      new SoftwareEngineer("Antonio", 16, true),
      new SoftwareEngineer("Manolo", 50, true),
      new SoftwareEngineer("Miguel", 10, false)
    };

    Predicate<SoftwareEngineer> isValidSoftwareEngineer = softwareEngineer -> softwareEngineer.getAge() >= 18
        && softwareEngineer.isHasGirlfriend();
    for (SoftwareEngineer engineer : softwareEngineerList) {
      if (isValidSoftwareEngineer.test(engineer)) {
        System.out.println("You are allowed into the pub!!!! " + engineer);
      } else {
        System.out.println("Return to your house!!! " + engineer);
      }
    }
  }
}
