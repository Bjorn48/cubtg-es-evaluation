/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:31:13 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.cnf.UnitClause;
import org.sat4j.minisat.core.SizeComparator;
import org.sat4j.specs.Constr;
import org.sat4j.specs.IVecInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SizeComparator_ESTest extends SizeComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      UnitClause unitClause0 = new UnitClause((-10));
      unitClause0.setActivity((-10));
      int int0 = sizeComparator0.compare((Constr) unitClause0, (Constr) unitClause0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      Constr constr0 = mixedDataStructureDanielHT0.createUnregisteredClause(vecInt0);
      Constr constr1 = mixedDataStructureDanielHT0.createUnregisteredClause(vecInt0);
      int int0 = sizeComparator0.compare(constr0, constr1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      VecInt vecInt0 = new VecInt();
      vecInt0.push(0);
      UnitClause unitClause0 = new UnitClause(0);
      IVecInt iVecInt0 = vecInt0.push(0);
      Constr constr0 = mixedDataStructureDanielHT0.createUnregisteredClause(iVecInt0);
      int int0 = sizeComparator0.compare((Constr) unitClause0, constr0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      // Undeclared exception!
      try { 
        sizeComparator0.compare((Constr) null, (Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.SizeComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SizeComparator sizeComparator0 = new SizeComparator();
      UnitClause unitClause0 = new UnitClause(0);
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(411);
      IVecInt iVecInt1 = iVecInt0.push(411);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Constr constr0 = mixedDataStructureDanielHT0.createUnregisteredClause(iVecInt1);
      int int0 = sizeComparator0.compare(constr0, (Constr) unitClause0);
      assertEquals(1, int0);
  }
}
