package com.ibm.eis.ui;

import java.util.Scanner;

import com.ibm.eis.bean.Employee;
import com.ibm.eis.service.EmployeeDetailsProcess;


public class Main {
	public static void main(String[] args) throws salaryInvalidException{
		
		Scanner sc = new Scanner(System.in);
		EmployeeDetailsProcess edp = new EmployeeDetailsProcess();
		
		System.out.print("Enter the name of the employee: ");
		String nameString = sc.next();
		
		String idNum;
		System.out.print("Enter the ID of the employee: ");
		while(true) {
			idNum = sc.next();
			if(edp.validateIdNum(idNum)) {
				break;
			}
			else {
				System.out.println("Enter ID Number in ABCD format: ");
			}
		}
		
		System.out.print("Enter the salary of the employee: ");
		int salary;
		while(true) {
			try {
				salary = sc.nextInt();
				break;
			}catch (Exception e) {
				System.out.println("Enter a valid value: ");
				sc.nextLine();
			}
		}
		
		
		String designationString = edp.assignDesignation(salary);
		String insuranceScheme = edp.assignInsuranceScheme(salary);
		
		Employee emp = new Employee();
		emp.setEmpName(nameString);
		emp.setIdNum(idNum);
		emp.setDesignation(designationString);
		emp.setSalary(salary);
		emp.setInsuranceScheme(insuranceScheme);
		
		edp.addEmployees(idNum, emp);
		
		System.out.println(edp.displayEmployees());
	}
}

class salaryInvalidException extends Exception{
	public salaryInvalidException(String s){
		super(s);
	}
}
