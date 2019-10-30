/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 11:13:28 GMT 2019
 */

package fr.pingtimeout.jtail.gui.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.pingtimeout.jtail.gui.controller.FileIndexerWorker;
import fr.pingtimeout.jtail.io.FileIndexer;
import java.awt.HeadlessException;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileIndexerWorker_ESTest extends FileIndexerWorker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = MockFile.createTempFile("fr.pingtimeout.jtail.gui.action.ChooseFileAction", "fr.pingtimeout.jtail.gui.action.ChooseFileAction");
      FileIndexer fileIndexer0 = new FileIndexer(file0);
      FileIndexerWorker fileIndexerWorker0 = null;
      try {
        fileIndexerWorker0 = new FileIndexerWorker(fileIndexer0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileIndexerWorker fileIndexerWorker0 = null;
      try {
        fileIndexerWorker0 = new FileIndexerWorker((FileIndexer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.FileIndexerWorker", e);
      }
  }
}