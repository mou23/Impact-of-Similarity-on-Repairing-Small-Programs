/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 29 14:15:11 GMT 2018
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
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1934), hashMap0);
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      Integer integer0 = new Integer((-1934));
//      hashMap0.put(linkedList0, integer0);
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1934), hashMap0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(696, map0);
//  }

  @Test(timeout = 60000)
  public void test1()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-180), hashMap0);
      int int0 = (-1363);
      int int1 = (-2848);
      HashMap<List<Integer>, Integer> hashMap1 = new HashMap<List<Integer>, Integer>();
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2848), hashMap1);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1363), map0);
      int int2 = 0;
      HashMap<List<Integer>, Integer> hashMap2 = new HashMap<List<Integer>, Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      try { 
        Integer.valueOf("~P[");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"~P[\"
         //
      }
  }

//  @Test(timeout = 60000)
//  public void test2()  throws Throwable  {
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      int int0 = (-1);
//      Integer integer0 = new Integer((-1));
//      hashMap0.put(linkedList0, integer0);
//      int int1 = 0;
//      int int2 = 2347;
//      Integer.sum(0, 2347);
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
//      hashMap0.put(linkedList0, integer0);
//      Integer integer1 = new Integer(2347);
//      hashMap0.put(linkedList0, integer1);
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(483, map1);
//  }

  @Test(timeout = 60000)
  public void test3()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, hashMap0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map0);
  }

  @Test(timeout = 60000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(1414, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
