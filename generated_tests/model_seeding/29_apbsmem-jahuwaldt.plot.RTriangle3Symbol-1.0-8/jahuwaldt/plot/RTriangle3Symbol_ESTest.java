/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:24:57 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle3Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RTriangle3Symbol_ESTest extends RTriangle3Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      rTriangle3Symbol0.setSize(3204);
      rTriangle3Symbol0.generatePoints((-2502), (-2502));
      assertEquals(3204, rTriangle3Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      int[] intArray0 = new int[4];
      rTriangle3Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle3Symbol0.generatePoints(3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.RTriangle3Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      int[] intArray0 = new int[2];
      rTriangle3Symbol0.yPoints = intArray0;
      rTriangle3Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle3Symbol0.generatePoints(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.RTriangle3Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      rTriangle3Symbol0.generatePoints(16, 3);
      rTriangle3Symbol0.generatePoints(3, 16);
      assertEquals(8, rTriangle3Symbol0.getSize());
  }
}
