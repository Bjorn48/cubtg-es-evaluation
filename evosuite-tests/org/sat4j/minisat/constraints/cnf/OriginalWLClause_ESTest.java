/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:05:51 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.constraints.cnf.OriginalWLClause;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.MandatoryLiteralListener;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OriginalWLClause_ESTest extends OriginalWLClause_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VecInt vecInt0 = new VecInt(3783, 3783);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, true).when(iLits0).isSatisfied(anyInt());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(vecInt0, iLits0);
      boolean boolean0 = originalWLClause0.propagatePI((MandatoryLiteralListener) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt(3783, 3783);
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(vecInt0, iLits0);
      originalWLClause0.register();
      assertFalse(originalWLClause0.locked());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(3783).when(iVecInt0).size();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iLits0).isFalsified(anyInt());
      doReturn(false).when(iLits0).isSatisfied(anyInt());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      ActiveLearning<CardinalityDataStructureYanMax> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMax>(3823.465004704003);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(activeLearning0, cardinalityDataStructureYanMax0, subsetVarOrder0, noRestarts0);
      boolean boolean0 = originalWLClause0.propagate(solver0, 46);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(iLits0).valueToString(anyInt());
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(1892).when(iVecInt0).size();
      OriginalWLClause originalWLClause0 = OriginalWLClause.brandNewClause(unitPropagationListener0, iLits0, iVecInt0);
      assertEquals(1892, originalWLClause0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(iLits0).valueToString(anyInt());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(3783).when(iVecInt0).size();
      OriginalWLClause originalWLClause0 = OriginalWLClause.brandNewClause(unitPropagationListener0, iLits0, iVecInt0);
      assertEquals(1, originalWLClause0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(1875).when(iVecInt0).size();
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, lits0);
      // Undeclared exception!
      try { 
        originalWLClause0.register();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lits lits0 = new Lits();
      VecInt vecInt0 = new VecInt(1875, 1875);
      OriginalWLClause originalWLClause0 = new OriginalWLClause(vecInt0, lits0);
      // Undeclared exception!
      try { 
        originalWLClause0.register();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1874
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        originalWLClause0.propagatePI((MandatoryLiteralListener) null, 32);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.OriginalWLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      Lits lits0 = new Lits();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      // Undeclared exception!
      try { 
        OriginalWLClause.brandNewClause(unitPropagationListener0, lits0, readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(1892).when(iVecInt0).size();
      // Undeclared exception!
      try { 
        OriginalWLClause.brandNewClause(unitPropagationListener0, (ILits) null, iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.OriginalWLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo((-497));
      // Undeclared exception!
      try { 
        OriginalWLClause.brandNewClause((UnitPropagationListener) null, (ILits) null, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      OriginalWLClause originalWLClause0 = null;
      try {
        originalWLClause0 = new OriginalWLClause(readOnlyVecInt0, iLits0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OriginalWLClause originalWLClause0 = null;
      try {
        originalWLClause0 = new OriginalWLClause((IVecInt) null, (ILits) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn((-2240)).when(iVecInt0).size();
      OriginalWLClause originalWLClause0 = null;
      try {
        originalWLClause0 = new OriginalWLClause(iVecInt0, lits0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        originalWLClause0.register();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(iLits0).isSatisfied(anyInt());
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(1892).when(iVecInt0).size();
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      // Undeclared exception!
      try { 
        originalWLClause0.propagatePI((MandatoryLiteralListener) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.OriginalWLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(3783).when(iVecInt0).size();
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iLits0).isSatisfied(anyInt());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      boolean boolean0 = originalWLClause0.propagatePI((MandatoryLiteralListener) null, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      originalWLClause0.setLearnt();
      assertEquals(1, originalWLClause0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      originalWLClause0.forwardActivity(3783);
      assertEquals(3783.0, originalWLClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, iLits0);
      originalWLClause0.incActivity(3783);
      assertFalse(originalWLClause0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      OriginalWLClause originalWLClause0 = new OriginalWLClause(vecInt0, (ILits) null);
      // Undeclared exception!
      try { 
        originalWLClause0.propagate((UnitPropagationListener) null, 362);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      UnitPropagationListener unitPropagationListener0 = mock(UnitPropagationListener.class, new ViolatedAssumptionAnswer());
      ILits iLits0 = mock(ILits.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        OriginalWLClause.brandNewClause(unitPropagationListener0, iLits0, iVecInt0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      OriginalWLClause originalWLClause0 = new OriginalWLClause(iVecInt0, (ILits) null);
      boolean boolean0 = originalWLClause0.learnt();
      assertFalse(boolean0);
  }
}