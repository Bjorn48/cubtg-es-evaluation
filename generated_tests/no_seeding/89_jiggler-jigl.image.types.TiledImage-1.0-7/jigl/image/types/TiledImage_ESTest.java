/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 21:23:25 GMT 2019
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
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = 0;
      int int1 = (-2460);
      int int2 = (-16);
      TiledImage tiledImage0 = new TiledImage("m::Aau`=qLyNVZ89;", 0, (-16), (-2460), 2860);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-2460));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage(".&w<4}ljt+|X@#", 0, (-594), (-594), (-594));
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)115;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte) (-109);
      byteArray0[5] = (byte)11;
      tiledImage0.close();
      tiledImage0.Y();
      tiledImage0.X();
      TiledImage.Tile tiledImage_Tile1 = tiledImage0.new Tile();
      TiledImage.Tile tiledImage_Tile2 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile2.read();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("j6W", 702, 702, 702, 702);
      try { 
        tiledImage0.set(809, 702, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("(p9\"@wSs", 0, 4, 0, 0);
      int[] intArray0 = new int[9];
      intArray0[0] = 1250;
      intArray0[1] = 4;
      intArray0[2] = 4;
      intArray0[3] = 4;
      intArray0[4] = 4;
      intArray0[5] = 0;
      intArray0[6] = (-3419);
      intArray0[7] = 4;
      intArray0[8] = (-3419);
      try { 
        tiledImage0.set((-3419), 1250, intArray0);
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
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      try { 
        tiledImage0.get((-1455), 2232);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", 0, (-1250));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 1501, 0, 1501);
      // Undeclared exception!
      try { 
        tiledImage0.set(0, 0, (int[]) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("8&*1R\u0003# tC}U%\"", 809, 809, (-32764), (-32764));
      TiledImage tiledImage1 = new TiledImage("8&*1R\u0003# tC}U%\"", 593, 593);
      tiledImage0.close();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 2220;
      int int1 = (-3);
      TiledImage tiledImage0 = new TiledImage("8&*1R\u0003# tC}U%\"", 1678, 1413, 2220, (-3));
      ROI rOI0 = new ROI();
      int int2 = 16;
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6", 10, 10, 0, 0);
      try { 
        tiledImage0.set(0, 144, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[3];
      intArray0[0] = 2232;
      intArray0[1] = 2232;
      tiledImage0.set(146, 4, intArray0);
      System.setCurrentTimeMillis(2232);
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("HLS", (-32787), (-32787));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 1501, 0, 1501);
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
  public void test13()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 0, 0, 0);
      tiledImage0.close();
      TiledImage tiledImage1 = new TiledImage(" ", (-2437), (-2104), 4, 1501);
      tiledImage1.flush();
      TiledImage tiledImage2 = new TiledImage(" ", (-2437), (-1670));
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
  public void test14()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 0, 0, 0);
      try { 
        tiledImage0.set(128, 0, (int[]) null);
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
        tiledImage0 = new TiledImage((String) null, 326, 326, 326, 326);
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
      int int0 = (-566);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage((String) null, 16, (-566));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      TiledImage tiledImage1 = new TiledImage("Array is invalid", 1413, 4);
      tiledImage0.flush();
      TiledImage.Tile tiledImage_Tile0 = tiledImage1.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(2232);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 2232;
      int int1 = 4;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      rOI0.setROI(1777, 48, 2, 139);
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "jigl.image.types.TiledImage$Tile");
      String string0 = "Array is invalid";
      int int0 = 144;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.close();
      int int1 = 48;
      rOI0.setROI(1777, 48, 2, 139);
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
  public void test20()  throws Throwable  {
      ROI rOI0 = new ROI();
      TiledImage tiledImage0 = new TiledImage("jigl.image.types.TiledImage", 1501, 1501, 1501, (-592));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 0, 0, 0);
      try { 
        tiledImage0.get(45, 45);
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
      ROI rOI0 = new ROI();
      TiledImage tiledImage0 = new TiledImage("NJQ'S{e\"", (-592), (-3113), (-592), (-592));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
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
      int int0 = Integer.MAX_VALUE;
      TiledImage tiledImage0 = new TiledImage("rw", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1537));
      int[] intArray0 = new int[6];
      intArray0[0] = 1014;
      intArray0[1] = (-4282);
      intArray0[2] = (-4282);
      intArray0[3] = 1014;
      intArray0[4] = (-4282);
      intArray0[5] = (-1537);
      try { 
        tiledImage0.set(1014, (-4282), intArray0);
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
      int int0 = 702;
      TiledImage tiledImage0 = new TiledImage("j6W", 702, 702, 702, 702);
      try { 
        tiledImage0.get(702, 6);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("j6W", 840, 840, 0, (-1444));
      try { 
        tiledImage0.get(0, (-1444));
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
      TiledImage tiledImage0 = new TiledImage("@m$", (-1323), 0, 0, 2038);
      try { 
        tiledImage0.set(0, 128, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = 0;
      int int1 = 5;
      TiledImage tiledImage0 = new TiledImage("HLS", 0, 5, 2220, 0);
      ROI rOI0 = new ROI();
      int int2 = (-835);
      rOI0.setROI(2220, (-609), 9, (-835));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "r7HLS");
      TiledImage tiledImage0 = new TiledImage("r7HLS", 1593, 5279, 2, (-33));
      tiledImage0.flush();
      ROI rOI0 = new ROI((-33), (-2085), 3622, 5279);
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("", 16, (-479), (-479), (-123));
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Negative position: -22977
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = (-289);
      TiledImage tiledImage0 = null;
      try {
        tiledImage0 = new TiledImage("jigl.image.AbstractArrayImage", (-289), (-289));
        fail("Expecting exception: EOFException");
      
      } catch(Throwable e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.RandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = (-1);
      TiledImage tiledImage0 = new TiledImage("PB.<b:;`f", (-1011), (-1), (-1), (-1855));
      int int1 = 0;
      try { 
        tiledImage0.get((-1011), 0);
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
      TiledImage tiledImage0 = new TiledImage("POe`yzB?u!+", 0, 4855, 4855, 0);
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
  public void test33()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int0 = 144;
      TiledImage tiledImage0 = new TiledImage("89MYVhr&9V6o", 4, 4, 1413, 4);
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[4];
      intArray0[0] = 1413;
      intArray0[1] = 2232;
      intArray0[3] = 144;
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      tiledImage0.getImage(rOI0);
      try { 
        tiledImage0.set((-16777216), (-16777216), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("|}{n'S", 1476, 809, (-1), 809);
      tiledImage0.flush();
      tiledImage0.flush();
      tiledImage0.Y();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("finished constructor", (-38), (-32760), (-32760), (-32760));
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = 1678;
      int int1 = 1413;
      int int2 = 2220;
      int int3 = 0;
      TiledImage tiledImage0 = new TiledImage("8&*1R\u0003# tC}U%\"", 1678, 1413, 2220, 0);
      ROI rOI0 = new ROI();
      int int4 = 9;
      rOI0.setROI(16, (-835), 16, 9);
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int int0 = Integer.MAX_VALUE;
      int int1 = (-1537);
      TiledImage tiledImage0 = new TiledImage("rQw", Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, (-1537));
      int int2 = 1014;
      int int3 = (-4282);
      int[] intArray0 = new int[6];
      try { 
        tiledImage0.get(35, 5261);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -6
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.close();
      int[] intArray0 = new int[3];
      intArray0[0] = 2232;
      intArray0[1] = 146;
      try { 
        tiledImage0.set(146, 4, intArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      int int0 = 1413;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int1 = 144;
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      tiledImage0.get(2, 2);
      ROI rOI0 = new ROI();
      rOI0.setROI(128, 2544, 2232, 51);
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("P6", 10, 10, 0, 16);
      try { 
        tiledImage0.get(16, 144);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      int int0 = 1501;
      ROI rOI0 = new ROI();
      TiledImage tiledImage0 = new TiledImage("jigl.image.types.TiledImage", 1501, 1501, 1501, (-592));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("0Am,V|~Cn%N*cR=3", 909, 5261, 0, 16);
      // Undeclared exception!
      try { 
        tiledImage0.get(16, 16);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      int int0 = 0;
      TiledImage tiledImage0 = new TiledImage("PB.<b:;`f", (-1011), (-1), 0, (-1855));
      int int1 = 0;
      try { 
        tiledImage0.get(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      int int0 = 1413;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      int int1 = 4;
      FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 1413, 144, 4, 1413);
      ROI rOI0 = new ROI();
      rOI0.setROI(1777, 1413, 2, 139);
      ROI rOI1 = new ROI(144, 2, 5, 144);
      tiledImage0.getImage(rOI1);
      tiledImage0.getImage(rOI0);
      int int2 = 2;
      int int3 = 0;
      int[] intArray0 = new int[5];
      intArray0[0] = int2;
      intArray0[1] = int3;
      intArray0[2] = int2;
      intArray0[3] = int0;
      intArray0[4] = int1;
      tiledImage0.set(int3, int3, intArray0);
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = "";
      FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      tiledImage0.getImage(rOI0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("@m$", 0, (-33), 1593, (-33));
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 0, 0, 0);
      try { 
        tiledImage0.get(0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("0Am,V|~Cn%N*cR=3", 5261, 1330, 1330, 10);
      tiledImage0.flush();
      tiledImage0.set(10, 10, (int[]) null);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("MsdyKA&y9*`{d\"bA[/", 3, 1501, 656, (-680));
      // Undeclared exception!
      try { 
        tiledImage0.set(0, 0, (int[]) null);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      int[] intArray0 = new int[3];
      intArray0[0] = 2232;
      intArray0[1] = 146;
      tiledImage0.set(146, 4, intArray0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("3[K)", 3124, 6, 6, 12);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      tiledImage0.flush();
      ROI rOI1 = new ROI();
      tiledImage0.getImage(rOI0);
      TiledImage tiledImage1 = null;
      try {
        tiledImage1 = new TiledImage("Array is invalid", (-249), 877, (-126), 2);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Negative position: -655103
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      TiledImage tiledImage1 = new TiledImage("Array is invalid", 2, 144, 1, 877);
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("|}{n'S", 1476, 809, (-1), 809);
      tiledImage0.flush();
      tiledImage0.X();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("Ir0q[_^_b", 1501, 1501, 0, 1501);
      TiledImage tiledImage1 = new TiledImage("Ir0q[_^_b", 0, 1767);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("j6W", (-38), (-32760), 702, (-32760));
      TiledImage tiledImage1 = new TiledImage("j6W", (-38), 809);
      tiledImage1.close();
      tiledImage0.X();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("NJQ'S{e\"", 1501, 1501, 1501, 1501);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage(".&w<4}ljt+|X@#", 0, (-594), (-594), (-594));
      tiledImage0.close();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)32;
      byteArray0[1] = (byte)115;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)4;
      byteArray0[4] = (byte) (-109);
      byteArray0[5] = (byte)11;
      byteArray0[6] = (byte) (-1);
      tiledImage_Tile0.m_data = byteArray0;
      tiledImage_Tile0.m_nPos = 0;
      tiledImage_Tile0.read();
      tiledImage0.flush();
      tiledImage0.close();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("Array is invalid", 2232, 144, 4, 1413);
      ROI rOI0 = new ROI();
      tiledImage0.getImage(rOI0);
      int[] intArray0 = new int[5];
      intArray0[0] = 2;
      intArray0[1] = 3;
      intArray0[2] = 2;
      intArray0[3] = 2232;
      intArray0[4] = 4;
      tiledImage0.set(3, 3, intArray0);
      TiledImage tiledImage1 = new TiledImage("Array is invalid", 4, 2, 133, 974);
      tiledImage0.flush();
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("8&*1R\u0003# tC}U%\"", 1443, 238, 5261, (-799));
      try { 
        tiledImage0.set(128, (-799), (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      int int0 = 5261;
      TiledImage tiledImage0 = new TiledImage("0Am,V|~Cn%N*cR=3", 909, 5261, 0, 16);
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
  public void test60()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      TiledImage tiledImage0 = new TiledImage("d", 1501, 656, 1501, 9);
      try { 
        tiledImage0.set((-962), 3, (int[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("0Am,V|~Cn%N*cR=3", 909, 5261, 0, 16);
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
  public void test62()  throws Throwable  {
      int int0 = (-158);
      TiledImage tiledImage0 = new TiledImage("GshLW-AI", 183, 183, (-158), 582);
      tiledImage0.close();
      tiledImage0.flush();
      tiledImage0.Y();
      tiledImage0.close();
      ROI rOI0 = new ROI();
      rOI0.setROI(183, (-955), 183, 183);
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ROI rOI0 = new ROI();
      rOI0.setROI((-592), (-592), 689, (-592));
      TiledImage tiledImage0 = new TiledImage("jigl.image.types.TiledImage", 1501, 1501, 1501, (-592));
      // Undeclared exception!
      try { 
        tiledImage0.getImage(rOI0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }
}