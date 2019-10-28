/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 17:04:34 GMT 2019
 */

package net.sourceforge.squirrel_sql.fw.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Iterator;
import net.sourceforge.squirrel_sql.fw.id.IHasIdentifier;
import net.sourceforge.squirrel_sql.fw.id.UidIdentifier;
import net.sourceforge.squirrel_sql.fw.sql.DatabaseObjectType;
import net.sourceforge.squirrel_sql.fw.util.IObjectCacheChangeListener;
import net.sourceforge.squirrel_sql.fw.util.ObjectCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjectCache_ESTest extends ObjectCache_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      uidIdentifier0.setString((String) null);
      // Undeclared exception!
      try { 
        objectCache0.remove(class0, uidIdentifier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.fw.id.UidIdentifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      uidIdentifier0.setString((String) null);
      // Undeclared exception!
      try { 
        objectCache0.get(class0, uidIdentifier0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.fw.id.UidIdentifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      Iterator<DatabaseObjectType> iterator0 = objectCache0.getAllForClass(class0);
      Iterator<DatabaseObjectType> iterator1 = objectCache0.getAllForClass(class0);
      assertNotSame(iterator1, iterator0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType>[] classArray0 = objectCache0.getAllClasses();
      assertEquals(0, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      objectCache0.getAllForClass(class0);
      Class<DatabaseObjectType>[] classArray0 = objectCache0.getAllClasses();
      assertEquals(1, classArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      // Undeclared exception!
      try { 
        objectCache0.add((DatabaseObjectType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("net.sourceforge.squirrel_sql.fw.util.ObjectCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      objectCache0.remove(class0, uidIdentifier0);
      //  // Unstable assertion: assertEquals("-720bce0f:16e03dceda8:-6b31", uidIdentifier0.toString());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      IObjectCacheChangeListener iObjectCacheChangeListener0 = mock(IObjectCacheChangeListener.class, new ViolatedAssumptionAnswer());
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      objectCache0.removeChangesListener(iObjectCacheChangeListener0, class0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      IObjectCacheChangeListener iObjectCacheChangeListener0 = mock(IObjectCacheChangeListener.class, new ViolatedAssumptionAnswer());
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      objectCache0.addChangesListener(iObjectCacheChangeListener0, class0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ObjectCache<DatabaseObjectType> objectCache0 = new ObjectCache<DatabaseObjectType>();
      Class<DatabaseObjectType> class0 = DatabaseObjectType.class;
      UidIdentifier uidIdentifier0 = new UidIdentifier();
      IHasIdentifier iHasIdentifier0 = objectCache0.get(class0, uidIdentifier0);
      assertNull(iHasIdentifier0);
  }
}
