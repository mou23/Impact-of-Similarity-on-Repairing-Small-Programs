/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:33:40 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

//  @Test(timeout = 4000)
//  public void test0()  throws Throwable  {
//      String string0 = "x$?J\\`99IYEIh[yb";
//      LEVENSHTEIN.levenshtein("x$?J`99IYEIh[yb", "x$?J`99IYEIh[yb");
//      LEVENSHTEIN.levenshtein("IJXHJpl", "IJXHJpl");
//      LEVENSHTEIN.levenshtein("x$?J`99IYEIh[yb", "x$?J`99IYEIh[yb");
//      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
//      String string1 = "";
//      String string2 = "sEOT;v''tAlY0";
//      LEVENSHTEIN.levenshtein("", "sEOT;v''tAlY0");
//      String string3 = "java_programs.LEVENSHTEIN";
//      // Undeclared exception!
//      LEVENSHTEIN.levenshtein("java_programs.LEVENSHTEIN", "IJXHJpl");
//  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      int int0 = LEVENSHTEIN.levenshtein("_%be/7", "_%be/7");
      assertEquals(0, int0);
      
      int int1 = LEVENSHTEIN.levenshtein("", "");
      assertEquals(0, int1);
      assertTrue(int1 == int0);
  }

//  @Test(timeout = 4000)
//  public void test2()  throws Throwable  {
//      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
//      assertNotNull(lEVENSHTEIN0);
//      
//      String string0 = "";
//      String string1 = "Uy),B7`>Y}?xJDkz";
//      int int0 = LEVENSHTEIN.levenshtein("", "Uy),B7`>Y}?xJDkz");
//      assertEquals(16, int0);
//      
//      String string2 = "";
//      int int1 = LEVENSHTEIN.levenshtein("", "Uy),B7`>Y}?xJDkz");
//      assertEquals(16, int1);
//      assertTrue(int1 == int0);
//      
//      int int2 = LEVENSHTEIN.levenshtein("Uy),B7`>Y}?xJDkz", "Uy),B7`>Y}?xJDkz");
//      assertEquals(0, int2);
//      assertFalse(int2 == int1);
//      assertFalse(int2 == int0);
//      
//      // Undeclared exception!
//      LEVENSHTEIN.levenshtein("-pn,q.<ym$L0i'P5", "Uy),B7`>Y}?xJDkz");
//  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("F+", "F+");
      assertEquals(0, int0);
      
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      assertNotNull(lEVENSHTEIN0);
      
      int int1 = LEVENSHTEIN.levenshtein("", "E_B~vs[K3X7");
      assertEquals(11, int1);
      assertFalse(int1 == int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}