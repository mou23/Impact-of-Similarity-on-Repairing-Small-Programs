/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:19:45 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

//  @Test(timeout = 4000)
//  public void test0()  throws Throwable  {
//      int[] intArray0 = new int[9];
//      intArray0[0] = (-1);
//      intArray0[1] = 0;
//      intArray0[2] = (-3311);
//      intArray0[3] = (-2095);
//      intArray0[4] = 2688;
//      intArray0[5] = (-2134);
//      intArray0[6] = 0;
//      intArray0[7] = (-3126);
//      int int0 = 562;
//      intArray0[8] = 562;
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 0;
      intArray0[1] = 1;
      intArray0[2] = (-3655);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      assertEquals(1, int0);
  }

//  @Test(timeout = 4000)
//  public void test2()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      int[] intArray0 = new int[6];
//      intArray0[0] = 1427;
//      intArray0[1] = 0;
//      intArray0[2] = 2424;
//      intArray0[3] = 1;
//      intArray0[4] = 0;
//      int int0 = 3087;
//      intArray0[5] = 3087;
//      int int1 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      int int2 = 2443;
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      int int3 = (-194);
//      POSSIBLE_CHANGE.possible_change(intArray0, int3);
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[0];
      POSSIBLE_CHANGE.possible_change(intArray0, 113);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, 113);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
      POSSIBLE_CHANGE.possible_change(intArray0, (-2716));
      int[] intArray1 = new int[2];
      intArray1[0] = 0;
      intArray1[1] = 0;
      POSSIBLE_CHANGE.possible_change(intArray1, (-1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[2];
      intArray0[0] = 0;
      intArray0[1] = (-1);
      POSSIBLE_CHANGE.possible_change(intArray0, 0);
  }

//  @Test(timeout = 4000)
//  public void test6()  throws Throwable  {
//      int[] intArray0 = new int[8];
//      int int0 = (-248);
//      intArray0[0] = (-248);
//      intArray0[1] = 0;
//      intArray0[2] = 0;
//      intArray0[3] = (-1);
//      intArray0[4] = 3001;
//      intArray0[5] = 1179;
//      intArray0[6] = 0;
//      intArray0[7] = 0;
//      int int1 = 273;
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      int int2 = 1380;
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[6]);
//      int int3 = 2639;
//      POSSIBLE_CHANGE.possible_change(intArray0, int3);
//      int int4 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int4);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[3]);
//      int int5 = 279;
//      POSSIBLE_CHANGE.possible_change(intArray0, int5);
//      int int6 = 3555;
//      POSSIBLE_CHANGE.possible_change(intArray0, int6);
//  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      POSSIBLE_CHANGE.possible_change((int[]) null, (-5544));
      POSSIBLE_CHANGE.possible_change((int[]) null, 0);
      POSSIBLE_CHANGE.possible_change((int[]) null, (-5544));
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}