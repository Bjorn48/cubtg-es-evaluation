/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:27:17 GMT 2019
 */

package org.sat4j.tools.xplain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;
import org.sat4j.tools.encoding.Binomial;
import org.sat4j.tools.xplain.QuickXplainStrategy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QuickXplainStrategy_ESTest extends QuickXplainStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      vecInt0.push(4);
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      VecInt vecInt1 = new VecInt(intArray0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      IVecInt iVecInt0 = quickXplainStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, vecInt1);
      assertEquals(1, vecInt0.size());
      assertNotSame(vecInt1, iVecInt0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      VecInt vecInt1 = new VecInt(intArray0);
      vecInt1.copyTo((IVecInt) vecInt0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      BiFunction<Object, String, String> biFunction0 = (BiFunction<Object, String, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge((Integer) 0, "e|p>kqmW/[d46~|jV", biFunction0);
      VecInt vecInt2 = new VecInt(0);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, vecInt2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      VecInt vecInt1 = new VecInt(intArray0);
      vecInt1.copyTo((IVecInt) vecInt0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      VecInt vecInt2 = new VecInt(3280, (-2058));
      // Undeclared exception!
      quickXplainStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, vecInt2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(473);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(statisticsSolver0, hashMap0, vecInt0);
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
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain((ISolver) null, hashMap0, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.xplain.QuickXplainStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(465);
      vecInt0.pop();
      HashMap<Integer, MixedDataStructureDanielHT> hashMap0 = new HashMap<Integer, MixedDataStructureDanielHT>();
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain((ISolver) null, hashMap0, vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, false).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      IVecInt iVecInt0 = quickXplainStrategy0.explain(singleSolutionDetector0, hashMap0, vecInt0);
      assertNotSame(vecInt0, iVecInt0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("}eGY/v'{B", "}eGY/v'{B").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, true).when(singleSolutionDetector0).isVerbose();
      doReturn(0, 8, (-15)).when(singleSolutionDetector0).nVars();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(clausalCardinalitiesDecorator0);
      VecInt vecInt1 = new VecInt(intArray0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      IVecInt iVecInt0 = quickXplainStrategy0.explain(abstractMinimalModel0, hashMap0, vecInt1);
      assertEquals(8, vecInt1.size());
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true, true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, true, true, false).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) (-2058), "e|p>kqmW/[d46~|jV");
      IVecInt iVecInt0 = quickXplainStrategy0.explain(singleSolutionDetector0, hashMap0, vecInt0);
      assertEquals(2058, iVecInt0.last());
      assertFalse(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      intArray0[7] = (-3823);
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      VecInt vecInt1 = new VecInt(intArray0);
      vecInt1.copyTo((IVecInt) vecInt0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      VecInt vecInt2 = new VecInt(3280);
      // Undeclared exception!
      try { 
        quickXplainStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, vecInt2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      VecInt vecInt0 = new VecInt(0);
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true, true).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, true, true, true).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) 0, "e|p>kqmW/[d46~|jV");
      IVecInt iVecInt0 = quickXplainStrategy0.explain(singleSolutionDetector0, hashMap0, vecInt0);
      assertFalse(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      int[] intArray0 = new int[8];
      VecInt vecInt0 = new VecInt();
      SingleSolutionDetector singleSolutionDetector0 = mock(SingleSolutionDetector.class, new ViolatedAssumptionAnswer());
      doReturn("e|p>kqmW/[d46~|jV", "e|p>kqmW/[d46~|jV", "org.sat4j.core.ASolverFactory", "e|p>kqmW/[d46~|jV", "we LK C").when(singleSolutionDetector0).getLogPrefix();
      doReturn(true, true, true, false, false).when(singleSolutionDetector0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn(true, true, false, true, true).when(singleSolutionDetector0).isVerbose();
      doReturn(vecInt0).when(singleSolutionDetector0).unsatExplanation();
      Binomial binomial0 = new Binomial();
      ClausalCardinalitiesDecorator<SingleSolutionDetector> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<SingleSolutionDetector>(singleSolutionDetector0, binomial0);
      VecInt vecInt1 = new VecInt(intArray0);
      vecInt1.copyTo((IVecInt) vecInt0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      IVecInt iVecInt0 = quickXplainStrategy0.explain(clausalCardinalitiesDecorator0, hashMap0, vecInt0);
      assertEquals(0, vecInt0.size());
      assertTrue(iVecInt0.equals((Object)vecInt0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      String string0 = quickXplainStrategy0.toString();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      QuickXplainStrategy quickXplainStrategy0 = new QuickXplainStrategy();
      quickXplainStrategy0.cancelExplanationComputation();
      assertEquals("QuickXplain (AAAI 2004 version) minimization strategy", quickXplainStrategy0.toString());
  }
}
