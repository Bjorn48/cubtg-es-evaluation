/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:24:00 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.reader.JSONReader;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONReader_ESTest extends JSONReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      JSONReader<StatisticsSolver> jSONReader0 = new JSONReader<StatisticsSolver>(statisticsSolver0);
      IVecInt iVecInt0 = jSONReader0.getLiterals("<=");
      assertTrue(iVecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      VecInt vecInt0 = new VecInt();
      ASolverFactory<MaxSatDecorator> aSolverFactory0 = (ASolverFactory<MaxSatDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(dimacsOutputSolver0, vecInt0, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(abstractMinimalModel0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0, checkMUSSolutionListener0);
      JSONReader<OptToSatAdapter> jSONReader0 = new JSONReader<OptToSatAdapter>(optToSatAdapter0);
      String string0 = jSONReader0.constraintRegexp();
      assertEquals("((\\[(-?(\\d+)(,-?(\\d+))*)?\\])|(\\[(\\[(-?(\\d+)(,-?(\\d+))*)?\\]),'[=<>]=?',-?\\d+\\]))", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(statisticsSolver0);
      NegationDecorator<AbstractMinimalModel> negationDecorator0 = new NegationDecorator<AbstractMinimalModel>(minimal4CardinalityModel0);
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>(negationDecorator0);
      // Undeclared exception!
      try { 
        jSONReader0.parseString("[]");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      JSONReader<DimacsStringSolver> jSONReader0 = new JSONReader<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.parseInstance((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Reader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JSONReader<Minimal4InclusionModel> jSONReader0 = new JSONReader<Minimal4InclusionModel>((Minimal4InclusionModel) null);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      try { 
        jSONReader0.parseInstance((InputStream) mockFileInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>>((ClausalCardinalitiesDecorator<MaxSatDecorator>) null);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard("v ");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FullClauseSelectorSolver<Minimal4CardinalityModel> fullClauseSelectorSolver0 = (FullClauseSelectorSolver<Minimal4CardinalityModel>) mock(FullClauseSelectorSolver.class, new ViolatedAssumptionAnswer());
      JSONReader<FullClauseSelectorSolver<Minimal4CardinalityModel>> jSONReader0 = new JSONReader<FullClauseSelectorSolver<Minimal4CardinalityModel>>(fullClauseSelectorSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>((NegationDecorator<AbstractMinimalModel>) null);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals("=");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      JSONReader<StatisticsSolver> jSONReader0 = new JSONReader<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>>((ClausalCardinalitiesDecorator<MaxSatDecorator>) null);
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        jSONReader0.decode(intArray0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>((NegationDecorator<AbstractMinimalModel>) null);
      // Undeclared exception!
      try { 
        jSONReader0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>>((ClausalCardinalitiesDecorator<MaxSatDecorator>) null);
      try { 
        jSONReader0.parseString("(([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorWrong input (([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ISolver iSolver0 = mock(ISolver.class, new ViolatedAssumptionAnswer());
      SolutionCounter solutionCounter0 = new SolutionCounter(iSolver0);
      JSONReader<SolutionCounter> jSONReader0 = new JSONReader<SolutionCounter>(solutionCounter0);
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        jSONReader0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorWrong input \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClausalCardinalitiesDecorator<MaxSatDecorator> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<MaxSatDecorator>((MaxSatDecorator) null);
      JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>>(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        jSONReader0.handleCard("[[],'<',0]");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // requires at least 2 literals
         //
         verifyException("org.sat4j.tools.encoding.Policy", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>> jSONReader0 = new JSONReader<ClausalCardinalitiesDecorator<MaxSatDecorator>>((ClausalCardinalitiesDecorator<MaxSatDecorator>) null);
      jSONReader0.handleCard("^[((([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))(,(([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+])))*)?]$");
      assertFalse(jSONReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      JSONReader<StatisticsSolver> jSONReader0 = new JSONReader<StatisticsSolver>(statisticsSolver0);
      // Undeclared exception!
      try { 
        jSONReader0.getLiterals("([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+])");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"[([(-?(d+)(\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>((NegationDecorator<AbstractMinimalModel>) null);
      // Undeclared exception!
      try { 
        jSONReader0.parseString("[]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>((NegationDecorator<AbstractMinimalModel>) null);
      int[] intArray0 = new int[0];
      String string0 = jSONReader0.decode(intArray0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      JSONReader<NegationDecorator<AbstractMinimalModel>> jSONReader0 = new JSONReader<NegationDecorator<AbstractMinimalModel>>((NegationDecorator<AbstractMinimalModel>) null);
      int[] intArray0 = new int[0];
      Writer writer0 = mock(Writer.class, new ViolatedAssumptionAnswer());
      PrintWriter printWriter0 = new PrintWriter(writer0);
      jSONReader0.decode(intArray0, printWriter0);
      assertFalse(jSONReader0.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      JSONReader<StatisticsSolver> jSONReader0 = new JSONReader<StatisticsSolver>(statisticsSolver0);
      try { 
        jSONReader0.handleNotHandled("(([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorUnknown constraint: (([(-?(d+)(,-?(d+))*)?])|([([(-?(d+)(,-?(d+))*)?]),'[=<>]=?',-?d+]))
         //
         verifyException("org.sat4j.reader.JSONReader", e);
      }
  }
}
