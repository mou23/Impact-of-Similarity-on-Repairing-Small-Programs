/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 23:25:38 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.QUICKSORT;

public class QUICKSORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QUICKSORT qUICKSORT0 = new QUICKSORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(15);
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(15);
      Integer integer1 = new Integer(43);
      arrayList0.add(integer1);
      arrayList0.add(integer0);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        QUICKSORT.quicksort((ArrayList<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertNotSame(arrayList1, arrayList0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(15);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(43);
      arrayList0.add(integer1);
      ArrayList<Integer> arrayList1 = QUICKSORT.quicksort(arrayList0);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}