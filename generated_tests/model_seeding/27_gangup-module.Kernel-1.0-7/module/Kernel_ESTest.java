/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:19:36 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.MissingResourceException;
import java.util.Stack;
import module.ConfigModule;
import module.Kernel;
import module.Logger;
import module.Message;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.info();
      try { 
        kernel0.request("R#w8`s1&H'uNEf9", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "REGISTERED";
      try { 
        kernel0.unloadModule("REGISTERED");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=REGISTERED
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Message message0 = null;
      ArrayList<Module> arrayList0 = new ArrayList<Module>();
      Stack<Kernel> stack0 = new Stack<Kernel>();
      arrayList0.addAll((Collection<? extends Module>) stack0);
      Logger logger0 = null;
      try {
        logger0 = new Logger();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.subscribe((Module) null, "@=}");
      kernel0.unsubscribe((Module) null);
      ConfigModule configModule0 = null;
      try {
        configModule0 = new ConfigModule();
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}
