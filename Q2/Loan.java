package com.eval.Q2;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee)
		{
			double loan = employeeObj.salary + employeeObj.salary*15/100;
			return loan;
		}
		else 
		{
			double loan1 = employeeObj.salary + employeeObj.salary*10/100;
			return loan1;
		}
		
	}

	Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
