/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 20:01:22 GMT 2019
 */

package ghm.follow.search;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ghm.follow.search.LineResult;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.util.List;
import java.util.regex.PatternSyntaxException;
import javax.swing.plaf.multi.MultiTextUI;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchableTextPane_ESTest extends SearchableTextPane_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StyleContext styleContext0 = StyleContext.getDefaultStyleContext();
      Font font0 = styleContext0.getFont("", (-3750), (-3750));
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, (-561));
      int int0 = searchableTextPane0.search("", (-561));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 5);
      // Undeclared exception!
      try { 
        searchableTextPane0.search((String) null, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-562));
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("/Os'@Lq[$", (-562));
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 8
         // /Os'@Lq[$
         //         ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 3);
      MultiTextUI multiTextUI0 = new MultiTextUI();
      searchableTextPane0.setUI(multiTextUI0);
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("", 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ghm.follow.search.SearchableTextPane", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-580));
      // Undeclared exception!
      try { 
        searchableTextPane0.highlight("/Os'@Lq[$", (-580));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown search strategy requested [flags=-580
         //
         verifyException("ghm.follow.search.SearchEngine", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Font font0 = new Font("BadLocationException in SearchableTextPane", 0, 0);
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 0);
      searchableTextPane0.removeHighlights();
      assertFalse(searchableTextPane0.isFocusCycleRoot());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      int int0 = searchableTextPane0.search("VV%Mwi?dYPZ", 1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      List<LineResult> list0 = searchableTextPane0.highlight("Line ", 1);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-3604));
      int int0 = searchableTextPane0.search("");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      int int0 = searchableTextPane0.search((String) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 12);
      List<LineResult> list0 = searchableTextPane0.highlight("", 12);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-213));
      List<LineResult> list0 = searchableTextPane0.highlight((String) null, (-213));
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, 1);
      boolean boolean0 = searchableTextPane0.getScrollableTracksViewportWidth();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Font font0 = Font.decode("5_M%wY8EC");
      SearchableTextPane searchableTextPane0 = new SearchableTextPane(font0, 327);
      int int0 = searchableTextPane0.search("5_M%wY8EC");
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SearchableTextPane searchableTextPane0 = new SearchableTextPane((Font) null, (-3604));
      List<LineResult> list0 = searchableTextPane0.highlight("|Otc9VfP", (-126));
      assertEquals(1, list0.size());
  }
}
