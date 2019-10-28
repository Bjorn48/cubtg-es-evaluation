/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 23:30:26 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.MissingResourceException;
import module.ClientNetworkModule;
import module.ConfigModule;
import module.Kernel;
import module.Message;
import module.MessageFactory;
import module.Module;
import module.ModuleInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kernel_ESTest extends Kernel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Kernel kernel0 = new Kernel();
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
  public void test01()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      LinkedList<Module> linkedList0 = new LinkedList<Module>();
      Message message0 = new Message();
      Message message1 = new Message();
      kernel0.sendMessageNotify(linkedList0, message1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "util.ManagedObject";
      try { 
        kernel0.loadModule("util.ManagedObject");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.IllegalAccessException: Class module.Kernel can not access a member of class util.ManagedObject with modifiers \"protected\"
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.request((Message) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Sorry, requests are not implemented in Kernel
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "";
      Message message0 = new Message((String) null, (String) null, (Object) null);
      message0.getHeader();
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
  public void test05()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = null;
      try { 
        kernel0.loadModule((String) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      ModuleInfo moduleInfo0 = kernel0.info();
      assertEquals("{cmds=DUMP LOAD UNLOAD LIST EXISTS, topics=KERNEL, name=Kernel, file=Kernel.java, date=2004/05/01 23:20:45 , author=bja , desc=This class provides a message delivery system. It's primary task is to manage loaded modules. It has methods for loading and unloading modules, type=, revision=1.7 , build=, tag=}", moduleInfo0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getThread();
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

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "UNLOAD";
      try { 
        kernel0.loadModule("UNLOAD");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class 'UNLOAD.class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      Kernel kernel1 = new Kernel();
      kernel1.getKernel();
      ClientNetworkModule clientNetworkModule0 = null;
      try {
        clientNetworkModule0 = new ClientNetworkModule((Kernel) null);
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "~Q*M:&MgOMM]Jr";
      kernel0.unsubscribe((Module) null);
      Message message0 = null;
      try { 
        kernel0.sendMessage((Message) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      String string0 = "";
      try { 
        kernel0.unloadModule("");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.request("$fb]@T<", "!Ubeg");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      MessageFactory messageFactory0 = MessageFactory.getInstance();
      Message message0 = messageFactory0.createMessage();
      message0.getBody();
      Message message1 = new Message();
      Message message2 = new Message();
      kernel0.receiveMessage(message2);
      String string0 = ",t xqbrjbk1]id\"";
      try { 
        kernel0.loadModule(",t xqbrjbk1]id\"");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.lang.ClassNotFoundException: Class ',t xqbrjbk1]id\".class' should be in target project, but could not be found!
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      try { 
        kernel0.request("", "");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Requests are not implemented
         //
         verifyException("module.Kernel", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Kernel kernel0 = new Kernel();
      kernel0.getThread();
      String string0 = "";
      try { 
        kernel0.unregister((Module) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // mod=null
         //
         verifyException("module.Kernel", e);
      }
  }
}
