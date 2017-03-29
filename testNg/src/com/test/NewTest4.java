package com.test;

import org.testng.annotations.Test;

public class NewTest4 {
  
  @Test
	public void logIn1(){
	  long id = Thread.currentThread().getId();
		System.out.println("Login 1successful -- Thread id:"+ id);
	}
	@Test
	public void fundTransfer1(){
		long id = Thread.currentThread().getId();
		System.out.println("fundtransfer1 successful --Thread id:"+id);
	}
	@Test
	public void cashDeposit1(){
		long id = Thread.currentThread().getId();
		System.out.println("cashdeposit1 successful --Thread id :"+id);
	}
	@Test
	public void cashWithdraw1(){
		long id = Thread.currentThread().getId();
		System.out.println("cashwithdraw1 successful --Thread id :"+id);
	}
}
