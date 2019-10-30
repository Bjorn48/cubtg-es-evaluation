/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 14:23:09 GMT 2019
 */

package com.allenstudio.ir.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.core.plugins.CommonNote;
import com.allenstudio.ir.event.NoteListDataListener;
import com.allenstudio.ir.ui.DefaultNoteListModel;
import java.util.Enumeration;
import java.util.NoSuchElementException;
import javax.swing.plaf.synth.SynthTableHeaderUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DefaultNoteListModel_ESTest extends DefaultNoteListModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      SynthTableHeaderUI synthTableHeaderUI0 = new SynthTableHeaderUI();
      defaultNoteListModel0.fireItemRemoved(synthTableHeaderUI0, (-1));
      assertTrue(defaultNoteListModel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.fireItemAdded("", 2684);
      assertEquals(0, defaultNoteListModel0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.fireContentChanged(commonNote0, 1);
      assertEquals(10, defaultNoteListModel0.capacity());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.setElementAt(commonNote0, 1);
      assertFalse(commonNote0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.removeElementAt(0);
      assertEquals(0, defaultNoteListModel0.getSize());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.add(0, (AbstractNote) null);
      assertEquals(1, defaultNoteListModel0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote[] abstractNoteArray0 = defaultNoteListModel0.toArray();
      assertEquals(1, abstractNoteArray0.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.remove(0);
      assertEquals("C:\\boot.ini", abstractNote0.getFeature());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0, (-481));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.insertElementAt(commonNote0, 0);
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement((AbstractNote) null);
      AbstractNote abstractNote0 = defaultNoteListModel0.lastElement();
      assertNull(abstractNote0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.lastElement();
      assertFalse(abstractNote0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      boolean boolean0 = defaultNoteListModel0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) commonNote0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) commonNote0, 1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement((AbstractNote) null);
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      int int0 = defaultNoteListModel0.getSize();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.getElementAt(0);
      assertFalse(abstractNote0.isFocusTraversalPolicySet());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement((AbstractNote) null);
      AbstractNote abstractNote0 = defaultNoteListModel0.get(0);
      assertNull(abstractNote0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement((AbstractNote) null);
      CommonNote commonNote0 = new CommonNote();
      defaultNoteListModel0.set(0, commonNote0);
      defaultNoteListModel0.get(0);
      assertEquals("[com.allenstudio.ir.core.plugins.CommonNote[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]]", defaultNoteListModel0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      commonNote0.setIgnoreRepaint(true);
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.firstElement();
      assertTrue(abstractNote0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.firstElement();
      assertTrue(abstractNote0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.elementAt(1);
      assertEquals("This is a testing description. \u00CF\u00A3\u00CD\u00FB\u00C4\u00E3\u00C4\u00DC\u00BF\u00B4\u00B5\u00BD\u00CB\u00FC\u00A1\u00A3", abstractNote0.getDescription());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      boolean boolean0 = defaultNoteListModel0.contains(commonNote0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.set(2844, commonNote0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2844 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.removeNoteListDataListener();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.removeElement(commonNote0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.insertElementAt((AbstractNote) null, (-865));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.indexOf((AbstractNote) null, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemRemoved(commonNote0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemRemoved((Object) null, (-48));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemAdded(object0, (-2594));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireItemAdded((Object) null, (-279));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireContentChanged("w-,(V_V]9]", 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.fireContentChanged((Object) null, 2356);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.addElement(commonNote0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.add(0, (AbstractNote) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      boolean boolean0 = defaultNoteListModel0.removeElement(commonNote0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CommonNote commonNote0 = new CommonNote();
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.insertElementAt(commonNote0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.allenstudio.ir.ui.DefaultNoteListModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      String string0 = defaultNoteListModel0.toString();
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      AbstractNote[] abstractNoteArray0 = defaultNoteListModel0.toArray();
      assertEquals(0, abstractNoteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.remove(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      Enumeration<AbstractNote> enumeration0 = defaultNoteListModel0.elements();
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.get((-1782));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.lastElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      NoteListDataListener noteListDataListener0 = mock(NoteListDataListener.class, new ViolatedAssumptionAnswer());
      defaultNoteListModel0.addNoteListDataListener(noteListDataListener0);
      defaultNoteListModel0.addElement(commonNote0);
      defaultNoteListModel0.addElement(commonNote0);
      AbstractNote abstractNote0 = defaultNoteListModel0.set(1, commonNote0);
      assertEquals("C:\\boot.ini", abstractNote0.getFeature());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.elementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      boolean boolean0 = defaultNoteListModel0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.add(2, (AbstractNote) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2 > 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      int int0 = defaultNoteListModel0.lastIndexOf((AbstractNote) commonNote0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      int int0 = defaultNoteListModel0.indexOf((AbstractNote) commonNote0, 6);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.setElementAt(commonNote0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.firstElement();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      boolean boolean0 = defaultNoteListModel0.removeElement(commonNote0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      int int0 = defaultNoteListModel0.capacity();
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.getElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      // Undeclared exception!
      try { 
        defaultNoteListModel0.removeElementAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      DefaultNoteListModel defaultNoteListModel0 = new DefaultNoteListModel();
      CommonNote commonNote0 = new CommonNote();
      boolean boolean0 = defaultNoteListModel0.contains(commonNote0);
      assertFalse(boolean0);
  }
}