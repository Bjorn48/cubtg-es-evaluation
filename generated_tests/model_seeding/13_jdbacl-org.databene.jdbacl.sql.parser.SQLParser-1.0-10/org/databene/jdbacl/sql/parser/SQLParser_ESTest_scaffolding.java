/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 26 01:43:08 GMT 2019
 */

package org.databene.jdbacl.sql.parser;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SQLParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.databene.jdbacl.sql.parser.SQLParser"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SQLParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.antlr.runtime.tree.RewriteEmptyStreamException",
      "org.databene.jdbacl.sql.parser.SQLParser$foreign_key_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$fractionDigits_return",
      "org.databene.jdbacl.sql.parser.SQLParser$unique_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.sql.parser.SQLParser$default_value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_value_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_sequence_return",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_flag_return",
      "org.antlr.runtime.UnwantedTokenException",
      "org.databene.jdbacl.sql.parser.SQLParser$table_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_configs_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_list_return",
      "org.antlr.runtime.tree.TreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$create_sequence_return",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_table_return",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_part_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_part_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$column_comment_details_return",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.antlr.runtime.tree.CommonTree",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_storage_opt_return",
      "org.databene.jdbacl.sql.parser.SQLParser$size_return",
      "org.antlr.runtime.tree.BaseTree",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_index_return",
      "org.databene.jdbacl.sql.parser.SQLParser$value_list_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_mutation_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$nullability_return",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_parts_return",
      "org.antlr.runtime.CharStream",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_list_return",
      "org.antlr.runtime.tree.TreeNodeStream",
      "org.databene.jdbacl.sql.parser.SQLParser$command_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_comment_details_return",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_partition_spec_return",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.MissingTokenException",
      "org.databene.jdbacl.sql.parser.SQLParser$inline_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_index_return",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_key_constraint_return",
      "org.antlr.runtime.EarlyExitException",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$constraint_spec_return",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.Token",
      "org.databene.jdbacl.sql.parser.SQLParser$type_return",
      "org.databene.jdbacl.sql.parser.SQLParser$index_name_return",
      "org.antlr.runtime.Parser",
      "org.databene.jdbacl.sql.parser.SQLParser$column_detail_return",
      "org.databene.jdbacl.sql.parser.SQLParser$qualified_name_return",
      "org.antlr.runtime.TokenSource",
      "org.databene.jdbacl.sql.parser.SQLParser$comment_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_storage_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.databene.jdbacl.sql.parser.SQLParser$size_uom_return",
      "org.databene.jdbacl.sql.parser.SQLParser$check_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$arguments_return",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$create_index_return",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.RecognizerSharedState",
      "org.databene.jdbacl.sql.parser.SQLParser$column_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$add_constraints_return",
      "org.databene.jdbacl.sql.parser.SQLParser$constraint_detail_return",
      "org.antlr.runtime.MismatchedTreeNodeException",
      "org.antlr.runtime.TokenStream",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.antlr.runtime.IntStream",
      "org.databene.jdbacl.sql.parser.SQLParser$table_details_return",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.databene.jdbacl.sql.parser.SQLParser$table_detail_return",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_pk_return",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.databene.jdbacl.sql.parser.SQLParser$create_table_return",
      "org.databene.jdbacl.sql.parser.SQLParser$alter_table_return",
      "org.antlr.runtime.MismatchedSetException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.databene.jdbacl.sql.parser.SQLParser$sub_partition_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.databene.jdbacl.sql.parser.SQLParser$column_spec_return",
      "org.antlr.runtime.tree.Tree",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_key_return",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.DFA"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.antlr.runtime.IntStream", false, SQLParser_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.antlr.runtime.TokenStream", false, SQLParser_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SQLParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.antlr.runtime.BaseRecognizer",
      "org.antlr.runtime.Parser",
      "org.antlr.runtime.DFA",
      "org.antlr.runtime.BitSet",
      "org.databene.jdbacl.sql.parser.SQLParser",
      "org.databene.jdbacl.sql.parser.SQLParser$DFA2",
      "org.antlr.runtime.RuleReturnScope",
      "org.antlr.runtime.ParserRuleReturnScope",
      "org.databene.jdbacl.sql.parser.SQLParser$commands_return",
      "org.databene.jdbacl.sql.parser.SQLParser$command_return",
      "org.databene.jdbacl.sql.parser.SQLParser$create_table_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$qualified_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_key_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_flag_return",
      "org.databene.jdbacl.sql.parser.SQLParser$keyword_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_details_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_detail_return",
      "org.databene.jdbacl.sql.parser.SQLParser$column_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$type_return",
      "org.databene.jdbacl.sql.parser.SQLParser$size_return",
      "org.databene.jdbacl.sql.parser.SQLParser$size_uom_return",
      "org.databene.jdbacl.sql.parser.SQLParser$fractionDigits_return",
      "org.databene.jdbacl.sql.parser.SQLParser$column_detail_return",
      "org.databene.jdbacl.sql.parser.SQLParser$nullability_return",
      "org.databene.jdbacl.sql.parser.SQLParser$default_value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$value_return",
      "org.databene.jdbacl.sql.parser.SQLParser$literal_return",
      "org.databene.jdbacl.sql.parser.SQLParser$inline_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$name_list_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_configs_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_storage_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_storage_opt_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_partition_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_part_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_parts_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_part_return",
      "org.databene.jdbacl.sql.parser.SQLParser$partition_value_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$and_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$exclusive_or_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$equality_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$null_comparison_return",
      "org.databene.jdbacl.sql.parser.SQLParser$relational_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$in_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$between_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$additive_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$multiplicative_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$unary_expression_return",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_return",
      "org.databene.jdbacl.sql.parser.SQLParser$arguments_return",
      "org.databene.jdbacl.sql.parser.SQLParser$value_list_return",
      "org.databene.jdbacl.sql.parser.SQLParser$sub_partition_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_return",
      "org.databene.jdbacl.sql.parser.SQLParser$column_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_config_return",
      "org.databene.jdbacl.sql.parser.SQLParser$ora_lob_index_return",
      "org.databene.jdbacl.sql.parser.SQLParser$comment_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_comment_details_return",
      "org.databene.jdbacl.sql.parser.SQLParser$column_comment_details_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_table_return",
      "org.databene.jdbacl.sql.parser.SQLParser$alter_table_return",
      "org.databene.jdbacl.sql.parser.SQLParser$table_mutation_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_pk_return",
      "org.databene.jdbacl.sql.parser.SQLParser$add_constraints_return",
      "org.databene.jdbacl.sql.parser.SQLParser$constraint_spec_return",
      "org.databene.jdbacl.sql.parser.SQLParser$constraint_detail_return",
      "org.databene.jdbacl.sql.parser.SQLParser$primary_key_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$foreign_key_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$unique_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$check_constraint_return",
      "org.databene.jdbacl.sql.parser.SQLParser$create_index_return",
      "org.databene.jdbacl.sql.parser.SQLParser$index_name_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_index_return",
      "org.databene.jdbacl.sql.parser.SQLParser$create_sequence_return",
      "org.databene.jdbacl.sql.parser.SQLParser$drop_sequence_return",
      "org.databene.jdbacl.sql.parser.SQLParser$expression_list_return",
      "org.antlr.runtime.RecognizerSharedState",
      "org.antlr.runtime.tree.BaseTreeAdaptor",
      "org.antlr.runtime.tree.CommonTreeAdaptor",
      "org.antlr.runtime.RecognitionException",
      "org.antlr.runtime.tree.BaseTree",
      "org.antlr.runtime.tree.CommonTree",
      "org.antlr.runtime.NoViableAltException",
      "org.antlr.runtime.MismatchedTokenException",
      "org.antlr.runtime.tree.RewriteRuleElementStream",
      "org.antlr.runtime.tree.RewriteRuleTokenStream",
      "org.antlr.runtime.tree.RewriteRuleSubtreeStream",
      "org.antlr.runtime.CommonToken",
      "org.antlr.runtime.MismatchedSetException",
      "org.antlr.runtime.tree.RewriteCardinalityException",
      "org.antlr.runtime.tree.RewriteEmptyStreamException"
    );
  }
}
