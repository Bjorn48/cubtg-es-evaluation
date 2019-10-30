/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:59:24 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.AProposAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AProposAction_ESTest extends AProposAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AProposAction aProposAction0 = new AProposAction((FenetrePrincipale) null, "Wfs3-;+BG# lG$N8p-");
      // Undeclared exception!
      try { 
        aProposAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}