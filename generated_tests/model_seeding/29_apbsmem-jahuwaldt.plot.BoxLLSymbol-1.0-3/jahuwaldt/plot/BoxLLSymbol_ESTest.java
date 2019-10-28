/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:30:57 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxLLSymbol_ESTest extends BoxLLSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      int[] intArray0 = new int[7];
      boxLLSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLLSymbol0.generatePoints(0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxLLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      int[] intArray0 = new int[0];
      boxLLSymbol0.yPoints = intArray0;
      boxLLSymbol0.xPoints = boxLLSymbol0.yPoints;
      // Undeclared exception!
      try { 
        boxLLSymbol0.generatePoints(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.BoxLLSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      boxLLSymbol0.generatePoints(47, 1);
      boxLLSymbol0.generatePoints((-1318), (-1318));
      assertEquals(8, boxLLSymbol0.getSize());
  }
}
