package com.systelab.toolchain.java8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Java8AppTest
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
    System.out.println("Test JDK 8");
    System.out.println("");

    Java8App testJdk8 = new Java8App();
    testJdk8.getJDK8Example();
  }

}