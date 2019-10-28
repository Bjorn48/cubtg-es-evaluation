/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:30:32 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.ContourAttrib;
import jahuwaldt.plot.ContourGenerator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ContourGenerator_ESTest extends ContourGenerator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[][] doubleArray0 = new double[3][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, (ContourAttrib[]) null);
      contourGenerator0.cancel();
      contourGenerator0.getProgress();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1532.2893857455197;
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourAttrib contourAttrib0 = new ContourAttrib(1110.3308218);
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[2];
      contourAttribArray0[0] = contourAttrib0;
      ContourAttrib contourAttrib1 = new ContourAttrib(1.0);
      contourAttrib1.getLevel();
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray1, contourAttribArray0);
      // Undeclared exception!
      try { 
        contourGenerator0.getContours();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      double[] doubleArray1 = new double[6];
      doubleArray1[0] = 0.0;
      doubleArray1[1] = 1.0;
      doubleArray1[2] = (-2471.845);
      doubleArray1[3] = 1.0;
      doubleArray1[4] = 96.25294272;
      doubleArray1[5] = 965.5596509924092;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray0, (ContourAttrib[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, 2398, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Data arrays must have more than one row or column.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = 0.0;
      doubleArray0[1] = (-211.7281368866);
      doubleArray0[3] = (-1354.288666169712);
      ContourAttrib contourAttrib0 = new ContourAttrib((-211.7281368866));
      double[][] doubleArray1 = new double[24][4];
      doubleArray1[10] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      doubleArray1[4] = doubleArray0;
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, 416, false);
      contourGenerator0.cancel();
      // Undeclared exception!
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double[] doubleArray0 = new double[17];
      doubleArray0[1] = 1532.2893857455197;
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourAttrib contourAttrib0 = new ContourAttrib(1532.2893857455197);
      contourAttrib0.clone();
      contourAttrib0.getLevel();
      ContourAttrib contourAttrib1 = new ContourAttrib(1110.3308218);
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[2];
      contourAttribArray0[0] = contourAttrib1;
      contourAttrib1.getLevel();
      ContourAttrib contourAttrib2 = new ContourAttrib(1.0);
      contourAttrib2.getLevel();
      contourAttrib2.getLevel();
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, contourAttribArray0);
      // Undeclared exception!
      try { 
        contourGenerator0.getContours();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double[][] doubleArray0 = new double[8][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, 7, false);
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      doubleArray0[1] = (-612.4);
      double[][] doubleArray1 = new double[2][1];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, 34, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Function data must be > 0 for logarithmic intervals.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[][] doubleArray0 = new double[8][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, (ContourAttrib[]) null);
      contourGenerator0.getProgress();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-612.4);
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourAttrib contourAttrib0 = new ContourAttrib((-612.4));
      ContourAttrib contourAttrib1 = new ContourAttrib(0.001);
      ContourAttrib contourAttrib2 = new ContourAttrib(0.001);
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, 597, false);
      contourGenerator0.cancel();
      contourGenerator0.getContours();
      contourGenerator0.cancel();
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      double[][] doubleArray0 = new double[6][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, (ContourAttrib[]) null);
      contourGenerator0.done();
      // Undeclared exception!
      try { 
        contourGenerator0.getContours();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double[][] doubleArray0 = new double[1][0];
      double[][] doubleArray1 = new double[3][7];
      double[] doubleArray2 = new double[5];
      doubleArray2[0] = 1332.5234433523;
      doubleArray2[1] = (-1565.831667672);
      doubleArray2[2] = (-1565.831667672);
      doubleArray2[3] = (-1565.831667672);
      doubleArray2[4] = (-1.0);
      doubleArray1[0] = doubleArray2;
      double[] doubleArray3 = new double[8];
      doubleArray3[0] = (-1565.831667672);
      doubleArray3[1] = (-1565.831667672);
      doubleArray3[2] = (-1565.831667672);
      doubleArray3[3] = (-1565.831667672);
      doubleArray3[4] = (-3081.7131203);
      doubleArray3[5] = (-1.0);
      doubleArray3[6] = (-1.0);
      doubleArray3[7] = (-1.0);
      doubleArray1[1] = doubleArray3;
      double[] doubleArray4 = new double[8];
      doubleArray4[0] = 4219.31;
      doubleArray4[1] = (-1565.831667672);
      doubleArray4[2] = (-1.0);
      doubleArray4[3] = 4219.31;
      doubleArray4[4] = (-1565.831667672);
      doubleArray4[5] = (-1565.831667672);
      doubleArray4[6] = (-1565.831667672);
      doubleArray4[7] = 1332.5234433523;
      doubleArray1[2] = doubleArray4;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray1, doubleArray1, 0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double[][] doubleArray0 = new double[8][7];
      double[] doubleArray1 = new double[7];
      double[][] doubleArray2 = new double[8][7];
      double[] doubleArray3 = new double[6];
      doubleArray3[0] = 0.0;
      doubleArray3[1] = 0.0;
      doubleArray3[2] = 1451.264;
      doubleArray3[3] = 0.0;
      doubleArray3[4] = 42.7;
      doubleArray3[5] = 1751.4;
      doubleArray2[0] = doubleArray3;
      doubleArray2[1] = doubleArray1;
      doubleArray2[2] = doubleArray1;
      doubleArray2[3] = doubleArray1;
      doubleArray2[4] = doubleArray1;
      doubleArray2[5] = doubleArray1;
      doubleArray2[6] = doubleArray1;
      doubleArray2[7] = doubleArray1;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray2, 0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[][] doubleArray0 = new double[3][4];
      double[] doubleArray1 = new double[5];
      doubleArray1[0] = 1.0;
      doubleArray1[1] = (-1020.6395044);
      doubleArray1[2] = (-2438.9367302756045);
      doubleArray1[3] = 297.7642008181;
      doubleArray1[4] = 773.85098;
      doubleArray0[0] = doubleArray1;
      double[] doubleArray2 = new double[3];
      doubleArray2[0] = 773.85098;
      doubleArray2[1] = (-2741.12195439);
      doubleArray2[2] = (-2438.9367302756045);
      doubleArray0[1] = doubleArray2;
      double[] doubleArray3 = new double[1];
      doubleArray3[0] = (-1020.6395044);
      doubleArray0[2] = doubleArray3;
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[1];
      ContourAttrib contourAttrib0 = new ContourAttrib(1.0);
      contourAttrib0.getLevel();
      contourAttribArray0[0] = contourAttrib0;
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, contourAttribArray0);
      contourGenerator0.getProgress();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      double[][] doubleArray1 = new double[4][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[2];
      ContourAttrib contourAttrib0 = new ContourAttrib(1.0);
      contourAttrib0.getLevel();
      contourAttribArray0[0] = contourAttrib0;
      ContourAttrib contourAttrib1 = new ContourAttrib(1.0);
      contourAttrib1.getLevel();
      contourAttribArray0[1] = contourAttrib1;
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, contourAttribArray0);
      contourGenerator0.cancel();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = 1532.2893857455197;
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourAttrib contourAttrib0 = new ContourAttrib(1532.2893857455197);
      contourAttrib0.getLevel();
      double[][] doubleArray2 = new double[1][6];
      doubleArray2[0] = doubleArray0;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray2, doubleArray2, (-907), false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      doubleArray0[0] = (-1.0);
      double[][] doubleArray1 = new double[4][3];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      doubleArray1[2] = doubleArray0;
      doubleArray1[3] = doubleArray0;
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[2];
      ContourAttrib contourAttrib0 = new ContourAttrib(1.0);
      contourAttrib0.getLevel();
      contourAttribArray0[0] = contourAttrib0;
      contourAttrib0.setLevel((-3081.7131203));
      ContourAttrib contourAttrib1 = new ContourAttrib(1.0);
      contourAttrib1.getLevel();
      contourAttribArray0[1] = contourAttrib1;
      contourAttrib1.clone();
      double[][] doubleArray2 = new double[3][4];
      doubleArray2[0] = doubleArray0;
      doubleArray2[1] = doubleArray0;
      doubleArray2[2] = doubleArray0;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray2, contourAttribArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Inconsistant array sizes.
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double[][] doubleArray0 = new double[8][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, 17, true);
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      doubleArray0[1] = (-612.4);
      double[][] doubleArray1 = new double[2][9];
      doubleArray1[0] = doubleArray0;
      doubleArray1[1] = doubleArray0;
      ContourAttrib contourAttrib0 = new ContourAttrib((-612.4));
      ContourAttrib contourAttrib1 = new ContourAttrib(0.001);
      contourAttrib1.getLevel();
      ContourAttrib contourAttrib2 = new ContourAttrib(3636.3);
      contourAttrib2.getLevel();
      contourAttrib0.getLevel();
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[2];
      contourAttribArray0[0] = contourAttrib2;
      contourAttribArray0[1] = contourAttrib0;
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray1, doubleArray1, doubleArray1, contourAttribArray0);
      contourGenerator0.getContours();
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double[][] doubleArray0 = new double[8][7];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, 17, true);
      contourGenerator0.cancel();
      contourGenerator0.getContours();
      contourGenerator0.done();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double[][] doubleArray0 = new double[5][7];
      ContourAttrib[] contourAttribArray0 = new ContourAttrib[0];
      ContourGenerator contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, doubleArray0, contourAttribArray0);
      contourGenerator0.getContours();
      contourGenerator0.getContours();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      doubleArray0[0] = (double) 17;
      doubleArray0[1] = (double) 17;
      doubleArray0[2] = (double) 17;
      ContourGenerator contourGenerator0 = null;
      try {
        contourGenerator0 = new ContourGenerator(doubleArray0, doubleArray0, (double[][]) null, (ContourAttrib[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.ContourGenerator", e);
      }
  }
}
