package com;

import java.util.List;

public class Emp {

	private int empID;
    private String empName;
    public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getProgramming() {
		return programming;
	}
	public void setProgramming(List<String> programming) {
		this.programming = programming;
	}
	private List<String> programming;



public void display() {
    System.out.println("Employee");
   System.out.println("Emp ID=" +empID );
   System.out.println( "EmpName= "+ empName  );
   System.out.println("Programming Languages= " + programming);




}
}