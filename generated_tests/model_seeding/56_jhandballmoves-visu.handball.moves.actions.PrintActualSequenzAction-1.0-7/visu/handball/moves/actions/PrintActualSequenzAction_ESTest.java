/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:26:41 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintActualSequenzAction_ESTest extends PrintActualSequenzAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Book book0 = new Book();
      PageFormat pageFormat0 = new PageFormat();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      printActualSequenzAction0.fillBook(book0, pageFormat0);
      assertEquals(612.0, pageFormat0.getWidth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Book book0 = new Book();
      HandballModel handballModel0 = new HandballModel();
      PrintActualSequenzAction printActualSequenzAction0 = new PrintActualSequenzAction(handballModel0);
      // Undeclared exception!
      try { 
        printActualSequenzAction0.fillBook(book0, (PageFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.print.Book$BookPage", e);
      }
  }
}