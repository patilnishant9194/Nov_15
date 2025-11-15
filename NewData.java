package com_testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewData {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://practicetestautomation.com/practice-test-login/");
	  wd.manage().window().maximize();
	  wd.findElement(By.id("username")).sendKeys(n);
	  wd.findElement(By.id("password")).sendKeys(s);
	  Thread.sleep(2000);
	  wd.findElement(By.id("submit")).click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "student", "Password123" },
      new Object[] { "pqrs", "123" },
    };
  }
}
