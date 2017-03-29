package com.test;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups={"sanity","regression"})
  public void logIn() {
	  System.out.println("Login successful");
  }
  @Test(groups={"sanity","regression"})
  public void logOut(){
	  System.out.println("Logout successful");
  }
  @Test(groups = {"sanity"})
  public void fundTransfer(){
	  System.out.println("Fundtransfer successful");
  }
  @Test(groups = {"regression"})
  public void cashWithdraw(){
	  System.out.println("Cashwithdraw successful");
  }@Test(groups={"sanity"})
  public void addAccount(){
	  System.out.println("add account successful");
  }
  @Test(groups = {"regression"})
  public void cashDeposiy(){
	  System.out.println("cash deposit successful");
  }
}
