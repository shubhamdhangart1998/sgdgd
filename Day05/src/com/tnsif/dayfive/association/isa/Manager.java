package com.tnsif.dayfive.association.isa;

//Entity
//child class inheriting from employee
public class Manager extends Employee {
	
	
	
	private int teamSize;

	public Manager() {
		super();
	}

	public Manager(String name, int empid, String department, int mobile,int teamSize) {
		super(name, empid, department, mobile );
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", getName()=" + getName() + ", getEmpid()=" + getEmpid()
				+ ", getDepartment()=" + getDepartment() + ", getMobile()=" + getMobile() + "]";
	}
	
	

}
