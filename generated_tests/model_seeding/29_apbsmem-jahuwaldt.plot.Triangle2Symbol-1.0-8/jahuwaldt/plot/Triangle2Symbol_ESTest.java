/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:24:30 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.Triangle2Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Triangle2Symbol_ESTest extends Triangle2Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      int[] intArray0 = new int[7];
      triangle2Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle2Symbol0.generatePoints((-865), (-865));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.Triangle2Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      int[] intArray0 = new int[0];
      triangle2Symbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        triangle2Symbol0.generatePoints(300, (-765));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.Triangle2Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      triangle2Symbol0.generatePoints(0, 0);
      triangle2Symbol0.generatePoints(552, 0);
      assertEquals(8, triangle2Symbol0.getSize());
  }
}
