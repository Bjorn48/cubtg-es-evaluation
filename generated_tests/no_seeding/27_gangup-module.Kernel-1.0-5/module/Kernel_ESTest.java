/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 18:19:21 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.MissingResourceException;
import module.ClientNetworkModule;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.register((Module) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=null
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "MapTilePane";
      String string1 = "fight";
      try { 
        kernel0.request("MapTilePane", "fight");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getKernel();
      ClientNetworkModule clientNetworkModule0 = null;
      try {
        clientNetworkModule0 = new ClientNetworkModule();
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
      String string0 = "";
      try { 
        kernel0.loadModule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: 
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Kernel kernel1 = new Kernel();
      try { 
        kernel0.unloadModule((Module) kernel1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=module.Kernel@4: Not registered!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.start();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Message message0 = MessageFactory.createWarningMessage("{V]d", (Object[]) null);
      // Undeclared exception!
      try { 
        kernel0.sendMessageNotify((Collection<Module>) null, message0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.processMessage((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "z[3";
      Message message0 = MessageFactory.createConnectionDroppedMessage(192, "z[3");
      try { 
        kernel0.request(message0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Sorry, requests are not implemented in Kernel
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "/nedWHnWIma";
      try { 
        kernel0.unloadModule("/nedWHnWIma");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=/nedWHnWIma
         //
         verifyException("module.Kernel", e);
      }
  }
}