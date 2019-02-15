package com.vidhyac.emp.model;

/*
Create a Employee domain model class having following properties: employeeId,
employeeName, employeeDepartment, employeeDesignation, employeeSalary. Employee Id
should be generated automatically at database level.*/


public class Employee {
	private String empName;
	private String empDept;
	private String empDesign;
	private double empSal;
	
	
/*//init block
{
	empId = ++autoEmpId;
}
*/

public Employee(String empName, String empDept, String empDesign, double empSal) {
	super();

	this.empName = empName;
	this.empDept = empDept;
	this.empDesign = empDesign;
	this.empSal = empSal;
}


public Employee() {

}



@Override
public String toString() {
	return "Employee [empName=" + empName + ", empDept=" + empDept + ", empDesign=" + empDesign + ", empSal=" + empSal
			+ "]";
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public String getEmpDept() {
	return empDept;
}


public void setEmpDept(String empDept) {
	this.empDept = empDept;
}


public String getEmpDesign() {
	return empDesign;
}


public void setEmpDesign(String empDesign) {
	this.empDesign = empDesign;
}


public double getEmpSal() {
	return empSal;
}


public void setEmpSal(double empSal) {
	this.empSal = empSal;
}











}