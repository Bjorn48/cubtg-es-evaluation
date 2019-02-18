/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:36:57 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.orders.RandomLiteralSelectionStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RandomLiteralSelectionStrategy_ESTest extends RandomLiteralSelectionStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      int int0 = randomLiteralSelectionStrategy0.select((-709));
      assertEquals((-1417), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      int int0 = randomLiteralSelectionStrategy0.select(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      randomLiteralSelectionStrategy0.updateVar(1812);
      assertEquals("random phase selection", randomLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      randomLiteralSelectionStrategy0.init(0, 0);
      assertEquals("random phase selection", randomLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      randomLiteralSelectionStrategy0.assignLiteral(820);
      assertEquals("random phase selection", randomLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      String string0 = randomLiteralSelectionStrategy0.toString();
      assertEquals("random phase selection", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      randomLiteralSelectionStrategy0.updateVarAtDecisionLevel(0);
      assertEquals("random phase selection", randomLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RandomLiteralSelectionStrategy randomLiteralSelectionStrategy0 = new RandomLiteralSelectionStrategy();
      randomLiteralSelectionStrategy0.init(0);
      assertEquals("random phase selection", randomLiteralSelectionStrategy0.toString());
  }
}
