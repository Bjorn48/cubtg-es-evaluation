/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 19:52:37 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxURSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoxURSymbol_ESTest extends BoxURSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      boxURSymbol0.generatePoints(9, 0);
      assertEquals(8, boxURSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      int[] intArray0 = new int[1];
      boxURSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxURSymbol0.generatePoints(1367, 1367);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.BoxURSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      int[] intArray0 = new int[0];
      boxURSymbol0.xPoints = intArray0;
      // Undeclared exception!
      try { 
        boxURSymbol0.generatePoints((-1633), (-1633));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jahuwaldt.plot.BoxURSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      boxURSymbol0.generatePoints(330, 330);
      boxURSymbol0.generatePoints(0, 0);
      assertEquals(8, boxURSymbol0.getSize());
  }
}
