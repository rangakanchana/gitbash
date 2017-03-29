package com.test;

import org.testng.annotations.Test;

public class NewTest3 {
	 @Test
		public void logIn(){
		 long id = Thread.currentThread().getId();
			System.out.println("Login 1successful -- Thread id : " + id);
		}
		@Test
		public void fundTransfer(){
			long id = Thread.currentThread().getId();
			System.out.println("fundtransfer successful --- Thread id :"+id);
		}
		@Test
		public void cashDeposit(){
			long id = Thread.currentThread().getId();
			System.out.println("cashdeposit successful -- Thread id: "+id);
		}
		@Test
		public void cashWithdraw(){
			long id = Thread.currentThread().getId();
			System.out.println("cashwithdraw successful -- Thread id: "+id);
		}
}
