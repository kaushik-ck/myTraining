package com.ibm.eis.service;

import java.util.Map;
import com.ibm.eis.bean.*;

public interface EmployeeDetailsProcessInterface {

	public static final String IDNUMCHECK_STRING = "[A-Z]{4}";
	
	boolean validateIdNum(String idNum);
	String assignDesignation(int salary);	
	String assignInsuranceScheme(int salary);
	
	void addEmployees(String idNum, Employee employee);
	
	Map<String, Employee> displayEmployees(); 	
}
