/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:38:50 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotRunList;
import jahuwaldt.plot.RTriangle1Symbol;
import jahuwaldt.plot.Triangle1Symbol;
import jahuwaldt.plot.Triangle2Symbol;
import java.awt.Color;
import java.time.temporal.ChronoField;
import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotRunList_ESTest extends PlotRunList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      PlotRun[] plotRunArray0 = new PlotRun[7];
      plotRunArray0[0] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      Color color0 = new Color((-1595));
      // Undeclared exception!
      try { 
        plotRunList0.setLineColor(color0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      int int0 = plotRunList0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add(0, (Object) null);
      int int0 = plotRunList0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      PlotRun[] plotRunArray0 = new PlotRun[9];
      plotRunArray0[0] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      PlotRun plotRun1 = (PlotRun)plotRunList0.set(0, (Object) null);
      assertEquals(0, plotRun1.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add(0, (Object) null);
      Object object0 = plotRunList0.remove(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[2];
      double[] doubleArray0 = new double[0];
      CircleSymbol circleSymbol0 = new CircleSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, circleSymbol0);
      plotRunArray0[0] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      Object object0 = plotRunList0.remove(0);
      assertSame(object0, plotRun0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      Iterator iterator0 = plotRunList0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1.0);
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinY();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = (-1.0);
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinX();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add(0, (Object) null);
      Object object0 = plotRunList0.get(0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[2];
      PlotRun plotRun0 = new PlotRun();
      plotRunArray0[1] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      PlotRun plotRun1 = (PlotRun)plotRunList0.get(1);
      assertEquals(0, plotRun1.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.addAll((Collection) plotRun0);
      // Undeclared exception!
      try { 
        plotRunList0.setPlotSymbol(rTriangle1Symbol0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.set(1969, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1969, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.set(998, plotRunList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // jahuwaldt.plot.PlotRunList cannot be cast to jahuwaldt.plot.PlotRun
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.set((-1975), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.remove((-2655));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[2];
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      // Undeclared exception!
      try { 
        plotRunList0.getMinY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add(0, (Object) null);
      // Undeclared exception!
      try { 
        plotRunList0.getMinX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add((Object) null);
      // Undeclared exception!
      try { 
        plotRunList0.getMaxY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[1];
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      // Undeclared exception!
      try { 
        plotRunList0.getMaxX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.get(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.get((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.add((Object) null);
      // Undeclared exception!
      try { 
        plotRunList0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRunList0.add(380, (Object) plotRun0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 380, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[1];
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      ChronoField chronoField0 = ChronoField.SECOND_OF_MINUTE;
      // Undeclared exception!
      try { 
        plotRunList0.add(0, (Object) chronoField0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.time.temporal.ChronoField cannot be cast to jahuwaldt.plot.PlotRun
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PlotRunList plotRunList0 = null;
      try {
        plotRunList0 = new PlotRunList((PlotRun[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PlotRunList plotRunList0 = null;
      try {
        plotRunList0 = new PlotRunList((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRunList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      PlotRunList plotRunList1 = (PlotRunList)plotRunList0.clone();
      assertNotSame(plotRunList1, plotRunList0);
      assertEquals(1, plotRunList1.size());
      assertEquals(1, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      plotRunList0.setLineColor((Color) null);
      assertEquals(0, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[2];
      double[] doubleArray0 = new double[0];
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, triangle2Symbol0);
      plotRunArray0[0] = plotRun0;
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      plotRunArray0[1] = plotRunArray0[0];
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      plotRunList0.setPlotSymbol(boxURSymbol0);
      assertEquals(2, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMaxY();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(1, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinY();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotDatum plotDatum0 = new PlotDatum((-805.52592100084), (-805.52592100084), true);
      plotDatumArray0[0] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      PlotRun[] plotRunArray0 = new PlotRun[8];
      plotRunArray0[0] = plotRun0;
      plotRunArray0[1] = plotRun0;
      plotRunArray0[2] = plotRun0;
      plotRunArray0[3] = plotRun0;
      plotRunArray0[4] = plotRun0;
      plotRunArray0[5] = plotRun0;
      plotRunArray0[6] = plotRun0;
      plotRunArray0[7] = plotRun0;
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      double double0 = plotRunList0.getMaxX();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(8, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[2];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      PlotRunList plotRunList0 = new PlotRunList(plotRun0);
      assertEquals(0, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      double[] doubleArray0 = new double[8];
      Triangle1Symbol triangle1Symbol0 = new Triangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, triangle1Symbol0);
      priorityQueue0.add(plotRun0);
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      PlotRunList plotRunList1 = new PlotRunList(plotRunList0);
      assertTrue(plotRunList1.equals((Object)plotRunList0));
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      PriorityQueue<PlotRun> priorityQueue0 = new PriorityQueue<PlotRun>();
      PlotRunList plotRunList0 = new PlotRunList(priorityQueue0);
      double double0 = plotRunList0.getMinX();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PlotRun[] plotRunArray0 = new PlotRun[2];
      PlotRunList plotRunList0 = new PlotRunList(plotRunArray0);
      plotRunList0.clear();
      assertEquals(0, plotRunList0.size());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PlotRunList plotRunList0 = new PlotRunList();
      // Undeclared exception!
      try { 
        plotRunList0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
