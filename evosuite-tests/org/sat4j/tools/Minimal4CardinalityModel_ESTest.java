/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:31:10 GMT 2019
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
import org.sat4j.core.VecInt;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GateTranslator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.Minimal4InclusionModel;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Minimal4CardinalityModel_ESTest extends Minimal4CardinalityModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      VecInt vecInt0 = new VecInt(1185, 1185);
      GateTranslator gateTranslator0 = new GateTranslator(iSolver0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(gateTranslator0, vecInt0);
      minimal4InclusionModel0.isSatisfiable();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0);
      int[] intArray0 = minimal4CardinalityModel0.modelWithInternalVariables();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[1] = 5;
      intArray0[2] = 246;
      intArray0[3] = 1;
      intArray0[4] = 1203;
      intArray0[6] = (-1);
      intArray0[7] = 1;
      intArray0[8] = 1;
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(manyCore0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((Object) intArray0, (Object) null).when(manyCore0).model();
      doReturn((Object) intArray0, (Object) null).when(manyCore0).modelWithInternalVariables();
      doReturn(0, 1203, (-643), 1, 0).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(clausalCardinalitiesDecorator0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(clausalCardinalitiesDecorator0, iVecInt0, checkMUSSolutionListener0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0, iVecInt0, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(minimal4CardinalityModel0);
      Minimal4CardinalityModel minimal4CardinalityModel1 = new Minimal4CardinalityModel(maxSatDecorator0, checkMUSSolutionListener0);
      // Undeclared exception!
      try { 
        minimal4CardinalityModel1.model();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Minimal4InclusionModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[0];
      Constr constr0 = Constr.TAUTOLOGY;
      constr0.size();
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(constr0, constr0).when(manyCore0).addBlockingClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false, true).when(manyCore0).isSatisfiable(any(org.sat4j.specs.IVecInt.class));
      doReturn((Object) intArray0, (Object) intArray0, (Object) null).when(manyCore0).model();
      doReturn((Object) intArray0, (Object) intArray0, (Object) null).when(manyCore0).modelWithInternalVariables();
      doReturn(1, 1, (-2040109463)).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(clausalCardinalitiesDecorator0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(clausalCardinalitiesDecorator0, iVecInt0, checkMUSSolutionListener0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0, iVecInt0, checkMUSSolutionListener0);
      // Undeclared exception!
      try { 
        minimal4CardinalityModel0.modelWithInternalVariables();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.Minimal4InclusionModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        minimal4CardinalityModel0.modelWithInternalVariables();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[4];
      Constr constr0 = Constr.TAUTOLOGY;
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(constr0, constr0, constr0, constr0, constr0).when(manyCore0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn(true, false, true, true, true).when(manyCore0).isSatisfiable();
      doReturn((Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0).when(manyCore0).model();
      doReturn((Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0, (Object) intArray0).when(manyCore0).modelWithInternalVariables();
      doReturn(1185, (-547)).when(manyCore0).nVars();
      doReturn(true).when(manyCore0).removeConstr(any(org.sat4j.specs.IConstr.class));
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(manyCore0);
      minimal4CardinalityModel0.modelWithInternalVariables();
      // Undeclared exception!
      minimal4CardinalityModel0.model();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      SolutionCounter solutionCounter0 = new SolutionCounter(dimacsStringSolver0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solutionCounter0);
      // Undeclared exception!
      try { 
        minimal4CardinalityModel0.model();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.DimacsStringSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      Minimal4CardinalityModel minimal4CardinalityModel0 = null;
      try {
        minimal4CardinalityModel0 = new Minimal4CardinalityModel((ISolver) null, solutionFoundListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(4, 3, (-769), (-1958)).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(clausalCardinalitiesDecorator0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(clausalCardinalitiesDecorator0, iVecInt0, checkMUSSolutionListener0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0, iVecInt0, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(minimal4CardinalityModel0);
      Minimal4CardinalityModel minimal4CardinalityModel1 = null;
      try {
        minimal4CardinalityModel1 = new Minimal4CardinalityModel(maxSatDecorator0, checkMUSSolutionListener0);
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
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, true);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = null;
      try {
        minimal4CardinalityModel0 = new Minimal4CardinalityModel(maxSatDecorator0, (IVecInt) null, checkMUSSolutionListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Minimal4CardinalityModel minimal4CardinalityModel0 = null;
      try {
        minimal4CardinalityModel0 = new Minimal4CardinalityModel((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(1185, 1185, 1349, 1065, 16384).when(manyCore0).nVars();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(manyCore0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Minimal4CardinalityModel minimal4CardinalityModel0 = null;
      try {
        minimal4CardinalityModel0 = new Minimal4CardinalityModel((ISolver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractMinimalModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = 1185;
      intArray0[0] = 1185;
      intArray0[2] = 1349;
      intArray0[3] = 1185;
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(1185, (-209), 0, 0).when(manyCore0).nVars();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(manyCore0);
      Minimal4CardinalityModel minimal4CardinalityModel1 = new Minimal4CardinalityModel(minimal4CardinalityModel0);
      assertFalse(minimal4CardinalityModel1.equals((Object)minimal4CardinalityModel0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[] intArray0 = new int[4];
      Constr constr0 = Constr.TAUTOLOGY;
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(manyCore0).addAtMost(any(org.sat4j.specs.IVecInt.class) , anyInt());
      doReturn(false).when(manyCore0).isSatisfiable();
      doReturn(intArray0).when(manyCore0).model();
      doReturn(intArray0).when(manyCore0).modelWithInternalVariables();
      doReturn(1185, (-547)).when(manyCore0).nVars();
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(manyCore0);
      int[] intArray1 = minimal4CardinalityModel0.model();
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ManyCore<AbstractMinimalModel> manyCore0 = (ManyCore<AbstractMinimalModel>) mock(ManyCore.class, new ViolatedAssumptionAnswer());
      doReturn(0, 1, 0).when(manyCore0).nVars();
      ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<ManyCore<AbstractMinimalModel>>(manyCore0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(clausalCardinalitiesDecorator0);
      ASolverFactory<AbstractMinimalModel> aSolverFactory0 = (ASolverFactory<AbstractMinimalModel>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4InclusionModel minimal4InclusionModel0 = new Minimal4InclusionModel(clausalCardinalitiesDecorator0, iVecInt0, checkMUSSolutionListener0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(minimal4InclusionModel0, iVecInt0, checkMUSSolutionListener0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(minimal4CardinalityModel0);
      GateTranslator gateTranslator0 = new GateTranslator(maxSatDecorator0);
      Minimal4CardinalityModel minimal4CardinalityModel1 = new Minimal4CardinalityModel(gateTranslator0, iVecInt0);
      assertFalse(minimal4CardinalityModel1.equals((Object)minimal4CardinalityModel0));
  }
}
