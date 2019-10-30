/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 08:57:26 GMT 2019
 */

package de.progra.charting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.Title;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Title_ESTest extends Title_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Title title0 = new Title("]qjC?j");
      BufferedImage bufferedImage0 = new BufferedImage(4, 4, 4);
      Graphics2D graphics2D0 = bufferedImage0.createGraphics();
      title0.paintDefault(graphics2D0);
      assertEquals("]qjC?j", title0.getText());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
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
  public void test02()  throws Throwable  {
      Title title0 = new Title("Helvetica");
      title0.setText((String) null);
      String string0 = title0.getText();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Title title0 = new Title("");
      String string0 = title0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Title title0 = new Title("");
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(25, dimension0.height);
      assertEquals(0, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Title title0 = new Title("A@>Y");
      StyleContext styleContext0 = new StyleContext();
      Font font0 = styleContext0.getFont("Chart Title", (-954), (-954));
      title0.font = font0;
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals((-2985), dimension0.width);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Title title0 = new Title("", (Font) null);
      Font font0 = title0.getFont();
      assertNull(font0);
      assertEquals("", title0.getText());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Title title0 = new Title("i40[#;h^+I9u&o");
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      AffineTransform affineTransform0 = new AffineTransform((-1.0F), (-1.0F), (-1.0F), (-1.0F), (-1.0F), (-328.36F));
      Font font1 = font0.deriveFont(affineTransform0);
      title0.setFont(font1);
      Font font2 = title0.getFont();
      assertEquals("i40[#;h^+I9u&o", title0.getText());
      assertEquals(12, font2.getSize());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Title title0 = new Title("c;2 (2,");
      Font font0 = new Font("", 4, 818);
      AffineTransform affineTransform0 = AffineTransform.getRotateInstance((double) 4, 0.0);
      Font font1 = font0.deriveFont((-1), affineTransform0);
      title0.setFont(font1);
      Font font2 = title0.getFont();
      assertEquals("c;2 (2,", title0.getText());
      assertEquals(818, font2.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont("", (-1542), (-1542));
      Title title0 = new Title("", font0);
      Font font1 = title0.getFont();
      assertEquals("", title0.getText());
      assertEquals((-1542.0F), font1.getSize2D(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Title title0 = new Title("");
      Graphics2D graphics2D0 = mock(Graphics2D.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        title0.paintDefault(graphics2D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Zero length string passed to TextLayout constructor.
         //
         verifyException("java.awt.font.TextLayout", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Title title0 = new Title("A@>Y");
      Font font0 = mock(Font.class, new ViolatedAssumptionAnswer());
      doReturn((Rectangle2D) null).when(font0).getStringBounds(anyString() , any(java.awt.font.FontRenderContext.class));
      doReturn((String) null).when(font0).toString();
      title0.setFont(font0);
      // Undeclared exception!
      try { 
        title0.getPreferredSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.Title", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Title title0 = new Title();
      String string0 = title0.getText();
      assertEquals("Chart Title", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Title title0 = new Title("i40[#;h^+I9u&o");
      Dimension dimension0 = title0.getPreferredSize();
      assertEquals(182, dimension0.width);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Font font0 = new Font("", (-1), 0);
      Title title0 = new Title("", font0);
      Font font1 = title0.getFont();
      assertEquals("", title0.getText());
      assertEquals(0, font1.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
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
}