package com.ibm.eis.service;

import com.ibm.eis.bean.*;
import com.ibm.eis.dao.DatabaseClass;
import java.util.Map;

public class EmployeeDetailsProcess implements EmployeeDetailsProcessInterface{
	
	DatabaseClass dao = new DatabaseClass();
	
	@Override
	public boolean validateIdNum(String idNum){
		if(idNum.matches(IDNUMCHECK_STRING)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String assignDesignation(int salary) {
		if(salary<5000) {
			return "Clerk";
		}		
		else if(salary>5000 && salary<20000) {
			return "System Associate";
		}
		else if(salary>=20000 && salary<40000) {
			return "Programmer";
		}
		else {
			return "Manager";
		}
	}
	
	@Override
	public String assignInsuranceScheme(int salary) {
		if(salary<5000) {
			return "No Scheme";
		}		
		else if(salary>5000 && salary<20000) {
			return "Scheme C";
		}
		else if(salary>=20000 && salary<40000) {
			return "Scheme B";
		}
		else {
			return "Scheme A";
		}
	}
	
	@Override
	public void addEmployees(String idNum, Employee employee) {
		dao.storeIntoDatabase(idNum, employee);
	}
	
	@Override
	public Map<String, Employee> displayEmployees(){
		return dao.displayEmployees();
	}
	
}
