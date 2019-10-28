/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Oct 25 20:42:51 GMT 2019
 */

package com.eteks.sweethome3d.model;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class HomePieceOfFurniture_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.eteks.sweethome3d.model.HomePieceOfFurniture"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HomePieceOfFurniture_ESTest_scaffolding.class.getClassLoader() ,
      "com.eteks.sweethome3d.model.HomeLight",
      "com.eteks.sweethome3d.tools.ResourceURLContent",
      "com.eteks.sweethome3d.model.TextStyle",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$10",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$SortableProperty",
      "com.eteks.sweethome3d.tools.URLContent",
      "com.eteks.sweethome3d.model.CatalogLight",
      "com.eteks.sweethome3d.model.HomeDoorOrWindow",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$15",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$16",
      "com.eteks.sweethome3d.model.DoorOrWindow",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$17",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$18",
      "com.eteks.sweethome3d.model.Content",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$11",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$12",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$13",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$14",
      "com.eteks.sweethome3d.model.Light",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$19",
      "com.eteks.sweethome3d.model.HomeTexture",
      "com.eteks.sweethome3d.model.FurnitureCategory",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$Property",
      "com.eteks.sweethome3d.model.Selectable",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$9",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$8",
      "com.eteks.sweethome3d.model.PieceOfFurniture",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.model.HomeFurnitureGroup",
      "com.eteks.sweethome3d.model.BackgroundImage",
      "com.eteks.sweethome3d.model.Elevatable",
      "com.eteks.sweethome3d.model.LightSource",
      "com.eteks.sweethome3d.model.Level",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$5",
      "com.eteks.sweethome3d.model.Sash",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$4",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$7",
      "com.eteks.sweethome3d.model.CatalogPieceOfFurniture",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$6",
      "com.eteks.sweethome3d.tools.TemporaryURLContent",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$1",
      "com.eteks.sweethome3d.model.CatalogDoorOrWindow",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$3",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$2",
      "com.eteks.sweethome3d.model.TextureImage"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.eteks.sweethome3d.model.Content", false, HomePieceOfFurniture_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.eteks.sweethome3d.model.LightSource", false, HomePieceOfFurniture_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.beans.PropertyChangeListener", false, HomePieceOfFurniture_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HomePieceOfFurniture_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$SortableProperty",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$1",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$2",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$3",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$4",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$5",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$6",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$7",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$8",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$9",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$10",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$11",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$12",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$13",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$14",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$15",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$16",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$17",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$18",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$19",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture",
      "com.eteks.sweethome3d.model.HomePieceOfFurniture$Property",
      "com.eteks.sweethome3d.tools.URLContent",
      "com.eteks.sweethome3d.model.LightSource",
      "com.eteks.sweethome3d.model.CatalogLight",
      "com.eteks.sweethome3d.model.HomeLight",
      "com.eteks.sweethome3d.tools.TemporaryURLContent",
      "com.eteks.sweethome3d.tools.ResourceURLContent",
      "com.eteks.sweethome3d.model.Sash",
      "com.eteks.sweethome3d.model.CatalogDoorOrWindow",
      "com.eteks.sweethome3d.model.CatalogTexture",
      "com.eteks.sweethome3d.model.HomeDoorOrWindow",
      "com.eteks.sweethome3d.model.TextStyle",
      "com.eteks.sweethome3d.tools.OperatingSystem",
      "com.eteks.sweethome3d.tools.OperatingSystem$1",
      "com.eteks.sweethome3d.tools.OperatingSystem$2",
      "com.eteks.sweethome3d.model.CatalogPieceOfFurniture",
      "com.eteks.sweethome3d.model.FurnitureCategory",
      "com.eteks.sweethome3d.model.HomeTexture",
      "com.eteks.sweethome3d.model.HomeFurnitureGroup",
      "com.eteks.sweethome3d.model.Level"
    );
  }
}
