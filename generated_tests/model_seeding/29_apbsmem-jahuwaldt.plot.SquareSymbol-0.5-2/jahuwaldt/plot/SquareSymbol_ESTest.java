/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 09:33:39 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.SquareSymbol;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SquareSymbol_ESTest extends SquareSymbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      Color color0 = Color.orange;
      Color color1 = new Color((-520));
      squareSymbol0.setFillColor(color1);
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(color0).when(graphics0).getColor();
      squareSymbol0.draw(graphics0, 434, 53);
      assertEquals(8, squareSymbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      // Undeclared exception!
      try { 
        squareSymbol0.draw(debugGraphics0, (-1950), (-1950));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.DebugGraphics", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SquareSymbol squareSymbol0 = new SquareSymbol();
      squareSymbol0.setBorderColor((Color) null);
      Color color0 = Color.DARK_GRAY;
      Graphics graphics0 = mock(Graphics.class, new ViolatedAssumptionAnswer());
      doReturn(color0).when(graphics0).getColor();
      squareSymbol0.draw(graphics0, 2824, 2824);
      assertEquals(8, squareSymbol0.getSize());
  }
}