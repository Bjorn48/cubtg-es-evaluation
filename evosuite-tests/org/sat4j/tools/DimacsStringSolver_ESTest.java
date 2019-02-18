/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:28:30 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVec;
import org.sat4j.core.Vec;
import org.sat4j.core.VecInt;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.DimacsStringSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsStringSolver_ESTest extends DimacsStringSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.nextFreeVarId(true);
      dimacsStringSolver0.nextFreeVarId(false);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(4956);
      dimacsStringSolver0.nextFreeVarId(true);
      dimacsStringSolver0.nextFreeVarId(true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.setExpectedNumberOfClauses(2588);
      dimacsStringSolver0.toString();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.newVar(657);
      dimacsStringSolver0.toString();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.nbvars = 16;
      dimacsStringSolver0.nVars();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.setExpectedNumberOfClauses(2588);
      dimacsStringSolver0.addAtLeast(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2489);
      dimacsStringSolver0.fixedNbClauses = true;
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addExactly((IVecInt) null, (-4741));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, false);
      dimacsStringSolver0.printInfos((PrintWriter) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(4956);
      dimacsStringSolver0.nextFreeVarId(true);
      dimacsStringSolver0.realNumberOfVariables();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(4956);
      dimacsStringSolver0.newVar((-1369));
      dimacsStringSolver0.realNumberOfVariables();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.newVar((-336));
      dimacsStringSolver0.nextFreeVarId(true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.newVar(0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1249);
      dimacsStringSolver0.setNbVars(58);
      dimacsStringSolver0.nVars();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.newVar((-336));
      dimacsStringSolver0.nVars();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.addAtLeast(vecInt0, 1);
      dimacsStringSolver0.nConstraints();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt(1094, 1094);
      // Undeclared exception!
      dimacsStringSolver0.addExactly(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addExactly((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(5740, 1);
      dimacsStringSolver0.addClause((IVecInt) vecInt0, 1);
      assertEquals(0, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addClause((IVecInt) null, (-491));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(10);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addClause((IVecInt) vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(2588, 2588);
      // Undeclared exception!
      dimacsStringSolver0.addAtMost(vecInt0, 1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtMost((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtLeast((IVecInt) null, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Vec<IVecInt> vec0 = new Vec<IVecInt>(1, (IVecInt) null);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAllClauses(vec0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(14);
      Vec<IVecInt> vec0 = new Vec<IVecInt>(1094, vecInt0);
      ReadOnlyVec<IVecInt> readOnlyVec0 = new ReadOnlyVec<IVecInt>(vec0);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAllClauses(readOnlyVec0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = null;
      try {
        dimacsStringSolver0 = new DimacsStringSolver((-25));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.insertFirst(2588);
      vecInt0.pushAll(vecInt0);
      dimacsStringSolver0.addAtMost(vecInt0, 1);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.addAtLeast(vecInt0, 1);
      dimacsStringSolver0.addAtMost(vecInt0, 1);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt();
      vecInt0.push(1094);
      dimacsStringSolver0.addClause((IVecInt) vecInt0);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.addAtMost(vecInt0, 1);
      dimacsStringSolver0.addClause((IVecInt) vecInt0);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(1094);
      dimacsStringSolver0.addClause(iVecInt0, 1);
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.nextFreeVarId(true);
      dimacsStringSolver0.toString();
      assertEquals(1, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtLeast(vecInt0, (-1));
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtLeast((IVecInt) null, 57);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 57
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1522);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addExactly((IVecInt) null, 1522);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 1522
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.setExpectedNumberOfClauses(2588);
      assertEquals(2588, dimacsStringSolver0.nConstraints());
      
      vecInt0.insertFirst(2588);
      vecInt0.pushAll(vecInt0);
      dimacsStringSolver0.addAtMost(vecInt0, 1);
      assertEquals(0, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(2594);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addExactly(vecInt0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtMost((IVecInt) null, 0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2489);
      VecInt vecInt0 = new VecInt(2489, 2489);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addAtMost(vecInt0, 2490);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not a clausal problem! degree 2490
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt();
      dimacsStringSolver0.addAtMost(vecInt0, 1);
      dimacsStringSolver0.addExactly(vecInt0, 1);
      assertEquals(1, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      VecInt vecInt0 = new VecInt(1094, 1094);
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Vec<IVecInt> vec0 = new Vec<IVecInt>(1094, vecInt0);
      ReadOnlyVec<IVecInt> readOnlyVec0 = new ReadOnlyVec<IVecInt>(vec0);
      // Undeclared exception!
      dimacsStringSolver0.addAllClauses(readOnlyVec0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.fixedNbClauses = true;
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addClause((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      VecInt vecInt0 = new VecInt();
      Vec<IVecInt> vec0 = new Vec<IVecInt>(1094, vecInt0);
      ReadOnlyVec<IVecInt> readOnlyVec0 = new ReadOnlyVec<IVecInt>(vec0);
      dimacsStringSolver0.addAllClauses(readOnlyVec0);
      assertEquals(1094, dimacsStringSolver0.nConstraints());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int int0 = dimacsStringSolver0.nConstraints();
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(48);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("Not a clausal problem! degree ", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(objectOutputStream0, false);
      dimacsStringSolver0.printStat((PrintWriter) mockPrintWriter0);
      assertEquals(0, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.modelWithInternalVariables();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.addParity((IVecInt) null, true);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.getAddedVars();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(0);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.printInfos((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      String string0 = dimacsStringSolver0.toString("m6LSOFlWt&");
      assertEquals("Dimacs output solver", string0);
      assertEquals(0, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        dimacsStringSolver0.primeImplicant(9);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int int0 = dimacsStringSolver0.realNumberOfVariables();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(2577);
      dimacsStringSolver0.reset();
      assertEquals(0, dimacsStringSolver0.nVars());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      dimacsStringSolver0.getOut();
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(86);
      // Undeclared exception!
      try { 
        dimacsStringSolver0.registerLiteral(86);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      int int0 = dimacsStringSolver0.newVar();
      assertEquals(0, int0);
      assertEquals(0, dimacsStringSolver0.realNumberOfVariables());
  }
}
