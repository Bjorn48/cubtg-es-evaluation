/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:30:50 GMT 2019
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
      int[] intArray0 = new int[6];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(0, 0);
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
      int[] intArray0 = new int[0];
      boxLRSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxLRSymbol0.generatePoints(0, 3);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.BoxLRSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      boxLRSymbol0.generatePoints((-1092), (-2008));
      boxLRSymbol0.generatePoints(1652, (-2334));
      assertEquals(8, boxLRSymbol0.getSize());
  }
}
