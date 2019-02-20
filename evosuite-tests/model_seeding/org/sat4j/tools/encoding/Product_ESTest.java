/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 19 17:18:25 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWLConciseBinary;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.SubModelIterator;
import org.sat4j.tools.encoding.Product;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ModelIterator modelIterator0 = new ModelIterator(dimacsStringSolver0, (-822L));
      VecInt vecInt0 = new VecInt(17, 17);
      // Undeclared exception!
      try { 
        product0.addAtMostNonOpt(modelIterator0, vecInt0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.moveTo2(vecInt0);
      product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ModelIterator modelIterator0 = new ModelIterator(dimacsStringSolver0, (-822L));
      VecInt vecInt0 = new VecInt(0, 0);
      SubModelIterator subModelIterator0 = new SubModelIterator(modelIterator0, vecInt0, 0);
      product0.addExactly(subModelIterator0, vecInt0, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Product product0 = new Product();
      VecInt vecInt0 = new VecInt(0, 0);
      ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(clauseOnlyLearning0, mixedDataStructureDanielWLConciseBinary0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      try { 
        product0.addExactlyOne(solver0, vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        product0.addExactlyOne(dimacsStringSolver0, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[6];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrink((-178));
      // Undeclared exception!
      try { 
        product0.addExactlyOne(dimacsStringSolver0, vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Product product0 = new Product();
      VecInt vecInt0 = new VecInt(0, 0);
      ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWLConciseBinary>();
      MixedDataStructureDanielWLConciseBinary mixedDataStructureDanielWLConciseBinary0 = new MixedDataStructureDanielWLConciseBinary();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureDanielWLConciseBinary> solver0 = new Solver<MixedDataStructureDanielWLConciseBinary>(clauseOnlyLearning0, mixedDataStructureDanielWLConciseBinary0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      try { 
        product0.addExactly(solver0, vecInt0, 1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.card.AtLeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        product0.addExactly(dimacsStringSolver0, (IVecInt) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.moveTo((IVecInt) vecInt0);
      vecInt0.pop();
      // Undeclared exception!
      try { 
        product0.addExactly(dimacsStringSolver0, vecInt0, 0);
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
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[12];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrink((-2693));
      // Undeclared exception!
      try { 
        product0.addExactly(dimacsStringSolver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      Product product0 = new Product();
      // Undeclared exception!
      try { 
        product0.addAtMostOne((ISolver) null, vecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Product", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(110, 110);
      // Undeclared exception!
      product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 14);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        product0.addAtMostNonOpt(dimacsStringSolver0, (IVecInt) null, (-730));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(0, 0);
      IConstr iConstr0 = product0.addAtMostOne(dimacsStringSolver0, vecInt0);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      IVecInt iVecInt0 = vecInt0.clone();
      vecInt0.moveTo(iVecInt0);
      product0.addAtMostOne(dimacsStringSolver0, iVecInt0);
      assertEquals(52, dimacsStringSolver0.nConstraints());
      assertEquals(9, dimacsStringSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[10];
      VecInt vecInt0 = new VecInt(intArray0);
      product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 1);
      assertEquals(29, dimacsStringSolver0.nConstraints());
      assertEquals(7, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 4);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 4
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[7];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.moveTo((IVecInt) vecInt0);
      IConstr iConstr0 = product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, (-41));
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[6];
      VecInt vecInt0 = new VecInt(intArray0);
      product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, 5);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.moveTo((IVecInt) vecInt0);
      IVecInt iVecInt0 = vecInt0.pop();
      IConstr iConstr0 = product0.addAtMostNonOpt(dimacsStringSolver0, iVecInt0, 0);
      assertEquals(0, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        product0.addAtMostNonOpt(dimacsStringSolver0, vecInt0, (-41));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Product", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[9];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        product0.addExactly(dimacsStringSolver0, vecInt0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 9
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Product product0 = new Product();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int[] intArray0 = new int[12];
      VecInt vecInt0 = new VecInt(intArray0);
      product0.addExactlyOne(dimacsStringSolver0, vecInt0);
      assertEquals(7, dimacsStringSolver0.nVars());
      assertEquals(34, dimacsStringSolver0.nConstraints());
  }
}