package com.eval.Q2;

public class Main {
	
	public static void main(String[] args) {
		
		Loan l = new Loan();
		
		Employee emp = new PermanentEmployee(10, "Chandan", 1000.0);
		
		
		
		emp.setEmployeeId(10);
		emp.setSalary(50000);
		emp.setEmployeeName("Chandan");
		
		
		double loanP = l.calculateLoanAmount(emp);
		System.out.println("Name PermanentEmployee : " + emp.getEmployeeName());
		System.out.println("EmployeeId  PermanentEmployee: " + emp.getEmployeeId());
		System.out.println("Slary  PermanentEmployee: " + emp.getSalary());
		System.out.println("Loan Amount PermanentEmployee : " + loanP);
		
		
		System.out.println("======");
		
		Employee empt = new TemporaryEmployee(10, "Deepak", 8, 500);
		TemporaryEmployee emp2 = new TemporaryEmployee(10, "Deepak", 8, 500);
	
		emp2.setHourlyWages(500);
		emp2.setHoursWorked(8);
		
		double loanT = l.calculateLoanAmount(empt);
		System.out.println("Loan Amount TEmployee : " + loanT);
		emp2.calculateSalary();
		
	}
}



