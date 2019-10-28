/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:48:06 GMT 2019
 */

package fr.pingtimeout.jtail.gui.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.pingtimeout.jtail.gui.controller.UpdateIndexFileWatcher;
import fr.pingtimeout.jtail.io.FileIndexer;
import fr.pingtimeout.jtail.io.index.RamFileIndex;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UpdateIndexFileWatcher_ESTest extends UpdateIndexFileWatcher_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("4o,-6MS/{f6 s$Q?}", "4o,-6MS/{f6 s$Q?}");
      mockFile0.createNewFile();
      Class<RamFileIndex> class0 = RamFileIndex.class;
      FileIndexer fileIndexer0 = new FileIndexer(mockFile0, class0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("4o,-6MS/{f6 s$Q?}/4o,-6MS/{f6 s$Q?}");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "4o,-6MS/{f6 s$Q?}");
      fileIndexer0.index();
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "i.py4a");
      updateIndexFileWatcher0.fileChanged();
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("4o,-6MS/{f6 s$Q?}", "4o,-6MS/{f6 s$Q?}");
      mockFile0.createNewFile();
      Class<RamFileIndex> class0 = RamFileIndex.class;
      FileIndexer fileIndexer0 = new FileIndexer(mockFile0, class0);
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.processIndexation((-1));
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UpdateIndexFileWatcher updateIndexFileWatcher0 = null;
      try {
        updateIndexFileWatcher0 = new UpdateIndexFileWatcher((FileIndexer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.pingtimeout.jtail.gui.controller.UpdateIndexFileWatcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("_.M[%[ZE", "_.M[%[ZE");
      FileIndexer fileIndexer0 = new FileIndexer(file0);
      UpdateIndexFileWatcher updateIndexFileWatcher0 = new UpdateIndexFileWatcher(fileIndexer0);
      updateIndexFileWatcher0.fileChanged();
      assertEquals(0L, updateIndexFileWatcher0.scheduledExecutionTime());
  }
}
