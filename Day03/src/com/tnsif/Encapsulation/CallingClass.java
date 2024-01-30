package com.tnsif.Encapsulation;

public class CallingClass {

	public static void main(String[] args) {

		Encapsulation001 en=new Encapsulation001();
		
		en.setName("Vikas");
		en.setCgpa(7.7);
		en.setFees(5678);
		en.setpMobile(876543653);
		en.setRollNo(123);
		en.setStd("B.E");
		
//		System.out.println(en.getRollNo());
//		System.out.println(en.getCgpa());
//		System.out.println(en.getFees());
//		System.out.println(en.getName());
//		System.out.println(en.getpMobile());
//		System.out.println(en.getRollNo());
		
		System.out.println(en);

		
//		en.rollNo=123;
//		en.name="Hardik";
//		en.fees=23456;
//		en.cgpa=9.9;
//		en.pMobile=98765434;
//		en.std="B.E";
//		
//		
//		
//		
		
	}

}
