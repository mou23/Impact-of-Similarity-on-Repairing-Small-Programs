/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:46:36 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

//  @Test(timeout = 4000)
//  public void test0()  throws Throwable  {
//      int int0 = (-334);
//      int int1 = 1;
//      int int2 = (-2026);
//      SUBSEQUENCES.subsequences(int0, int1, int2);
//      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
//      int int3 = (-880);
//      int int4 = 0;
//      int int5 = 0;
//      SUBSEQUENCES.subsequences(int3, int4, int5);
//  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      SUBSEQUENCES.subsequences(481, 481, 0);
      SUBSEQUENCES.subsequences(0, 0, 0);
      SUBSEQUENCES.subsequences(0, 0, 0);
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertFalse(arrayList0.isEmpty());
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 968, 1);
      assertEquals(968, arrayList1.size());
      
      SUBSEQUENCES.subsequences(1, 0, 1);
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(456, 1, 1);
      assertTrue(arrayList2.isEmpty());
  }

//  @Test(timeout = 4000)
//  public void test2()  throws Throwable  {
//      int int0 = 4031;
//      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(4031, 165, 4031);
//      assertEquals(0, arrayList0.size());
//      assertTrue(arrayList0.isEmpty());
//      assertNotNull(arrayList0);
//      
//      int int1 = 1874;
//      int int2 = 0;
//      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1874, 1874, 0);
//      assertNotSame(arrayList1, arrayList0);
//      assertFalse(arrayList1.isEmpty());
//      assertEquals(1, arrayList1.size());
//      assertNotNull(arrayList1);
//      assertFalse(arrayList1.equals((Object)arrayList0));
//      
//      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
//      assertNotNull(sUBSEQUENCES0);
//      
//      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(4031, 1874, 2170);
//      assertNotSame(arrayList2, arrayList0);
//      assertNotSame(arrayList2, arrayList1);
//      assertEquals(0, arrayList2.size());
//      assertTrue(arrayList2.isEmpty());
//      assertNotNull(arrayList2);
//      assertFalse(arrayList2.equals((Object)arrayList1));
//      assertTrue(arrayList2.equals((Object)arrayList0));
//      
//      int int3 = (-3079);
//      SUBSEQUENCES.subsequences(int0, int1, int3);
//      int int4 = 0;
//      SUBSEQUENCES.subsequences(int4, int2, int1);
//      int int5 = 1;
//      SUBSEQUENCES.subsequences(int1, int0, int5);
//      int int6 = (-58);
//      int int7 = 0;
//      int int8 = 50;
//      SUBSEQUENCES.subsequences(int6, int7, int8);
//      int int9 = 720;
//      int int10 = (-2798);
//      SUBSEQUENCES.subsequences(int9, int9, int10);
//      int int11 = 0;
//      SUBSEQUENCES.subsequences(int11, int1, int3);
//  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertFalse(arrayList0.isEmpty());
      assertEquals(1, arrayList0.size());
      assertNotNull(arrayList0);
      
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertNotSame(arrayList1, arrayList0);
      assertEquals(1, arrayList1.size());
      assertFalse(arrayList1.isEmpty());
      assertNotNull(arrayList1);
      assertTrue(arrayList1.equals((Object)arrayList0));
      
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertNotSame(arrayList2, arrayList1);
      assertNotSame(arrayList2, arrayList0);
      assertFalse(arrayList2.isEmpty());
      assertEquals(1, arrayList2.size());
      assertNotNull(arrayList2);
      assertTrue(arrayList2.equals((Object)arrayList0));
      assertTrue(arrayList2.equals((Object)arrayList1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      assertNotNull(sUBSEQUENCES0);
      
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1240, (-495), 1);
      assertTrue(arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNotNull(arrayList0);
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertNotSame(arrayList1, arrayList0);
      assertFalse(arrayList1.isEmpty());
      assertEquals(1, arrayList1.size());
      assertNotNull(arrayList1);
      assertFalse(arrayList1.equals((Object)arrayList0));
      
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 1);
      assertNotSame(arrayList2, arrayList0);
      assertNotSame(arrayList2, arrayList1);
      assertEquals(0, arrayList2.size());
      assertTrue(arrayList2.isEmpty());
      assertNotNull(arrayList2);
      assertFalse(arrayList2.equals((Object)arrayList1));
      assertTrue(arrayList2.equals((Object)arrayList0));
      
      int int0 = 1567;
      ArrayList<ArrayList> arrayList3 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1567, 1567, 1567);
      assertNotSame(arrayList3, arrayList0);
      assertNotSame(arrayList3, arrayList2);
      assertNotSame(arrayList3, arrayList1);
      assertEquals(0, arrayList3.size());
      assertTrue(arrayList3.isEmpty());
      assertNotNull(arrayList3);
      assertTrue(arrayList3.equals((Object)arrayList0));
      assertFalse(arrayList3.equals((Object)arrayList1));
      assertTrue(arrayList3.equals((Object)arrayList2));
      
      int int1 = 0;
      SUBSEQUENCES.subsequences(int1, int0, int0);
      int int2 = 362;
      int int3 = 0;
      SUBSEQUENCES.subsequences(int1, int2, int3);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(2607, 2607, 50);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertNotNull(arrayList0);
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(50, 0, 1);
      assertNotSame(arrayList1, arrayList0);
      assertEquals(0, arrayList1.size());
      assertTrue(arrayList1.isEmpty());
      assertNotNull(arrayList1);
      assertTrue(arrayList1.equals((Object)arrayList0));
  }

//  @Test(timeout = 4000)
//  public void test6()  throws Throwable  {
//      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
//      assertNotNull(sUBSEQUENCES0);
//      
//      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
//      assertFalse(arrayList0.isEmpty());
//      assertEquals(1, arrayList0.size());
//      assertNotNull(arrayList0);
//      
//      int int0 = 3012;
//      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(3012, 3012, 0);
//      assertNotSame(arrayList1, arrayList0);
//      assertFalse(arrayList1.isEmpty());
//      assertEquals(1, arrayList1.size());
//      assertNotNull(arrayList1);
//      assertTrue(arrayList1.equals((Object)arrayList0));
//      
//      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1, 1, 1);
//      assertNotSame(arrayList2, arrayList0);
//      assertNotSame(arrayList2, arrayList1);
//      assertEquals(0, arrayList2.size());
//      assertTrue(arrayList2.isEmpty());
//      assertNotNull(arrayList2);
//      assertFalse(arrayList2.equals((Object)arrayList0));
//      assertFalse(arrayList2.equals((Object)arrayList1));
//      
//      int int1 = (-1);
//      int int2 = 0;
//      int int3 = (-3373);
//      SUBSEQUENCES.subsequences(int1, int2, int3);
//      SUBSEQUENCES.subsequences(int2, int3, int3);
//      int int4 = 1;
//      int int5 = (-1);
//      SUBSEQUENCES.subsequences(int4, int5, int4);
//      int int6 = 548;
//      int int7 = 0;
//      int int8 = 0;
//      SUBSEQUENCES.subsequences(int6, int7, int8);
//      int int9 = 605;
//      SUBSEQUENCES.subsequences(int4, int9, int0);
//      int int10 = 0;
//      int int11 = 1;
//      int int12 = (-1);
//      SUBSEQUENCES.subsequences(int10, int11, int12);
//  }

//  @Test(timeout = 4000)
//  public void test7()  throws Throwable  {
//      // Undeclared exception!
//      SUBSEQUENCES.subsequences((-1159), 50, 50);
//  }
}