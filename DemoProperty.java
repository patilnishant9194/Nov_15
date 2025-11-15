package com_testing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoProperty {
  @Test
  public void f() throws Exception {
	  WebDriver d= new ChromeDriver();
	  d.manage().window().maximize();
	  Properties p = new Properties();
	  FileReader fr =new FileReader("C:\\Users\\cdac\\Downloads\\TestNG\\TestNG_Pro\\src\\input.properties");
	  p.load(fr);
	  d.get(p.getProperty("url"));
	 d.findElement(By.id("username")).sendKeys(p.getProperty("user"));
	 d.findElement(By.id("password")).sendKeys(p.getProperty("pass"));
  }
}
