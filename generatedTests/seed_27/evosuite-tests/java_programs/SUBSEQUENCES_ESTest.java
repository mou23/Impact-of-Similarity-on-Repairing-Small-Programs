/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 01:14:41 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      SUBSEQUENCES.subsequences(934, 934, 166);
      int int0 = (-2494);
      int int1 = (-1);
      int int2 = 842;
      SUBSEQUENCES.subsequences(int0, int1, int2);
      int int3 = (-1);
      int int4 = 0;
      SUBSEQUENCES.subsequences(int3, int4, int4);
      int int5 = 1911;
      int int6 = 563;
      SUBSEQUENCES.subsequences(int5, int5, int6);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(50, 0, 0);
      SUBSEQUENCES.subsequences(256, (-44), 306);
      SUBSEQUENCES.subsequences(0, 0, 0);
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences((-1338), (-1338), 882);
      ArrayList<ArrayList> arrayList2 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(306, (-1), (-44));
      assertTrue(arrayList2.equals((Object)arrayList1));
      assertFalse(arrayList2.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      int int0 = (-1);
      int int1 = 65;
      SUBSEQUENCES.subsequences(int0, int1, int0);
      int int2 = (-2514);
      SUBSEQUENCES.subsequences(int2, int2, int2);
      SUBSEQUENCES.subsequences(int0, int1, int1);
      int int3 = 0;
      int int4 = 130;
      SUBSEQUENCES.subsequences(int3, int4, int2);
      int int5 = 0;
      int int6 = 466;
      int int7 = (-464);
      SUBSEQUENCES.subsequences(int5, int6, int7);
      int int8 = 1321;
      SUBSEQUENCES.subsequences(int8, int5, int5);
      int int9 = 0;
      int int10 = 1557;
      int int11 = (-1248);
      SUBSEQUENCES.subsequences(int9, int10, int11);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SUBSEQUENCES.subsequences(0, 650, 3829);
      SUBSEQUENCES.subsequences(4129, 650, 650);
      SUBSEQUENCES.subsequences(650, 2358, 1);
      SUBSEQUENCES.subsequences(2358, (-868), 650);
      SUBSEQUENCES.subsequences(1, 1382, 1382);
      // Undeclared exception!
      SUBSEQUENCES.subsequences(1, 4129, 1);
  }
}
