package com.tnsif.daysixteen.jbdcoperationsdemo;

import java.sql.*;


public class ResultSet {

	public static void main(String[] args) {

		try {
			//step1: load or register the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is load successfully");
			
			//Step 2: create connection between java and db 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/raisonistudents","root","root");
			System.out.println("Connection created successfully");
			
			//Step 3: create Statement object 
			
			Statement stmt=con.createStatement();
			System.out.println("Statemnt create succesfully");
			
			
			//Result is an object
			//Represent the data which is there in db
			
			
			
			java.sql.ResultSet rs=stmt.executeQuery("select * from student where stdid=103");
			System.out.println("Stdid\tname\tsubject\tduration");
			
			while(rs.next())
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			
			
			
			
			
//			
//			//Step 4 : Write a query
//			
//			String q="alter table student add primary key(stdid)";
//			
//			int s=stmt.executeUpdate(q);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}


	}

}
