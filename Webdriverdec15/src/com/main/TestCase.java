package com.main;

public class TestCase extends UserMethods {

	public static void main(String[] args) throws InterruptedException {

	TestCase test = new TestCase();
  test.launchBr();
  test.adminLogin();
  String url = driver.getCurrentUrl();
  if(url.contains("http://www.gcrit.com/build3/admin/login.php")){
	  System.out.println("Admin login successful");
	  }else {
		System.out.println("Admin login unsuccessful");  
	  }
  test.closeBr();
 Thread.sleep(2000);
  // using user method with parameters
  test.launchBr();
  test.adminLogin("admin", "admin@123");
  String url1 = driver.getCurrentUrl();
  if(url1.contains("http://www.gcrit.com/build3/admin/login.php")){
	  System.out.println("Admin login successful");
	  }else {
		System.out.println("Admin login unsuccessful");  
	  }
  
  
		
		
		
		
		
		
	}

}
