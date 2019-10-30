/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 28 14:06:28 GMT 2019
 */

package com.eteks.sweethome3d.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomeEnvironment;
import com.eteks.sweethome3d.model.HomeTexture;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HomeEnvironment_ESTest extends HomeEnvironment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatalogTexture catalogTexture0 = new CatalogTexture("PHOTO_WIDTH", (Content) null, 0.0F, 0.0F);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(7, homeTexture0, 7, 7, 7);
      homeEnvironment0.setVideoFrameRate(1120);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setVideoWidth(711);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setPhotoWidth(2375);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setWallsAlpha(2115.76F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      TemporaryURLContent temporaryURLContent0 = new TemporaryURLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("&W8$SbP4UPA?3/o<t", "&W8$SbP4UPA?3/o<t", temporaryURLContent0, (-43), 4, "&W8$SbP4UPA?3/o<t", false);
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-43), homeTexture0, 10, 8192, 2.0F);
      homeEnvironment0.setCeillingLightColor((-43));
      homeEnvironment0.setCeillingLightColor(1253);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setSkyColor(13684944);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment((-1191), (HomeTexture) null, 427, (HomeTexture) null, (-1191), 2966.0F);
      homeEnvironment0.setGroundColor(1937);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setObserverCameraElevationAdjusted(false);
      homeEnvironment0.isObserverCameraElevationAdjusted();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      HomeEnvironment homeEnvironment0 = new HomeEnvironment();
      homeEnvironment0.setAllLevelsVisible(true);
      homeEnvironment0.isAllLevelsVisible();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      URLContent uRLContent0 = new URLContent(uRL0);
      CatalogTexture catalogTexture0 = new CatalogTexture("5Wb1+QS[oxXSKz", "OBSERVER_CAMERA_ELEVATION_ADJUSTED", uRLContent0, 2, (-21.6F), "^xp5A#4N)$");
      HomeTexture homeTexture0 = new HomeTexture(catalogTexture0);
      HomeEnvironment homeEnvironment0 = new HomeEnvironment(2, homeTexture0, 3, 3, 2197.0F);
      homeEnvironment0.getWallsAlpha();
  }
}