/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 18:04:33 GMT 2019
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.virtualinfinity.atrobots.arena.LinearDamageFunction;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExplosionFunction_ESTest extends ExplosionFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("", 1, robotScoreKeeper0);
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction((Position) null, 1, 1);
      // Undeclared exception!
      try { 
        linearDamageFunction0.inflictDamage(robot0, robot0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.Position", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction((Position) null, (-1.0), (-1.0));
      // Undeclared exception!
      try { 
        linearDamageFunction0.getDamageAmount((ArenaObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.LinearDamageFunction", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinearDamageFunction linearDamageFunction0 = new LinearDamageFunction((Position) null, (-2542.7453730621114), (-2542.7453730621114));
      // Undeclared exception!
      try { 
        linearDamageFunction0.getCenter();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.virtualinfinity.atrobots.arena.LinearDamageFunction", e);
      }
  }
}
