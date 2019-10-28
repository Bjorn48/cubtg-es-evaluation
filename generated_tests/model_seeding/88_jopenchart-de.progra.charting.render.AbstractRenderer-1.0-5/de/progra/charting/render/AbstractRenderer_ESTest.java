/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:27:48 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.DefaultChart;
import de.progra.charting.Legend;
import de.progra.charting.Title;
import de.progra.charting.model.ChartDataModel;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractRenderer_ESTest extends AbstractRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle();
      rectangle0.add((-2147483646), 25);
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle(115, 115);
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Title title0 = new Title();
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(graphics2D0).drawImage(any(java.awt.Image.class) , anyInt() , anyInt() , any(java.awt.image.ImageObserver.class));
      title0.render(graphics2D0);
      assertEquals("Chart Title", title0.getText());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle();
      rectangle0.setSize((-2144064088), (-2144064088));
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DefaultChart defaultChart0 = new DefaultChart((ChartDataModel) null, "#Uq\"F'C`.[>8GA%XP");
      Rectangle rectangle0 = defaultChart0.getBounds();
      assertNull(rectangle0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Title title0 = new Title();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      title0.setBounds(rectangle0);
      Rectangle rectangle1 = title0.getBounds();
      assertEquals(0, rectangle1.height);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Title title0 = new Title();
      Polygon polygon0 = new Polygon();
      Rectangle rectangle0 = polygon0.getBounds();
      rectangle0.add((-1071.1699897), (double) 0);
      title0.setBounds(rectangle0);
      Rectangle rectangle1 = title0.getBounds();
      assertEquals(0, rectangle1.height);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Legend legend0 = new Legend();
      // Undeclared exception!
      try { 
        legend0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Legend", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = title0.getBounds();
      assertEquals(2.147483647E9, rectangle0.getMaxX(), 0.01);
      assertEquals(2.147483647E9, rectangle0.getMaxY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Title title0 = new Title();
      Rectangle rectangle0 = new Rectangle();
      rectangle0.width = 973;
      title0.setBounds(rectangle0);
      // Undeclared exception!
      try { 
        title0.render((Graphics2D) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (973) and height (0) must be non-zero
         //
         verifyException("java.awt.image.ReplicateScaleFilter", e);
      }
  }
}
