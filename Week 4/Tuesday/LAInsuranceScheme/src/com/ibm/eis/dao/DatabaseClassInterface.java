package com.ibm.eis.dao;

import java.util.Map;

import com.ibm.eis.bean.Employee;

public interface DatabaseClassInterface {
	
	void storeIntoDatabase(String idNum, Employee employee);
	Map<String, Employee> displayEmployees();
	
}
