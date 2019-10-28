/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:19:04 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.ChargeBaseAction;
import fr.unice.gfarce.interGraph.ChoixDB4O;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ChargeBaseAction_ESTest extends ChargeBaseAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChargeBaseAction chargeBaseAction0 = new ChargeBaseAction((ChoixDB4O) null, "fr.unice.gfarce.interGraph.ChargeBaseAction");
      // Undeclared exception!
      try { 
        chargeBaseAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
