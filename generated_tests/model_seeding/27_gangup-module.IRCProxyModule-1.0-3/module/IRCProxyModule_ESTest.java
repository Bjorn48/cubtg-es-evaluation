/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:30:25 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.MissingResourceException;
import module.IRCProxyModule;
import module.Kernel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IRCProxyModule_ESTest extends IRCProxyModule_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IRCProxyModule iRCProxyModule0 = null;
      try {
        iRCProxyModule0 = new IRCProxyModule();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IRCProxyModule iRCProxyModule0 = null;
      try {
        iRCProxyModule0 = new IRCProxyModule((Kernel) null);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}