/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:27:48 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractClauseSelectorSolver;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.AllMUSes;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.SubModelIterator;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AllMUSes_ESTest extends AllMUSes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      AllMUSes allMUSes0 = new AllMUSes(true, lightFactory0);
      List<IVecInt> list0 = allMUSes0.computeAllMUSes();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes((AbstractClauseSelectorSolver<? extends ISolver>) null, aSolverFactory0);
      SingleSolutionDetector singleSolutionDetector0 = allMUSes0.getSolverInstance();
      assertNull(singleSolutionDetector0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0, minimal4CardinalityModel0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      allMUSes0.computeAllMUSesOrdered(solutionFoundListener0);
      List<IVecInt> list0 = allMUSes0.getMssList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0).when(iSolver0).nVars();
      doReturn(false, false, false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0, solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener((ASolverFactory<? extends ISolver>) null);
      List<IVecInt> list0 = allMUSes0.computeAllMUSes((SolutionFoundListener) checkMUSSolutionListener0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      int[] intArray0 = new int[1];
      intArray0[0] = 0;
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.ensure(0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes((IVecInt) vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dimacsStringSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(dimacsStringSolver0).isVerbose();
      doReturn(0, 0, 0).when(dimacsStringSolver0).nVars();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(negationDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(singleSolutionDetector0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      List<IVecInt> list0 = allMUSes0.computeAllMSSOrdered((IVecInt) null, solutionFoundListener0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      NegationDecorator<DimacsStringSolver> negationDecorator0 = new NegationDecorator<DimacsStringSolver>(dimacsStringSolver0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes(negationDecorator0, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      List<IVecInt> list0 = allMUSes0.computeAllMSS(solutionFoundListener0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0).when(iSolver0).nVars();
      doReturn(false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      List<IVecInt> list0 = allMUSes0.computeAllMSS((IVecInt) null, solutionFoundListener0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      VecInt vecInt0 = new VecInt();
      List<IVecInt> list0 = allMUSes0.computeAllMSS((IVecInt) vecInt0, solutionFoundListener0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = new int[3];
      AbstractClauseSelectorSolver<Minimal4InclusionModel> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<Minimal4InclusionModel>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, linkedList0, linkedList0).when(abstractClauseSelectorSolver0).getAddedVars();
      doReturn(false, true, false, false).when(abstractClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((IConstr) null, (IConstr) null).when(abstractClauseSelectorSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, false, false).when(abstractClauseSelectorSolver0).isVerbose();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).model();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).modelWithInternalVariables();
      doReturn((-2474), (-2474)).when(abstractClauseSelectorSolver0).nVars();
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, aSolverFactory0);
      List<IVecInt> list0 = allMUSes0.computeAllMSS();
      VecInt vecInt0 = new VecInt();
      List<IVecInt> list1 = allMUSes0.computeAllMSS((IVecInt) vecInt0);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = new int[3];
      AbstractClauseSelectorSolver<Minimal4InclusionModel> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<Minimal4InclusionModel>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, linkedList0, linkedList0).when(abstractClauseSelectorSolver0).getAddedVars();
      doReturn(false, true, false, false).when(abstractClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((IConstr) null, (IConstr) null).when(abstractClauseSelectorSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, false, false).when(abstractClauseSelectorSolver0).isVerbose();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).model();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).modelWithInternalVariables();
      doReturn((-2474), (-2474)).when(abstractClauseSelectorSolver0).nVars();
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, aSolverFactory0);
      List<IVecInt> list0 = allMUSes0.computeAllMSS();
      List<IVecInt> list1 = allMUSes0.computeAllMSS();
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = new int[3];
      intArray0[0] = 2147483645;
      intArray0[1] = 2147483645;
      intArray0[2] = 2147483645;
      AbstractClauseSelectorSolver<SingleSolutionDetector> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<SingleSolutionDetector>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, linkedList0, linkedList0).when(abstractClauseSelectorSolver0).getAddedVars();
      doReturn(false, true, false, false).when(abstractClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((IConstr) null, (IConstr) null).when(abstractClauseSelectorSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn("L+a_0 X1N", "L+a_0 X1N", "L+a_0 X1N").when(abstractClauseSelectorSolver0).getLogPrefix();
      doReturn(true, true, true, false).when(abstractClauseSelectorSolver0).isVerbose();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).model();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).modelWithInternalVariables();
      doReturn(2147483645, 2147483645).when(abstractClauseSelectorSolver0).nVars();
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, (ASolverFactory<? extends ISolver>) null);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.clone();
      iVecInt0.copyTo((IVecInt) vecInt0);
      iVecInt0.size();
      iVecInt0.toArray();
      allMUSes0.computeAllMSS(iVecInt0);
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener((ASolverFactory<? extends ISolver>) null);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSesOrdered((SolutionFoundListener) checkMUSSolutionListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS((SolutionFoundListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int[] intArray0 = new int[3];
      intArray0[0] = 1;
      intArray0[1] = (-2474);
      intArray0[2] = (-1);
      AbstractClauseSelectorSolver<Minimal4InclusionModel> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<Minimal4InclusionModel>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, linkedList0, linkedList0, (Collection) null).when(abstractClauseSelectorSolver0).getAddedVars();
      doReturn(false, true, false, false).when(abstractClauseSelectorSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((IConstr) null, (IConstr) null).when(abstractClauseSelectorSolver0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false, false, false).when(abstractClauseSelectorSolver0).isVerbose();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).model();
      doReturn(intArray0).when(abstractClauseSelectorSolver0).modelWithInternalVariables();
      doReturn((-2474), (-2474)).when(abstractClauseSelectorSolver0).nVars();
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, aSolverFactory0);
      allMUSes0.computeAllMSS();
      allMUSes0.reset();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.clone();
      iVecInt0.copyTo((IVecInt) vecInt0);
      iVecInt0.size();
      iVecInt0.toArray();
      allMUSes0.computeAllMSS(iVecInt0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[1];
      DimacsStringSolver[] dimacsStringSolverArray0 = new DimacsStringSolver[1];
      DimacsStringSolver dimacsStringSolver0 = mock(DimacsStringSolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(dimacsStringSolver0).isVerbose();
      doReturn(0, 0, 0).when(dimacsStringSolver0).nVars();
      dimacsStringSolverArray0[0] = dimacsStringSolver0;
      ManyCore<DimacsStringSolver> manyCore0 = new ManyCore<DimacsStringSolver>(false, stringArray0, dimacsStringSolverArray0);
      VecInt vecInt0 = new VecInt(1844);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(manyCore0, vecInt0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AllMUSes allMUSes0 = null;
      try {
        allMUSes0 = new AllMUSes(false, (ASolverFactory<? extends ISolver>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AllMUSes allMUSes0 = null;
      try {
        allMUSes0 = new AllMUSes((ASolverFactory<? extends ISolver>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS((IVecInt) null, solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      AllMUSes allMUSes0 = new AllMUSes(true, lightFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      List<IVecInt> list0 = allMUSes0.computeAllMUSesOrdered((IVecInt) null, solutionFoundListener0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSesOrdered((IVecInt) null, (SolutionFoundListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(0, 0, 0, 0, 0).when(iSolver0).nVars();
      doReturn(false, false, false, false).when(iSolver0).isVerbose();
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      ASolverFactory<SolutionCounter> aSolverFactory0 = (ASolverFactory<SolutionCounter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(solutionCounter0, solutionCounter0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(solutionCounter0);
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener((ASolverFactory<? extends ISolver>) null);
      List<IVecInt> list0 = allMUSes0.computeAllMUSes(iVecInt0, (SolutionFoundListener) checkMUSSolutionListener0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ASolverFactory<StatisticsSolver> aSolverFactory0 = (ASolverFactory<StatisticsSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(false, aSolverFactory0);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes((IVecInt) vecInt0, solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(false, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSSOrdered((IVecInt) null, solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      AbstractClauseSelectorSolver<SingleSolutionDetector> abstractClauseSelectorSolver0 = (AbstractClauseSelectorSolver<SingleSolutionDetector>) mock(AbstractClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0, linkedList0, (Collection) null).when(abstractClauseSelectorSolver0).getAddedVars();
      doReturn("").when(abstractClauseSelectorSolver0).getLogPrefix();
      doReturn(true).when(abstractClauseSelectorSolver0).isVerbose();
      doReturn(2147483645).when(abstractClauseSelectorSolver0).nVars();
      AllMUSes allMUSes0 = new AllMUSes(abstractClauseSelectorSolver0, (ASolverFactory<? extends ISolver>) null);
      linkedList0.add((Integer) 306);
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener((ASolverFactory<? extends ISolver>) null);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSesOrdered((SolutionFoundListener) checkMUSSolutionListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0, minimal4CardinalityModel0, (ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      allMUSes0.computeAllMUSesOrdered(solutionFoundListener0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AllMUSes", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(false, aSolverFactory0);
      List<IVecInt> list0 = allMUSes0.getMssList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMSS();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel0).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(true, aSolverFactory0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      List<IVecInt> list0 = allMUSes0.computeAllMSS(solutionFoundListener0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ASolverFactory<SubModelIterator> aSolverFactory0 = (ASolverFactory<SubModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      AllMUSes allMUSes0 = new AllMUSes(aSolverFactory0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory1 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory1);
      // Undeclared exception!
      try { 
        allMUSes0.computeAllMUSes((SolutionFoundListener) checkMUSSolutionListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }
}
