/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 16:24:42 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.EOFException;
import java.io.IOException;
import jigl.image.ROI;
import jigl.image.types.TiledImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      TiledImage tiledImage1 = new TiledImage(" misses", 353, 1700, 2, (-1));
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      tiledImage_Tile0.m_bPartialX = true;
      int[] intArray0 = new int[0];
      try { 
        tiledImage0.set(353, 584, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = 2;
      int int1 = 2061;
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      tiledImage0.get(561, 561);
      int int2 = 2;
      String string0 = "\uFFDE&";
      TiledImage tiledImage1 = new TiledImage(string0, int1, int1, int2, int0);
      int int3 = (-1563);
      int int4 = 128;
      tiledImage1.get(int3, int4);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("O_3)<;PoD4j0HrUG8lH", 1556, 1556, 4253, 4253);
      tiledImage0.Y();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = 2116;
      TiledImage tiledImage0 = new TiledImage("C0~l", 2116, 5, (-367), 2116);
      try { 
        tiledImage0.get(584, (-1146));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("P6 ");
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-34);
      byteArray0[0] = (byte) (-34);
      byteArray0[1] = (byte)38;
      byteArray0[2] = (byte)85;
      byteArray0[3] = (byte) (-98);
      byte byte1 = (byte)114;
      byteArray0[4] = (byte)114;
      byteArray0[5] = (byte)81;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("P6 ", (-331), (-331));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1934);
      TiledImage tiledImage0 = new TiledImage("bNy+<F8", 0, 0, 0, (-1934));
      tiledImage0.flush();
      tiledImage0.flush();
      tiledImage0.close();
      tiledImage0.close();
      int[] intArray0 = new int[5];
      try { 
        tiledImage0.set(2310, (-1934), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.get(561, 561);
      TiledImage tiledImage1 = new TiledImage("C0~l", 2061, 2);
      int int0 = (-1563);
      int[] intArray0 = new int[5];
      intArray0[0] = 2061;
      intArray0[1] = 2;
      intArray0[2] = 2;
      intArray0[3] = 2;
      intArray0[4] = (-3407);
      try { 
        tiledImage1.set((-3407), (-3407), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = (-3171);
      int int1 = 255;
      TiledImage tiledImage0 = new TiledImage("I2I", 0, (-3171), 956, 255);
      try { 
        tiledImage0.get((-16777216), 255);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.get(561, 561);
      TiledImage tiledImage1 = new TiledImage("C0~l", 2061, 2);
      int[] intArray0 = new int[5];
      intArray0[0] = 2061;
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("*0(PvJ2Fro]!&m7", 0, 0, (-1), (-1));
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-2388));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int int0 = 584;
      int int1 = 2;
      int int2 = 5;
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 2, 2, 5);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = 3;
      int int1 = 0;
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 3, 3, 3, 0);
      tiledImage0.Y();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        tiledImage0.set(0, 0, intArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = 2;
      String string0 = "C0~l";
      int int1 = 2061;
      int int2 = 4278;
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      ROI rOI0 = new ROI();
      rOI0.setROI(2049, 4278, 4278, 12);
      rOI0.setROI(4278, 4278, 4278, 2);
      // Undeclared exception!
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 2, 2, 5);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      TiledImage tiledImage2 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 353, (-268));
      TiledImage tiledImage3 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 530, 7, 2044, 10);
      TiledImage.Tile tiledImage_Tile1 = tiledImage3.new Tile();
      ROI rOI0 = new ROI();
      TiledImage tiledImage4 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, (-268));
      tiledImage3.get(7, 5);
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      int int0 = 353;
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", (-1), 584);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage_Tile0.m_bPartialX = true;
      int[] intArray0 = new int[7];
      try { 
        tiledImage0.set(353, 584, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 16, 2791);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("O_3)<;PoD4j0HrUG8lH", 1556, 1556, 4253, 4253);
      try { 
        tiledImage0.get(1556, 4);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = 584;
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      tiledImage0.close();
      int int1 = 353;
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", (-1), 584);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", (-2184), 0, (-861), (-214));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = 584;
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 2, 2, 584, 5);
      int int1 = 353;
      String string0 = "interrupted waiting for pixels!";
      TiledImage tiledImage1 = new TiledImage("interrupted waiting for pixels!", 353, 4539, 584, 353);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      TiledImage tiledImage2 = new TiledImage("interrupted waiting for pixels!", (-1), 1509);
      // Undeclared exception!
      try { 
        tiledImage2.getImage(rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = 377;
      int int1 = (-1146);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("Array is invalid", 377, (-1146));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Y{|t3$zF$:3", (-1), 1, (-1), 1);
      TiledImage tiledImage1 = new TiledImage("Y{|t3$zF$:3", 1, (-1));
      TiledImage tiledImage2 = new TiledImage("\uFFDE&", 558, 558, 1, (-2218));
      try { 
        tiledImage1.get(3, 561);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = 46;
      TiledImage tiledImage0 = new TiledImage("Jj@/1c#YRpH", 514, 514, 46, 514);
      int[] intArray0 = new int[8];
      intArray0[0] = 46;
      intArray0[1] = 514;
      intArray0[2] = 514;
      intArray0[3] = 514;
      intArray0[4] = 514;
      intArray0[5] = 514;
      intArray0[6] = 514;
      intArray0[7] = 514;
      try { 
        tiledImage0.set(514, 514, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      tiledImage0.get(561, 561);
      try { 
        tiledImage0.set((-60), 2, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 1531, 1531, (-1576), 2792);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("seconds, with ", 1956, 353, 1956, 353);
      int[] intArray0 = new int[7];
      intArray0[0] = 353;
      intArray0[4] = 1956;
      tiledImage0.flush();
      try { 
        tiledImage0.set(35, 1956, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String string0 = "Array is invalid";
      int int0 = 3;
      int int1 = 0;
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 3, 3, 3, 0);
      tiledImage0.Y();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        tiledImage0.set(0, 0, intArray0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 2046, 2046);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 4278);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.get(561, 561);
      TiledImage tiledImage1 = new TiledImage("C0~l", 2061, 2);
      int[] intArray0 = new int[5];
      tiledImage0.get(561, 0);
      intArray0[0] = 2061;
      // Undeclared exception!
      try { 
        tiledImage1.set(2045, 10, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = 584;
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 31, 0);
      int int1 = 353;
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 0, 584, 353, 31);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = "g6[6>KOjSZ;^1[\"S<w";
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      int int0 = 1700;
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", (-1), 584);
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage_Tile0.m_bPartialX = true;
      int int1 = (-50);
      int[] intArray0 = new int[9];
      intArray0[0] = 353;
      intArray0[1] = (-1);
      intArray0[2] = 2050;
      intArray0[3] = (-50);
      intArray0[4] = 584;
      intArray0[5] = 353;
      intArray0[6] = 5;
      intArray0[7] = 353;
      // Undeclared exception!
      try { 
        tiledImage1.getImage(rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = 2331;
      TiledImage tiledImage0 = new TiledImage("8yej", 415, 13, 882, 13);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = 2331;
      intArray0[2] = 0;
      intArray0[3] = 2331;
      intArray0[4] = 2331;
      intArray0[5] = (-1);
      try { 
        tiledImage0.set(7, (-1), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Y{|t3$zF$:3", (-1), 1, (-1), 1);
      tiledImage0.Y();
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      int[] intArray0 = new int[9];
      intArray0[0] = (-1);
      intArray0[1] = 1;
      intArray0[2] = (-175);
      intArray0[3] = (-1);
      intArray0[4] = (-175);
      intArray0[5] = 1;
      intArray0[6] = (-1);
      intArray0[7] = (-1765);
      intArray0[8] = (-1);
      try { 
        tiledImage0.set((-1), (-175), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 584, 5);
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 584, 5);
      TiledImage tiledImage2 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 353, (-268));
      TiledImage tiledImage3 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 530, 7, 2044, 10);
      ROI rOI0 = new ROI();
      TiledImage tiledImage4 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, (-268));
      tiledImage3.get(7, 5);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 353, (-268));
      tiledImage1.close();
      TiledImage tiledImage2 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 530, 7, 2044, 10);
      TiledImage.Tile tiledImage_Tile1 = tiledImage2.new Tile();
      ROI rOI0 = new ROI();
      TiledImage tiledImage3 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, (-268));
      tiledImage2.get(7, 5);
      tiledImage2.Y();
      tiledImage2.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("\n", (-951), (-951), (-951), 0);
      try { 
        tiledImage0.get((-951), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 2;
      String string0 = "C0~l";
      int int1 = 2061;
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 2061);
      tiledImage0.get(2, 2);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile1 = tiledImage0.new Tile();
      tiledImage_Tile0.m_bDirty = false;
      int int2 = tiledImage_Tile1.m_nMaxY;
      tiledImage0.flush();
      int int3 = tiledImage_Tile1.m_nID;
      // Undeclared exception!
      try { 
        tiledImage_Tile0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Y{|t3$zF$:3", (-1), 1, (-1), 1);
      tiledImage0.Y();
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-367));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 2061);
      tiledImage0.get(2, 2);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile1 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile1.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("P6 ", (-331), (-331));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("O_3)<;PoD4j0HrUG8lH", 1556, 1556, 4253, 4253);
      tiledImage0.Y();
      tiledImage0.X();
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Y{|t3-zk$:3", (-1), (-1), (-1), (-1));
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      int int0 = tiledImage_Tile0.m_nPos;
      tiledImage0.X();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("`|", (-1), (-1), 814, 90);
      tiledImage0.Y();
      tiledImage0.close();
      TiledImage tiledImage1 = null;
      try {
        tiledImage1 = new TiledImage((String) null, (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("P6 ");
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte) (-34);
      byteArray0[0] = (byte) (-34);
      byte byte1 = (byte)85;
      byteArray0[2] = (byte)85;
      byteArray0[4] = (byte) (-98);
      byteArray0[5] = (byte)81;
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("P6 ", (-331), (-331));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = 584;
      int int1 = 2;
      int int2 = 5;
      TiledImage tiledImage0 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 584, 584, 2, 5);
      TiledImage tiledImage1 = new TiledImage("g6[6>KOjSZ;^1[\"S<w", 16, 2044, 16, 584);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      try { 
        tiledImage0.get(5, 584);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Y{|t3$zF$:3", 353, 1, (-1177), (-4949));
      tiledImage0.flush();
      try { 
        tiledImage0.set(35, (-1177), (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("C0~l", 2061, 2061, 2, 2061);
      tiledImage0.get(2, 2);
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }
}