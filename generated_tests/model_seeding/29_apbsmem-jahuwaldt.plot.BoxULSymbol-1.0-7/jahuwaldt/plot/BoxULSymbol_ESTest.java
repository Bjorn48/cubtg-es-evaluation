/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:15:19 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxULSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxULSymbol_ESTest extends BoxULSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      int[] intArray0 = new int[3];
      boxULSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxULSymbol0.generatePoints(2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxULSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      int[] intArray0 = new int[1];
      boxULSymbol0.yPoints = intArray0;
      boxULSymbol0.generatePoints(2, 2);
      boxULSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        boxULSymbol0.generatePoints(2, (-1592));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jahuwaldt.plot.BoxULSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxULSymbol boxULSymbol0 = new BoxULSymbol();
      boxULSymbol0.generatePoints(1024, 2657);
      boxULSymbol0.generatePoints(1024, 2657);
      assertEquals(8, boxULSymbol0.getSize());
  }
}
