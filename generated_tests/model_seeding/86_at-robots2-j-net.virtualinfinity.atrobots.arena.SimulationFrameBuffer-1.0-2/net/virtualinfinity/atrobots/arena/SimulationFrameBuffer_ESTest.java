/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 16:51:14 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import net.virtualinfinity.atrobots.arena.SimulationFrame;
import net.virtualinfinity.atrobots.arena.SimulationFrameBuffer;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.gui.ArenaPane;
import net.virtualinfinity.atrobots.gui.RobotStatusPane;
import net.virtualinfinity.atrobots.snapshots.ArenaObjectSnapshot;
import net.virtualinfinity.atrobots.snapshots.RobotSnapshot;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimulationFrameBuffer_ESTest extends SimulationFrameBuffer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      ArrayList<ArenaObjectSnapshot> arrayList0 = new ArrayList<ArenaObjectSnapshot>();
      LinkedHashSet<RobotSnapshot> linkedHashSet0 = new LinkedHashSet<RobotSnapshot>(255);
      SimulationFrame simulationFrame0 = new SimulationFrame(arrayList0, linkedHashSet0, true);
      simulationFrameBuffer0.setFrame(simulationFrame0);
      SimulationFrame simulationFrame1 = simulationFrameBuffer0.getCurrentFrame();
      assertTrue(simulationFrame1.isRoundOver());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.observers = null;
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.setFrame((SimulationFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.SimulationFrameBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.addSimulationObserver((SimulationObserver) null);
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.setFrame((SimulationFrame) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.SimulationFrameBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.observers = null;
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.removeSimulationObserver((SimulationObserver) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.SimulationFrameBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      TreeSet<SimulationObserver> treeSet0 = new TreeSet<SimulationObserver>();
      simulationFrameBuffer0.observers = (Collection<SimulationObserver>) treeSet0;
      ArenaPane arenaPane0 = new ArenaPane();
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.removeSimulationObserver(arenaPane0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.virtualinfinity.atrobots.gui.ArenaPane cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      List list0 = robotStatusPane0.getSelectedValuesList();
      simulationFrameBuffer0.observers = (Collection<SimulationObserver>) list0;
      ArenaPane arenaPane0 = new ArenaPane();
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.addSimulationObserver(arenaPane0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.observers = null;
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.addSimulationObserver(robotStatusPane0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.SimulationFrameBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TreeSet<SimulationObserver> treeSet0 = new TreeSet<SimulationObserver>();
      ArenaPane arenaPane0 = new ArenaPane();
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      simulationFrameBuffer0.observers = (Collection<SimulationObserver>) treeSet0;
      // Undeclared exception!
      try { 
        simulationFrameBuffer0.addSimulationObserver(arenaPane0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // net.virtualinfinity.atrobots.gui.ArenaPane cannot be cast to java.lang.Comparable
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      ArenaPane arenaPane0 = new ArenaPane();
      simulationFrameBuffer0.addSimulationObserver(arenaPane0);
      SimulationFrame simulationFrame0 = simulationFrameBuffer0.getCurrentFrame();
      simulationFrameBuffer0.setFrame(simulationFrame0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      ArrayList<ArenaObjectSnapshot> arrayList0 = new ArrayList<ArenaObjectSnapshot>();
      LinkedHashSet<RobotSnapshot> linkedHashSet0 = new LinkedHashSet<RobotSnapshot>(255);
      SimulationFrame simulationFrame0 = new SimulationFrame(arrayList0, linkedHashSet0, false);
      simulationFrameBuffer0.setFrame(simulationFrame0);
      SimulationFrame simulationFrame1 = simulationFrameBuffer0.getCurrentFrame();
      assertFalse(simulationFrame1.isRoundOver());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimulationFrameBuffer simulationFrameBuffer0 = new SimulationFrameBuffer();
      RobotStatusPane robotStatusPane0 = RobotStatusPane.createRobotStatusPane();
      simulationFrameBuffer0.removeSimulationObserver(robotStatusPane0);
      assertFalse(robotStatusPane0.isFocusTraversalPolicyProvider());
  }
}
