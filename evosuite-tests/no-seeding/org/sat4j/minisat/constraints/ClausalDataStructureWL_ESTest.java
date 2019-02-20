/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:36:52 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClausalDataStructureWL_ESTest extends ClausalDataStructureWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = clausalDataStructureWL0.createUnregisteredClause(vecInt0);
      assertEquals(0, constr0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      ILits iLits0 = clausalDataStructureWL0.createLits();
      assertEquals(0, iLits0.realnVars());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      int[] intArray0 = new int[2];
      VecInt vecInt0 = new VecInt(intArray0);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt();
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(2373, 0);
      // Undeclared exception!
      clausalDataStructureWL0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt(intArray0);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      VecInt vecInt0 = new VecInt(2149, 2149);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      int[] intArray0 = new int[3];
      intArray0[0] = 154;
      intArray0[1] = 110;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      ActiveLearning<CardinalityDataStructureYanMax> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(activeLearning0, cardinalityDataStructureYanMax0, varOrderHeap0, arminRestarts0);
      clausalDataStructureWL0.solver = (UnitPropagationListener) solver0;
      int[] intArray0 = new int[4];
      VecInt vecInt0 = new VecInt(intArray0);
      Constr constr0 = clausalDataStructureWL0.createClause(vecInt0);
      assertFalse(constr0.learnt());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      int[] intArray0 = new int[3];
      intArray0[1] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      Constr constr0 = clausalDataStructureWL0.createClause(vecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      int[] intArray0 = new int[3];
      intArray0[0] = 120;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createClause(vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      // Undeclared exception!
      try { 
        clausalDataStructureWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }
}