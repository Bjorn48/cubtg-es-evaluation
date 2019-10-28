/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 01:56:43 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StopAnimationAction_ESTest extends StopAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StopAnimationAction stopAnimationAction0 = null;
      try {
        stopAnimationAction0 = new StopAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StopAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      stopAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.getNearestPlayer(1, 1);
      handballModel0.getActualMoveEvent();
      handballModel0.setActualMoveEvent((MoveEvent) null);
      handballModel0.getMoveEvents(1338);
      HandballModel handballModel1 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Player) null, (Player) null).when(moveEvent0).getPlayer();
      doReturn(1, 0, 0, 0).when(moveEvent0).getSequenceNr();
      doReturn(true, false).when(moveEvent0).isDestinationPointSet();
      handballModel1.setActualMoveEvent(moveEvent0);
      handballModel1.startAnimation(true);
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel1);
      stopAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Player) null, (Player) null, (Player) null).when(moveEvent0).getPlayer();
      doReturn(1, 1, 1, 793, 0).when(moveEvent0).getSequenceNr();
      doReturn(true, true, false).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      handballModel0.startAnimation(true);
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, 1, "");
      stopAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      ActionEvent actionEvent0 = new ActionEvent(integer0, 1, "");
      stopAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.PLACE_OFFENDERS, handballModel0.getState());
  }
}
