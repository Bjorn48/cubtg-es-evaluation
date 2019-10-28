/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:27:25 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.LinearAxisScale;
import jahuwaldt.plot.PlotAxis;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotRunList;
import jahuwaldt.plot.PlotXAxis;
import jahuwaldt.plot.Triangle1Symbol;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotXAxis_ESTest extends PlotXAxis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      Rectangle rectangle0 = new Rectangle();
      plotXAxis0.setSize(rectangle0);
      assertEquals(0, rectangle0.width);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      Rectangle rectangle0 = new Rectangle();
      rectangle0.setBounds(15, 5, (-348), 0);
      plotXAxis0.resizeAxis(rectangle0);
      assertEquals(1, plotXAxis0.getGridStyle());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      PlotRun[] plotRunArray0 = new PlotRun[3];
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      PlotDatum plotDatum0 = mock(PlotDatum.class, new ViolatedAssumptionAnswer());
      doReturn(plotXAxis0, "XS8.?Jk6+gvj$lV#0A", plotXAxis0.kTick, (Object) null, (Object) null).when(plotDatum0).clone();
      plotDatumArray0[0] = plotDatum0;
      plotDatumArray0[1] = plotDatum0;
      plotDatumArray0[2] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      plotRunArray0[0] = plotRun0;
      plotRunArray0[1] = plotRun0;
      plotRunArray0[2] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      PlotRunList plotRunList1 = (PlotRunList)plotRunList0.clone();
      // Undeclared exception!
      try { 
        plotXAxis0.setAxisBounds(plotRunList1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jahuwaldt.plot.PlotXAxis cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotXAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      // Undeclared exception!
      try { 
        plotXAxis0.resizeAxis((Rectangle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotXAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      // Undeclared exception!
      try { 
        plotXAxis0.draw((Graphics) null, (Component) null, (Rectangle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotXAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      plotXAxis0.manualUpperBounds(true);
      PlotRunList plotRunList0 = new PlotRunList();
      plotXAxis0.setAxisBounds(plotRunList0);
      assertEquals((-1.0), plotXAxis0.getLowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      plotXAxis0.manualLowerBounds(true);
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      PlotRunList plotRunList0 = new PlotRunList(plotRun0);
      plotXAxis0.setAxisBounds(plotRunList0);
      assertEquals(1.0, plotXAxis0.getUpperBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      double[] doubleArray0 = new double[11];
      plotXAxis0.manualUpperBounds(true);
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, triangle1Symbol0);
      PlotRun[] plotRunArray0 = new PlotRun[1];
      plotRunArray0[0] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      plotXAxis0.setAxisBounds(plotRunList0);
      assertEquals(0.0, plotXAxis0.getLowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      plotXAxis0.manualLowerBounds(true);
      PlotRun[] plotRunArray0 = new PlotRun[3];
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      plotRunArray0[0] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      // Undeclared exception!
      try { 
        plotXAxis0.setAxisBounds(plotRunList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotXAxis", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      PlotRunList plotRunList0 = new PlotRunList();
      PlotRun plotRun0 = new PlotRun();
      plotRunList0.add((Object) plotRun0);
      plotXAxis0.setAxisBounds(plotRunList0);
      assertEquals((-1.0), plotXAxis0.getLowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      plotXAxis0.setAxisBounds((PlotRunList) null);
      assertEquals((-1.0), plotXAxis0.getLowerBounds(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotXAxis plotXAxis0 = new PlotXAxis();
      plotXAxis0.manualLowerBounds(true);
      plotXAxis0.manualUpperBounds(true);
      plotXAxis0.setAxisBounds((PlotRunList) null);
      assertEquals(1, PlotAxis.kTickMarksOnly);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinearAxisScale linearAxisScale0 = new LinearAxisScale();
      PlotXAxis plotXAxis0 = new PlotXAxis("5[.&;gPD.ak", linearAxisScale0, (NumberFormat) null, (-893));
      assertEquals(5, PlotAxis.kTick);
  }
}
