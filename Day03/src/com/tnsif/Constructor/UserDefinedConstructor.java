package com.tnsif.Constructor;

public class UserDefinedConstructor {

	//in userdefined constructor first declare data type
	//in class then create constructor and initialize value on it 
	
	int stdRoll;
	String stdName;
	
	UserDefinedConstructor()
	{
		stdRoll=123;
		stdName="TNS";
	}
	
	public void std_info()
	{
		System.out.println("student information");
		System.out.println("student roll no = "+ stdRoll);
		System.out.println("student name  = "+ stdName);

	}
	
	
	public static void main(String[] args) {

		UserDefinedConstructor uc=new UserDefinedConstructor();
		uc.std_info();
	}

}
