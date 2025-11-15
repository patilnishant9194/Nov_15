package com_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest9194 {
  @Test
  @Parameters({"username","password"})
  public void f(String username,String password) {
	  WebDriver d=new ChromeDriver();
	  d.get("https://practice.expandtesting.com/login");
	WebElement e=  d.findElement(By.id("username"));
	e.sendKeys(username);
	WebElement e1=  d.findElement(By.id("password"));
	e1.sendKeys(password);
	
			WebElement l=  d.findElement(By.id("submit-login"));
			l.click();
			
			JavascriptExecutor js=(JavascriptExecutor)d;
			js.executeScript("window.scrollBy(0,600)");
  }
}
