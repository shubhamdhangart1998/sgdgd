package com.tnsif.dayseven.covariantoverridingdemo;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1=new Student(103, "Shivam", "IT");
		s1.print();
		
		
		Student s2=s1.clone();
		s2.setName("Shubham");
		s2.setBranch("CS");
		s2.setRollNo(102);
		s2.print();
		
		
//		Student s2=(Student)s1.clone();
//		s2.setName("Shubham");
//		s2.setBranch("CS");
//		s2.setRollNo(102);
//		
//		s2.print();
//		
//
//		Student s3=(Student)s1.clone();
//		s3.setName("Shiv");
//		s3.setBranch("ME");
//		s3.setRollNo(103);
//		
//		s3.print();

		
	}

}
