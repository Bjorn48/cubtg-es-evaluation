/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:09:46 GMT 2019
 */

package org.sat4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.ExitCode;
import org.sat4j.ILauncherMode;
import org.sat4j.MUSLauncher;
import org.sat4j.OptimizationMode;
import org.sat4j.core.ASolverFactory;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.reader.GroupedCNFReader;
import org.sat4j.specs.IGroupSolver;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IOptimizationProblem;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class OptimizationMode_ESTest extends OptimizationMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Long long0 = new Long((-819L));
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<MaxSatDecorator> basicLauncher0 = new BasicLauncher<MaxSatDecorator>(aSolverFactory0);
      optimizationMode0.displayResult(dimacsStringSolver0, iOptimizationProblem0, basicLauncher0, mockPrintWriter0, groupedCNFReader0, (-819L), false);
      assertEquals(10L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      ExitCode exitCode0 = optimizationMode0.getCurrentExitCode();
      assertEquals("UNKNOWN", exitCode0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("serial");
      // Undeclared exception!
      try { 
        optimizationMode0.solve(dimacsStringSolver0, groupedCNFReader0, (ILogAble) null, mockPrintWriter0, 0L);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.sat4j.tools.DimacsStringSolver cannot be cast to org.sat4j.specs.IOptimizationProblem
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        optimizationMode0.onSolutionFound(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsStringSolver0, iOptimizationProblem0, (ILogAble) null, mockPrintWriter0, groupedCNFReader0, 0L, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsStringSolver0, iOptimizationProblem0, (ILogAble) null, mockPrintWriter0, groupedCNFReader0, 0L, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iOptimizationProblem0).admitABetterSolution();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      MockFile mockFile0 = new MockFile("objective function=", "objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      optimizationMode0.solve(iOptimizationProblem0, groupedCNFReader0, (ILogAble) null, mockPrintWriter0, 50L);
      assertEquals(ExitCode.UNSATISFIABLE, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iOptimizationProblem0).admitABetterSolution();
      doReturn(false).when(iOptimizationProblem0).nonOptimalMeansSatisfiable();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("-DRjaD9GW;}Tg/XCe");
      // Undeclared exception!
      try { 
        optimizationMode0.solve(iOptimizationProblem0, groupedCNFReader0, (ILogAble) null, mockPrintWriter0, 10L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iOptimizationProblem0).admitABetterSolution();
      doReturn(true).when(iOptimizationProblem0).hasNoObjectiveFunction();
      doReturn(true).when(iOptimizationProblem0).nonOptimalMeansSatisfiable();
      IGroupSolver iGroupSolver0 = mock(IGroupSolver.class, new ViolatedAssumptionAnswer());
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(iGroupSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      optimizationMode0.solve(iOptimizationProblem0, groupedCNFReader0, mUSLauncher0, mockPrintWriter0, 1226L);
      assertEquals(ExitCode.SATISFIABLE, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iOptimizationProblem0).admitABetterSolution();
      doReturn(false).when(iOptimizationProblem0).nonOptimalMeansSatisfiable();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      // Undeclared exception!
      try { 
        optimizationMode0.solve(iOptimizationProblem0, groupedCNFReader0, (ILogAble) null, mockPrintWriter0, (-819L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iOptimizationProblem0).admitABetterSolution();
      doReturn((Number) null).when(iOptimizationProblem0).getObjectiveValue();
      doReturn(false).when(iOptimizationProblem0).hasNoObjectiveFunction();
      doReturn(true).when(iOptimizationProblem0).nonOptimalMeansSatisfiable();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsOutputSolver0);
      MockFile mockFile0 = new MockFile("?bjective fnction=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<MaxSatDecorator> basicLauncher0 = new BasicLauncher<MaxSatDecorator>(aSolverFactory0);
      optimizationMode0.solve(iOptimizationProblem0, groupedCNFReader0, basicLauncher0, mockPrintWriter0, (-811L));
      assertEquals(ExitCode.OPTIMUM_FOUND, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IOptimizationProblem iOptimizationProblem0 = mock(IOptimizationProblem.class, new ViolatedAssumptionAnswer());
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockFile mockFile0 = new MockFile("objective function=");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0);
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<MaxSatDecorator> basicLauncher0 = new BasicLauncher<MaxSatDecorator>(aSolverFactory0);
      optimizationMode0.displayResult(dimacsStringSolver0, iOptimizationProblem0, basicLauncher0, mockPrintWriter0, groupedCNFReader0, (-819L), false);
      assertEquals(10L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("oO0ODHob?Y{2n");
      BasicLauncher<MaxSatDecorator> basicLauncher0 = new BasicLauncher<MaxSatDecorator>((ASolverFactory<MaxSatDecorator>) null);
      optimizationMode0.displayResult(dimacsStringSolver0, dimacsStringSolver0, basicLauncher0, mockPrintWriter0, groupedCNFReader0, (-1636L), true);
      assertEquals("", dimacsStringSolver0.getLogPrefix());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      GroupedCNFReader groupedCNFReader0 = new GroupedCNFReader(dimacsStringSolver0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("serial");
      optimizationMode0.displayResult((ISolver) null, (IProblem) null, (ILogAble) null, mockPrintWriter0, groupedCNFReader0, (-2969L), false);
      assertFalse(groupedCNFReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      ExitCode exitCode0 = optimizationMode0.getCurrentExitCode();
      assertEquals(ExitCode.UNKNOWN, exitCode0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      OptimizationMode optimizationMode0 = (OptimizationMode)ILauncherMode.OPTIMIZATION;
      optimizationMode0.onUnsatTermination();
      assertEquals(ExitCode.UNKNOWN, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      optimizationMode0.setIncomplete(false);
      assertEquals(ExitCode.UNKNOWN, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      ExitCode exitCode0 = ExitCode.UNSATISFIABLE;
      optimizationMode0.setExitCode(exitCode0);
      assertEquals(ExitCode.UNSATISFIABLE, optimizationMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      OptimizationMode optimizationMode0 = new OptimizationMode();
      // Undeclared exception!
      try { 
        optimizationMode0.onSolutionFound((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.OptimizationMode", e);
      }
  }
}