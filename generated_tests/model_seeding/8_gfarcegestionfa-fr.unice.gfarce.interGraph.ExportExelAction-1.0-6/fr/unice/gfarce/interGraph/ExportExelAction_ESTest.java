/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:52:10 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import fr.unice.gfarce.interGraph.ExportExelAction;
import fr.unice.gfarce.interGraph.FenetrePrincipale;
import fr.unice.gfarce.main.Controler;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExportExelAction_ESTest extends ExportExelAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExportExelAction exportExelAction0 = new ExportExelAction((FenetrePrincipale) null, "!6n|n ", (Controler) null);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) exportExelAction0;
      JComboBox<Object> jComboBox0 = new JComboBox<Object>(objectArray0);
      FenetrePrincipale.comboBoxFormation2 = jComboBox0;
      exportExelAction0.actionPerformed((ActionEvent) null);
  }
}
