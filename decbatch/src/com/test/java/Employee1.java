package com.test.java;

public class Employee1 {
int salary = 10000;
String name;
int id;
Address address;



Employee1(String name,int id,Address address)
{
	this.name=name;
	this.id=id;
this.address = address;
}
void display()
{
	System.out.println("name is "+ name +"id is "+ id );
	System.out.println("Street is "+address.street + "City is "+address.city + "Postalcode is "+address.Postalcode);
}
public static void main(String[] args) {
Address add = new Address("street 1","Tarnaka",500021);
Address add1 = new Address("Bakaram","Musheerabad",500048);
Employee1 emp = new Employee1("Srinivas Goud",1,add);
Employee1 emp1 = new Employee1("Baka",2,add1);

emp.display();
emp1.display();

}
}