/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 18:05:05 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.IS_VALID_PARENTHESIZATION;

public class IS_VALID_PARENTHESIZATION_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IS_VALID_PARENTHESIZATION iS_VALID_PARENTHESIZATION0 = new IS_VALID_PARENTHESIZATION();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Boolean boolean0 = IS_VALID_PARENTHESIZATION.is_valid_parenthesization("((L-FONi5;+;C{90");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Boolean boolean0 = IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Boolean boolean0 = IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        IS_VALID_PARENTHESIZATION.is_valid_parenthesization((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
