/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 02:12:14 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java_programs.SHORTEST_PATH_LENGTHS;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class SHORTEST_PATH_LENGTHS_ESTest {

//  @Test(timeout = 60000)
//  public void test0()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = 0;
//      int int1 = 924;
//      int int2 = 418;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(418, hashMap0);
//  }

//  @Test(timeout = 60000)
//  public void test1()  throws Throwable  {
//      int int0 = 2;
//      int int1 = (-58);
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-58), (Map<List<Integer>, Integer>) null);
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(672, map1);
//  }

  @Test(timeout = 60000)
  public void test2()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      int int0 = 0;
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      List<Integer> list0 = null;
      Integer integer0 = new Integer(0);
      try { 
        Integer.parseUnsignedInt("]JL,b}oFvD#{Sb", 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // radix 0 less than Character.MIN_RADIX
         //
      }
  }

//  @Test(timeout = 60000)
//  public void test3()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, (Map<List<Integer>, Integer>) null);
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map0);
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map1);
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
//      HashMap<List<Integer>, Integer> hashMap1 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1463, hashMap1);
//  }

//  @Test(timeout = 60000)
//  public void test4()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = (-1);
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(99999, hashMap0);
//  }

//  @Test(timeout = 60000)
//  public void test5()  throws Throwable  {
//      int int0 = 2872;
//      int int1 = 1;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      Integer integer0 = new Integer(1);
//      linkedList0.add(integer0);
//      Integer integer1 = new Integer(1);
//      hashMap0.put(linkedList0, integer1);
//      Integer integer2 = new Integer(0);
//      Integer.min(0, 1077);
//      BiFunction<Object, Object, Integer> biFunction0 = (BiFunction<Object, Object, Integer>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
//      doReturn((Object) null).when(biFunction0).apply(any() , any());
//      hashMap0.merge(linkedList0, integer2, biFunction0);
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, hashMap0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(2872, map0);
//  }

//  @Test(timeout = 60000)
//  public void test6()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = 612;
//      int int1 = 671;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(612, map0);
//  }

  @Test(timeout = 60000)
  public void test7()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      int int0 = 0;
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      hashMap0.put(linkedList0, integer0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
      int int1 = 973;
      int int2 = 0;
      Integer integer1 = new Integer(0);
      linkedList0.add(integer1);
      Integer integer2 = new Integer(0);
      Integer.getInteger("FbP2qbZx`^Y8;%R+{");
      linkedList0.removeLastOccurrence(integer2);
      Map<List<Integer>, Integer> map0 = null;
      hashMap0.put(linkedList0, (Integer) null);
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(973, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}