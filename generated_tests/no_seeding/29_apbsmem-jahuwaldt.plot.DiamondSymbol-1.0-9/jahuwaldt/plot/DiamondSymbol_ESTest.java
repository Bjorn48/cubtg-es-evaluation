/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 22:44:44 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.DiamondSymbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DiamondSymbol_ESTest extends DiamondSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DiamondSymbol diamondSymbol0 = new DiamondSymbol();
      diamondSymbol0.generatePoints(15, 15);
      diamondSymbol0.yPoints = null;
      // Undeclared exception!
      try { 
        diamondSymbol0.generatePoints(35, (-1291));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.DiamondSymbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DiamondSymbol diamondSymbol0 = new DiamondSymbol();
      diamondSymbol0.generatePoints(29, 29);
      diamondSymbol0.generatePoints(538, 29);
      assertEquals(8, diamondSymbol0.getSize());
  }
}