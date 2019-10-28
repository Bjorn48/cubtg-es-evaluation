/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:19:04 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.ChoixDB4O;
import fr.unice.gfarce.main.Controler;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChoixDB4O_ESTest extends ChoixDB4O_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChoixDB4O choixDB4O0 = null;
      try {
        choixDB4O0 = new ChoixDB4O((Controler) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
