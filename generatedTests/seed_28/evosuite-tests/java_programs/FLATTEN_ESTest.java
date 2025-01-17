/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 15:01:23 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.FLATTEN;

public class FLATTEN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FLATTEN fLATTEN0 = new FLATTEN();
      Object object0 = FLATTEN.flatten(fLATTEN0);
      assertSame(object0, fLATTEN0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) "java_programs.FLATTEN");
      ArrayList arrayList1 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertFalse(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList0.add((Object) arrayList1);
      ArrayList arrayList2 = (ArrayList)FLATTEN.flatten(arrayList0);
      assertTrue(arrayList2.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object object0 = FLATTEN.flatten((Object) null);
      assertNull(object0);
  }
}
