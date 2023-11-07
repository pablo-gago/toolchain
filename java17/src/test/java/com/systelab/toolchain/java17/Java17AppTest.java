package com.systelab.toolchain.java17;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Java17AppTest
{


  @BeforeAll
  public static void init() {
    System.out.println("");
    System.out.println("");
    System.out.println("#######################################################################################");
    System.out.println("");
  }

  @Test
  public void testJdk17() {
    System.out.println("Test JDK 17");
    System.out.println("");

    Java17App testJdk17 = new Java17App();

    testJdk17.getJDK17Example();
  }

}
