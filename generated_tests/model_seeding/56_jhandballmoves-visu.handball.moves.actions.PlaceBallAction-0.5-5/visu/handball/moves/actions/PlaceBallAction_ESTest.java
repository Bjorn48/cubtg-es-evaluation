/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 29 13:10:11 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import javax.swing.plaf.synth.SynthSpinnerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PlaceBallAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaceBallAction_ESTest extends PlaceBallAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn((HandballModel.State) null).when(handballModel0).getState();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      // Undeclared exception!
      try { 
        placeBallAction0.modelChanged();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceBallAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(handballModel_State0).when(handballModel0).getState();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      SynthSpinnerUI synthSpinnerUI0 = new SynthSpinnerUI();
      placeBallAction0.addPropertyChangeListener(synthSpinnerUI0);
      // Undeclared exception!
      try { 
        placeBallAction0.modelChanged();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // visu.handball.moves.actions.PlaceBallAction cannot be cast to javax.swing.JSpinner
         //
         verifyException("javax.swing.plaf.synth.SynthSpinnerUI", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlaceBallAction placeBallAction0 = null;
      try {
        placeBallAction0 = new PlaceBallAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PlaceBallAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel.State handballModel_State0 = HandballModel.State.EDIT_EVENT;
      HandballModel.State handballModel_State1 = HandballModel.State.FULL_ANIMATION_ENDED;
      HandballModel handballModel0 = mock(HandballModel.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(handballModel0).addListener(any(visu.handball.moves.model.HandballModelListener.class));
      doReturn(handballModel_State0, handballModel_State0, handballModel_State1).when(handballModel0).getState();
      doReturn(true).when(handballModel0).passEventDefinedAfter(anyInt());
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.modelChanged();
      placeBallAction0.modelChanged();
      placeBallAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PlaceBallAction placeBallAction0 = new PlaceBallAction(handballModel0);
      placeBallAction0.actionPerformed((ActionEvent) null);
  }
}