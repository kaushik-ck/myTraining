package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employee;

public class DatabaseClass implements DatabaseClassInterface {
	
	private Map<String, Employee> employeeMap = new HashMap<String, Employee>();
	
	@Override
	public void storeIntoDatabase(String idNum, Employee employee) {
		employeeMap.put(idNum, employee);
	}
	
	@Override
	public Map<String, Employee> displayEmployees(){
		return employeeMap;
	}
}
