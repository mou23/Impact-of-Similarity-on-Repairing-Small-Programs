/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 02:27:47 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java_programs.SHORTEST_PATH_LENGTHS;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class SHORTEST_PATH_LENGTHS_ESTest {

//  @Test(timeout = 4000)
//  public void test0()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = 57;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      Integer integer0 = new Integer(57);
//      hashMap0.put(linkedList0, integer0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(57, hashMap0);
//  }

//  @Test(timeout = 4000)
//  public void test1()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      assertNotNull(sHORTEST_PATH_LENGTHS0);
//      
//      int int0 = 1;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      assertEquals(0, hashMap0.size());
//      assertTrue(hashMap0.isEmpty());
//      assertNotNull(hashMap0);
//      
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      assertEquals(0, linkedList0.size());
//      assertFalse(linkedList0.contains(int0));
//      assertNotNull(linkedList0);
//      
//      int int1 = 1458;
//      Integer integer0 = new Integer(1458);
//      assertEquals(1458, (int)integer0);
//      assertTrue(integer0.equals((Object)int1));
//      assertFalse(integer0.equals((Object)int0));
//      assertNotNull(integer0);
//      
//      Integer integer1 = new Integer(99999);
//      assertEquals(99999, (int)integer1);
//      assertFalse(integer1.equals((Object)int1));
//      assertFalse(integer1.equals((Object)integer0));
//      assertFalse(integer1.equals((Object)int0));
//      assertNotNull(integer1);
//      
//      boolean boolean0 = linkedList0.add(integer1);
//      assertEquals(1, linkedList0.size());
//      assertTrue(linkedList0.contains(integer1));
//      assertFalse(linkedList0.contains(integer0));
//      assertTrue(boolean0);
//      assertFalse(integer1.equals((Object)int1));
//      assertFalse(integer1.equals((Object)integer0));
//      assertFalse(integer1.equals((Object)int0));
//      
//      Integer integer2 = Integer.getInteger("V");
//      assertNull(integer2);
//      
//      Integer integer3 = hashMap0.put(linkedList0, integer0);
//      assertFalse(hashMap0.isEmpty());
//      assertEquals(1, hashMap0.size());
//      assertEquals(1, linkedList0.size());
//      assertTrue(linkedList0.contains(integer1));
//      assertFalse(linkedList0.contains(integer0));
//      assertTrue(integer0.equals((Object)int1));
//      assertFalse(integer0.equals((Object)int0));
//      assertFalse(integer0.equals((Object)integer1));
//      assertNull(integer3);
//      
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(99999, hashMap0);
//  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      assertNotNull(sHORTEST_PATH_LENGTHS0);
      
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, (Map<List<Integer>, Integer>) null);
      assertEquals(0, map0.size());
      assertTrue(map0.isEmpty());
      assertNotNull(map0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = 1;
      int int1 = (-147);
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      Integer integer0 = hashMap0.remove((Object) null);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNull(integer0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertFalse(linkedList0.contains(int1));
      assertNotNull(linkedList0);
      
      Integer integer1 = Integer.getInteger((String) null, 0);
      assertEquals(0, (int)integer1);
      assertFalse(integer1.equals((Object)int0));
      assertFalse(integer1.equals((Object)int1));
      assertNotNull(integer1);
      
      boolean boolean0 = linkedList0.add((Integer) null);
      assertEquals(1, linkedList0.size());
      assertFalse(linkedList0.contains(int1));
      assertTrue(boolean0);
      
      int int2 = (-1);
      Integer integer2 = Integer.getInteger((String) null, (-1));
      assertEquals((-1), (int)integer2);
      assertFalse(integer2.equals((Object)int0));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)int1));
      assertNotNull(integer2);
      
      int int3 = (-3565);
      int int4 = Integer.compare((-3565), 1);
      assertEquals((-1), int4);
      assertFalse(int4 == int1);
      assertFalse(int4 == int0);
      assertTrue(int4 == int2);
      assertFalse(int4 == int3);
      
      Integer integer3 = hashMap0.put(linkedList0, integer2);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertFalse(linkedList0.contains(int3));
      assertFalse(integer2.equals((Object)int0));
      assertFalse(integer2.equals((Object)integer1));
      assertFalse(integer2.equals((Object)int1));
      assertFalse(integer2.equals((Object)int3));
      assertTrue(integer2.equals((Object)int4));
      assertNull(integer3);
      
      Integer integer4 = new Integer(1361);
      assertEquals(1361, (int)integer4);
      assertFalse(integer4.equals((Object)int3));
      assertFalse(integer4.equals((Object)integer2));
      assertFalse(integer4.equals((Object)int1));
      assertFalse(integer4.equals((Object)int4));
      assertFalse(integer4.equals((Object)int0));
      assertFalse(integer4.equals((Object)int2));
      assertFalse(integer4.equals((Object)integer1));
      assertNotNull(integer4);
      
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      linkedList0.forEach(consumer0);
      assertEquals(1, linkedList0.size());
      assertFalse(linkedList0.contains(int1));
      
      Integer integer5 = new Integer(99999);
      assertEquals(99999, (int)integer5);
      assertFalse(integer5.equals((Object)integer2));
      assertFalse(integer5.equals((Object)int0));
      assertFalse(integer5.equals((Object)integer4));
      assertFalse(integer5.equals((Object)int4));
      assertFalse(integer5.equals((Object)int3));
      assertFalse(integer5.equals((Object)int1));
      assertFalse(integer5.equals((Object)int2));
      assertFalse(integer5.equals((Object)integer1));
      assertNotNull(integer5);
      
      Integer integer6 = hashMap0.put(linkedList0, integer5);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertFalse(linkedList0.contains(int1));
      assertEquals((-1), (int)integer6);
      assertFalse(integer6.equals((Object)int0));
      assertFalse(integer6.equals((Object)int3));
      assertFalse(integer6.equals((Object)int1));
      assertFalse(integer6.equals((Object)integer1));
      assertFalse(integer6.equals((Object)integer5));
      assertFalse(integer6.equals((Object)integer4));
      assertTrue(integer6.equals((Object)int4));
      assertFalse(integer5.equals((Object)integer2));
      assertFalse(integer5.equals((Object)int0));
      assertFalse(integer5.equals((Object)integer4));
      assertFalse(integer5.equals((Object)int4));
      assertFalse(integer5.equals((Object)int3));
      assertFalse(integer5.equals((Object)int1));
      assertFalse(integer5.equals((Object)int2));
      assertFalse(integer5.equals((Object)integer1));
      assertNotNull(integer6);
      
      try { 
        Integer.parseUnsignedInt("", 0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test4()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      assertNotNull(sHORTEST_PATH_LENGTHS0);
//      
//      int int0 = (-2892);
//      Map<List<Integer>, Integer> map0 = null;
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2892), (Map<List<Integer>, Integer>) null);
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map1.size());
//      assertNotNull(map1);
//      
//      Map<List<Integer>, Integer> map2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1), map1);
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map2.isEmpty());
//      assertEquals(0, map2.size());
//      assertNotSame(map1, map2);
//      assertNotSame(map2, map1);
//      assertTrue(map2.equals((Object)map1));
//      assertNotNull(map2);
//      
//      Map<List<Integer>, Integer> map3 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2892), map2);
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map2.isEmpty());
//      assertEquals(0, map2.size());
//      assertEquals(0, map3.size());
//      assertTrue(map3.isEmpty());
//      assertNotSame(map1, map3);
//      assertNotSame(map1, map2);
//      assertNotSame(map2, map3);
//      assertNotSame(map2, map1);
//      assertNotSame(map3, map1);
//      assertNotSame(map3, map2);
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map2.equals((Object)map1));
//      assertTrue(map3.equals((Object)map2));
//      assertTrue(map3.equals((Object)map1));
//      assertNotNull(map3);
//      
//      Map<List<Integer>, Integer> map4 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1), map3);
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map2.isEmpty());
//      assertEquals(0, map2.size());
//      assertEquals(0, map3.size());
//      assertTrue(map3.isEmpty());
//      assertTrue(map4.isEmpty());
//      assertEquals(0, map4.size());
//      assertNotSame(map1, map4);
//      assertNotSame(map1, map3);
//      assertNotSame(map1, map2);
//      assertNotSame(map2, map3);
//      assertNotSame(map2, map1);
//      assertNotSame(map2, map4);
//      assertNotSame(map3, map4);
//      assertNotSame(map3, map1);
//      assertNotSame(map3, map2);
//      assertNotSame(map4, map3);
//      assertNotSame(map4, map2);
//      assertNotSame(map4, map1);
//      assertTrue(map1.equals((Object)map3));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map2.equals((Object)map1));
//      assertTrue(map2.equals((Object)map3));
//      assertTrue(map3.equals((Object)map2));
//      assertTrue(map3.equals((Object)map1));
//      assertTrue(map4.equals((Object)map1));
//      assertTrue(map4.equals((Object)map2));
//      assertTrue(map4.equals((Object)map3));
//      assertNotNull(map4);
//      
//      int int1 = 2;
//      int int2 = 0;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertNotNull(hashMap0);
//      
//      Map<List<Integer>, Integer> map5 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map4);
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map1));
//      assertNotNull(map5);
//      
//      Map<List<Integer>, Integer> map6 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map5);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertEquals(4, map6.size());
//      assertFalse(map6.isEmpty());
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map6);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map4);
//      assertNotSame(map6, map2);
//      assertNotSame(map6, map4);
//      assertNotSame(map6, map5);
//      assertNotSame(map6, map1);
//      assertNotSame(map6, map3);
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map1));
//      assertFalse(map6.equals((Object)map2));
//      assertFalse(map6.equals((Object)map4));
//      assertFalse(map6.equals((Object)map5));
//      assertFalse(map6.equals((Object)map1));
//      assertFalse(map6.equals((Object)map3));
//      assertNotNull(map6);
//      
//      Map<List<Integer>, Integer> map7 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map6);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertEquals(4, map6.size());
//      assertFalse(map6.isEmpty());
//      assertFalse(map7.isEmpty());
//      assertEquals(4, map7.size());
//      assertNotSame(map5, map7);
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map6);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map4);
//      assertNotSame(map6, map7);
//      assertNotSame(map6, map2);
//      assertNotSame(map6, map4);
//      assertNotSame(map6, map5);
//      assertNotSame(map6, map1);
//      assertNotSame(map6, map3);
//      assertNotSame(map7, map1);
//      assertNotSame(map7, map2);
//      assertNotSame(map7, map6);
//      assertNotSame(map7, map3);
//      assertNotSame(map7, map4);
//      assertNotSame(map7, map5);
//      assertFalse(map5.equals((Object)map6));
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map1));
//      assertFalse(map6.equals((Object)map2));
//      assertFalse(map6.equals((Object)map4));
//      assertFalse(map6.equals((Object)map5));
//      assertFalse(map6.equals((Object)map1));
//      assertFalse(map6.equals((Object)map3));
//      assertFalse(map7.equals((Object)map1));
//      assertFalse(map7.equals((Object)map2));
//      assertTrue(map7.equals((Object)map6));
//      assertFalse(map7.equals((Object)map3));
//      assertFalse(map7.equals((Object)map4));
//      assertFalse(map7.equals((Object)map5));
//      assertNotNull(map7);
//      
//      int int3 = 1090;
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1090, map4);
//  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertEquals(0, linkedList0.size());
      assertNotNull(linkedList0);
      
      Integer integer0 = new Integer(1391);
      assertEquals(1391, (int)integer0);
      assertNotNull(integer0);
      
      int int0 = Integer.divideUnsigned(1391, 1391);
      assertEquals(1, int0);
      
      boolean boolean0 = linkedList0.add(integer0);
      assertEquals(1, linkedList0.size());
      assertTrue(linkedList0.contains(1391));
      assertFalse(linkedList0.contains(int0));
      assertTrue(boolean0);
      assertFalse(integer0.equals((Object)int0));
      
      Integer integer1 = new Integer(1391);
      assertEquals(1391, (int)integer1);
      assertTrue(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)int0));
      assertNotNull(integer1);
      
      String string0 = Integer.toUnsignedString(2847);
      assertEquals("2847", string0);
      assertNotNull(string0);
      
      Integer integer2 = Integer.getInteger("");
      assertNull(integer2);
      
      Integer integer3 = hashMap0.put(linkedList0, integer1);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, linkedList0.size());
      assertTrue(linkedList0.contains(1391));
      assertFalse(linkedList0.contains(2847));
      assertTrue(integer1.equals((Object)integer0));
      assertFalse(integer1.equals((Object)int0));
      assertNull(integer3);
      
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1), hashMap0);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertNotNull(map0);
      
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      assertNotNull(sHORTEST_PATH_LENGTHS0);
      
      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, map0);
      assertEquals(1, hashMap0.size());
      assertFalse(hashMap0.isEmpty());
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertFalse(map1.isEmpty());
      assertEquals(1, map1.size());
      assertNotSame(map0, map1);
      assertNotSame(map1, map0);
      assertFalse(map1.equals((Object)map0));
      assertNotNull(map1);
  }

//  @Test(timeout = 4000)
//  public void test6()  throws Throwable  {
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertNotNull(hashMap0);
//      
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-5175), hashMap0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertNotNull(map0);
//      
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-5175), map0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertNotSame(map0, map1);
//      assertNotSame(map1, map0);
//      assertTrue(map1.equals((Object)map0));
//      assertNotNull(map1);
//      
//      Map<List<Integer>, Integer> map2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-219), map0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map2.size());
//      assertTrue(map2.isEmpty());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map1);
//      assertNotSame(map2, map1);
//      assertNotSame(map2, map0);
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map2.equals((Object)map0));
//      assertTrue(map2.equals((Object)map1));
//      assertNotNull(map2);
//      
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      assertNotNull(sHORTEST_PATH_LENGTHS0);
//      
//      Map<List<Integer>, Integer> map3 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1891), map1);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map3.size());
//      assertTrue(map3.isEmpty());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map1);
//      assertNotSame(map1, map2);
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map3);
//      assertNotSame(map3, map2);
//      assertNotSame(map3, map1);
//      assertNotSame(map3, map0);
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map3.equals((Object)map1));
//      assertTrue(map3.equals((Object)map0));
//      assertTrue(map3.equals((Object)map2));
//      assertNotNull(map3);
//      
//      int int0 = (-3599);
//      Map<List<Integer>, Integer> map4 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-3599), hashMap0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map4.size());
//      assertTrue(map4.isEmpty());
//      assertNotSame(map4, map2);
//      assertNotSame(map4, map1);
//      assertNotSame(map4, map0);
//      assertNotSame(map4, map3);
//      assertTrue(map4.equals((Object)map1));
//      assertTrue(map4.equals((Object)map2));
//      assertTrue(map4.equals((Object)map0));
//      assertTrue(map4.equals((Object)map3));
//      assertNotNull(map4);
//      
//      Map<List<Integer>, Integer> map5 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-219), map1);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map4);
//      assertNotSame(map0, map5);
//      assertNotSame(map0, map1);
//      assertNotSame(map1, map2);
//      assertNotSame(map1, map4);
//      assertNotSame(map1, map5);
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map3);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map4);
//      assertNotSame(map5, map0);
//      assertTrue(map0.equals((Object)map4));
//      assertTrue(map0.equals((Object)map3));
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map1.equals((Object)map4));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map1.equals((Object)map3));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map0));
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map1));
//      assertNotNull(map5);
//      
//      Map<List<Integer>, Integer> map6 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-185), map5);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertTrue(map6.isEmpty());
//      assertEquals(0, map6.size());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map6);
//      assertNotSame(map0, map4);
//      assertNotSame(map0, map5);
//      assertNotSame(map0, map1);
//      assertNotSame(map1, map6);
//      assertNotSame(map1, map2);
//      assertNotSame(map1, map4);
//      assertNotSame(map1, map5);
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map3);
//      assertNotSame(map5, map6);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map4);
//      assertNotSame(map5, map0);
//      assertNotSame(map6, map5);
//      assertNotSame(map6, map1);
//      assertNotSame(map6, map4);
//      assertNotSame(map6, map2);
//      assertNotSame(map6, map0);
//      assertNotSame(map6, map3);
//      assertTrue(map0.equals((Object)map4));
//      assertTrue(map0.equals((Object)map3));
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map0.equals((Object)map5));
//      assertTrue(map1.equals((Object)map4));
//      assertTrue(map1.equals((Object)map5));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map1.equals((Object)map3));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map0));
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map1));
//      assertTrue(map6.equals((Object)map0));
//      assertTrue(map6.equals((Object)map3));
//      assertTrue(map6.equals((Object)map2));
//      assertTrue(map6.equals((Object)map4));
//      assertTrue(map6.equals((Object)map1));
//      assertTrue(map6.equals((Object)map5));
//      assertNotNull(map6);
//      
//      Map<List<Integer>, Integer> map7 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-5175), map0);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertTrue(map7.isEmpty());
//      assertEquals(0, map7.size());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map6);
//      assertNotSame(map0, map7);
//      assertNotSame(map0, map4);
//      assertNotSame(map0, map5);
//      assertNotSame(map0, map1);
//      assertNotSame(map7, map2);
//      assertNotSame(map7, map0);
//      assertNotSame(map7, map3);
//      assertNotSame(map7, map5);
//      assertNotSame(map7, map4);
//      assertNotSame(map7, map1);
//      assertNotSame(map7, map6);
//      assertTrue(map0.equals((Object)map4));
//      assertTrue(map0.equals((Object)map3));
//      assertTrue(map0.equals((Object)map6));
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map0.equals((Object)map5));
//      assertTrue(map7.equals((Object)map4));
//      assertTrue(map7.equals((Object)map5));
//      assertTrue(map7.equals((Object)map2));
//      assertTrue(map7.equals((Object)map1));
//      assertTrue(map7.equals((Object)map6));
//      assertTrue(map7.equals((Object)map0));
//      assertTrue(map7.equals((Object)map3));
//      assertNotNull(map7);
//      
//      Map<List<Integer>, Integer> map8 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-5175), map5);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertEquals(0, map8.size());
//      assertTrue(map8.isEmpty());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map6);
//      assertNotSame(map0, map7);
//      assertNotSame(map0, map4);
//      assertNotSame(map0, map5);
//      assertNotSame(map0, map1);
//      assertNotSame(map0, map8);
//      assertNotSame(map1, map6);
//      assertNotSame(map1, map2);
//      assertNotSame(map1, map4);
//      assertNotSame(map1, map8);
//      assertNotSame(map1, map5);
//      assertNotSame(map1, map7);
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map3);
//      assertNotSame(map5, map6);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map8);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map7);
//      assertNotSame(map5, map4);
//      assertNotSame(map5, map0);
//      assertNotSame(map8, map5);
//      assertNotSame(map8, map1);
//      assertNotSame(map8, map2);
//      assertNotSame(map8, map0);
//      assertNotSame(map8, map6);
//      assertNotSame(map8, map7);
//      assertNotSame(map8, map3);
//      assertNotSame(map8, map4);
//      assertTrue(map0.equals((Object)map4));
//      assertTrue(map0.equals((Object)map3));
//      assertTrue(map0.equals((Object)map6));
//      assertTrue(map0.equals((Object)map7));
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map0.equals((Object)map5));
//      assertTrue(map1.equals((Object)map4));
//      assertTrue(map1.equals((Object)map5));
//      assertTrue(map1.equals((Object)map7));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map1.equals((Object)map3));
//      assertTrue(map1.equals((Object)map6));
//      assertTrue(map5.equals((Object)map7));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map0));
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map6));
//      assertTrue(map5.equals((Object)map1));
//      assertTrue(map8.equals((Object)map3));
//      assertTrue(map8.equals((Object)map6));
//      assertTrue(map8.equals((Object)map2));
//      assertTrue(map8.equals((Object)map0));
//      assertTrue(map8.equals((Object)map1));
//      assertTrue(map8.equals((Object)map7));
//      assertTrue(map8.equals((Object)map5));
//      assertTrue(map8.equals((Object)map4));
//      assertNotNull(map8);
//      
//      Map<List<Integer>, Integer> map9 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, map5);
//      assertTrue(hashMap0.isEmpty());
//      assertEquals(0, hashMap0.size());
//      assertEquals(0, map0.size());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map5.size());
//      assertTrue(map5.isEmpty());
//      assertEquals(1, map9.size());
//      assertFalse(map9.isEmpty());
//      assertNotSame(map0, map2);
//      assertNotSame(map0, map3);
//      assertNotSame(map0, map9);
//      assertNotSame(map0, map6);
//      assertNotSame(map0, map7);
//      assertNotSame(map0, map4);
//      assertNotSame(map0, map5);
//      assertNotSame(map0, map1);
//      assertNotSame(map0, map8);
//      assertNotSame(map1, map9);
//      assertNotSame(map1, map6);
//      assertNotSame(map1, map2);
//      assertNotSame(map1, map4);
//      assertNotSame(map1, map8);
//      assertNotSame(map1, map5);
//      assertNotSame(map1, map7);
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map3);
//      assertNotSame(map5, map9);
//      assertNotSame(map5, map6);
//      assertNotSame(map5, map1);
//      assertNotSame(map5, map2);
//      assertNotSame(map5, map8);
//      assertNotSame(map5, map3);
//      assertNotSame(map5, map7);
//      assertNotSame(map5, map4);
//      assertNotSame(map5, map0);
//      assertNotSame(map9, map2);
//      assertNotSame(map9, map0);
//      assertNotSame(map9, map3);
//      assertNotSame(map9, map8);
//      assertNotSame(map9, map1);
//      assertNotSame(map9, map7);
//      assertNotSame(map9, map4);
//      assertNotSame(map9, map5);
//      assertNotSame(map9, map6);
//      assertTrue(map0.equals((Object)map4));
//      assertTrue(map0.equals((Object)map8));
//      assertTrue(map0.equals((Object)map3));
//      assertTrue(map0.equals((Object)map6));
//      assertTrue(map0.equals((Object)map7));
//      assertTrue(map0.equals((Object)map1));
//      assertTrue(map0.equals((Object)map2));
//      assertTrue(map0.equals((Object)map5));
//      assertTrue(map1.equals((Object)map4));
//      assertTrue(map1.equals((Object)map5));
//      assertTrue(map1.equals((Object)map7));
//      assertTrue(map1.equals((Object)map2));
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map1.equals((Object)map3));
//      assertTrue(map1.equals((Object)map6));
//      assertTrue(map1.equals((Object)map8));
//      assertTrue(map5.equals((Object)map7));
//      assertTrue(map5.equals((Object)map4));
//      assertTrue(map5.equals((Object)map0));
//      assertTrue(map5.equals((Object)map2));
//      assertTrue(map5.equals((Object)map3));
//      assertTrue(map5.equals((Object)map6));
//      assertTrue(map5.equals((Object)map1));
//      assertTrue(map5.equals((Object)map8));
//      assertFalse(map9.equals((Object)map2));
//      assertFalse(map9.equals((Object)map0));
//      assertFalse(map9.equals((Object)map3));
//      assertFalse(map9.equals((Object)map8));
//      assertFalse(map9.equals((Object)map1));
//      assertFalse(map9.equals((Object)map7));
//      assertFalse(map9.equals((Object)map4));
//      assertFalse(map9.equals((Object)map5));
//      assertFalse(map9.equals((Object)map6));
//      assertNotNull(map9);
//      
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(2592, map1);
//  }

//  @Test(timeout = 4000)
//  public void test7()  throws Throwable  {
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      assertEquals(0, hashMap0.size());
//      assertTrue(hashMap0.isEmpty());
//      assertNotNull(hashMap0);
//      
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1579, hashMap0);
//  }

//  @Test(timeout = 4000)
//  public void test8()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      assertNotNull(sHORTEST_PATH_LENGTHS0);
//      
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      assertEquals(0, hashMap0.size());
//      assertTrue(hashMap0.isEmpty());
//      assertNotNull(hashMap0);
//      
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
//      assertEquals(0, hashMap0.size());
//      assertTrue(hashMap0.isEmpty());
//      assertTrue(map0.isEmpty());
//      assertEquals(0, map0.size());
//      assertNotNull(map0);
//      
//      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2585), (Map<List<Integer>, Integer>) null);
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertNotSame(map1, map0);
//      assertTrue(map1.equals((Object)map0));
//      assertNotNull(map1);
//      
//      Map<List<Integer>, Integer> map2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2585), map1);
//      assertEquals(0, map1.size());
//      assertTrue(map1.isEmpty());
//      assertEquals(0, map2.size());
//      assertTrue(map2.isEmpty());
//      assertNotSame(map1, map0);
//      assertNotSame(map1, map2);
//      assertNotSame(map2, map0);
//      assertNotSame(map2, map1);
//      assertTrue(map1.equals((Object)map0));
//      assertTrue(map2.equals((Object)map1));
//      assertTrue(map2.equals((Object)map0));
//      assertNotNull(map2);
//      
//      HashMap<List<Integer>, Integer> hashMap1 = new HashMap<List<Integer>, Integer>(688);
//      assertEquals(0, hashMap1.size());
//      assertTrue(hashMap1.isEmpty());
//      assertTrue(hashMap1.equals((Object)hashMap0));
//      assertNotNull(hashMap1);
//      
//      Map<List<Integer>, Integer> map3 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-967), hashMap1);
//      assertEquals(0, hashMap1.size());
//      assertTrue(hashMap1.isEmpty());
//      assertTrue(map3.isEmpty());
//      assertEquals(0, map3.size());
//      assertNotSame(hashMap1, hashMap0);
//      assertNotSame(map3, map0);
//      assertNotSame(map3, map1);
//      assertNotSame(map3, map2);
//      assertTrue(hashMap1.equals((Object)hashMap0));
//      assertTrue(map3.equals((Object)map2));
//      assertTrue(map3.equals((Object)map0));
//      assertTrue(map3.equals((Object)map1));
//      assertNotNull(map3);
//      
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(688, map3);
//  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(207, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}