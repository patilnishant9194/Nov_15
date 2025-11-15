package com_testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewImplicit {
  @Test
  public void f() throws InterruptedException {
	  WebDriver d= new ChromeDriver();
	  d.get("https://practicetestautomation.com/practice-test-login/");
	  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 // Thread.sleep(2000);
	  d.findElement(By.id("username")).sendKeys("welcome");
	 List<WebElement> el= d.findElements(By.tagName("a"));
	 System.out.println("the count of text box are   " +el.size( ));
	 for(WebElement web : el)
	 {
		 System.out.println(web.getText());
	 }
	 
	
	  
	  
  }
}
