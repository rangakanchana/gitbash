package com.java.dec;

public class Employee {
	int id;
	String name;
	String departname;
	Address address;
	public Employee (int id,String name,String departname,Address address){
		this.id = id;
		this.name=name;
		this.departname = departname;
		this.address = address;
	}
	public void display(){
		System.out.println("Employee details are" +id+ " "+name+" "+departname);
		System.out.println("Employee address is"+address.streetno+ " "+address.city+" "+address.state+" "+address.zipcode);
		
		
	
		
	}
	public static void main(String[] args) {
Address a1 = new Address(122,"Ramanthapur","A.P.",500048);
Address a2 = new Address(123,"Habsiguda","A.P.",500012);
Address a3 = new Address(124,"Narayanaguda","A.P.",500020);
Employee e1 = new Employee (1,"Radha","Electronics",a1);
Employee e2 = new Employee (2,"Revathi","civil",a2);
Employee e3 = new Employee(3,"Usha","Mechanical",a3);
e1.display();
e2.display();
e3.display();



























































































































































































































	}

}
