/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:32:24 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewMoveEventAction_ESTest extends NewMoveEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(1714, 1714);
      offender0.resetPosition();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0).when(moveEvent0).getPlayer();
      doReturn(Integer.MIN_VALUE, 0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 1266, "", (-778L), 1266);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewMoveEventAction newMoveEventAction0 = null;
      try {
        newMoveEventAction0 = new NewMoveEventAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.NewMoveEventAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(149, 149);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(149, 149).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      handballModel0.removeEventsAfter();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(149, 149);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(149, 149, 149, 0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
      newMoveEventAction0.actionPerformed((ActionEvent) null);
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Defender defender0 = new Defender(149, 149);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(defender0).when(moveEvent0).getPlayer();
      doReturn(149, 149, 149).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
      assertEquals(149, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
  }
}
