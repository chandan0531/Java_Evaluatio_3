package com.eval.Q2;

public class PermanentEmployee extends Employee {

	double basicPay;
		
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		double pfAmount = basicPay* 0.12;
		this.salary = basicPay - pfAmount;
	}
	
}
