/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 01:30:51 GMT 2019
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
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.SingleSolutionDetector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CheckMUSSolutionListener_ESTest extends CheckMUSSolutionListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(minOneDecorator0).isSatisfiable();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minOneDecorator0).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      checkMUSSolutionListener0.onSolutionFound(iVecInt0);
      assertSame(iVecInt0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt(0, (-1));
      IVecInt iVecInt0 = vecInt0.pop();
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(iVecInt0);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.checkThatItIsAMUS(readOnlyVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.CheckMUSSolutionListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.onSolutionFound(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.CheckMUSSolutionListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(2584);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.onSolutionFound(iVecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2583, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.onSolutionFound((IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AbstractMinimalModel[] abstractMinimalModelArray0 = new AbstractMinimalModel[2];
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(3423);
      VecInt vecInt0 = new VecInt();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0, vecInt0);
      abstractMinimalModelArray0[0] = (AbstractMinimalModel) minimal4CardinalityModel0;
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(abstractMinimalModelArray0[0]);
      abstractMinimalModelArray0[1] = (AbstractMinimalModel) minimal4InclusionModel0;
      ManyCore<AbstractMinimalModel> manyCore0 = new ManyCore<AbstractMinimalModel>(false, abstractMinimalModelArray0);
      ModelIterator modelIterator0 = new ModelIterator(manyCore0);
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel1 = new Minimal4CardinalityModel(modelIterator0, checkMUSSolutionListener0);
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory1 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minimal4CardinalityModel1).when(aSolverFactory1).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener1 = new CheckMUSSolutionListener(aSolverFactory1);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener1.checkThatItIsAMUS(vecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      ASolverFactory<SingleSolutionDetector> aSolverFactory0 = (ASolverFactory<SingleSolutionDetector>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.checkThatItIsAMUS(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.addOriginalClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.CheckMUSSolutionListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ASolverFactory<ModelIterator> aSolverFactory0 = (ASolverFactory<ModelIterator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.addOriginalClause(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      vecInt0.shrink((-1390));
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.addOriginalClause(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(minOneDecorator0).isSatisfiable();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minOneDecorator0).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      checkMUSSolutionListener0.onSolutionFound((IVecInt) vecInt0);
      assertEquals(0, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<DimacsStringSolver> aSolverFactory0 = (ASolverFactory<DimacsStringSolver>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(dimacsStringSolver0).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      checkMUSSolutionListener0.onSolutionFound(iVecInt0);
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(lightFactory0);
      VecInt vecInt0 = new VecInt();
      boolean boolean0 = checkMUSSolutionListener0.checkThatItIsAMUS(vecInt0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ASolverFactory<Minimal4CardinalityModel> aSolverFactory0 = (ASolverFactory<Minimal4CardinalityModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn((ISolver) null).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      vecInt0.unsafePush(670);
      // Undeclared exception!
      try { 
        checkMUSSolutionListener0.checkThatItIsAMUS(vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 669, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = mock(MinOneDecorator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(minOneDecorator0).isSatisfiable();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      doReturn(minOneDecorator0).when(aSolverFactory0).defaultSolver();
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      boolean boolean0 = checkMUSSolutionListener0.checkThatItIsAMUS(vecInt0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      VecInt vecInt0 = new VecInt();
      checkMUSSolutionListener0.addOriginalClause(vecInt0);
      assertTrue(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ASolverFactory<Minimal4InclusionModel> aSolverFactory0 = (ASolverFactory<Minimal4InclusionModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      int[] intArray0 = new int[0];
      checkMUSSolutionListener0.onSolutionFound(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      checkMUSSolutionListener0.onUnsatTermination();
  }
}