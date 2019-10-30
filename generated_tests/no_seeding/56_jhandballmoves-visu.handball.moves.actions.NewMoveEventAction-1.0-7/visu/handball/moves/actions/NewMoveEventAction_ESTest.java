/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 20:56:06 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.plaf.metal.MetalComboBoxUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
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
      Defender defender0 = new Defender(20, 20);
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1097, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(defender0, 1, "", 1097);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals(1097, actionEvent0.getModifiers());
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
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      Offender offender0 = new Offender(20, 20);
      MoveEvent moveEvent0 = new MoveEvent(offender0, 1);
      handballModel0.addMoveEvent(moveEvent0);
      handballModel0.setState(handballModel_State0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      newMoveEventAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      Defender defender0 = new Defender(0, (-494));
      MoveEvent moveEvent0 = new MoveEvent(defender0, 1);
      handballModel0.setActualMoveEvent(moveEvent0);
      assertTrue(moveEvent0.isMarked());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(0, 0);
      MoveEvent moveEvent0 = new MoveEvent(offender0, 0, 1);
      handballModel0.addMoveEvent(moveEvent0);
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT;
      handballModel0.setState(handballModel_State0);
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(moveEvent0, 0, " V[*^3dY1dg;Sl");
      // Undeclared exception!
      try { 
        newMoveEventAction0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.MoveEvent", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(newMoveEventAction0, (-2903), "2/-(d<BO`799", 1097);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals((-2903), actionEvent0.getID());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      NewMoveEventAction newMoveEventAction0 = new NewMoveEventAction(handballModel0);
      Defender defender0 = new Defender((-1723), 1740);
      MoveEvent moveEvent0 = new MoveEvent(defender0, (-2903), 80);
      handballModel0.setActualMoveEvent(moveEvent0);
      ActionEvent actionEvent0 = new ActionEvent(newMoveEventAction0, (-2903), "2/-(d<BO`799", 1097);
      newMoveEventAction0.actionPerformed(actionEvent0);
      assertEquals((-2903), actionEvent0.getID());
  }
}