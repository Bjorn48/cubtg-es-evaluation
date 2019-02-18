/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:31:18 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ManyCore_ESTest extends ManyCore_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, dimacsStringSolver0).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      dimacsStringSolver0.addExactly(vecInt0, (-2030));
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(aSolverFactory0, stringArray0);
      int int0 = manyCore0.nConstraints();
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[5];
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(789);
      dimacsStringSolverArray0[0] = dimacsStringSolver0;
      dimacsStringSolverArray0[1] = dimacsStringSolverArray0[0];
      dimacsStringSolverArray0[2] = dimacsStringSolverArray0[0];
      dimacsStringSolverArray0[3] = dimacsStringSolverArray0[2];
      dimacsStringSolverArray0[4] = dimacsStringSolverArray0[0];
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(dimacsStringSolverArray0);
      boolean boolean0 = manyCore0.isSolverKeptHot();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, dimacsStringSolver0).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.printStat((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[3];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      statisticsSolverArray0[0] = statisticsSolver0;
      ManyCore<StatisticsSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<StatisticsSolver>(statisticsSolverArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[2];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(iSolver0).nVars();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      minimal4CardinalityModel0.setDecorated(minimal4CardinalityModel0);
      ManyCore<Minimal4CardinalityModel> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<Minimal4CardinalityModel>(minimal4CardinalityModelArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[4];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      statisticsSolverArray0[0] = statisticsSolver0;
      ManyCore<StatisticsSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<StatisticsSolver>(stringArray0, statisticsSolverArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[1];
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      statisticsSolverArray0[0] = statisticsSolver0;
      ManyCore<StatisticsSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<StatisticsSolver>(false, statisticsSolverArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ManyCore<NegationDecorator<SubModelIterator>> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<NegationDecorator<SubModelIterator>>(true, (NegationDecorator<SubModelIterator>[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(2306, 5, 932, 2306, 5).when(iSolver0).nVars();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      String[] stringArray0 = new String[0];
      minimal4CardinalityModel0.setDecorated(minimal4CardinalityModel0);
      ASolverFactory<ModelIterator> aSolverFactory0 = (ASolverFactory<ModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(minimal4CardinalityModel0, checkMUSSolutionListener0);
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[5];
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(true, stringArray0, modelIteratorToSATAdapterArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[3];
      ManyCore<MinOneDecorator> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<MinOneDecorator>(false, stringArray0, (MinOneDecorator[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[6];
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[1];
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      dimacsStringSolverArray0[0] = dimacsStringSolver0;
      ManyCore<DimacsStringSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<DimacsStringSolver>(false, stringArray0, dimacsStringSolverArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[1];
      ManyCore<Minimal4InclusionModel> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<Minimal4InclusionModel>(aSolverFactory0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[0];
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(stringArray0, dimacsOutputSolverArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(aSolverFactory0, stringArray0);
      manyCore0.provideUnitClauses((UnitPropagationListener) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>((ASolverFactory<Minimal4InclusionModel>) null, stringArray0);
      ASolverFactory<GroupClauseSelectorSolver<MaxSatDecorator>> aSolverFactory0 = (ASolverFactory<GroupClauseSelectorSolver<MaxSatDecorator>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<GroupClauseSelectorSolver<MaxSatDecorator>> basicLauncher0 = new BasicLauncher<GroupClauseSelectorSolver<MaxSatDecorator>>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      manyCore0.printInfos(printWriter0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, dimacsStringSolver0).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(aSolverFactory0, stringArray0);
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      manyCore0.printStat(printWriter0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<SubModelIterator> manyCore0 = new ManyCore<SubModelIterator>(aSolverFactory0, stringArray0);
      manyCore0.setKeepSolverHot(true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<DimacsOutputSolver> aSolverFactory0 = (ASolverFactory<DimacsOutputSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(aSolverFactory0, true, stringArray0);
      manyCore0.registerLiteral(5150);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      int int0 = manyCore0.nextFreeVarId(true);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(manyCore0, solutionFoundListener0);
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[9];
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[1] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[2] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[3] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[4] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[5] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[6] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[7] = modelIteratorToSATAdapter0;
      modelIteratorToSATAdapterArray0[8] = modelIteratorToSATAdapterArray0[5];
      ManyCore<ModelIteratorToSATAdapter> manyCore1 = new ManyCore<ModelIteratorToSATAdapter>(false, stringArray0, modelIteratorToSATAdapterArray0);
      manyCore1.setDBSimplificationAllowed(false);
      assertFalse(manyCore1.equals((Object)manyCore0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ASolverFactory<ManyCore<DimacsOutputSolver>> aSolverFactory0 = (ASolverFactory<ManyCore<DimacsOutputSolver>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ManyCore<DimacsOutputSolver>> manyCore0 = new ManyCore<ManyCore<DimacsOutputSolver>>(aSolverFactory0, stringArray0);
      manyCore0.printInfos((PrintWriter) null, "eQe7|V");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<StatisticsSolver> manyCore0 = new ManyCore<StatisticsSolver>((ASolverFactory<StatisticsSolver>) null, stringArray0);
      String string0 = manyCore0.toString((String) null);
      assertEquals("nullManyCore solver with 0 solvers running in parallel\n", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASolverFactory<ManyCore<DimacsOutputSolver>> aSolverFactory0 = (ASolverFactory<ManyCore<DimacsOutputSolver>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ManyCore<DimacsOutputSolver>> manyCore0 = new ManyCore<ManyCore<DimacsOutputSolver>>(aSolverFactory0, stringArray0);
      manyCore0.setTimeoutOnConflicts(3225);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      manyCore0.setTimeoutMs(5L);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      manyCore0.setExpectedNumberOfClauses(1161);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ASolverFactory<ManyCore<DimacsOutputSolver>> aSolverFactory0 = (ASolverFactory<ManyCore<DimacsOutputSolver>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ManyCore<DimacsOutputSolver>> manyCore0 = new ManyCore<ManyCore<DimacsOutputSolver>>(aSolverFactory0, stringArray0);
      manyCore0.reset();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(aSolverFactory0, stringArray0);
      manyCore0.printStat((PrintWriter) null, "OA`TjDmx!]B");
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>((ASolverFactory<Minimal4InclusionModel>) null, stringArray0);
      manyCore0.clearLearntClauses();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[3];
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[0];
      ManyCore<StatisticsSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<StatisticsSolver>(stringArray0, statisticsSolverArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[0];
      DimacsOutputSolver[] dimacsOutputSolverArray0 = new DimacsOutputSolver[1];
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      dimacsOutputSolverArray0[0] = dimacsOutputSolver0;
      ManyCore<DimacsOutputSolver> manyCore0 = new ManyCore<DimacsOutputSolver>(true, stringArray0, dimacsOutputSolverArray0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = (LexicoDecorator<SingleSolutionDetector>) mock(LexicoDecorator.class, new ViolatedAssumptionAnswer());
      ASolverFactory<LexicoDecorator<SingleSolutionDetector>> aSolverFactory0 = (ASolverFactory<LexicoDecorator<SingleSolutionDetector>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(lexicoDecorator0, (ISolver) null).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[8];
      stringArray0[0] = "MY^6) ";
      ManyCore<LexicoDecorator<SingleSolutionDetector>> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<LexicoDecorator<SingleSolutionDetector>>(aSolverFactory0, true, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.isSatisfiable(false);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.primeImplicant(3895);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.modelWithInternalVariables();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.model();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<ManyCore<DimacsOutputSolver>> aSolverFactory0 = (ASolverFactory<ManyCore<DimacsOutputSolver>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<ManyCore<DimacsOutputSolver>> manyCore0 = new ManyCore<ManyCore<DimacsOutputSolver>>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.primeImplicant();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[4];
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolverArray0[0] = dimacsStringSolver0;
      dimacsStringSolverArray0[1] = dimacsStringSolverArray0[0];
      dimacsStringSolverArray0[2] = dimacsStringSolverArray0[0];
      dimacsStringSolverArray0[3] = dimacsStringSolver0;
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(false, dimacsStringSolverArray0);
      Map<String, Number> map0 = manyCore0.getStat();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ASolverFactory<ManyCore<DimacsOutputSolver>> aSolverFactory0 = (ASolverFactory<ManyCore<DimacsOutputSolver>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ManyCore<DimacsOutputSolver>> manyCore0 = new ManyCore<ManyCore<DimacsOutputSolver>>(aSolverFactory0, stringArray0);
      List<ManyCore<DimacsOutputSolver>> list0 = manyCore0.getSolvers();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[0];
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(true, dimacsStringSolverArray0);
      // Undeclared exception!
      try { 
        manyCore0.getSearchListener();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ASolverFactory<SingleSolutionDetector> aSolverFactory0 = (ASolverFactory<SingleSolutionDetector>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<SingleSolutionDetector> manyCore0 = new ManyCore<SingleSolutionDetector>(aSolverFactory0, false, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.nVars();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>((ASolverFactory<Minimal4InclusionModel>) null, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.isVerbose();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.newVar();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, stringArray0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(manyCore0, 0L, solutionFoundListener0);
      ModelIteratorToSATAdapter[] modelIteratorToSATAdapterArray0 = new ModelIteratorToSATAdapter[8];
      modelIteratorToSATAdapterArray0[0] = modelIteratorToSATAdapter0;
      ManyCore<ModelIteratorToSATAdapter> manyCore1 = null;
      try {
        manyCore1 = new ManyCore<ModelIteratorToSATAdapter>(true, stringArray0, modelIteratorToSATAdapterArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Does not make sense in the parallel context
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<MinOneDecorator> manyCore0 = new ManyCore<MinOneDecorator>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.getTimeout();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String[] stringArray0 = new String[0];
      StatisticsSolver[] statisticsSolverArray0 = new StatisticsSolver[4];
      ManyCore<StatisticsSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<StatisticsSolver>(stringArray0, statisticsSolverArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>(aSolverFactory0, stringArray0);
      try { 
        manyCore0.isSatisfiable();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.model((-4176));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ASolverFactory<ModelIteratorToSATAdapter> aSolverFactory0 = (ASolverFactory<ModelIteratorToSATAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      ManyCore<ModelIteratorToSATAdapter> manyCore0 = new ManyCore<ModelIteratorToSATAdapter>(aSolverFactory0, true, stringArray0);
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      NegationDecorator<MaxSatDecorator> negationDecorator0 = new NegationDecorator<MaxSatDecorator>((MaxSatDecorator) null);
      FullClauseSelectorSolver<NegationDecorator<MaxSatDecorator>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<NegationDecorator<MaxSatDecorator>>(negationDecorator0, true);
      IVecInt iVecInt0 = fullClauseSelectorSolver0.getLastClause();
      Constr constr0 = mixedDataStructureDanielWL0.createUnregisteredCardinalityConstraint(iVecInt0, 414);
      // Undeclared exception!
      try { 
        manyCore0.addConstr(constr0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet in ManyCore: cannot add a specific constraint to each solver
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ManyCore<DimacsOutputSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<DimacsOutputSolver>((DimacsOutputSolver[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).createSolverByName(anyString());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "";
      ManyCore<DimacsStringSolver> manyCore0 = null;
      try {
        manyCore0 = new ManyCore<DimacsStringSolver>(aSolverFactory0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<StatisticsSolver> manyCore0 = new ManyCore<StatisticsSolver>((ASolverFactory<StatisticsSolver>) null, stringArray0);
      manyCore0.learnUnit((-269));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<SolutionCounter> manyCore0 = new ManyCore<SolutionCounter>(aSolverFactory0, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.createBlockingClauseForCurrentModel();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ASolverFactory<NegationDecorator<Minimal4CardinalityModel>> aSolverFactory0 = (ASolverFactory<NegationDecorator<Minimal4CardinalityModel>>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      ManyCore<NegationDecorator<Minimal4CardinalityModel>> manyCore0 = new ManyCore<NegationDecorator<Minimal4CardinalityModel>>(aSolverFactory0, stringArray0);
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        manyCore0.findModel((IVecInt) vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ManyCore<Minimal4InclusionModel> manyCore0 = new ManyCore<Minimal4InclusionModel>((ASolverFactory<Minimal4InclusionModel>) null, stringArray0);
      // Undeclared exception!
      try { 
        manyCore0.getLogPrefix();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
