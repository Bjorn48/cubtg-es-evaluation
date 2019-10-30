/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 13:15:56 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle1Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RTriangle1Symbol_ESTest extends RTriangle1Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      rTriangle1Symbol0.setSize((-203));
      rTriangle1Symbol0.generatePoints(0, 0);
      assertEquals((-203), rTriangle1Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      int[] intArray0 = new int[9];
      rTriangle1Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle1Symbol0.generatePoints((-3431), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.RTriangle1Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      int[] intArray0 = new int[0];
      rTriangle1Symbol0.yPoints = intArray0;
      rTriangle1Symbol0.generatePoints(13, 0);
      rTriangle1Symbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle1Symbol0.generatePoints((-1427), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.RTriangle1Symbol", e);
      }
  }
}