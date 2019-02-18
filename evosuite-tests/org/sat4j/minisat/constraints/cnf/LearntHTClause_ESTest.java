/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 21:57:54 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.LearntHTClause;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.WatcherBasedPrimeImplicantStrategy;
import org.sat4j.specs.IVecInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LearntHTClause_ESTest extends LearntHTClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt(346, 0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      learntHTClause0.incActivity(0.8968678755167269);
      assertEquals(0.8968678755167269, learntHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      lits0.getFromPool(0);
      IVecInt iVecInt0 = vecInt0.push(43);
      LearntHTClause learntHTClause0 = new LearntHTClause(iVecInt0, lits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      lits0.getFromPool(0);
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      learntHTClause0.register();
      assertFalse(learntHTClause0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-2599);
      VecInt vecInt0 = new VecInt(intArray0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, iLits0);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2600
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(iVecInt0, (ILits) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.EmptyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause((IVecInt) null, lits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(vecInt0, lits0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.HTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = null;
      try {
        learntHTClause0 = new LearntHTClause(vecInt0, lits0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      VecInt vecInt0 = new VecInt(intArray0);
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        learntHTClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.LearntHTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt(30, 30);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      learntHTClause0.forwardActivity((-585.7493191112603));
      assertFalse(learntHTClause0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, iLits0);
      learntHTClause0.setLearnt();
      assertFalse(learntHTClause0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt(139, 139);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      WatcherBasedPrimeImplicantStrategy watcherBasedPrimeImplicantStrategy0 = new WatcherBasedPrimeImplicantStrategy();
      // Undeclared exception!
      try { 
        learntHTClause0.propagatePI(watcherBasedPrimeImplicantStrategy0, 139);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.cnf.LearntHTClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt(30, 30);
      Lits lits0 = new Lits();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, lits0);
      learntHTClause0.setActivity((-2777.0));
      assertEquals((-2777.0), learntHTClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      LearntHTClause learntHTClause0 = new LearntHTClause(vecInt0, iLits0);
      boolean boolean0 = learntHTClause0.learnt();
      assertTrue(boolean0);
  }
}
