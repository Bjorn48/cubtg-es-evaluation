/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:28:53 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.TabDSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabDSymbol_ESTest extends TabDSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      tabDSymbol0.generatePoints(1154, (-1766));
      assertEquals(8, tabDSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      int[] intArray0 = new int[1];
      tabDSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabDSymbol0.generatePoints((-3386), (-3386));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.TabDSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TabDSymbol tabDSymbol0 = new TabDSymbol();
      int[] intArray0 = new int[0];
      tabDSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        tabDSymbol0.generatePoints(2469, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.TabDSymbol", e);
      }
  }
}
