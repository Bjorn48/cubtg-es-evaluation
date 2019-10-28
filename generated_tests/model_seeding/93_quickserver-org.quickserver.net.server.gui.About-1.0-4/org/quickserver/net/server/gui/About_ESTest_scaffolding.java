/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 25 19:21:30 GMT 2019
 */

package org.quickserver.net.server.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class About_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.quickserver.net.server.gui.About"; 
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
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(About_ESTest_scaffolding.class.getClassLoader() ,
      "org.quickserver.util.xmlreader.ThreadObjectPoolConfig",
      "org.quickserver.net.server.ClientCommandHandler",
      "org.quickserver.net.server.AuthStatus",
      "org.quickserver.util.xmlreader.ObjectPoolConfig",
      "org.quickserver.net.server.QuickServer",
      "org.quickserver.util.xmlreader.ClientHandlerObjectPoolConfig",
      "org.quickserver.util.xmlreader.Secure",
      "org.quickserver.util.xmlreader.KeyStoreInfo",
      "org.quickserver.util.xmlreader.DatabaseConnectionConfig",
      "org.quickserver.net.server.ClientAuthenticationHandler",
      "org.quickserver.net.server.ClientExtendedEventHandler",
      "org.quickserver.net.server.ClientEventHandler",
      "org.quickserver.util.xmlreader.BasicServerConfig",
      "org.quickserver.net.server.ClientObjectHandler",
      "org.quickserver.util.xmlreader.PoolConfig",
      "org.quickserver.net.server.DataMode",
      "org.quickserver.util.xmlreader.ByteBufferObjectPoolConfig",
      "org.quickserver.util.xmlreader.ServerMode",
      "org.quickserver.net.server.ClientEvent",
      "org.quickserver.util.xmlreader.ClientDataObjectPoolConfig",
      "org.quickserver.util.xmlreader.DefaultDataMode",
      "org.quickserver.util.xmlreader.AccessConstraintConfig",
      "org.quickserver.util.xmlreader.QSAdminServerConfig",
      "org.quickserver.net.server.ClientHandler",
      "org.quickserver.net.server.ClientBinaryHandler",
      "org.quickserver.net.server.gui.About",
      "org.quickserver.net.ServerHook",
      "org.quickserver.util.xmlreader.QuickServerConfig",
      "org.quickserver.net.Service",
      "org.quickserver.net.server.ClientWriteHandler",
      "org.quickserver.net.server.gui.About$1",
      "org.quickserver.util.xmlreader.IpFilterConfig",
      "org.quickserver.util.xmlreader.InitServerHooks",
      "org.quickserver.net.server.TheClient",
      "org.quickserver.util.xmlreader.DBObjectPoolConfig",
      "org.quickserver.util.xmlreader.AdvancedSettings",
      "org.quickserver.util.xmlreader.ApplicationConfiguration",
      "org.quickserver.util.xmlreader.SecureStore",
      "org.quickserver.util.xmlreader.DatabaseConnectionSet",
      "org.quickserver.util.xmlreader.ServerHooks",
      "org.quickserver.util.xmlreader.TrustStoreInfo",
      "org.quickserver.net.AppException",
      "org.quickserver.util.xmlreader.Property",
      "org.quickserver.net.server.Authenticator",
      "org.quickserver.net.server.ClientData",
      "org.quickserver.net.server.DataType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(About_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.quickserver.net.server.gui.About",
      "org.quickserver.net.server.gui.About$1"
    );
  }
}
