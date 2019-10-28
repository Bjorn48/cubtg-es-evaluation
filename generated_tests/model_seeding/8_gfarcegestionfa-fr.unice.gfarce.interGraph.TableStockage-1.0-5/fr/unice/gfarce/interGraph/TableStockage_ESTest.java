/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 19:42:25 GMT 2019
 */

package fr.unice.gfarce.interGraph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fr.unice.gfarce.interGraph.TableStockage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TableStockage_ESTest extends TableStockage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][] objectArray0 = new Object[0][9];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice("?\"Gu 6Cc7?", (-777), (-777));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -778
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(4446, 1529);
      tableStockage0.getValueAt(1821, 1);
      assertEquals(4445, tableStockage0.getRowCount());
      assertEquals(1529, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "X*`driWzc4_";
      Object[][] objectArray0 = new Object[9][8];
      objectArray0[0] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Object object0 = tableStockage0.getValueAt(0, 0);
      assertEquals("X*`driWzc4_", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Object[][] objectArray0 = new Object[3][7];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      int int0 = tableStockage0.getRowCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[8];
      Object[][] objectArray0 = new Object[4][5];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      objectArray0[3] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String[] stringArray1 = tableStockage0.getNomColonnes();
      assertEquals(8, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "X*`driWzc4_";
      Object[][] objectArray0 = new Object[9][8];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("X*`driWzc4_", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "";
      Object[][] objectArray0 = new Object[3][1];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getColumnCount();
      assertEquals(0, tableStockage0.getRowCount());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(1669, 2558);
      int int0 = tableStockage0.getColumnCount();
      assertEquals(1668, tableStockage0.getRowCount());
      assertEquals(2558, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setValueAt("", (-2141), (-2141));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnName(1247, "5Ah+d2[0|N/pqE");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1247
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass(2, (Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(tableStockage0, 132, 132);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 131
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnName(39);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 39
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getColumnClass(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][3];
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((String[]) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      Object[][] objectArray0 = new Object[2][0];
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage(stringArray0, objectArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TableStockage tableStockage0 = null;
      try {
        tableStockage0 = new TableStockage((-1133), (-1133));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(4446, 1529);
      tableStockage0.setValueAt((Object) null, 1, 1);
      assertEquals(1529, tableStockage0.getColumnCount());
      assertEquals(4445, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      // Undeclared exception!
      try { 
        tableStockage0.getValueAt(3415, 3415);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3415
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      int int0 = tableStockage0.getRowCount();
      assertEquals(0, int0);
      assertEquals(0, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Object[][] objectArray0 = new Object[2][5];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Boolean boolean0 = new Boolean("8Q=`u^$%");
      // Undeclared exception!
      try { 
        tableStockage0.remplirMatrice(boolean0, 0, 1);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to java.lang.String
         //
         verifyException("fr.unice.gfarce.interGraph.TableStockage", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(2467, 2467);
      Boolean boolean0 = Boolean.valueOf((String) null);
      tableStockage0.remplirMatrice(boolean0, 9, 63);
      assertEquals(2466, tableStockage0.getRowCount());
      assertEquals(2467, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(40, 884);
      Class<Object> class0 = Object.class;
      tableStockage0.setColumnClass(1, class0);
      assertEquals(39, tableStockage0.getRowCount());
      assertEquals(884, tableStockage0.getColumnCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Boolean> class0 = Boolean.class;
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[3][1];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      tableStockage0.setColumnClass(0, class0);
      assertEquals(3, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(4446, 1529);
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        tableStockage0.setColumnClass((-1), class0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[5];
      Object[][] objectArray0 = new Object[10][5];
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      Class<String> class0 = String.class;
      tableStockage0.setColumnClass(0, class0);
      assertEquals(10, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      boolean boolean0 = tableStockage0.isCellEditable(0, 0);
      assertEquals(0, tableStockage0.getColumnCount());
      assertTrue(boolean0);
      assertEquals(0, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(40, 884);
      tableStockage0.setColumnName(1, "");
      assertEquals(884, tableStockage0.getColumnCount());
      assertEquals(39, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage();
      String[] stringArray0 = tableStockage0.getNomColonnes();
      assertEquals(0, stringArray0.length);
      assertEquals(0, tableStockage0.getRowCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Object[][] objectArray0 = new Object[3][1];
      objectArray0[0] = (Object[]) stringArray0;
      objectArray0[1] = (Object[]) stringArray0;
      objectArray0[2] = (Object[]) stringArray0;
      TableStockage tableStockage0 = new TableStockage(stringArray0, objectArray0);
      String string0 = tableStockage0.getColumnName(0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TableStockage tableStockage0 = new TableStockage(40, 884);
      tableStockage0.getColumnClass(574);
      assertEquals(884, tableStockage0.getColumnCount());
      assertEquals(39, tableStockage0.getRowCount());
  }
}
