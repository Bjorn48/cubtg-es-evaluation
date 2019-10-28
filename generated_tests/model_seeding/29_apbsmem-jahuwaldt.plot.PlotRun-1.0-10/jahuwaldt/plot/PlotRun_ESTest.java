/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 01:47:53 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.BoxLLSymbol;
import jahuwaldt.plot.BoxLRSymbol;
import jahuwaldt.plot.BoxURSymbol;
import jahuwaldt.plot.CircleSymbol;
import jahuwaldt.plot.PlotDatum;
import jahuwaldt.plot.PlotRun;
import jahuwaldt.plot.PlotSymbol;
import jahuwaldt.plot.RTriangle1Symbol;
import jahuwaldt.plot.RTriangle3Symbol;
import jahuwaldt.plot.SquareSymbol;
import jahuwaldt.plot.ThinRect1Symbol;
import jahuwaldt.plot.Triangle2Symbol;
import jahuwaldt.plot.Triangle3Symbol;
import java.awt.Color;
import java.time.chrono.ThaiBuddhistEra;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlotRun_ESTest extends PlotRun_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      PlotDatum plotDatum0 = new PlotDatum((-1251.495415945863), 2223.77, false);
      plotDatumArray0[0] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Set<String> set0 = Calendar.getAvailableCalendarTypes();
      PlotRun plotRun0 = new PlotRun(set0);
      int int0 = plotRun0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      double[] doubleArray0 = new double[8];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, boxLLSymbol0);
      int int0 = plotRun0.size();
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotDatum plotDatum0 = new PlotDatum((-1251.495415945863), (-1251.495415945863), false);
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      Object object0 = plotRun0.set(0, plotDatum0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotDatum plotDatum0 = new PlotDatum((-1251.495415945863), 2223.77, false);
      plotDatumArray0[0] = plotDatum0;
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      PlotDatum plotDatum1 = (PlotDatum)plotRun0.set(0, plotDatum0);
      assertFalse(plotDatum1.hasErrorBar());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[4];
      doubleArray0[2] = (-1693.213195310973);
      RTriangle3Symbol rTriangle3Symbol0 = new RTriangle3Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, rTriangle3Symbol0);
      double double0 = plotRun0.getMinY();
      assertEquals((-1693.213195310973), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      RTriangle1Symbol rTriangle1Symbol0 = new RTriangle1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, rTriangle1Symbol0);
      double double0 = plotRun0.getMinX();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[4];
      PlotDatum plotDatum0 = new PlotDatum(0.0, (-1015.337), false);
      plotDatumArray0[0] = plotDatum0;
      CircleSymbol circleSymbol0 = new CircleSymbol();
      PlotDatum plotDatum1 = new PlotDatum((-1015.337), 1.0, false, circleSymbol0);
      plotDatumArray0[1] = plotDatum1;
      plotDatumArray0[2] = plotDatumArray0[0];
      plotDatumArray0[3] = plotDatumArray0[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      double double0 = plotRun0.getMinX();
      assertEquals(4, plotRun0.size());
      assertEquals((-1015.337), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      double[] doubleArray0 = new double[8];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, boxLLSymbol0);
      plotRun0.add(8, (Object) null);
      Object object0 = plotRun0.get(8);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      double[] doubleArray0 = new double[6];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, thinRect1Symbol0);
      plotRun0.get(1);
      assertEquals(6, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set(0, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      ArrayDeque<String> arrayDeque0 = new ArrayDeque<String>();
      // Undeclared exception!
      try { 
        plotRun0.set(1470, arrayDeque0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.ArrayDeque cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.remove((-4980));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      ArrayList<PlotDatum> arrayList0 = new ArrayList<PlotDatum>(0);
      arrayList0.add((PlotDatum) null);
      plotRun0.addAll((Collection) arrayList0);
      // Undeclared exception!
      try { 
        plotRun0.getMaxY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      double[] doubleArray0 = new double[8];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, boxLLSymbol0);
      plotRun0.add(8, (Object) null);
      // Undeclared exception!
      try { 
        plotRun0.getMaxX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get(1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.add(7, (Object) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      // Undeclared exception!
      try { 
        plotRun0.add(19, (Object) integer0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to jahuwaldt.plot.PlotDatum
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((PlotDatum[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((Collection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      Iterator iterator0 = plotRun0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BEFORE_BE;
      EnumSet<ThaiBuddhistEra> enumSet0 = EnumSet.of(thaiBuddhistEra0, thaiBuddhistEra0);
      PlotRun plotRun0 = new PlotRun(enumSet0);
      Object object0 = plotRun0.clone();
      assertNotSame(object0, plotRun0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double[] doubleArray0 = new double[14];
      ThinRect1Symbol thinRect1Symbol0 = new ThinRect1Symbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, thinRect1Symbol0);
      Color color0 = Color.yellow;
      plotRun0.setLineColor(color0);
      assertEquals(14, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      SquareSymbol squareSymbol0 = new SquareSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, squareSymbol0);
      plotRun0.setPlotSymbol(squareSymbol0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[3];
      PlotDatum plotDatum0 = new PlotDatum((-1251.495415945863), 2223.77, false);
      plotDatumArray0[0] = plotDatum0;
      plotDatumArray0[1] = plotDatum0;
      plotDatumArray0[2] = plotDatumArray0[0];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      double double0 = plotRun0.getMaxY();
      assertEquals(2223.77, double0, 0.01);
      assertEquals(3, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      BoxLRSymbol boxLRSymbol0 = new BoxLRSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxLRSymbol0);
      double double0 = plotRun0.getMinY();
      assertEquals(6, plotRun0.size());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BEFORE_BE;
      EnumSet<ThaiBuddhistEra> enumSet0 = EnumSet.of(thaiBuddhistEra0, thaiBuddhistEra0);
      PlotRun plotRun0 = new PlotRun(enumSet0);
      assertEquals(0, plotRun0.size());
      
      double double0 = plotRun0.getMinY();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BoxLLSymbol boxLLSymbol0 = new BoxLLSymbol();
      double[] doubleArray0 = new double[8];
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, true, boxLLSymbol0);
      double double0 = plotRun0.getMaxX();
      assertEquals(4.9E-324, double0, 0.01);
      assertEquals(8, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PlotDatum[] plotDatumArray0 = new PlotDatum[1];
      PlotRun plotRun0 = new PlotRun(plotDatumArray0);
      // Undeclared exception!
      try { 
        plotRun0.getMinX();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      double double0 = plotRun0.getMinX();
      assertEquals(1.7976931348623157E308, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>();
      PlotDatum plotDatum0 = new PlotDatum(298.15, 298.15, true);
      priorityQueue0.add(plotDatum0);
      PlotRun plotRun0 = new PlotRun(priorityQueue0);
      assertEquals(1, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Triangle2Symbol triangle2Symbol0 = new Triangle2Symbol();
      double[] doubleArray0 = new double[6];
      double[] doubleArray1 = new double[3];
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, doubleArray1, false, triangle2Symbol0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Triangle3Symbol triangle3Symbol0 = new Triangle3Symbol();
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun(doubleArray0, (double[]) null, true, triangle3Symbol0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      BoxURSymbol boxURSymbol0 = new BoxURSymbol();
      PlotRun plotRun0 = new PlotRun(doubleArray0, doubleArray0, false, boxURSymbol0);
      plotRun0.remove(0);
      assertEquals(5, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      PlotRun plotRun0 = null;
      try {
        plotRun0 = new PlotRun((double[]) null, (double[]) null, true, (PlotSymbol) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.clear();
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      EnumSet<ThaiBuddhistEra> enumSet0 = EnumSet.of(thaiBuddhistEra0, thaiBuddhistEra0);
      PlotRun plotRun0 = new PlotRun(enumSet0);
      PlotRun plotRun1 = new PlotRun(plotRun0);
      assertEquals(0, plotRun0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ThaiBuddhistEra thaiBuddhistEra0 = ThaiBuddhistEra.BE;
      EnumSet<ThaiBuddhistEra> enumSet0 = EnumSet.of(thaiBuddhistEra0, thaiBuddhistEra0);
      PlotRun plotRun0 = new PlotRun(enumSet0);
      // Undeclared exception!
      try { 
        plotRun0.remove(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      plotRun0.add((Object) null);
      // Undeclared exception!
      try { 
        plotRun0.getMinY();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.PlotRun", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.get((-1058));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      PlotRun plotRun0 = new PlotRun();
      // Undeclared exception!
      try { 
        plotRun0.set((-617), (Object) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
