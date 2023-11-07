package com.systelab.toolchain.java11;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Java11AppTest
{


  @BeforeAll
  public static void init() {
    System.out.println("");
    System.out.println("");
    System.out.println("#######################################################################################");
    System.out.println("");
  }

  @Test
  public void testJdk8() {
    System.out.println("Test JDK 11");
    System.out.println("");

    Java11App testJdk11 = new Java11App();
    int[] numbers = {1, 2, 3, 4, 5};
    testJdk11.getJDK11Example();
  }

}
