/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 07:57:41 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.specs.Constr;
import org.sat4j.specs.FakeConstr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.Lbool;
import org.sat4j.tools.RupSearchListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RupSearchListener_ESTest extends RupSearchListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("");
      NoLearningButHeuristics<MixedDataStructureDanielWLConciseBinary> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(noLearningButHeuristics0, mixedDataStructureDanielWLConciseBinary0, naturalStaticOrder0, (RestartStrategy) null);
      rupSearchListener0.init(solver0);
      rupSearchListener0.learnUnit(110);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("org.sat4j.tools.RupSearchListener");
      rupSearchListener0.init((Solver<MixedDataStructureDanielWLConciseBinary>) null);
      Lbool lbool0 = Lbool.FALSE;
      rupSearchListener0.end(lbool0);
      assertEquals("F", lbool0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("6O)");
      Constr constr0 = Constr.TAUTOLOGY;
      MiniSATLearning<MixedDataStructureDanielWLConciseBinary> miniSATLearning0 = new MiniSATLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(miniSATLearning0, mixedDataStructureDanielWLConciseBinary0, naturalStaticOrder0, (RestartStrategy) null);
      rupSearchListener0.init(solver0);
      rupSearchListener0.delete(constr0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>(" if the memory bound ");
      Constr constr0 = Constr.TAUTOLOGY;
      // Undeclared exception!
      try { 
        rupSearchListener0.learn(constr0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.RupSearchListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = null;
      try {
        rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("");
      NoLearningButHeuristics<MixedDataStructureDanielWLConciseBinary> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(noLearningButHeuristics0, mixedDataStructureDanielWLConciseBinary0, naturalStaticOrder0, (RestartStrategy) null);
      rupSearchListener0.init(solver0);
      Lbool lbool0 = Lbool.UNDEFINED;
      rupSearchListener0.end(lbool0);
      rupSearchListener0.end(lbool0);
      assertEquals("U", lbool0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("org.sat4j.tools.RupSearchListener");
      Lbool lbool0 = Lbool.FALSE;
      // Undeclared exception!
      try { 
        rupSearchListener0.end(lbool0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.RupSearchListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("org.sat4j.specs.Constr$1");
      // Undeclared exception!
      try { 
        rupSearchListener0.learnUnit(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.RupSearchListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>(" if the mmory lound");
      PercentLengthLearning<MixedDataStructureDanielWLConciseBinary> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureDanielWLConciseBinary>((-2381));
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(percentLengthLearning0, mixedDataStructureDanielWLConciseBinary0, naturalStaticOrder0, (RestartStrategy) null);
      rupSearchListener0.init(solver0);
      UnitClause unitClause0 = new UnitClause((-9));
      rupSearchListener0.learn(unitClause0);
      assertFalse(unitClause0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>("6O)");
      Constr constr0 = Constr.TAUTOLOGY;
      // Undeclared exception!
      try { 
        rupSearchListener0.delete(constr0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.RupSearchListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>> rupSearchListener0 = new RupSearchListener<Solver<MixedDataStructureDanielWLConciseBinary>>(" if the memory bound ");
      IConstr iConstr0 = FakeConstr.instance();
      // Undeclared exception!
      try { 
        rupSearchListener0.learn(iConstr0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Fake IConstr
         //
         verifyException("org.sat4j.specs.FakeConstr", e);
      }
  }
}