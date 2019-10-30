/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:32:13 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ColorModel;
import jigl.image.ROI;
import jigl.image.types.ColorImage;
import jigl.image.types.InterpolatedColorImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ColorImage_ESTest extends ColorImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      ColorImage colorImage1 = new ColorImage(colorImage0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      ROI rOI0 = new ROI();
      colorImage0.add(0, 0, 4, 0, 4, rOI0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(261, 1082);
      ROI rOI0 = new ROI();
      colorImage0.toString(rOI0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.subtract(0, (-2403), (-2403));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 3);
      interpolatedColorImage0.subtract(0, 1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.subtract(0, 0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 0);
      interpolatedColorImage0.subtract(0, 0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      colorImage0.plane(0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.plane(0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(68, 0);
      interpolatedColorImage0.multiply(0, 68);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(3, 0);
      interpolatedColorImage0.min();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.maxComponent();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 1);
      interpolatedColorImage0.max();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1, 0);
      interpolatedColorImage0.divide(1, 0, 128);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(1285, 1285);
      ROI rOI0 = new ROI();
      colorImage0.copy(rOI0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      colorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      interpolatedColorImage0.clear();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(68, 0);
      interpolatedColorImage0.clear();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 3);
      int[] intArray0 = new int[6];
      interpolatedColorImage0.addbuffer(2, 0, 0, 128, intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1315, 1315);
      int[] intArray0 = new int[8];
      ColorImage colorImage0 = interpolatedColorImage0.addbuffer(1, 6, 255, (-67), intArray0);
      assertEquals(ColorModel.RGB, colorImage0.getColorModel());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = interpolatedColorImage0.addSum();
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = new int[8];
      ColorImage colorImage0 = interpolatedColorImage0.add(intArray0);
      assertEquals(ColorModel.RGB, colorImage0.getColorModel());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      int[] intArray0 = interpolatedColorImage0.absSum();
      interpolatedColorImage0.divide(intArray0);
      assertEquals(3, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int int0 = interpolatedColorImage0.Y();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      int int0 = colorImage0.X();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1315, 1315);
      ROI rOI0 = new ROI((-2115), (-2115), (-2115), (-2115));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.toString(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2115
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[6];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract((-2613), 0, intArray0, (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        colorImage0.subtract(0, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract((-897), (-897), rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -897
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ROI rOI0 = new ROI();
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 233);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(0, 648, (-606), (-1503), 0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 648
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.subtract(0, 0, (-760), (-1), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.subtract((-736), (-736));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -736
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      Integer[] integerArray0 = new Integer[4];
      integerArray0[0] = (Integer) 0;
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.set((int) integerArray0[0], (int) integerArray0[0], integerArray0, rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      Integer[] integerArray0 = new Integer[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.set(192, 192, integerArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply((ColorImage) interpolatedColorImage0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1315, 1315);
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(255, 1315, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1315
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(0, 0, (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI((-2093), (-2093), (-2093), (-2093));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply((-1551), (-3365), (-1551), (-3365), 7, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -5458
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(3535, 3535, 3535, 3535, 3535);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(2003, 2003, 2003);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.multiply(0, Integer.MAX_VALUE);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(377, 377);
      // Undeclared exception!
      interpolatedColorImage0.minComponent();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.minComponent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.min((ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      ROI rOI0 = new ROI((-2115), (-2115), (-2115), (-2115));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2115
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min(0, rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.min((-233));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -233
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(377, 377);
      // Undeclared exception!
      interpolatedColorImage0.min();
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(1285, 1285);
      // Undeclared exception!
      colorImage0.maxComponent();
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.max((ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-2115), (-2115), (-2115), (-2115));
      ColorImage colorImage0 = interpolatedColorImage0.copy();
      // Undeclared exception!
      try { 
        colorImage0.max(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2115
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(922, 922);
      // Undeclared exception!
      interpolatedColorImage0.max(0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.max(128);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 128
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1315, 1315);
      // Undeclared exception!
      interpolatedColorImage0.max();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.getJavaImage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      ROI rOI0 = new ROI();
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(colorImage0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.get(255, 5901, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5901
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ROI rOI0 = new ROI(361, 361, 361, 361);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(3, 361);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide(intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 361
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      ROI rOI0 = new ROI((-2131), (-2131), (-2131), (-2131));
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        colorImage0.divide(1, (-2131), intArray0, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide((-897), (-897), (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide(0, 16, (ROI) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ROI rOI0 = new ROI(0, 0, 0, 0);
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 0);
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      // Undeclared exception!
      try { 
        interpolatedColorImage0.divide((-1639), (-1639), (-1639), (-1639), 190);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(0, 1660);
      ROI rOI0 = new ROI((-2115), (-2115), (-2115), (-2115));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.copy(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2115
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(1288, 1288);
      // Undeclared exception!
      colorImage0.copy();
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      ROI rOI0 = new ROI((-2115), (-2115), (-2115), (-2115));
      // Undeclared exception!
      try { 
        interpolatedColorImage0.clip(8, (-2115), rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        colorImage0.byteSize(rOI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(2, 2);
      ROI rOI0 = new ROI();
      rOI0.setROI(0, 1, (-1736), 2);
      // Undeclared exception!
      try { 
        colorImage0.byteSize(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1736
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage(1315, 1315);
      // Undeclared exception!
      interpolatedColorImage0.byteSize();
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.byteSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        colorImage0.addbuffer(192, 255, intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage();
      // Undeclared exception!
      try { 
        colorImage0.addbuffer(377, (-1665), (int[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 0);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        colorImage0.addbuffer(748, 0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      InterpolatedColorImage interpolatedColorImage0 = new InterpolatedColorImage();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        interpolatedColorImage0.addbuffer((-2115), 1, (-303), (-2115), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.GrayImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ColorImage colorImage0 = new ColorImage(0, 1);
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        colorImage0.addbuffer(0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("jigl.image.types.ColorImage", e);
      }
  }
}