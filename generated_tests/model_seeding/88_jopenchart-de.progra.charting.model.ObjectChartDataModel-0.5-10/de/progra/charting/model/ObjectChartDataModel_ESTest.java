/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 18:50:01 GMT 2019
 */

package de.progra.charting.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.model.ChartDataModelConstraints;
import de.progra.charting.model.DataSet;
import de.progra.charting.model.DefaultChartDataModelConstraints;
import de.progra.charting.model.DefaultDataSet;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import java.util.TreeSet;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectChartDataModel_ESTest extends ObjectChartDataModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(objectChartDataModel0, 0);
      objectChartDataModel0.setChartDataModelConstraints((-757), defaultChartDataModelConstraints0);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.getChartDataModelConstraints(2592);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[3];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      dataSetArray0[0] = (DataSet) editableDataSet0;
      dataSetArray0[1] = (DataSet) editableDataSet0;
      DefaultDataSet defaultDataSet0 = new DefaultDataSet(dataSetArray0, dataSetArray0, 0);
      Short short0 = new Short((short)0);
      defaultDataSet0.setValueAt(0, short0);
      dataSetArray0[2] = (DataSet) defaultDataSet0;
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      Number number0 = objectChartDataModel0.getValueAt((byte)0, (byte)0);
      assertEquals(0.0, number0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      TreeSet treeSet0 = objectChartDataModel0.getOrderedValues(1);
      assertNotNull(treeSet0);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      int int0 = objectChartDataModel0.getDataSetNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[4];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      String string0 = objectChartDataModel0.getDataSetName(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      stringArray0[0] = "** Error creating the nevilletest.png file, showing the Neville Interpolation.";
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      String string0 = objectChartDataModel0.getDataSetName(0);
      assertEquals("** Error creating the nevilletest.png file, showing the Neville Interpolation.", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[][] intArray0 = new int[1][0];
      String[] stringArray0 = new String[2];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
      int int0 = objectChartDataModel0.getDataSetLength((byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.getColumnValueAt(916, 1);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getValueAt((-1017), (-1017));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1017
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Number[][] numberArray0 = new Number[0][4];
      String[] stringArray0 = new String[9];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, (Object[]) null, stringArray0);
      // Undeclared exception!
      try { 
        objectChartDataModel0.getLastColumnValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getDataSetName((-679));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -679
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getDataSetLength(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getColumnValueAt((-597), (-597));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -597
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getColumnValueAt((-611));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -611
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      // Undeclared exception!
      try { 
        objectChartDataModel0.getAxisBinding((-60));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -60
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel((Number[][]) null, (Object[]) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Number[][] numberArray0 = new Number[1][8];
      Number[] numberArray1 = new Number[2];
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      numberArray1[0] = (Number) integer0;
      Double double0 = new Double(0.0);
      numberArray1[1] = (Number) double0;
      numberArray0[0] = numberArray1;
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray1, (String[]) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel((int[][]) null, (Object[]) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[][] intArray0 = new int[20][5];
      String[] stringArray0 = new String[10];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(intArray0, intArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 10
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[4];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel((double[][]) null, stringArray0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.ChartUtilities", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[][] doubleArray0 = new double[15][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[1];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      Object object0 = objectChartDataModel0.getColumnValueAt(0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.getColumnValueAt(0);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.setChartDataModelConstraints(0, (ChartDataModelConstraints) null);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      DefaultChartDataModelConstraints defaultChartDataModelConstraints0 = new DefaultChartDataModelConstraints(editableChartDataModel0, (-148), true);
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.setChartDataModelConstraints(2, defaultChartDataModelConstraints0);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints((byte)0);
      assertNotNull(chartDataModelConstraints0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      ChartDataModelConstraints chartDataModelConstraints0 = objectChartDataModel0.getChartDataModelConstraints((-648));
      assertNotNull(chartDataModelConstraints0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Number[][] numberArray0 = new Number[1][8];
      Number[] numberArray1 = new Number[1];
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      numberArray1[0] = (Number) integer0;
      numberArray0[0] = numberArray1;
      String[] stringArray0 = new String[0];
      ObjectChartDataModel objectChartDataModel0 = null;
      try {
        objectChartDataModel0 = new ObjectChartDataModel(numberArray0, numberArray1, stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[12];
      Number[][] numberArray0 = new Number[0][3];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(numberArray0, stringArray0, stringArray0);
      objectChartDataModel0.data = null;
      // Undeclared exception!
      try { 
        objectChartDataModel0.getAxisBinding((-32));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.model.ObjectChartDataModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.getOrderedValues(46);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet();
      dataSetArray0[1] = (DataSet) editableDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      int int0 = objectChartDataModel0.getAxisBinding(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet();
      dataSetArray0[1] = (DataSet) editableDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      String string0 = objectChartDataModel0.getDataSetName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      int int0 = objectChartDataModel0.getDataSetLength(0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int[][] intArray0 = new int[1][5];
      String[] stringArray0 = new String[6];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(intArray0, stringArray0, stringArray0);
      // Undeclared exception!
      try { 
        objectChartDataModel0.getValueAt(0, 526);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 526, Size: 5
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      int int0 = objectChartDataModel0.getDataSetNumber();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DataSet[] dataSetArray0 = new DataSet[2];
      DefaultDataSet defaultDataSet0 = new DefaultDataSet();
      dataSetArray0[0] = (DataSet) defaultDataSet0;
      EditableDataSet editableDataSet0 = new EditableDataSet();
      dataSetArray0[1] = (DataSet) editableDataSet0;
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(dataSetArray0, dataSetArray0);
      double double0 = objectChartDataModel0.getLastColumnValue();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      double double0 = objectChartDataModel0.getFirstColumnValue();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, objectChartDataModel0.getDataSetNumber());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      double[][] doubleArray0 = new double[1][2];
      String[] stringArray0 = new String[1];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      Object object0 = objectChartDataModel0.getColumnValueAt(1635, 0);
      assertNotNull(object0);
  }
}