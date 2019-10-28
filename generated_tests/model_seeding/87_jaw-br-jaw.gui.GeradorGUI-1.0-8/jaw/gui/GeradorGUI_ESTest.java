/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:58:36 GMT 2019
 */

package jaw.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.util.List;
import jaw.gui.GeradorGUI;
import jaw.metamodelo.Entidade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GeradorGUI_ESTest extends GeradorGUI_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GeradorGUI geradorGUI0 = null;
      try {
        geradorGUI0 = new GeradorGUI((List<Entidade>) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
