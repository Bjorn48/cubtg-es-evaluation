/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:30:27 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LexicoDecorator_ESTest extends LexicoDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn("cyh}kbgABMzo4(7}").when(manyCore0).getLogPrefix();
      doReturn(false, true).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(true).when(manyCore0).isVerbose();
      doReturn(0, 0).when(manyCore0).nVars();
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      VecInt vecInt0 = new VecInt(2184, 0);
      int[] intArray0 = new int[8];
      lexicoDecorator0.prevfullmodel = intArray0;
      lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0, vecInt0, checkMUSSolutionListener0);
      LexicoDecorator<Minimal4CardinalityModel> lexicoDecorator1 = new LexicoDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      // Undeclared exception!
      try { 
        lexicoDecorator1.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Minimal4CardinalityModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<SolutionCounter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      boolean boolean0 = lexicoDecorator0.manageUnsatCase();
      assertFalse(boolean0);
      assertFalse(lexicoDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<SolutionCounter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(fullClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      boolean boolean0 = lexicoDecorator0.admitABetterSolution();
      assertFalse(lexicoDecorator0.isOptimal());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LexicoDecorator<ModelIterator> lexicoDecorator0 = new LexicoDecorator<ModelIterator>((ModelIterator) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate(1057);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LexicoDecorator<ModelIterator> lexicoDecorator0 = new LexicoDecorator<ModelIterator>((ModelIterator) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>((DimacsOutputSolver) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discardSolutionsForOptimizing();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      String[] stringArray0 = new String[0];
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>((ASolverFactory<DimacsStringSolver>) null, false, stringArray0);
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      try { 
        lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      VecInt vecInt0 = new VecInt(2184, 21);
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0, vecInt0, checkMUSSolutionListener0);
      LexicoDecorator<Minimal4CardinalityModel> lexicoDecorator1 = new LexicoDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      minimal4CardinalityModel0.setDecorated(lexicoDecorator1);
      // Undeclared exception!
      try { 
        lexicoDecorator1.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((-4527)).when(manyCore0).nVars();
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      VecInt vecInt0 = new VecInt(2184, 0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((int[]) null).when(manyCore0).model();
      doReturn(false).when(manyCore0).model(anyInt());
      doReturn((int[]) null).when(manyCore0).modelWithInternalVariables();
      doReturn(1, 50, 0).when(manyCore0).nVars();
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      int int0 = 0;
      VecInt vecInt0 = new VecInt(2184, 0);
      IVecInt iVecInt0 = vecInt0.pop();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      int[] intArray0 = new int[8];
      intArray0[0] = (-707);
      intArray0[1] = 2184;
      intArray0[2] = 0;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = 0;
      intArray0[6] = (-1379);
      intArray0[7] = 2184;
      lexicoDecorator0.prevfullmodel = intArray0;
      readOnlyVecInt0.last();
      IVecInt iVecInt1 = vecInt0.pop();
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution(iVecInt1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, false);
      LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>> lexicoDecorator0 = new LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>>(fullClauseSelectorSolver0);
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<DimacsOutputSolver>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(fullClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((-881)).when(fullClauseSelectorSolver0).nVars();
      LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>> lexicoDecorator0 = new LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>>(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[0];
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<DimacsOutputSolver>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(fullClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((int[]) null).when(fullClauseSelectorSolver0).model();
      doReturn(false).when(fullClauseSelectorSolver0).model(anyInt());
      doReturn((int[]) null).when(fullClauseSelectorSolver0).modelWithInternalVariables();
      doReturn(320, 331, 0).when(fullClauseSelectorSolver0).nVars();
      LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>> lexicoDecorator0 = new LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>>(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      ModelIterator modelIterator0 = new ModelIterator(iSolver0);
      NegationDecorator<ModelIterator> negationDecorator0 = new NegationDecorator<ModelIterator>(modelIterator0);
      LexicoDecorator<NegationDecorator<ModelIterator>> lexicoDecorator0 = new LexicoDecorator<NegationDecorator<ModelIterator>>(negationDecorator0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discardCurrentSolution();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsStringSolver0);
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = new LexicoDecorator<SingleSolutionDetector>(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.model(1044);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>((MinOneDecorator) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.calculateObjective();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      int int0 = lexicoDecorator0.numberOfCriteria();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(false).when(manyCore0).isVerbose();
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      VecInt vecInt0 = new VecInt(2184, 0);
      int[] intArray0 = new int[8];
      lexicoDecorator0.prevfullmodel = intArray0;
      lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(lexicoDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      Number number0 = lexicoDecorator0.getObjectiveValue();
      assertEquals((-1), number0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      int[] intArray0 = lexicoDecorator0.modelWithInternalVariables();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.fixCriterionValue();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<SolutionCounter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(lexicoDecorator0, false);
      LexicoDecorator<MaxSatDecorator> lexicoDecorator1 = new LexicoDecorator<MaxSatDecorator>(maxSatDecorator0);
      boolean boolean0 = lexicoDecorator1.nonOptimalMeansSatisfiable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ManyCore<DimacsStringSolver> manyCore0 = (ManyCore<DimacsStringSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(1714, 343).when(manyCore0).nVars();
      LexicoDecorator<ManyCore<DimacsStringSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<DimacsStringSolver>>(manyCore0);
      VecInt vecInt0 = new VecInt(2184, 0);
      lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(lexicoDecorator0);
      LexicoDecorator<MinOneDecorator> lexicoDecorator1 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      // Undeclared exception!
      try { 
        lexicoDecorator1.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LexicoDecorator<LexicoDecorator<ModelIteratorToSATAdapter>> lexicoDecorator0 = new LexicoDecorator<LexicoDecorator<ModelIteratorToSATAdapter>>((LexicoDecorator<ModelIteratorToSATAdapter>) null);
      int[] intArray0 = lexicoDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ManyCore<StatisticsSolver> manyCore0 = (ManyCore<StatisticsSolver>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<ManyCore<StatisticsSolver>> lexicoDecorator0 = new LexicoDecorator<ManyCore<StatisticsSolver>>(manyCore0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.setTimeoutForFindingBetterSolution(446);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No implemented yet
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<SolutionCounter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(fullClauseSelectorSolver0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator(singleSolutionDetector0);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      boolean boolean0 = lexicoDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.forceObjectiveValueTo(7);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      boolean boolean0 = lexicoDecorator0.hasNoObjectiveFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LexicoDecorator<ModelIterator> lexicoDecorator0 = new LexicoDecorator<ModelIterator>((ModelIterator) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.getObjectiveValue(1270);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      FullClauseSelectorSolver<SolutionCounter> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<SolutionCounter>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      LexicoDecorator<FullClauseSelectorSolver<SolutionCounter>> lexicoDecorator0 = new LexicoDecorator<FullClauseSelectorSolver<SolutionCounter>>(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
