/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 18:33:51 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[6][5];
      int[] intArray1 = new int[4];
      intArray1[0] = 1;
      intArray1[1] = 1;
      intArray1[2] = 1;
      intArray1[3] = 1;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[9];
      intArray2[0] = 1748;
      intArray2[1] = 0;
      intArray2[2] = 1;
      intArray2[3] = (-818);
      intArray2[4] = 1;
      intArray2[5] = 1;
      intArray2[6] = 1;
      intArray2[7] = 1;
      intArray2[8] = 1;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[2];
      intArray3[0] = 0;
      intArray3[1] = (-818);
      intArray0[2] = intArray3;
      int[] intArray4 = new int[5];
      intArray4[0] = 81;
      intArray4[1] = 0;
      intArray4[2] = 1;
      intArray4[3] = (-818);
      intArray4[4] = (-818);
      intArray0[3] = intArray4;
      int[] intArray5 = new int[2];
      intArray5[0] = 81;
      intArray5[1] = 0;
      intArray0[4] = intArray5;
      int[] intArray6 = new int[4];
      intArray6[0] = 1748;
      intArray6[1] = 1;
      intArray6[2] = 0;
      intArray6[3] = (-818);
      intArray0[5] = intArray6;
      int int0 = KNAPSACK.knapsack(1, intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[4][1];
      int[] intArray1 = new int[9];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 0;
      intArray1[5] = 0;
      intArray1[6] = 0;
      intArray1[7] = 0;
      intArray1[8] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[7];
      intArray2[0] = 0;
      intArray2[1] = 0;
      intArray2[2] = 0;
      intArray2[3] = 0;
      intArray2[4] = 0;
      intArray2[5] = 0;
      intArray2[6] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[8];
      intArray3[0] = 0;
      intArray3[1] = (-301);
      intArray3[2] = 0;
      intArray3[3] = 0;
      intArray3[4] = 366;
      intArray3[5] = 0;
      intArray3[6] = 0;
      intArray3[7] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[9];
      intArray4[0] = (-301);
      intArray4[1] = (-1);
      intArray4[2] = 0;
      intArray4[3] = (-301);
      intArray4[4] = 0;
      intArray4[5] = 366;
      intArray4[6] = 0;
      intArray4[7] = 366;
      intArray4[8] = 0;
      intArray0[3] = intArray4;
      int int0 = KNAPSACK.knapsack(0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[1][9];
      int[] intArray1 = new int[2];
      intArray1[0] = 96;
      intArray1[1] = 96;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(96, intArray0);
      KNAPSACK.knapsack(96, intArray0);
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2384), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[3][4];
      int[] intArray1 = new int[2];
      intArray1[0] = 985;
      intArray1[1] = 985;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[4];
      intArray2[0] = 985;
      intArray2[1] = 985;
      intArray2[2] = 985;
      intArray2[3] = 985;
      int[] intArray3 = new int[1];
      intArray3[0] = 985;
      intArray0[2] = intArray3;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(985, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test5()  throws Throwable  {
//      int[][] intArray0 = new int[6][4];
//      int[] intArray1 = new int[2];
//      intArray1[0] = 4301;
//      intArray1[1] = 4301;
//      intArray0[0] = intArray1;
//      int[] intArray2 = new int[8];
//      intArray2[0] = 4301;
//      intArray2[1] = 0;
//      intArray2[2] = 4301;
//      intArray2[3] = 4301;
//      intArray2[4] = 4301;
//      intArray2[5] = 4301;
//      intArray2[6] = 4301;
//      intArray2[7] = (-834);
//      intArray0[1] = intArray2;
//      int[] intArray3 = new int[3];
//      intArray3[0] = 4301;
//      intArray3[1] = (-834);
//      intArray3[2] = 0;
//      intArray0[2] = intArray3;
//      int[] intArray4 = new int[4];
//      intArray4[0] = 4301;
//      intArray4[1] = 0;
//      intArray4[2] = 0;
//      intArray4[3] = 4301;
//      intArray0[3] = intArray4;
//      int[] intArray5 = new int[0];
//      intArray0[4] = intArray5;
//      int[] intArray6 = new int[4];
//      intArray6[0] = 4301;
//      intArray6[1] = 0;
//      intArray6[2] = 4301;
//      intArray6[3] = 0;
//      intArray0[5] = intArray6;
//      // Undeclared exception!
//      KNAPSACK.knapsack(4301, intArray0);
//  }
}