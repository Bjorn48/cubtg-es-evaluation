/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 15:41:08 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle4Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RTriangle4Symbol_ESTest extends RTriangle4Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.setSize((-1188));
      rTriangle4Symbol0.generatePoints((-340), 0);
      assertEquals((-1188), rTriangle4Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      int[] intArray0 = new int[1];
      rTriangle4Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.generatePoints((-3245), (-3245));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.RTriangle4Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle4Symbol rTriangle4Symbol0 = new RTriangle4Symbol();
      rTriangle4Symbol0.generatePoints((-3283), (-1720));
      int[] intArray0 = new int[2];
      rTriangle4Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle4Symbol0.generatePoints((-1720), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.RTriangle4Symbol", e);
      }
  }
}
