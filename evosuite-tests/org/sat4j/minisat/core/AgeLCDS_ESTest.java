/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:31:18 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.card.AtLeast;
import org.sat4j.minisat.constraints.cnf.LearntBinaryClause;
import org.sat4j.minisat.core.AgeLCDS;
import org.sat4j.minisat.core.ConflictTimer;
import org.sat4j.minisat.core.ConflictTimerContainer;
import org.sat4j.minisat.core.DataStructureFactory;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.LBDConflictTimer;
import org.sat4j.minisat.core.RestartStrategy;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IVec;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AgeLCDS_ESTest extends AgeLCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Solver<CardinalityDataStructure> solver0 = (Solver<CardinalityDataStructure>) mock(Solver.class, new ViolatedAssumptionAnswer());
      LBDConflictTimer lBDConflictTimer0 = new LBDConflictTimer(solver0, 0);
      AgeLCDS ageLCDS0 = new AgeLCDS((Solver<? extends DataStructureFactory>) null, lBDConflictTimer0);
      ConflictTimer conflictTimer0 = ageLCDS0.getTimer();
      assertSame(lBDConflictTimer0, conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      AgeLCDS ageLCDS0 = new AgeLCDS((Solver<? extends DataStructureFactory>) null, fixedPeriodRestarts0);
      Vec<Constr> vec0 = new Vec<Constr>();
      // Undeclared exception!
      try { 
        ageLCDS0.reduce(vec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.AgeLCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>((-735));
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(15);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(1459);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, lubyRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, lubyRestarts0);
      solver0.verbose = true;
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>((-916));
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      Solver<CardinalityDataStructureYanMin> solver1 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, searchParams0, tabuListDecorator0, lubyRestarts0);
      IVec<Constr> iVec0 = solver1.learnts;
      ageLCDS0.reduce(iVec0);
      assertEquals(0, iVec0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>((-735));
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(15);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(1459);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, lubyRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, lubyRestarts0);
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>((-916));
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      Solver<CardinalityDataStructureYanMin> solver1 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, searchParams0, tabuListDecorator0, lubyRestarts0);
      solver0.backtrack(intArray0);
      IVec<Constr> iVec0 = solver1.learnts;
      ageLCDS0.reduce(iVec0);
      assertEquals(0, iVec0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>((-735));
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(15);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(1459);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, lubyRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, lubyRestarts0);
      PercentLengthLearning<CardinalityDataStructureYanMin> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMin>((-916));
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      Solver<CardinalityDataStructureYanMin> solver1 = new Solver<CardinalityDataStructureYanMin>(percentLengthLearning0, cardinalityDataStructureYanMin0, searchParams0, tabuListDecorator0, lubyRestarts0);
      solver0.backtrack(intArray0);
      IVec<Constr> iVec0 = solver1.learnts;
      solver0.backtrack(intArray0);
      // Undeclared exception!
      try { 
        ageLCDS0.reduce(iVec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.constraints.cnf.WLClause", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NoLearningButHeuristics<MixedDataStructureDanielHT> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams(0.0, 1.0, 1.0, 20);
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      NoLearningNoHeuristics<CardinalityDataStructureYanMin> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(noLearningNoHeuristics0, cardinalityDataStructureYanMin0, searchParams0, naturalStaticOrder0, (RestartStrategy) null);
      ILogAble iLogAble0 = solver0.getLogger();
      Solver<MixedDataStructureDanielHT> solver1 = new Solver<MixedDataStructureDanielHT>(noLearningButHeuristics0, mixedDataStructureDanielHT0, searchParams0, naturalStaticOrder0, (RestartStrategy) null, iLogAble0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver1, (ConflictTimer) null);
      ConflictTimer conflictTimer0 = ageLCDS0.getTimer();
      assertNull(conflictTimer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClauseOnlyLearning<MixedDataStructureDanielHT> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielHT>();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      SearchParams searchParams0 = new SearchParams();
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      ArminRestarts arminRestarts0 = new ArminRestarts();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(clauseOnlyLearning0, mixedDataStructureDanielHT0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, arminRestarts0);
      VecInt vecInt0 = new VecInt();
      LearntBinaryClause learntBinaryClause0 = new LearntBinaryClause(vecInt0, (ILits) null);
      ageLCDS0.onPropagation(learntBinaryClause0);
      assertTrue(learntBinaryClause0.canBeSatisfiedByCountingLiterals());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>((-735));
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(15);
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(1459);
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, lubyRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, lubyRestarts0);
      ageLCDS0.init();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ConflictTimerContainer conflictTimerContainer0 = new ConflictTimerContainer();
      AgeLCDS ageLCDS0 = new AgeLCDS((Solver<? extends DataStructureFactory>) null, conflictTimerContainer0);
      Constr constr0 = Constr.TAUTOLOGY;
      ageLCDS0.onClauseLearning(constr0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>((-735));
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams((-735));
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, lubyRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, lubyRestarts0);
      String string0 = ageLCDS0.toString();
      assertEquals("Age based learned constraints deletion strategy with timer luby style (SATZ_rand, TiniSAT) restarts strategy with factor 32", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FixedLengthLearning<CardinalityDataStructureYanMin> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMin>(1843);
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      int[] intArray0 = new int[0];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(fixedLengthLearning0, cardinalityDataStructureYanMin0, tabuListDecorator0, fixedPeriodRestarts0);
      AgeLCDS ageLCDS0 = new AgeLCDS(solver0, fixedPeriodRestarts0);
      VecInt vecInt0 = (VecInt)solver0.decisions;
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      AtLeast atLeast0 = new AtLeast(iLits0, vecInt0, 0);
      ageLCDS0.onConflictAnalysis(atLeast0);
      assertFalse(atLeast0.simplify());
  }
}
