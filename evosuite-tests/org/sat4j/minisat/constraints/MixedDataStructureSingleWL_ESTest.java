/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:36:12 GMT 2019
 */

package org.sat4j.minisat.constraints;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.MUSLauncher;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MixedDataStructureSingleWL_ESTest extends MixedDataStructureSingleWL_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(646, 646);
      mixedDataStructureSingleWL0.createUnregisteredClause(vecInt0);
      Constr constr0 = mixedDataStructureSingleWL0.createUnregisteredClause(vecInt0);
      assertTrue(constr0.learnt());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(646, 646);
      Constr constr0 = mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(vecInt0, 65535);
      assertEquals(65535, constr0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      ILits iLits0 = mixedDataStructureSingleWL0.createLits();
      assertEquals(0, iLits0.nVars());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      Constr constr0 = mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 0);
      assertFalse(constr0.simplify());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt(21);
      vecInt0.shrink(48);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause(vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint(iVecInt0, (-1281));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cards with degree 1 are clauses!!!!
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      IVecInt iVecInt0 = VecInt.EMPTY;
      try { 
        mixedDataStructureSingleWL0.createClause(iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(4336, 9);
      // Undeclared exception!
      mixedDataStructureSingleWL0.createClause(vecInt0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(9, 9);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(646, 646);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(646);
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 646);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1741, 1);
      // Undeclared exception!
      mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, (-1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(724, (-3257));
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint(vecInt0, 724);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1, 1);
      vecInt0.insertFirst(48);
      IVecInt iVecInt0 = vecInt0.push(9);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      ActiveLearning<MixedDataStructureDanielHT> activeLearning0 = new ActiveLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      PureOrder pureOrder0 = new PureOrder();
      SearchParams searchParams0 = new SearchParams();
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(activeLearning0, mixedDataStructureDanielHT0, searchParams0, pureOrder0, miniSATRestarts0, mUSLauncher0);
      mixedDataStructureSingleWL0.solver = (UnitPropagationListener) solver0;
      VecInt vecInt0 = new VecInt(1, 1);
      Constr constr0 = mixedDataStructureSingleWL0.createClause(vecInt0);
      assertTrue(constr0.isSatisfied());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1, 1);
      IVecInt iVecInt0 = vecInt0.push(0);
      Constr constr0 = mixedDataStructureSingleWL0.createClause(iVecInt0);
      assertNull(constr0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      VecInt vecInt0 = new VecInt(1, 1);
      IVecInt iVecInt0 = vecInt0.push(2);
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createClause(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createUnregisteredCardinalityConstraint((IVecInt) null, 2139);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      // Undeclared exception!
      try { 
        mixedDataStructureSingleWL0.createCardinalityConstraint((IVecInt) null, (-2705));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }
}
