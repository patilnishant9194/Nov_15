package com_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver d= new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login/");
	  JavascriptExecutor js=(JavascriptExecutor)d;
	  js.executeScript("window,scrollBy(0,650)");
	  Thread.sleep(2000);
	  js.executeScript("window,scrollBy(0,-350)");
	  
	  WebElement li=d.findElement(By.xpath("//a[@href=\"https://practicetestautomation.com/privacy-policy/\"]")); 
			  js.executeScript("arguments[0].scrollIntoView(true);", li);
			  Thread.sleep(2000);
			  li.click();
  }
}
