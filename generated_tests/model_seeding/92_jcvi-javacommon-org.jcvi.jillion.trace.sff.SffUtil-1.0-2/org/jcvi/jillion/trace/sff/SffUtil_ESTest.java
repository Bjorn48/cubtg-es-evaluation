/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:58:51 GMT 2019
 */

package org.jcvi.jillion.trace.sff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jcvi.jillion.core.Range;
import org.jcvi.jillion.trace.sff.SffReadHeader;
import org.jcvi.jillion.trace.sff.SffUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SffUtil_ESTest extends SffUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Range range0 = Range.of(1701L);
      Range range1 = Range.of(4L);
      SffReadHeader sffReadHeader0 = mock(SffReadHeader.class, new ViolatedAssumptionAnswer());
      doReturn(range0).when(sffReadHeader0).getAdapterClip();
      doReturn((-2976)).when(sffReadHeader0).getNumberOfBases();
      doReturn(range1).when(sffReadHeader0).getQualityClip();
      // Undeclared exception!
      try { 
        SffUtil.computeTrimRangeFor(sffReadHeader0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // length can not be negative
         //
         verifyException("org.jcvi.jillion.core.Range$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = SffUtil.caclulatePaddedBytes((byte)57);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = SffUtil.toSffIndexOffsetValue(4294967295L);
      assertArrayEquals(new byte[] {(byte)3, (byte)6, (byte)4, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-110);
      long long0 = SffUtil.parseSffIndexOffsetValue(byteArray0);
      assertEquals(9493650L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)87;
      long long0 = SffUtil.parseSffIndexOffsetValue(byteArray0);
      assertEquals(22185L, long0);
  }
}
