package com.imambux;

public class OutputUtil {

  public static void println(String heading, String... outputs) {
    System.out.println("=========== " + heading + " ============");
    for (String output : outputs) {
      System.out.println(output);
    }
    System.out.println();
    System.out.println();
    System.out.println();
  }

  public static void println(String heading, Boolean... outputs) {
    System.out.println("=========== " + heading + " ============");
    for (Boolean output : outputs) {
      System.out.println(output);
    }
    System.out.println();
    System.out.println();
    System.out.println();
  }

}
