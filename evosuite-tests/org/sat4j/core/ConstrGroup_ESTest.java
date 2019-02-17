/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:02:41 GMT 2019
 */

package org.sat4j.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ConstrGroup;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.VarMapper;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrGroup_ESTest extends ConstrGroup_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      constrGroup0.add((IConstr) null);
      StatisticsSolver statisticsSolver0 = mock(StatisticsSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(statisticsSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      constrGroup0.add((IConstr) null);
      constrGroup0.removeFrom(statisticsSolver0);
      assertEquals(2, constrGroup0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      constrGroup0.add((IConstr) null);
      int int0 = constrGroup0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      IVecInt iVecInt0 = mock(IVecInt.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(iVecInt0).size();
      Constr constr0 = mixedDataStructureDanielWL0.createUnregisteredClause(iVecInt0);
      constrGroup0.add(constr0);
      boolean boolean0 = constrGroup0.learnt();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      UnitClause unitClause0 = new UnitClause((-2918));
      constrGroup0.add(unitClause0);
      IConstr iConstr0 = constrGroup0.getConstr(0);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(true);
      constrGroup0.add(constrGroup0);
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(statisticsSolver0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      VecInt vecInt0 = new VecInt(0, 264);
      Constr constr0 = mixedDataStructureDanielWLConciseBinary0.createCardinalityConstraint(vecInt0, (-1));
      constrGroup0.add(constr0);
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom((ISolver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      Constr constr0 = Constr.TAUTOLOGY;
      constrGroup0.add(constr0);
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[0];
      ManyCore<StatisticsSolver> manyCore0 = new ManyCore<StatisticsSolver>(true, statisticsSolverArray0);
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(manyCore0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Can only remove a group of constraints!
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      constrGroup0.add(constrGroup0);
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(iSolver0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.core.ConstrGroup cannot be cast to org.sat4j.specs.Constr
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      UnitClause unitClause0 = new UnitClause((-2918));
      constrGroup0.add(unitClause0);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      // Undeclared exception!
      try { 
        constrGroup0.removeFrom(iSolver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2918
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      constrGroup0.add((IConstr) null);
      // Undeclared exception!
      try { 
        constrGroup0.learnt();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.getConstr((-2119));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      boolean boolean0 = constrGroup0.learnt();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.add((IConstr) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      int int0 = constrGroup0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      constrGroup0.clear();
      assertEquals(0.0, constrGroup0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.get((-1));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      boolean boolean0 = constrGroup0.canBePropagatedMultipleTimes();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup(false);
      String string0 = constrGroup0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      IConstr iConstr0 = constrGroup0.getConstr(0);
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      // Undeclared exception!
      try { 
        constrGroup0.toString((VarMapper) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConstrGroup constrGroup0 = new ConstrGroup();
      double double0 = constrGroup0.getActivity();
      assertEquals(0.0, double0, 0.01);
  }
}