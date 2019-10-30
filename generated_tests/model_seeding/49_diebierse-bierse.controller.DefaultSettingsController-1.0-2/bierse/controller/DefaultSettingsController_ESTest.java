/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:29:17 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultSettingsController;
import bierse.model.Drink;
import bierse.model.Model;
import bierse.view.IDrinkSettingsView;
import bierse.view.ISettingsView;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultSettingsController_ESTest extends DefaultSettingsController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SETTINGS_ACTION_DRINK_SELECTED", (-2422), "SETTINGS_ACTION_DRINK_SELECTED");
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to javax.swing.JComboBox
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 0, "SETTINGS_ACTION_CHOOSE_BACKGROUND");
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SETTINGS_ACTION_OK", (-2185), "SETTINGS_ACTION_CANCEL");
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ActionEvent actionEvent0 = new ActionEvent("SETTINGS_ACTION_OK", 1989, "SETTINGS_ACTION_OK");
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JComboBox<Drink> jComboBox0 = new JComboBox<Drink>();
      ActionEvent actionEvent0 = new ActionEvent(jComboBox0, 0, "SETTINGS_ACTION_DRINK_SELECTED");
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      // Undeclared exception!
      try { 
        defaultSettingsController0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultSettingsController", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DefaultSettingsController defaultSettingsController0 = new DefaultSettingsController((Model) null, (ISettingsView) null, (IDrinkSettingsView) null);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, 0, "");
      defaultSettingsController0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }
}