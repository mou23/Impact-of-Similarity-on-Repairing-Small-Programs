/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 17:54:48 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java_programs.HANOI;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>((Integer) null, "E4WSfff>@^5\u0004");
      Integer integer0 = hANOI_Pair0.getFirst();
      HANOI.Pair<Object, Integer> hANOI_Pair1 = new HANOI.Pair<Object, Integer>((Object) null, integer0);
      Integer integer1 = hANOI_Pair1.getSecond();
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>((Integer) null, "E4WSfff>@^5\u0004");
      Integer integer0 = hANOI_Pair0.getFirst();
      HANOI.Pair<Object, Integer> hANOI_Pair1 = new HANOI.Pair<Object, Integer>((Object) null, integer0);
      hANOI_Pair1.setFirst("E4WSfff>@^5\u0004");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>((Integer) null, "E4WSfff>@^5\u0004");
      hANOI_Pair0.setSecond("E4WSfff>@^5\u0004");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI.Pair<Integer, String> hANOI_Pair0 = new HANOI.Pair<Integer, String>((Integer) null, "E4WSfff>@^5\u0004");
      String string0 = hANOI_Pair0.toString();
      assertEquals("(null, E4WSfff>@^5\u0004)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(1, (-1), 0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-472), (-472), 0);
      assertEquals(0, list0.size());
  }
}
