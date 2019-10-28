/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 21:16:26 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NewMoveEventAction_ESTest extends NewMoveEventAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(player0).getCurrent_x();
      doReturn(0).when(player0).getCurrent_y();
      MoveEvent moveEvent0 = new MoveEvent(player0, 0);
      Player player1 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(player1).getCurrent_x();
      doReturn(0, 0).when(player1).getCurrent_y();
      doReturn(0, 0, 0, 0).when(player1).getPlayerNumber();
      MoveEvent moveEvent1 = new MoveEvent(player1, (-214));
      handballModel0.setActualMoveEvent(moveEvent1);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(moveEvent0, 550, "");
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(0L, actionEvent0.getWhen());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      newMoveEventAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        newMoveEventAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.NewMoveEventAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
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
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(3678, 3678);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0).when(moveEvent0).getPlayer();
      doReturn(9, 3678, 1).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Offender) null).when(moveEvent0).getPlayer();
      doReturn(0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(0, 0);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0).when(moveEvent0).getPlayer();
      doReturn(1, 0).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      DefaultEditorKit.CutAction defaultEditorKit_CutAction0 = new DefaultEditorKit.CutAction();
      ActionEvent actionEvent0 = new ActionEvent(defaultEditorKit_CutAction0, 1, "k6b\u0000+TLn");
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(1, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(3678, 3678);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0).when(moveEvent0).getPlayer();
      doReturn(9, 3678, 1).when(moveEvent0).getSequenceNr();
      doReturn(true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 81, "");
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(81, actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.actionPerformed((ActionEvent) null);
  }
}
