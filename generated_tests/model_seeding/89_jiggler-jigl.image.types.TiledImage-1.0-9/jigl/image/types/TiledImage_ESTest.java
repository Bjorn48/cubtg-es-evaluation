/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 01:16:06 GMT 2019
 */

package jigl.image.types;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jigl.image.ROI;
import jigl.image.types.TiledImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TiledImage_ESTest extends TiledImage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int int0 = (-447);
      int int1 = 128;
      int int2 = 2;
      TiledImage tiledImage0 = new TiledImage(" ms", 128, 2, (-447), 2);
      int[] intArray0 = new int[4];
      intArray0[0] = 2;
      intArray0[1] = 128;
      intArray0[2] = (-10);
      intArray0[3] = (-447);
      try { 
        tiledImage0.set(2, (-10), intArray0);
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
      TiledImage tiledImage0 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-997), (-997), (-997), (-997));
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      TiledImage tiledImage1 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-1), (-997));
      System.setCurrentTimeMillis((-629L));
      try { 
        tiledImage0.get((-997), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = 3;
      TiledImage tiledImage0 = new TiledImage("l(P&Q42Y`]e:P-\u0003", 3, 3, 3, 3);
      tiledImage0.X();
      tiledImage0.X();
      tiledImage0.Y();
      try { 
        tiledImage0.get(3, 3);
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
      String string0 = "w~x#EOV5p{@SBDho'5R";
      int int0 = (-997);
      TiledImage tiledImage0 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-997), (-997), (-997), (-997));
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-563));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = (-997);
      int int1 = 272;
      TiledImage tiledImage0 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-997), (-997), 272, 272);
      tiledImage0.close();
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("|k)alNBv_N", (-1528), (-1528), (-293), (-293));
      tiledImage0.flush();
      try { 
        tiledImage0.get(5025, 5025);
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
      TiledImage tiledImage0 = new TiledImage(" misses", (-447), (-447), (-19), (-19));
      TiledImage tiledImage1 = new TiledImage(" misses", 55, 55, 1652, 744);
      tiledImage1.X();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int int0 = 10;
      int int1 = 0;
      TiledImage tiledImage0 = new TiledImage("wi^ted)uC ", 10, 0, 0, 0);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      int int2 = 2;
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("|k)alNBv_N", (-1528), (-1528), (-293), (-293));
      tiledImage0.close();
      int[] intArray0 = new int[1];
      intArray0[0] = (-1528);
      try { 
        tiledImage0.set((-1528), (-293), intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-997), (-997), 272, 272);
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      TiledImage tiledImage1 = new TiledImage("w~x#EOV5p{@SBDho'5R", (-1), 272);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage(" misses", 1547, 128, 128, 128);
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
      TiledImage.Tile tiledImage_Tile0 = tiledImage0.new Tile();
      tiledImage0.flush();
      tiledImage0.getImage(rOI0);
      // Undeclared exception!
      try { 
        tiledImage_Tile0.write((-447));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage$Tile", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int int0 = (-447);
      int int1 = (-19);
      TiledImage tiledImage0 = new TiledImage(" misses", (-447), (-447), (-19), (-19));
      tiledImage0.X();
      ROI rOI0 = new ROI();
      rOI0.X();
      rOI0.Y();
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
  public void test12()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage("wi^ted)uC ", (-4925), 0, 0, 10);
      int int0 = 0;
      int[] intArray0 = new int[9];
      intArray0[0] = 0;
      intArray0[1] = 2846;
      intArray0[2] = 520;
      intArray0[3] = 10;
      intArray0[4] = 0;
      intArray0[5] = (-460);
      intArray0[6] = 0;
      intArray0[7] = 4412;
      intArray0[8] = 10;
      try { 
        tiledImage0.set(520, 4412, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jigl.image.types.TiledImage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TiledImage tiledImage0 = new TiledImage(" misses", 1547, 128, 128, 128);
      ROI rOI0 = new ROI();
      rOI0.X();
      tiledImage0.get(1286, 1);
      rOI0.Y();
      tiledImage0.flush();
      tiledImage0.getImage(rOI0);
      tiledImage0.close();
      tiledImage0.flush();
      System.setCurrentTimeMillis(1);
  }
}
