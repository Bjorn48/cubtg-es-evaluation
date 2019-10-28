/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:28:08 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintMoveAction_ESTest extends PrintMoveAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Book book0 = new Book();
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(player0).getCurrent_x();
      doReturn(0).when(player0).getCurrent_y();
      doReturn(0, 0, 0, 0).when(player0).getPlayerNumber();
      MoveEvent moveEvent0 = new MoveEvent(player0, 862);
      handballModel0.addMoveEvent(moveEvent0);
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      // Undeclared exception!
      try { 
        printMoveAction0.fillBook(book0, (PageFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.print.Book$BookPage", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Book book0 = new Book();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      // Undeclared exception!
      try { 
        printMoveAction0.fillBook(book0, (PageFormat) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.print.Book$BookPage", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PrintMoveAction printMoveAction0 = new PrintMoveAction(handballModel0);
      Book book0 = new Book();
      PageFormat pageFormat0 = new PageFormat();
      printMoveAction0.fillBook(book0, pageFormat0);
      assertEquals(1, book0.getNumberOfPages());
  }
}
