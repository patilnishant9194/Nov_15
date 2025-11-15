package com_testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest111 {
  @Test(priority = 'A')
  public void Login() {
	  System.out.println("I am in login");
  }
  @Test(priority = 'B')
  public void Reg() {
	  System.out.println("I am in Reg");
  }
  @Test(priority = 3)
  public void Home() {
	  System.out.println("I am in Home");
  }
  @Test(priority = 5)
  public void Logout() {
	  System.out.println("I am in Logout");
  }
  @Test(priority = 4)
  public void ABC() {
	  throw new SkipException("We are working...");
	  //System.out.println("I am in ABC");
  }

}
