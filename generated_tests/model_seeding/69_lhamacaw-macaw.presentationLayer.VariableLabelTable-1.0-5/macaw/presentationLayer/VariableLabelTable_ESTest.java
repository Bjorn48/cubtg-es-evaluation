/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:13:24 GMT 2019
 */

package macaw.presentationLayer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import macaw.businessLayer.MacawCurationAPI;
import macaw.businessLayer.User;
import macaw.businessLayer.Variable;
import macaw.persistenceLayer.production.ProductionCurationService;
import macaw.presentationLayer.VariableLabelTable;
import macaw.system.SessionProperties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VariableLabelTable_ESTest extends VariableLabelTable_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionProperties sessionProperties0 = new SessionProperties();
      ProductionCurationService productionCurationService0 = new ProductionCurationService(sessionProperties0);
      VariableLabelTable variableLabelTable0 = new VariableLabelTable(productionCurationService0, false);
      try { 
        variableLabelTable0.save();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to create connection.
         //
         verifyException("macaw.persistenceLayer.production.SQLConnectionManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, true);
      variableLabelTable0.changeSelection(2066, 2066, false, false);
      // Undeclared exception!
      try { 
        variableLabelTable0.deleteValueLabel();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2066, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, false);
      variableLabelTable0.changeSelection(1, 1, true, false);
      // Undeclared exception!
      try { 
        variableLabelTable0.addValueLabel();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, false);
      JComboBox<Object> jComboBox0 = (JComboBox<Object>) mock(JComboBox.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jComboBox0).isEditable();
      DefaultCellEditor defaultCellEditor0 = new DefaultCellEditor(jComboBox0);
      variableLabelTable0.setCellEditor(defaultCellEditor0);
      variableLabelTable0.deleteValueLabel();
      assertFalse(variableLabelTable0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, true);
      variableLabelTable0.addValueLabel();
      variableLabelTable0.deleteValueLabel();
      assertFalse(variableLabelTable0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, true);
      variableLabelTable0.addValueLabel();
      variableLabelTable0.addValueLabel();
      variableLabelTable0.deleteValueLabel();
      variableLabelTable0.addValueLabel();
      assertTrue(variableLabelTable0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, false);
      // Undeclared exception!
      try { 
        variableLabelTable0.save();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      User user0 = new User();
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, true);
      // Undeclared exception!
      try { 
        variableLabelTable0.setData(user0, (Variable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("macaw.presentationLayer.VariableLabelTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      VariableLabelTable variableLabelTable0 = new VariableLabelTable((MacawCurationAPI) null, true);
      variableLabelTable0.cancel();
      assertFalse(variableLabelTable0.getIgnoreRepaint());
  }
}
