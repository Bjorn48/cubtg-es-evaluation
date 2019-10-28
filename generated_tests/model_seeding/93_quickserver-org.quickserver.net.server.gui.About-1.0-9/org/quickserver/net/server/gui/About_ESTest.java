/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 01:17:18 GMT 2019
 */

package org.quickserver.net.server.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.quickserver.net.server.gui.About;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class About_ESTest extends About_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      About about0 = null;
      try {
        about0 = new About();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/pool/PoolableObjectFactory
         //
         verifyException("org.quickserver.net.server.gui.About", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        About.showAbout();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/pool/PoolableObjectFactory
         //
         verifyException("org.quickserver.net.server.gui.About", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      About.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
