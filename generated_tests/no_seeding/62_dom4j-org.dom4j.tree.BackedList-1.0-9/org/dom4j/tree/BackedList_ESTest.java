/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 23:01:10 GMT 2019
 */

package org.dom4j.tree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.bean.BeanAttributeList;
import org.dom4j.bean.BeanElement;
import org.dom4j.bean.BeanMetaData;
import org.dom4j.dom.DOMElement;
import org.dom4j.dom.DOMNamespace;
import org.dom4j.tree.AbstractBranch;
import org.dom4j.tree.BackedList;
import org.dom4j.tree.BaseElement;
import org.dom4j.tree.DefaultDocument;
import org.dom4j.tree.DefaultDocumentType;
import org.dom4j.tree.NamespaceStack;
import org.dom4j.util.NonLazyElement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BackedList_ESTest extends BackedList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      baseElement0.addElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      Namespace namespace1 = backedList0.set(0, namespace0);
      assertEquals("Namespace", namespace1.getNodeTypeName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DOMElement dOMElement0 = new DOMElement("-");
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QName qName0 = QName.get("Index value: ", namespace0);
      Object object0 = new Object();
      BeanElement beanElement0 = new BeanElement(qName0, object0);
      Class<String> class0 = String.class;
      BeanMetaData beanMetaData0 = BeanMetaData.get(class0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(dOMElement0, beanAttributeList0, beanAttributeList0);
      // Undeclared exception!
      try { 
        backedList0.add(3, namespace0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 0
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace("", "");
      backedList0.add((Namespace) dOMNamespace0);
      DOMNamespace dOMNamespace1 = (DOMNamespace)backedList0.set(0, (Namespace) dOMNamespace0);
      assertEquals("", dOMNamespace1.getURI());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Namespace namespace0 = Namespace.get("Sw1vk}$zdi>}lodV(,");
      BaseElement baseElement0 = new BaseElement("", namespace0);
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      backedList0.addLocal(namespace0);
      boolean boolean0 = backedList0.remove((Node) namespace0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      Node node0 = namespace0.asXPathResult(baseElement0);
      // Undeclared exception!
      try { 
        backedList0.set(0, (Namespace) node0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The node \"org.dom4j.tree.DefaultNamespace@0000000008\" could not be added to the element \"\" because: The Node already has an existing parent of \"\"
         //
         verifyException("org.dom4j.tree.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace("", "");
      backedList0.add(0, (Namespace) dOMNamespace0);
      backedList0.remove(0);
      backedList0.add((Namespace) dOMNamespace0);
      backedList0.remove(0);
      // Undeclared exception!
      try { 
        backedList0.set(0, (Namespace) dOMNamespace0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QName qName0 = QName.get("K*za\"1l$&m ", namespace0);
      BeanElement beanElement0 = new BeanElement(qName0, class0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      BackedList<Namespace> backedList0 = new BackedList<Namespace>((AbstractBranch) null, beanAttributeList0, beanAttributeList0);
      // Undeclared exception!
      try { 
        backedList0.remove((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BeanElement beanElement0 = new BeanElement((QName) null, (Object) null);
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0, beanMetaData0);
      BackedList<Namespace> backedList0 = new BackedList<Namespace>((AbstractBranch) null, beanAttributeList0, beanAttributeList0);
      // Undeclared exception!
      try { 
        backedList0.remove(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType("CharacterData node is read only: ", " is less than zero");
      DefaultDocument defaultDocument0 = new DefaultDocument((Element) null, defaultDocumentType0);
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(defaultDocument0, linkedList0);
      // Undeclared exception!
      try { 
        backedList0.remove((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 0
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      BackedList<Namespace> backedList1 = new BackedList<Namespace>(baseElement0, (List<Node>) null, backedList0);
      // Undeclared exception!
      try { 
        backedList1.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("N");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace(nonLazyElement0, "org.dom4j.tree.BackedList", "");
      // Undeclared exception!
      try { 
        backedList0.add((Namespace) dOMNamespace0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The node \"org.dom4j.dom.DOMNamespace@0000000006\" could not be added to the element \"N\" because: The Node already has an existing parent of \"N\"
         //
         verifyException("org.dom4j.tree.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("un+bs~n!hf[zr5a2V");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      // Undeclared exception!
      try { 
        backedList0.add((Namespace) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("#");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      DOMNamespace dOMNamespace0 = new DOMNamespace(baseElement0, "#", "#");
      // Undeclared exception!
      try { 
        backedList0.add(0, (Namespace) dOMNamespace0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The node \"org.dom4j.dom.DOMNamespace@0000000006\" could not be added to the element \"#\" because: The Node already has an existing parent of \"#\"
         //
         verifyException("org.dom4j.tree.AbstractElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      DefaultDocument defaultDocument0 = new DefaultDocument("#");
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(defaultDocument0, (List<Node>) null);
      // Undeclared exception!
      try { 
        backedList0.add(0, namespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BackedList<Namespace> backedList0 = null;
      try {
        backedList0 = new BackedList<Namespace>((AbstractBranch) null, (List<Node>) null, (List<Namespace>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.LazyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      backedList0.clear();
      assertFalse(backedList0.contains(namespace0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DefaultDocumentType defaultDocumentType0 = new DefaultDocumentType("CharacterData node is read only: ", " is less than zero");
      DefaultDocument defaultDocument0 = new DefaultDocument((Element) null, defaultDocumentType0);
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(defaultDocument0, linkedList0);
      backedList0.add(0, (Namespace) null);
      Namespace namespace0 = backedList0.remove(0);
      assertNull(namespace0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Node> linkedList0 = new LinkedList<Node>();
      BackedList<Node> backedList0 = new BackedList<Node>((AbstractBranch) null, linkedList0);
      BeanElement beanElement0 = new BeanElement("Ah7\"|<Qsk0>0,?HqJeq", backedList0);
      BeanAttributeList beanAttributeList0 = new BeanAttributeList(beanElement0);
      BackedList<Namespace> backedList1 = new BackedList<Namespace>((AbstractBranch) null, linkedList0, beanAttributeList0);
      Namespace namespace0 = new Namespace("Invalid node type: ", "Ol");
      // Undeclared exception!
      try { 
        backedList1.set(1, namespace0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      List<Node> list0 = baseElement0.createContentList();
      BackedList<Node> backedList1 = new BackedList<Node>(baseElement0, list0);
      BackedList<Namespace> backedList2 = new BackedList<Namespace>(baseElement0, backedList1, backedList0);
      Namespace namespace1 = backedList2.set(0, namespace0);
      assertSame(namespace0, namespace1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("#");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      backedList0.add(namespace0);
      Namespace namespace1 = backedList0.remove(0);
      backedList0.add(1, namespace1);
      assertEquals("Namespace", namespace1.getNodeTypeName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      QName qName0 = QName.get(" />]");
      BeanElement beanElement0 = new BeanElement(qName0, "o>Cwh:Le,+|G'1");
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(beanElement0, beanAttributeList0, beanAttributeList0);
      NamespaceStack namespaceStack0 = new NamespaceStack();
      Namespace namespace0 = namespaceStack0.createNamespace("", "9u5dvKT 1EV");
      // Undeclared exception!
      try { 
        backedList0.add(15, namespace0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index value: 15 cannot be greater than the size: 1
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NonLazyElement nonLazyElement0 = new NonLazyElement("Mmqo<");
      BackedList<Namespace> backedList0 = ((AbstractBranch)nonLazyElement0).createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      // Undeclared exception!
      try { 
        backedList0.add((-2418), namespace0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index value: -2418 is less than zero
         //
         verifyException("org.dom4j.tree.BackedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BaseElement baseElement0 = new BaseElement("");
      BackedList<Namespace> backedList0 = baseElement0.createResultList();
      Namespace namespace0 = Namespace.XML_NAMESPACE;
      backedList0.add(0, namespace0);
      backedList0.add(0, namespace0);
      assertEquals("http://www.w3.org/XML/1998/namespace", namespace0.getText());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DOMElement dOMElement0 = new DOMElement("-");
      Class<Object> class0 = Object.class;
      BeanMetaData beanMetaData0 = new BeanMetaData(class0);
      Namespace namespace0 = Namespace.NO_NAMESPACE;
      QName qName0 = QName.get("Index value: ", namespace0);
      Object object0 = new Object();
      BeanElement beanElement0 = new BeanElement(qName0, object0);
      BeanAttributeList beanAttributeList0 = beanMetaData0.createAttributeList(beanElement0);
      BackedList<Namespace> backedList0 = new BackedList<Namespace>(dOMElement0, beanAttributeList0, beanAttributeList0);
      boolean boolean0 = backedList0.remove((Node) dOMElement0);
      assertFalse(boolean0);
  }
}