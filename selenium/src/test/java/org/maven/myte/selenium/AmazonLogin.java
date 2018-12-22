package org.maven.myte.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class AmazonLogin {
	
	WebDriver g;
	
  @Test
  public void f() throws AWTException {
	  
	  g.findElement(By.id("twotabsearchtextbox")).sendKeys("SJ 5000x Elite");
	  g.findElement(By.className("nav-input")).click();
	  
	  Actions a = new Actions(g);
	  WebElement target = g.findElement(By.linkText("SJCam SJ5000X Elite Wi-Fi Action Camera (Black)"));
	  a.moveToElement(target);
	  a.contextClick().build().perform();
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ESCAPE);
	  g.close();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
	  g =new ChromeDriver();
	  g.manage().window().maximize();
	  g.get("http://amazon.in");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
