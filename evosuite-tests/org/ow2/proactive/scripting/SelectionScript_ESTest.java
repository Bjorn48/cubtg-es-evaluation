/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 18 22:40:10 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.script.Bindings;
import javax.script.SimpleBindings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.Script;
import org.ow2.proactive.scripting.ScriptResult;
import org.ow2.proactive.scripting.SelectionScript;
import org.ow2.proactive.scripting.SimpleScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SelectionScript_ESTest extends SelectionScript_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("@fQ +q_9Q", "ZO|iKdFNQUP.[GRl|", false);
      selectionScript0.id = "JIdjnNiS5BgG";
      String string0 = selectionScript0.toString();
      assertEquals("834325802\n@fQ +q_9Q", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript(") call failed.", (String) null, true);
      byte[] byteArray0 = new byte[3];
      byte[] byteArray1 = new byte[7];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertTrue(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("}Z?3", "", (Serializable[]) null, true);
      selectionScript0.setScript("(<~TJ");
      String string0 = selectionScript0.getId();
      assertTrue(selectionScript0.isDynamic());
      assertEquals("}Z?3", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.prepareSpecialBindings(simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("> QjyO!", "> QjyO!");
      String string0 = selectionScript0.toString();
      assertEquals("1327442633\n> QjyO!", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("@fQ +q_9Q", "ZO|iKdFNQUP.[GRl|", false);
      boolean boolean0 = selectionScript0.isDynamic();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      selectionScript0.id_ = byteArray0;
      linkedList0.offerFirst(selectionScript0);
      assertTrue(selectionScript0.isDynamic());
      
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals((-1807454463), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      selectionScript0.setScript("hk");
      selectionScript0.getReader();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, true);
      String string0 = selectionScript0.getId();
      assertTrue(selectionScript0.isDynamic());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[2];
      SelectionScript selectionScript0 = new SelectionScript("", "", serializableArray0, false);
      String string0 = selectionScript0.getId();
      assertFalse(selectionScript0.isDynamic());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("> QjyO!", "> QjyO!");
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        selectionScript0.getResult(object0, (Bindings) null);
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
      SelectionScript selectionScript0 = new SelectionScript();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        selectionScript0.compareByteArray((byte[]) null, byteArray0);
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
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, serializableArray0);
      SelectionScript selectionScript0 = new SelectionScript(simpleScript0, true);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, (Serializable[]) null, false);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, (Serializable[]) null);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, false);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "", serializableArray0, false);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "SHA-1", serializableArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "!- i~{", false);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, "MD5");
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[1];
      serializableArray0[0] = (Serializable) selectionScript0;
      SelectionScript selectionScript1 = null;
      try {
        selectionScript1 = new SelectionScript("0LedZe?JD;f", "selected", serializableArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[7];
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, serializableArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      File file0 = new File("\n");
      String[] stringArray0 = Locale.getISOLanguages();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      selectionScript0.buildSelectionScriptId();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[4];
      Script<String> script0 = (Script<String>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn(serializableArray0).when(script0).getParameters();
      doReturn("common name of the certificate subject: ").when(script0).getScript();
      doReturn("").when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      selectionScript0.buildSelectionScriptId();
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      File file0 = MockFile.createTempFile("org.apache.log4j.CategoryKey", "org.apache.log4j.CategoryKey");
      Serializable[] serializableArray0 = new Serializable[9];
      SelectionScript selectionScript0 = new SelectionScript(file0, serializableArray0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      File file0 = MockFile.createTempFile("false", "You have tried to set a null error-handler.");
      Serializable[] serializableArray0 = new Serializable[5];
      SelectionScript selectionScript0 = new SelectionScript(file0, serializableArray0, true);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("L=gy[H_EqHy-,HZ=", "log4j.reset");
      selectionScript0.hashCode();
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      Script<MockFileInputStream> script0 = (Script<MockFileInputStream>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      linkedList0.add(selectionScript0);
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(1693105774, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      linkedList0.add(selectionScript0);
      // Undeclared exception!
      try { 
        SelectionScript.hashCodeFromList(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LinkedList<SelectionScript> linkedList0 = new LinkedList<SelectionScript>();
      int int0 = SelectionScript.hashCodeFromList(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = SelectionScript.hashCodeFromList((List<SelectionScript>) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Script<CharBuffer> script0 = (Script<CharBuffer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      byte[] byteArray0 = selectionScript0.digest();
      byte[] byteArray1 = new byte[2];
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray1);
      assertFalse(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Script<CharBuffer> script0 = (Script<CharBuffer>) mock(Script.class, new ViolatedAssumptionAnswer());
      doReturn((Serializable[]) null).when(script0).getParameters();
      doReturn((String) null).when(script0).getScript();
      doReturn((String) null).when(script0).getScriptName();
      SelectionScript selectionScript0 = new SelectionScript(script0, false);
      byte[] byteArray0 = selectionScript0.digest();
      boolean boolean0 = selectionScript0.compareByteArray(byteArray0, byteArray0);
      assertTrue(boolean0);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("?=RVzbgV%<HsV", "<mmc[WkPz)iS(n@>Pg", true);
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
  public void test37()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("?=RVzbgV%<HsV", "<mmc[WkPz)iS(n@>Pg", true);
      boolean boolean0 = selectionScript0.equals(selectionScript0);
      assertTrue(boolean0);
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      boolean boolean0 = selectionScript0.equals("selected");
      assertTrue(selectionScript0.isDynamic());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      simpleBindings0.put("selected", (Object) ") call failed.");
      ScriptResult<Boolean> scriptResult0 = selectionScript0.getResult(") call failed.", simpleBindings0);
      assertFalse(scriptResult0.errorOccured());
      assertTrue(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript(") call failed.", ") call failed.", true);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      Object object0 = new Object();
      simpleBindings0.put("selected", object0);
      ScriptResult<Boolean> scriptResult0 = selectionScript0.getResult(1048576, simpleBindings0);
      assertTrue(selectionScript0.isDynamic());
      assertTrue(scriptResult0.errorOccured());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript(") call failed.", ") call failed.", false);
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.getResult(1048576, simpleBindings0);
      assertFalse(selectionScript0.isDynamic());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "Cn<w", (Serializable[]) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      File file0 = new File("\n");
      String[] stringArray0 = Locale.getISOLanguages();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(file0, stringArray0, false);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((Script<?>) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript((File) null, (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SelectionScript selectionScript0 = new SelectionScript(uRL0, (String) null, (Serializable[]) null);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
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
  public void test48()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, (Serializable[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
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
  public void test52()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.digest();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.security.MessageDigest", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
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
  public void test54()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("L=gy[H_EqHy-,HZ=", "log4j.reset");
      boolean boolean0 = selectionScript0.isDynamic();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, (Serializable[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      String string0 = selectionScript0.getDefaultScriptName();
      assertTrue(selectionScript0.isDynamic());
      assertEquals("SelectionScript", string0);
  }
}
