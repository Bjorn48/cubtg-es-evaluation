/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:29:37 GMT 2019
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
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.SingleSolutionDetector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleSolutionDetector_ESTest extends SingleSolutionDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[15];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(iSolver0).model();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector((ISolver) null);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector((ISolver) null);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[0];
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(false, minimal4CardinalityModelArray0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(manyCore0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
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
      int[] intArray0 = new int[5];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(iSolver0).model();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution((IVecInt) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(iSolver0).model();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution((IVecInt) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[15];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(iSolver0).model();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(true).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution((IVecInt) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn((int[]) null).when(iSolver0).model();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      // Undeclared exception!
      try { 
        singleSolutionDetector0.hasASingleSolution();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[1];
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iSolver0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(intArray0).when(iSolver0).model();
      doReturn((IConstr) null).when(iSolver0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(iSolver0).removeConstr(any(org.sat4j.specs.IConstr.class));
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(iSolver0);
      boolean boolean0 = singleSolutionDetector0.hasASingleSolution();
      assertTrue(boolean0);
  }
}
