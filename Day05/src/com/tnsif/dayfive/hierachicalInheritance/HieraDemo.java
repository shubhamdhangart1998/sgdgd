package com.tnsif.dayfive.hierachicalInheritance;

public class HieraDemo {

	public static void main(String[] args) {
		
		Person p=new Person();
		
		System.out.println("Person class details............");
		System.out.println(p);
		
//		Student s=new Student();
//		
//		Employee emp=new Employee();
		
		//dynamic binding//runtime polymorphism //loose coupling 
		Person p1;//object reference
		p1=new Person("Tushar","Pune",20);
		if(p1 instanceof Person)
		{
		System.out.println(p1);
		}
		
		
		p1=new Student("Shubham","Mumbai",22,102,"IT", "G H");
		if(p1 instanceof Student)
		{
		System.out.println(p1);
		}
		
		
		p1=new Employee("Aakash","Delhi", 23,1234,"Infosys", "Developer", 50000);
		if(p1 instanceof Employee)
		{System.out.println(p1);				
		}
		
		
		
		
		
		
		
		
		
		
		
	/*
	 * 
	 * The java instanceof operator is used to test whether the object is an instance of the specified type 
	 * (class or subclass or interface).

The instanceof in java is also known as type comparison operator because it compares the instance with type. 
It returns either true or false. If we apply the instanceof operator with any variable that has null value, 
it returns false.	
	 */
				
		
		

	}

}


//InstanceOf
