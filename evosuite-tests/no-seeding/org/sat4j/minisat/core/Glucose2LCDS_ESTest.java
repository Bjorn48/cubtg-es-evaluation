/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:33:44 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.constraints.xor.Xor;
import org.sat4j.minisat.core.Glucose2LCDS;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.Glucose21Restarts;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Glucose2LCDS_ESTest extends Glucose2LCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      UnitClause unitClause0 = new UnitClause(49);
      unitClause0.setActivity(2.0);
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>((Solver<CardinalityDataStructure>) null, glucose21Restarts0);
      glucose2LCDS0.onPropagation(unitClause0);
      assertEquals(1, unitClause0.requiredNumberOfSatisfiedLiterals());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>((Solver<CardinalityDataStructure>) null, glucose21Restarts0);
      VecInt vecInt0 = new VecInt();
      Xor xor0 = new Xor(vecInt0, true, (ILits) null);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation(xor0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.minisat.constraints.xor.Xor", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      UnitClause unitClause0 = new UnitClause(49);
      unitClause0.setActivity(49);
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>((Solver<CardinalityDataStructure>) null, glucose21Restarts0);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation(unitClause0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.Glucose2LCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      UnitClause unitClause0 = new UnitClause(49);
      unitClause0.setActivity(49);
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, tabuListDecorator0, glucose21Restarts0);
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>(solver0, glucose21Restarts0);
      glucose2LCDS0.onPropagation(unitClause0);
      assertEquals(1.0, unitClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      UnitClause unitClause0 = new UnitClause(49);
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, tabuListDecorator0, glucose21Restarts0);
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>(solver0, glucose21Restarts0);
      glucose2LCDS0.onPropagation(unitClause0);
      assertEquals(0.0, unitClause0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>((Solver<CardinalityDataStructure>) null, glucose21Restarts0);
      String string0 = glucose2LCDS0.toString();
      assertEquals("Glucose 2 learned constraints deletion strategy (LBD updated on propagation) with timer Glucose 2.1 dynamic restart strategy", string0);
  }
}