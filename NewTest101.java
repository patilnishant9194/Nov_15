package com_testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest101 {
  @Test
  public void f() throws InterruptedException {
	  WebDriver wd=new ChromeDriver();
	  wd.get("https://practice.expandtesting.com/login");
	  JavascriptExecutor js=(JavascriptExecutor)wd;
	  js.executeScript("window.scrollBy(0,600)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-360)");
	  
  }
}
