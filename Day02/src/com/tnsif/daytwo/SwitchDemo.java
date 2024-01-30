package com.tnsif.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		
    int day=4;     //declared and initialized
		
		switch(4)
		{
		case 1:{
			
			System.out.println("sunday");
			System.out.println("the details of the students are");
			int rollNo=27;
			String name="SD";
			String add="Pune";
			System.out.println(rollNo);
			System.out.println(name);
			System.out.println(add);

			
			
		}
		break;
		
		case 2:{System.out.println("monday");
		
		System.out.println("the details of the Trainer are");
		int empNo=222227;
		String name="Shubham";
		String company="TNS";
		System.out.println(empNo);
		System.out.println(name);
		System.out.println(company);
		
		
		}
		
		break;
		
		case 3:System.out.println("tuesday");
		break;
		
		case 4:System.out.println("wednesday");
		break;
		
		case 5:System.out.println("thursday");
		break;
		
		case 6:System.out.println("friday");
		break;
		
		case 7:
			System.out.println("saturday");
		break;
		
		case 8:System.out.println("there r only 7 days in a week ");
		break;
		
		default:System.out.println("invalid days");
	    
		
		
		
		}
			

	}

}
