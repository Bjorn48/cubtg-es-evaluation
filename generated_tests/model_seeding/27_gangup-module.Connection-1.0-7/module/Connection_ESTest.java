/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 22:16:02 GMT 2019
 */

package module;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.Socket;
import java.util.MissingResourceException;
import module.Connection;
import module.NetworkModule;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Connection_ESTest extends Connection_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Connection connection0 = null;
      try {
        connection0 = new Connection((NetworkModule) null, (Socket) null, (-652));
        fail("Expecting exception: MissingResourceException");
      
      } catch(MissingResourceException e) {
         //
         // Can't find bundle for base name gangup, locale en
         //
         verifyException("java.util.ResourceBundle", e);
      }
  }
}
