/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 24 12:50:03 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.ModifTableStockage;
import fr.unice.gfarce.interGraph.TableStockage;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModifTableStockage_ESTest extends ModifTableStockage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      ModifTableStockage modifTableStockage1 = new ModifTableStockage(tableStockage1);
      Class<Integer> class0 = Integer.class;
      modifTableStockage1.ajouterColonne(":wM1p96", class0);
      // Undeclared exception!
      try { 
        modifTableStockage1.supprimerColonne(760);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      ModifTableStockage modifTableStockage1 = new ModifTableStockage(tableStockage1);
      modifTableStockage1.colonneMail();
      // Undeclared exception!
      try { 
        modifTableStockage1.selectMail();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.supprimerLigne(2147483645);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.supprimerColonne(88);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.separerColonne(160);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModifTableStockage modifTableStockage0 = null;
      try {
        modifTableStockage0 = new ModifTableStockage((TableStockage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.ModifTableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      ModifTableStockage modifTableStockage1 = new ModifTableStockage(tableStockage1);
      assertEquals(0, tableStockage1.getRowCount());
      
      TableStockage tableStockage2 = modifTableStockage1.selectMail();
      assertEquals(1, tableStockage2.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.selectMail();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      modifTableStockage0.colonneMail();
      modifTableStockage0.colonneMail();
      // Undeclared exception!
      try { 
        modifTableStockage0.fusionnerColonnes(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.fusionnerColonnes(1);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      modifTableStockage0.colonneMail();
      // Undeclared exception!
      try { 
        modifTableStockage0.supprimerColonne((-2259));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      assertEquals(1, tableStockage1.getColumnCount());
      
      TableStockage tableStockage2 = modifTableStockage0.supprimerColonne(0);
      assertEquals(0, tableStockage2.getColumnCount());
      assertEquals(0, tableStockage2.getRowCount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      TableStockage tableStockage1 = modifTableStockage0.colonneMail();
      ModifTableStockage modifTableStockage1 = new ModifTableStockage(tableStockage1);
      // Undeclared exception!
      try { 
        modifTableStockage1.ajouterLigne();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      // Undeclared exception!
      try { 
        modifTableStockage0.ajouterLigne();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      ModifTableStockage modifTableStockage0 = new ModifTableStockage(tableStockage0);
      modifTableStockage0.colonneMail();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        modifTableStockage0.ajouterColonne(":wM1p96", class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }
}