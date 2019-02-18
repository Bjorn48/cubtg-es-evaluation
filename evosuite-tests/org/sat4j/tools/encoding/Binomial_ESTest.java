/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:26:01 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.Binomial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Binomial_ESTest extends Binomial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      IVecInt iVecInt0 = VecInt.EMPTY;
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      try { 
        binomial0.addExactlyOne(iSolver0, iVecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(2132, 2132);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      binomial0.addExactlyOne(dimacsStringSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      doReturn(0, 0).when(dimacsOutputSolver0).nextFreeVarId(anyBoolean());
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(negationDecorator0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(optToSatAdapter0, iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Binomial binomial1 = new Binomial();
      ActiveLearning<CardinalityDataStructureYanMin> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      NoRestarts noRestarts0 = new NoRestarts();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      int[] intArray0 = new int[7];
      intArray0[0] = 59;
      intArray0[1] = (-341);
      intArray0[2] = 2641;
      intArray0[3] = 1183;
      intArray0[2] = 486;
      intArray0[5] = 1;
      intArray0[6] = 16;
      VecInt vecInt0 = new VecInt(intArray0);
      binomial0.toString();
      DimacsOutputSolver dimacsOutputSolver1 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(2641, 0).when(dimacsOutputSolver1).nextFreeVarId(anyBoolean());
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver1);
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(negationDecorator0, iVecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2132, 2132);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      binomial0.addExactly(dimacsStringSolver0, vecInt0, 2132);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addExactly((ISolver) null, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      iVecInt0.shrinkTo((-3321));
      // Undeclared exception!
      try { 
        binomial0.addExactly(lexicoDecorator0, iVecInt0, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt(146, 58);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      vecInt0.shrink((-810));
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addExactly(dimacsStringSolver0, vecInt0, 146);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(2132, 2132);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      binomial0.addAtMostOne(dimacsStringSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(58, (-3579));
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      NegationDecorator<DimacsOutputSolver> negationDecorator0 = new NegationDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(negationDecorator0);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne(maxSatDecorator0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      iVecInt0.shrinkTo(1121);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne(dimacsStringSolver0, iVecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(2132, 2132);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      binomial0.addAtMost(dimacsStringSolver0, vecInt0, 2132);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addAtMost((ISolver) null, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binomial", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      ActiveLearning<CardinalityDataStructureYanMin> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(activeLearning0, cardinalityDataStructureYanMin0, naturalStaticOrder0, noRestarts0);
      ModelIterator modelIterator0 = new ModelIterator(solver0);
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        binomial0.addAtMost(modelIterator0, vecInt0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      binomial0.addAtMostOne(dimacsStringSolver0, iVecInt0);
      assertEquals(3, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      binomial0.addAtMost(dimacsStringSolver0, iVecInt0, 0);
      assertEquals(3, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      DimacsOutputSolver dimacsOutputSolver1 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver1, true);
      // Undeclared exception!
      try { 
        binomial0.addAtMost(fullClauseSelectorSolver0, iVecInt0, 2);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      IVecInt iVecInt0 = VecInt.EMPTY;
      SubModelIterator subModelIterator0 = new SubModelIterator(dimacsStringSolver0, iVecInt0, 0);
      IConstr iConstr0 = binomial0.addExactlyOne(subModelIterator0, iVecInt0);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = mock(DimacsOutputSolver.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1121, 1121, 1121, 0).when(dimacsOutputSolver0).nVars();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      ActiveLearning<CardinalityDataStructureYanMin> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(activeLearning0, cardinalityDataStructureYanMin0, naturalStaticOrder0, noRestarts0);
      binomial0.addExactly(solver0, iVecInt0, 2);
      assertEquals(4, solver0.nConstraints());
  }
}
