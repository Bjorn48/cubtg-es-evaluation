/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 19:19:41 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import jigl.image.InterpolationMethod;
import jigl.image.types.InterpolatedRealGrayImage;
import jigl.image.types.RealGrayImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InterpolatedRealGrayImage_ESTest extends InterpolatedRealGrayImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      interpolatedRealGrayImage0.splat(665.746F, 665.746F, (-32768.0F));
      assertEquals(3341, interpolatedRealGrayImage0.X());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      interpolatedRealGrayImage0.splat(789.8968F, 0.0F, 5.0F);
      assertEquals(3341, interpolatedRealGrayImage0.Y());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(0.0F, 2639.39F, (-1049.01F));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum((-1049.01F), 2651.1653F, 255.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1049
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum((-1049.01F), 2651.1653F, 255.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1049
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(1, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp((-2312.4F), 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2312
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, 255.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(17, 1);
      interpolatedRealGrayImage0.splat(0.0F, 0.0F, 1);
      assertEquals(17, interpolatedRealGrayImage0.X());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      interpolatedRealGrayImage0.splat(5.0F, 0.0F, 0.0F);
      assertEquals(InterpolationMethod.NEIGHBOR, interpolatedRealGrayImage0.getInterpolationMethod());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 0);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
      assertEquals(0, interpolatedRealGrayImage1.Y());
      assertEquals(1, interpolatedRealGrayImage1.X());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(0, 3);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(3, interpolatedRealGrayImage1.Y());
      assertEquals(0, interpolatedRealGrayImage1.X());
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      interpolatedRealGrayImage0.setInterpolationMethod((InterpolationMethod) null);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat((-2739.7932F), 298.1628F, 0.0F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3310, 1725);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((InterpolatedRealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((-260), (-260));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.RealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage((RealGrayImage) interpolatedRealGrayImage0);
      assertEquals(1, interpolatedRealGrayImage1.X());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3, 1);
      InterpolationMethod interpolationMethod0 = interpolatedRealGrayImage0.getInterpolationMethod();
      assertEquals(InterpolationMethod.NEIGHBOR, interpolationMethod0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(1, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.splat(1, 1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      interpolatedRealGrayImage0.splat((-0.5F), (-0.5F), (-0.5F));
      assertEquals(1.125F, interpolatedRealGrayImage0.absSum(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.accum(1, 0.0F, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(580.6041F, 294.2F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3345, 3345);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(3345, 3345);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3345
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(3341, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3341
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(17, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(1, 17);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 17
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(3341, 0.0F);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3341
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(294.2F, 3341);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3341
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(1, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.LINEAR;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp((-2308.6929F), (-2308.6929F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2308
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3345, 3345);
      InterpolationMethod interpolationMethod0 = InterpolationMethod.CUBIC;
      interpolatedRealGrayImage0.setInterpolationMethod(interpolationMethod0);
      // Undeclared exception!
      try { 
        interpolatedRealGrayImage0.interp(0.0F, (-1779.5063F));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1779
         //
         verifyException("jigl.image.types.InterpolatedRealGrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(9, 9);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = interpolatedRealGrayImage0.copy();
      assertEquals(9, interpolatedRealGrayImage1.Y());
      assertNotSame(interpolatedRealGrayImage1, interpolatedRealGrayImage0);
      assertEquals(9, interpolatedRealGrayImage1.X());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(3341, 3341);
      // Undeclared exception!
      interpolatedRealGrayImage0.copy();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((Image) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.AbstractImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = null;
      try {
        interpolatedRealGrayImage0 = new InterpolatedRealGrayImage((RealGrayImage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InterpolatedRealGrayImage interpolatedRealGrayImage0 = new InterpolatedRealGrayImage(1, 1);
      InterpolatedRealGrayImage interpolatedRealGrayImage1 = new InterpolatedRealGrayImage(interpolatedRealGrayImage0);
      assertEquals(1, interpolatedRealGrayImage1.Y());
  }
}
