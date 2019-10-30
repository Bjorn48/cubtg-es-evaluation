/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:16:29 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.ThinRect1Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ThinRect1Symbol_ESTest extends ThinRect1Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      int[] intArray0 = new int[7];
      thinRect1Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        thinRect1Symbol0.generatePoints(1052, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ThinRect1Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      thinRect1Symbol0.generatePoints((-876), (-41));
      int[] intArray0 = new int[0];
      thinRect1Symbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        thinRect1Symbol0.generatePoints((-41), 546);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.ThinRect1Symbol", e);
      }
  }
}