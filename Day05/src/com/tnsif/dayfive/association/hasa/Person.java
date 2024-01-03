
//program to define container class
package com.tnsif.dayfive.association.hasa;


//            HAS A
//  Person ----------------------Address
//                               plotno state streetno lane no, nearby location, pincode 



//Container class
public class Person {

	
	
	private String name;
	private Address address;  //object refernce 
	
	
	
	
	public Person(String name, Address address) {
	
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void displayinfo()
	{
		System.out.println("Name: "+ name);
		System.out.println("Address: "+ address.getStreet() + ", " + address.getFlatno()+ ", " 
		+address.getCity()+ ", " +address.getPostalCode()+ ", " +address.getState());

	}
	
}
