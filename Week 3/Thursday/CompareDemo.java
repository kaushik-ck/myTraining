import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee{
	int age;
	String name;
	public String firstName, lastName;
	String[] store = {" "," "};

	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public Integer getAge(){
		return this.age;
	}

	public String getName(){
		return this.name;
	}

	public String getFirstName(){

		store = this.name.split(" ", 2);
		firstName = store[0];
		return this.firstName;
	}

	public String getLastName(){

		store = this.name.split(" ", 2);
		if(store.length>1){
			lastName = store[1];
			return this.lastName;	
		}
		return "AAAAAA";		
	}

	@Override
	public String toString(){
		return this.getName();
	}
}



class SortByFirstName implements java.util.Comparator{
	@Override
	public int compare(Object firstObj, Object secondObj){
		return ((Employee)firstObj).getFirstName().compareTo(((Employee)secondObj).getFirstName());
	}
}

class SortByLastName implements java.util.Comparator{
	@Override
	public int compare(Object firstObj, Object secondObj){
		return ((Employee)firstObj).getLastName().compareTo(((Employee)secondObj).getLastName());
	}
}

class SortByAge implements java.util.Comparator{
	@Override
	public int compare(Object firstObj, Object secondObj){
		return ((Employee)firstObj).getAge().compareTo(((Employee)secondObj).getAge());
	}
}

class CompareDemo{

	static ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public static void main(String[] args) {

		new CompareDemo().driverProgram();
	}

	public void driverProgram(){

		System.out.println("Welcome");
		displayMenu();
	}

	public void displayMenu(){
		System.out.println("\n1. Add Employee.");
		System.out.println("2. Sorting Program\n3. Exit\n");
		userChoice();
	}

	public void userChoice(){

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		switch(choice){
			case 1:
				addEmployee();
				break;

			case 2:
				sortingProgramDisplay();
				break;

			case 3:
				System.out.println("Exiting...");
				break;
		}
	}

	public void addEmployee(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter name: ");
		String str = sc.nextLine();
		System.out.print("\nEnter age: ");
		int num = sc.nextInt();
		System.out.println("Entry added");

		employeeList.add(new Employee(str,num));
		displayMenu();
	}

	public void sortingProgram(int choice){

		switch(choice){
			case 1:
				java.util.Collections.sort(employeeList, new SortByFirstName());	
				System.out.println(employeeList);
				break;
			case 2:
				java.util.Collections.sort(employeeList, new SortByLastName());
				System.out.println(employeeList);
				break;
			case 3:
				java.util.Collections.sort(employeeList, new SortByAge());
				System.out.println(employeeList);
				break;
		}
		displayMenu();

	}

	public void sortingProgramDisplay(){

		System.out.println("\nSort by:");
		System.out.println("	1. First Name");
		System.out.println("	2. Last Name");
		System.out.println("	3. Age Name\n");
		sortingProgramChoice();
	}

	public void sortingProgramChoice(){
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		sortingProgram(choice);
	}
}
