/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 20:02:35 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      String string0 = "java_programs.LEVENSHTEIN";
      LEVENSHTEIN.levenshtein("java_programs.LEVENSHTEIN", "java_programs.LEVENSHTEIN");
      String string1 = null;
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein("java_programs.LEVENSHTEIN", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = "2AXuWKt";
      LEVENSHTEIN.levenshtein("", "2AXuWKt");
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      LEVENSHTEIN.levenshtein("", "2AXuWKt");
      LEVENSHTEIN.levenshtein("2AXuWKt", "");
      LEVENSHTEIN.levenshtein("", "Rf)Vd$INDX=QK Vav~");
      LEVENSHTEIN.levenshtein("2AXuWKt", "2AXuWKt");
      LEVENSHTEIN.levenshtein("", "");
      String string1 = "J@8hSOy/";
      LEVENSHTEIN.levenshtein("J@8hSOy/", "J@8hSOy/");
      // Undeclared exception!
      LEVENSHTEIN.levenshtein("2AXuWKt", "?-RD3e");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
      LEVENSHTEIN.levenshtein("", "");
      int int0 = LEVENSHTEIN.levenshtein("}RK9D[", "}RK9D[");
      assertEquals(0, int0);
      
      int int1 = LEVENSHTEIN.levenshtein("", "dLbfr");
      assertEquals(5, int1);
  }
}
