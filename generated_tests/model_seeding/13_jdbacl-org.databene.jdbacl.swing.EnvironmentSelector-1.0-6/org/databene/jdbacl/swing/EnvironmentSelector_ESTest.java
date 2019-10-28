/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:55:03 GMT 2019
 */

package org.databene.jdbacl.swing;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.databene.jdbacl.swing.EnvironmentSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvironmentSelector_ESTest extends EnvironmentSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvironmentSelector.EnvironmentModel environmentSelector_EnvironmentModel0 = null;
      try {
        environmentSelector_EnvironmentModel0 = new EnvironmentSelector.EnvironmentModel();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/databene/commons/SystemInfo
         //
         verifyException("org.databene.jdbacl.swing.EnvironmentSelector$EnvironmentModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnvironmentSelector environmentSelector0 = null;
      try {
        environmentSelector0 = new EnvironmentSelector();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/databene/commons/SystemInfo
         //
         verifyException("org.databene.jdbacl.swing.EnvironmentSelector$EnvironmentModel", e);
      }
  }
}
