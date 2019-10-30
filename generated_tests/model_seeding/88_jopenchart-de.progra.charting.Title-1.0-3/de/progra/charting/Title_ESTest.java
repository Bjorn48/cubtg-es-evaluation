/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:06:02 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Title;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Title_ESTest extends Title_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Title title0 = new Title((String) null);
      String string0 = title0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Title title0 = new Title();
      assertEquals("Chart Title", title0.getText());
      
      title0.setText("");
      title0.getText();
      assertEquals("", title0.getText());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Title title0 = new Title();
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(115, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Font font0 = new Font("q/U", (-1264), 0);
      Title title0 = new Title("z]", font0);
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals("z]", title0.getText());
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Title title0 = new Title("Kq*pA'H^*R^I", (Font) null);
      Font font0 = title0.getFont();
      assertEquals("Kq*pA'H^*R^I", title0.getText());
      assertNull(font0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Title title0 = new Title();
      Font font0 = title0.getFont();
      assertEquals("Chart Title", title0.getText());
      assertEquals("Helvetica", font0.getName());
      assertEquals(0, font0.getStyle());
      assertEquals(22, font0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Title title0 = new Title();
      // Undeclared exception!
      try { 
        title0.paintDefault((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Title", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Title title0 = new Title((String) null);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Font", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Font font0 = new Font("q/U", (-1264), 0);
      Title title0 = new Title("z]", font0);
      Font font1 = title0.getFont();
      assertEquals("z]", title0.getText());
      assertEquals(0, font1.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Font font0 = new Font("q/U", (-1264), 0);
      Title title0 = new Title("z]", font0);
      title0.setFont(font0);
      assertEquals("z]", title0.getText());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Title title0 = new Title();
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
  public void test11()  throws Throwable  {
      Font font0 = new Font("q/U", (-1264), 0);
      Title title0 = new Title("z]", font0);
      String string0 = title0.getText();
      assertEquals("z]", string0);
  }
}