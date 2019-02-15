package com.vidhyac.assign5.dao;

import java.util.HashMap;
import java.util.Map;

import com.vidhyac.assign5.model.Employee;

public class EmployeeDAO {
	
	Map<Integer, Employee> map=new HashMap<>();
	
	public EmployeeDAO() {
		
		map.put(1, new Employee("Vidhya","JEE", "Analyst",30000));
		map.put(2, new Employee("Priya", "BI", "Tester", 55000));
		map.put(3, new Employee("Sudha", "IMS", "Support", 85000));
	}
	
	
	public Map<Integer, Employee> getAllEmp() {
		return map;
		
	}
	
	
	
	
	
}
