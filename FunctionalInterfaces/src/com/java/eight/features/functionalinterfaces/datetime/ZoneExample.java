package com.java.eight.features.functionalinterfaces.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneExample {

  public static void main(String[] args) {
    ZoneId zone = ZoneId.systemDefault();
    System.out.println(zone);

    ZoneId anotherZone = ZoneId.of("America/Los_Angeles");
    ZonedDateTime dt = ZonedDateTime.now(anotherZone);
    System.out.println(dt);
  }
}
