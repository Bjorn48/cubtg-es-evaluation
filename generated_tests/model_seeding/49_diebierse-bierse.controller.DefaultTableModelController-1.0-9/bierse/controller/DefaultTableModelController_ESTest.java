/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:46:19 GMT 2019
 */

package bierse.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bierse.controller.DefaultTableModelController;
import bierse.model.Model;
import bierse.view.IDrinkSellView;
import java.util.Vector;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultTableModelController_ESTest extends DefaultTableModelController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Vector<Boolean> vector0 = new Vector<Boolean>();
      Boolean boolean0 = new Boolean("<=jvT:=}H72I");
      vector0.add(boolean0);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, 770);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, 73);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("bierse.controller.DefaultTableModelController", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) defaultTableModelController0;
      defaultTableModel0.addColumn((Object) null, objectArray0);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // bierse.controller.DefaultTableModelController cannot be cast to java.lang.String
         //
         verifyException("bierse.controller.DefaultTableModelController", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0);
      // Undeclared exception!
      try { 
        defaultTableModelController0.tableChanged(tableModelEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DefaultTableModelController defaultTableModelController0 = new DefaultTableModelController((Model) null, (IDrinkSellView) null);
      Vector<Boolean> vector0 = new Vector<Boolean>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, 7);
      TableModelEvent tableModelEvent0 = new TableModelEvent(defaultTableModel0, (-164));
      defaultTableModelController0.tableChanged(tableModelEvent0);
  }
}