package com.tnsif.daysixteen.jbdcoperationsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCInsertData {

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
			
			
			//Step 4 : Write a query
			
			//String q="create table student(stdid int,name varchar(20), subject varchar(20), duration double)";
			String q="insert into student values(104,'shubham','Java', 80)";
//			String q1="insert into student values(103,'shubham','Java', 80)";
//			String q2="insert into student values(102,'shubham','Java', 80)";
			
			int s=stmt.executeUpdate(q);
//			int s1=stmt.executeUpdate(q1);
//			int s2=stmt.executeUpdate(q2);
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
