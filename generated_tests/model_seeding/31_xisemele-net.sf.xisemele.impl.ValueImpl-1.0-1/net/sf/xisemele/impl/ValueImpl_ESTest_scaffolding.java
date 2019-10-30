/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 25 15:43:57 GMT 2019
 */

package net.sf.xisemele.impl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ValueImpl_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.sf.xisemele.impl.ValueImpl"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ValueImpl_ESTest_scaffolding.class.getClassLoader() ,
      "net.sf.xisemele.api.Element",
      "net.sf.xisemele.impl.FormatterProvider",
      "net.sf.xisemele.impl.WriterEditor",
      "net.sf.xisemele.api.Result",
      "net.sf.xisemele.impl.ValueImpl",
      "net.sf.xisemele.exception.XisemeleException",
      "net.sf.xisemele.impl.Validations",
      "net.sf.xisemele.exception.FormatterNotConfiguredException",
      "net.sf.xisemele.api.Writer",
      "net.sf.xisemele.api.Value",
      "net.sf.xisemele.api.Editor",
      "net.sf.xisemele.exception.XisemeleIOException",
      "net.sf.xisemele.api.Reader",
      "net.sf.xisemele.impl.FactoryImpl",
      "net.sf.xisemele.exception.FormatterException",
      "net.sf.xisemele.api.ValueList",
      "net.sf.xisemele.api.Formatter",
      "net.sf.xisemele.impl.ValueImpl$11",
      "net.sf.xisemele.impl.ValueImpl$4",
      "net.sf.xisemele.impl.ValueImpl$3",
      "net.sf.xisemele.impl.ValueImpl$10",
      "net.sf.xisemele.impl.ValueImpl$2",
      "net.sf.xisemele.impl.Operations",
      "net.sf.xisemele.impl.ValueImpl$1",
      "net.sf.xisemele.impl.ValueImpl$12",
      "net.sf.xisemele.impl.FormatterProviderImpl",
      "net.sf.xisemele.impl.ValueImpl$8",
      "net.sf.xisemele.impl.ValueImpl$7",
      "net.sf.xisemele.impl.ValueImpl$6",
      "net.sf.xisemele.impl.ValueImpl$5",
      "net.sf.xisemele.impl.Message",
      "net.sf.xisemele.impl.DateFormatter",
      "net.sf.xisemele.impl.WithinContext",
      "net.sf.xisemele.impl.ValueImpl$Parser",
      "net.sf.xisemele.impl.ValueImpl$9",
      "net.sf.xisemele.impl.Factory",
      "net.sf.xisemele.impl.OperationsHelper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ValueImpl_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.sf.xisemele.impl.ValueImpl",
      "net.sf.xisemele.impl.ValueImpl$1",
      "net.sf.xisemele.impl.ValueImpl$2",
      "net.sf.xisemele.impl.ValueImpl$3",
      "net.sf.xisemele.impl.ValueImpl$4",
      "net.sf.xisemele.impl.ValueImpl$5",
      "net.sf.xisemele.impl.ValueImpl$6",
      "net.sf.xisemele.impl.ValueImpl$7",
      "net.sf.xisemele.impl.ValueImpl$8",
      "net.sf.xisemele.impl.ValueImpl$9",
      "net.sf.xisemele.impl.ValueImpl$10",
      "net.sf.xisemele.impl.ValueImpl$11",
      "net.sf.xisemele.impl.ValueImpl$12",
      "net.sf.xisemele.impl.FactoryImpl",
      "net.sf.xisemele.impl.MessageImpl",
      "net.sf.xisemele.impl.DateFormatter",
      "net.sf.xisemele.exception.XisemeleException",
      "net.sf.xisemele.exception.FormatterException",
      "net.sf.xisemele.exception.FormatterNotConfiguredException",
      "net.sf.xisemele.impl.WithinContextImpl",
      "net.sf.xisemele.impl.ValidationsImpl",
      "net.sf.xisemele.impl.ValueListImpl",
      "net.sf.xisemele.impl.NullErrorHandler",
      "net.sf.xisemele.impl.OperationsImpl",
      "net.sf.xisemele.impl.OperationsHelperImpl",
      "net.sf.xisemele.impl.ResultImpl",
      "net.sf.xisemele.impl.ElementImpl",
      "net.sf.xisemele.exception.XisemeleIOException",
      "net.sf.xisemele.impl.WriterImpl",
      "net.sf.xisemele.impl.WriterEditorImpl",
      "net.sf.xisemele.impl.EditorImpl",
      "net.sf.xisemele.impl.ReaderImpl",
      "net.sf.xisemele.impl.FormatterProviderImpl"
    );
  }
}