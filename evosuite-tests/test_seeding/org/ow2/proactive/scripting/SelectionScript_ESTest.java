/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 08:10:21 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import javax.script.Bindings;
import javax.script.SimpleBindings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.Script;
import org.ow2.proactive.scripting.ScriptResult;
import org.ow2.proactive.scripting.SelectionScript;
import org.ow2.proactive.scripting.SimpleScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionScript_ESTest extends SelectionScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("DzSDF0]#J/GtuOv`~s;", "DzSDF0]#J/GtuOv`~s;", true);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte) (-96);
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertTrue(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("qi3d;yT4|]JMsvz}dw", "");
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      selectionScript0.id = "org.apache.commons.io.filefilter.FileFileFilter";
      // Undeclared exception!
      try { 
        selectionScript0.getReader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript(" 2q .U0xD*$[lEtZ[=O", "n");
      selectionScript0.hashCode();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, "6T^tP@ )n8?9:");
      selectionScript0.prepareSpecialBindings((Bindings) null);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("/!Y]&Bfiv2_=>", ":h[rxE", false);
      boolean boolean0 = selectionScript0.isDynamic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript((String) null, "6T^tP@ )n8?9:");
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      linkedList0.add(selectionScript0);
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(779278683, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("javascript", "SSL");
      selectionScript0.getReader();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      selectionScript0.id = "org.apache.commons.io.filefilter.FileFileFilter";
      String string0 = selectionScript0.getId();
      assertEquals("org.apache.commons.io.filefilter.FileFileFilter", string0);
      assertNotNull(string0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[1];
      SelectionScript selectionScript0 = new SelectionScript("", "", serializableArray0, false);
      String string0 = selectionScript0.getId();
      assertEquals("", string0);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[1];
      SelectionScript selectionScript0 = new SelectionScript("FLL`i", "FLL`i", serializableArray0, true);
      selectionScript0.digest();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.getResult((Object) null, (Bindings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("javascript", "SSL");
      SelectionScript selectionScript1 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.equals(selectionScript1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.compareByteArray((byte[]) null, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[2];
      serializableArray0[0] = (Serializable) selectionScript0;
      selectionScript0.parameters = serializableArray0;
      // Undeclared exception!
      try { 
        selectionScript0.buildSelectionScriptId();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[7];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, serializableArray0);
      SelectionScript selectionScript0 = new SelectionScript(simpleScript0, true);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, (Serializable[]) null, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, serializableArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, true);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "/fooExample", serializableArray0, true);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "/fooExample", serializableArray0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "/fooExample", false);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "http://www.someFakeButWellFormedURL.org/fooExample");
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[2];
      serializableArray0[0] = (Serializable) selectionScript0;
      SelectionScript selectionScript1 = null;
      try {
        selectionScript1 = new SelectionScript("selected", "</tr>", serializableArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      File file0 = new File("");
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, (Serializable[]) null, false);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[1];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, serializableArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("DzSDF0]#J/GtuOv`~s;", "DzSDF0]#J/GtuOv`~s;", true);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-82);
      byte[] byteArray1 = new byte[3];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("Bad result format : awaited Boolean (or Integer when not existing), found ", "%0x~B");
      selectionScript0.buildSelectionScriptId();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[2];
      selectionScript0.parameters = serializableArray0;
      selectionScript0.buildSelectionScriptId();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("*u22");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      File file0 = new File("*u22");
      SelectionScript selectionScript0 = new SelectionScript(file0, (Serializable[]) null);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      File file0 = MockFile.createTempFile("(_|QkQ+c%", "");
      Serializable[] serializableArray0 = new Serializable[1];
      SelectionScript selectionScript0 = new SelectionScript(file0, serializableArray0, true);
      String string0 = selectionScript0.toString();
      assertEquals("-1070038893\n", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      SelectionScript selectionScript0 = new SelectionScript("", "");
      linkedList0.add(selectionScript0);
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals((-461658112), int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      linkedList0.add((SelectionScript) null);
      // Undeclared exception!
      try { 
        SelectionScript.hashCodeFromList(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.SelectionScript", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      int int0 = SelectionScript.hashCodeFromList((List<SelectionScript>) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[1];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray0);
      assertTrue(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[0];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("javascript", "SSL");
      SelectionScript selectionScript1 = new SelectionScript("javascript", "args", false);
      boolean boolean0 = selectionScript0.equals(selectionScript1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      boolean boolean0 = selectionScript0.equals(selectionScript0);
      assertTrue(selectionScript0.isDynamic());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      boolean boolean0 = selectionScript0.equals((Object) null);
      assertFalse(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("selected", (Object) selectionScript0);
      ScriptResult<Boolean> scriptResult0 = selectionScript0.getResult(simpleBindings0, simpleBindings0);
      assertTrue(scriptResult0.errorOccured());
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("selected", (Object) "selected");
      ScriptResult<Boolean> scriptResult0 = selectionScript0.getResult((Object) null, simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
      assertFalse(scriptResult0.errorOccured());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.getResult(simpleBindings0, simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[1];
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, "", (Serializable[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, (Serializable[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((Script<?>) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      File file0 = new File("*u22");
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, (Serializable[]) null);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/*u22
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, "o9gkJg/", (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, "===BEGIN ICANN DOMAINS===", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.digest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("%0x~B", "%0x~B");
      boolean boolean0 = selectionScript0.isDynamic();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      String string0 = selectionScript0.getId();
      assertTrue(selectionScript0.isDynamic());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((URL) null, (Serializable[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      String string0 = selectionScript0.getDefaultScriptName();
      assertTrue(selectionScript0.isDynamic());
      assertEquals("SelectionScript", string0);
  }
}