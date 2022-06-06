package com.eval.Q2;

public class TemporaryEmployee extends Employee {

	int hoursWorked;
	int hourlyWages;
	
		
	public TemporaryEmployee(int employeeId, String employeeName,int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		this.salary = hoursWorked * hourlyWages;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	
	

}
