/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:25:31 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.DefaultChart;
import de.progra.charting.Legend;
import de.progra.charting.Title;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.DefaultChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.EditableDataSet;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.AbstractChartRenderer;
import de.progra.charting.render.PieChartRenderer;
import de.progra.charting.render.PlotChartRenderer;
import de.progra.charting.render.RowColorModel;
import java.awt.Dialog;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractChart_ESTest extends AbstractChart_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.setTitle((Title) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Number[][] numberArray0 = new Number[1][2];
      Number[] numberArray1 = new Number[1];
      numberArray1[0] = (Number) 0;
      numberArray0[0] = numberArray1;
      double[] doubleArray0 = new double[7];
      String[] stringArray0 = new String[4];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(numberArray0, doubleArray0, stringArray0);
      RowColorModel rowColorModel0 = new RowColorModel(defaultChartDataModel0);
      defaultChart0.setRowColorModel(rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      RowColorModel rowColorModel0 = new RowColorModel(objectChartDataModel0);
      Legend legend0 = new Legend(rowColorModel0);
      defaultChart0.setLegend(legend0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.setCoordSystem((CoordSystem) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "VDYm6fIt:");
      defaultChart0.setChartDataModel((ChartDataModel) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "VDYm6fIt:");
      defaultChart0.getTitle();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.getRowColorModel();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "mcc[D'w_");
      defaultChart0.getRowColorModel();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EditableDataSet[] editableDataSetArray0 = new EditableDataSet[1];
      EditableDataSet editableDataSet0 = new EditableDataSet();
      editableDataSetArray0[0] = editableDataSet0;
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel(editableDataSetArray0);
      DefaultChart defaultChart0 = new DefaultChart(editableChartDataModel0, (String) null);
      defaultChart0.getRowColorModel();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "'&");
      defaultChart0.getLegend();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "$pDTAFJ2tZ3i\"y", 0);
      defaultChart0.getCoordSystem();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.renderer = null;
      defaultChart0.getChartRenderer();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.setAutoScale(true);
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "mcc[D'w_");
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      defaultChartDataModel0.setMinimumColumnValue(2525);
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "de.progra.charting.AbstractChart", 2525);
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.setMinimumColumnValue((-1727.282701862));
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "fu`dbBA", 25);
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      defaultChartDataModel0.setMaximumColumnValue(559.258);
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "iQ,h");
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      objectChartDataModel0.setMaximumColumnValue((-793.796332307237));
      DefaultChart defaultChart0 = new DefaultChart(objectChartDataModel0, "fu`dbBA", 25);
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[][] doubleArray0 = new double[2][7];
      double[] doubleArray1 = new double[1];
      String[] stringArray0 = new String[9];
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel(doubleArray0, doubleArray1, stringArray0);
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "W", 11);
      defaultChart0.getChartDataModel();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      double[][] doubleArray0 = new double[5][3];
      String[] stringArray0 = new String[6];
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel(doubleArray0, doubleArray0, stringArray0);
      DecimalFormat decimalFormat0 = new DecimalFormat();
      CoordSystem coordSystem0 = new CoordSystem(objectChartDataModel0, decimalFormat0, false, true, false);
      Rectangle rectangle0 = coordSystem0.getInnerBounds();
      defaultChart0.setBounds(rectangle0);
      defaultChart0.getBounds();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "", (-2736));
      Rectangle rectangle0 = new Rectangle(1, (-2736), (-1211), (-2736));
      defaultChart0.bounds = rectangle0;
      defaultChart0.getBounds();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      // Undeclared exception!
      try { 
        defaultChart0.setChartRenderer((Map) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Hashtable<Object, Object> hashtable0 = new Hashtable<Object, Object>();
      Object object0 = new Object();
      hashtable0.put(object0, defaultChart0);
      // Undeclared exception!
      try { 
        defaultChart0.setChartRenderer(hashtable0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // de.progra.charting.DefaultChart cannot be cast to de.progra.charting.render.AbstractChartRenderer
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      // Undeclared exception!
      try { 
        defaultChart0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.DefaultChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.renderer = null;
      // Undeclared exception!
      try { 
        defaultChart0.getChartRenderer((-2355));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      // Undeclared exception!
      try { 
        defaultChart0.addChartRenderer((AbstractChartRenderer) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.AbstractChart", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultChartDataModel defaultChartDataModel0 = new DefaultChartDataModel();
      DefaultChart defaultChart0 = new DefaultChart(defaultChartDataModel0, "xo$x<_5QFMfDQ,&:");
      DecimalFormat decimalFormat0 = new DecimalFormat("");
      CoordSystem coordSystem0 = new CoordSystem(defaultChartDataModel0, decimalFormat0, false, false, true);
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer(coordSystem0, defaultChartDataModel0);
      defaultChart0.addChartRenderer(plotChartRenderer0, (-2227));
      defaultChart0.getChartRenderer();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      AbstractChartRenderer abstractChartRenderer0 = defaultChart0.getChartRenderer((-1));
      assertNull(abstractChartRenderer0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Rectangle rectangle0 = defaultChart0.getBounds();
      assertNull(rectangle0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Legend legend0 = defaultChart0.getLegend();
      assertNull(legend0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Map map0 = defaultChart0.getChartRenderer();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      defaultChart0.paintDefault((Graphics2D) null);
      assertEquals(0, DefaultChart.LINEAR_X_LINEAR_Y);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      HashMap<Dialog.ModalExclusionType, PieChartRenderer> hashMap0 = new HashMap<Dialog.ModalExclusionType, PieChartRenderer>();
      Dialog.ModalExclusionType dialog_ModalExclusionType0 = Dialog.ModalExclusionType.APPLICATION_EXCLUDE;
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      hashMap0.put(dialog_ModalExclusionType0, pieChartRenderer0);
      defaultChart0.setChartRenderer(hashMap0);
      AbstractChartRenderer abstractChartRenderer0 = defaultChart0.getChartRenderer(0);
      assertSame(abstractChartRenderer0, pieChartRenderer0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Title title0 = defaultChart0.getTitle();
      assertNull(title0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "", (-2736));
      CoordSystem coordSystem0 = defaultChart0.getCoordSystem();
      assertNull(coordSystem0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart();
      Rectangle rectangle0 = new Rectangle(1, 0, 0, 1);
      defaultChart0.setBounds(rectangle0);
      Rectangle rectangle1 = defaultChart0.getBounds();
      assertTrue(rectangle1.isEmpty());
  }
}