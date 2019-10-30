/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 15:17:19 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.AnimationModusAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Defender;
import visu.handball.moves.model.player.Offender;
import visu.handball.moves.model.player.Player;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnimationModusAction_ESTest extends AnimationModusAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      animationModusAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      animationModusAction0.addPropertyChangeListener(propertyChangeListener0);
      // Undeclared exception!
      try { 
        animationModusAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.AnimationModusAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      MetalComboBoxUI metalComboBoxUI0 = new MetalComboBoxUI();
      PropertyChangeListener propertyChangeListener0 = metalComboBoxUI0.createPropertyChangeListener();
      animationModusAction0.addPropertyChangeListener(propertyChangeListener0);
      ActionEvent actionEvent0 = new ActionEvent("z]%4<>|FOj(", 0, "=QY!iR|39FvL", 0);
      // Undeclared exception!
      try { 
        animationModusAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.AnimationModusAction cannot be cast to javax.swing.JComboBox
         //
         verifyException("javax.swing.plaf.basic.BasicComboBoxUI$Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnimationModusAction animationModusAction0 = null;
      try {
        animationModusAction0 = new AnimationModusAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.AnimationModusAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      Defender defender0 = new Defender((-2963), 2514);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      handballModel0.addMoveEvent(moveEvent0);
      assertEquals(HandballModel.State.EDIT_EVENT, handballModel0.getState());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.getFirstBallOwner();
      handballModel0.removePlayer((Player) null);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn((Offender) null, (Player) null).when(moveEvent0).getPlayer();
      doReturn(0, 0, 0, 0).when(moveEvent0).getSequenceNr();
      doReturn(true, false).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      handballModel0.startAnimation(true);
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((-4366)).when(player0).getCurrent_x();
      doReturn(400).when(player0).getCurrent_y();
      doReturn(843, 2, 10, 843).when(player0).getPlayerNumber();
      MoveEvent moveEvent1 = new MoveEvent(player0, 61);
      handballModel0.addMoveEvent(moveEvent1);
      assertFalse(moveEvent1.equals((Object)moveEvent0));
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((-4366)).when(player0).getCurrent_x();
      doReturn(400).when(player0).getCurrent_y();
      doReturn(843, 2, 10, 843).when(player0).getPlayerNumber();
      MoveEvent moveEvent0 = new MoveEvent(player0, 61);
      handballModel0.addMoveEvent(moveEvent0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      AnimationModusAction animationModusAction0 = new AnimationModusAction(handballModel0);
      Object object0 = new Object();
      ActionEvent actionEvent0 = new ActionEvent(object0, (-1454), "");
      animationModusAction0.actionPerformed(actionEvent0);
      assertEquals((-1454), actionEvent0.getID());
  }
}