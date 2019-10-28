/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:46:39 GMT 2019
 */

package bcry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import bcry.bcFileDialog;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class bcFileDialog_ESTest extends bcFileDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("data/temp/recent");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "xwNq=");
      bcFileDialog bcFileDialog0 = null;
      try {
        bcFileDialog0 = new bcFileDialog("xwNq=");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.javax.swing.MockJFileChooser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      bcFileDialog bcFileDialog0 = null;
      try {
        bcFileDialog0 = new bcFileDialog("", "");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.javax.swing.MockJFileChooser", e);
      }
  }
}
