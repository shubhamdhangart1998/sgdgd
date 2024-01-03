package com.tnsif.dayfive.multilevelinheritance;

public class MLInheritanceDriver {

	public static void main(String[] args) {
	
		//Country c=new Country();
		City c= new City();
		
		c.setCityName("Pune");
		c.setArea(100.89f);
		c.setCapital("Delhi");
		c.setCode(001);
		c.setCountryName("India");
		c.setLanguage("Marathi");
	    c.setPopulationCity(4567);
	    c.setStateName("Maharshtra");
	    
	    System.out.println(c);

		

	}

}


/*
 * 
 *              Person
 * 
 *              Name, age, birth, birthplace, bloodgroup, no. add, sisname, moth name, grandf name, father, adno
 * 
 * 
 * 
 * 
 * Student      Employee     GovernmentDoc    BankAccount    Hospital
 * 
 * rollno        empid                             
 * branch        des
 * fees          CN
 *             
 * 
 */
