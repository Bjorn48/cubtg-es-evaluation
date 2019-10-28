/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:36:16 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLRSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxLRSymbol_ESTest extends BoxLRSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      int[] intArray0 = new int[1];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(2214, (-1077));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      int[] intArray0 = new int[4];
      boxLRSymbol0.yPoints = intArray0;
      boxLRSymbol0.generatePoints(4796, 335);
      boxLRSymbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(4571, 4796);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }
}
