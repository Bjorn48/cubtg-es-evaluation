/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 28 16:12:48 GMT 2019
 */

package ipac;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class IPAC_Applet_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "ipac.IPAC_Applet"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IPAC_Applet_ESTest_scaffolding.class.getClassLoader() ,
      "ipac.IPv6",
      "ipac.IPv4$9",
      "ipac.IPv4$8",
      "ipac.IPv4$7",
      "ipac.IPv4$6",
      "ipac.IPv4$5",
      "ipac.IPv4$4",
      "ipac.IPv4",
      "ipac.IPv4$3",
      "ipac.WhoIS",
      "ipac.IPv4$2",
      "ipac.IPv4$1",
      "ipac.IPAC_Applet$3",
      "ipac.IPv4$18",
      "ipac.IPAC_Applet$4",
      "ipac.IPv4$17",
      "ipac.IPAC_Applet$1",
      "ipac.IPAC_Applet$2",
      "ipac.IPv4$19",
      "ipac.IPv4$25",
      "ipac.IPv4$24",
      "ipac.IPv4$27",
      "ipac.IPv4$26",
      "ipac.IPv4$21",
      "ipac.IPv4$20",
      "ipac.IPv4$23",
      "ipac.IPv4$22",
      "ipac.IPAC_Applet",
      "ipac.IPv4$28",
      "ipac.IPv4$14",
      "ipac.IPv4$13",
      "ipac.IPv4$16",
      "ipac.IPv4$15",
      "ipac.IPv4$10",
      "ipac.IPv4$12",
      "ipac.IPv4$11"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IPAC_Applet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "ipac.IPAC_Applet",
      "ipac.IPAC_Applet$1",
      "ipac.IPAC_Applet$2",
      "ipac.IPAC_Applet$3",
      "ipac.IPAC_Applet$4",
      "ipac.IPv4",
      "ipac.IPv4$1",
      "ipac.IPv4$2",
      "ipac.IPv4$3",
      "ipac.IPv4$4",
      "ipac.IPv4$5",
      "ipac.IPv4$6",
      "ipac.IPv4$7",
      "ipac.IPv4$8",
      "ipac.IPv4$9",
      "ipac.IPv4$10",
      "ipac.IPv4$11",
      "ipac.IPv4$12",
      "ipac.IPv4$13",
      "ipac.IPv4$14",
      "ipac.IPv4$15",
      "ipac.IPv4$16",
      "ipac.IPv4$17",
      "ipac.IPv4$18",
      "ipac.IPv4$19",
      "ipac.IPv4$20",
      "ipac.IPv4$21",
      "ipac.IPv4$22",
      "ipac.IPv4$23",
      "ipac.IPv4$24",
      "ipac.IPv4$25",
      "ipac.IPv4$26",
      "ipac.IPv4$27",
      "ipac.IPv4$28"
    );
  }
}