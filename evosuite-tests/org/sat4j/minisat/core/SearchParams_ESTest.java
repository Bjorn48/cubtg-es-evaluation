/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:02:51 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.core.SearchParams;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchParams_ESTest extends SearchParams_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(142.8542211210275, 142.8542211210275, 0.0, 0);
      assertEquals(142.8542211210275, searchParams0.getVarDecay(), 0.01);
      
      searchParams0.setVarDecay(0.0);
      double double0 = searchParams0.getVarDecay();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1456);
      searchParams0.setVarDecay((-136.372145227263));
      double double0 = searchParams0.getVarDecay();
      assertEquals((-136.372145227263), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      searchParams0.setInitConflictBound(0);
      int int0 = searchParams0.getInitConflictBound();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(142.8542211210275, 142.8542211210275, 0.0, 0);
      searchParams0.setInitConflictBound((-1210));
      int int0 = searchParams0.getInitConflictBound();
      assertEquals((-1210), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1655.5634012692028, 527);
      searchParams0.setConflictBoundIncFactor(0.0);
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams((-1190));
      searchParams0.setConflictBoundIncFactor((-1190));
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals((-1190.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(142.8542211210275, 142.8542211210275, 0.0, 0);
      assertEquals(142.8542211210275, searchParams0.getClaDecay(), 0.01);
      
      searchParams0.setClaDecay(0);
      double double0 = searchParams0.getClaDecay();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(0.0, (-1015.2983297038099), 0.0, 1212);
      double double0 = searchParams0.getClaDecay();
      assertEquals((-1015.2983297038099), double0, 0.01);
      assertEquals(1212, searchParams0.getInitConflictBound());
      assertEquals(0.0, searchParams0.getVarDecay(), 0.01);
      assertEquals(0.0, searchParams0.getConflictBoundIncFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      searchParams0.toString();
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getClaDecay();
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(0.999, double0, 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      int int0 = searchParams0.getInitConflictBound();
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(100, int0);
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getConflictBoundIncFactor();
      assertEquals(1.5, double0, 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
      assertEquals(0.95, searchParams0.getVarDecay(), 0.01);
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams();
      double double0 = searchParams0.getVarDecay();
      assertEquals(0.95, double0, 0.01);
      assertEquals(1.5, searchParams0.getConflictBoundIncFactor(), 0.01);
      assertEquals(100, searchParams0.getInitConflictBound());
      assertEquals(0.999, searchParams0.getClaDecay(), 0.01);
  }
}