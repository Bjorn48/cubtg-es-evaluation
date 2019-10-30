/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 10:29:59 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.EnvoiFormationAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EnvoiFormationAction_ESTest extends EnvoiFormationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnvoiFormationAction envoiFormationAction0 = new EnvoiFormationAction((FenetrePrincipale) null, ",Oy.uk(G-B", (Controler) null);
      // Undeclared exception!
      try { 
        envoiFormationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiFormationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnvoiFormationAction envoiFormationAction0 = new EnvoiFormationAction((FenetrePrincipale) null, "m&", (Controler) null);
      JTable jTable0 = new JTable();
      FenetrePrincipale.tableFormation = jTable0;
      // Undeclared exception!
      try { 
        envoiFormationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.EnvoiFormationAction", e);
      }
  }
}