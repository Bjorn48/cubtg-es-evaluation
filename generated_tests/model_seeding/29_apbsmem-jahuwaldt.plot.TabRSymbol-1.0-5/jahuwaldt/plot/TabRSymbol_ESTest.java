/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 19:52:18 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabRSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabRSymbol_ESTest extends TabRSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      int[] intArray0 = new int[5];
      tabRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabRSymbol0.generatePoints(335, (-2445));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      int[] intArray0 = new int[0];
      tabRSymbol0.generatePoints((-2535), (-2535));
      tabRSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        tabRSymbol0.generatePoints(7, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.TabRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabRSymbol tabRSymbol0 = new TabRSymbol();
      tabRSymbol0.generatePoints(0, 0);
      tabRSymbol0.generatePoints(9, (-2215));
      assertEquals(8, tabRSymbol0.getSize());
  }
}
