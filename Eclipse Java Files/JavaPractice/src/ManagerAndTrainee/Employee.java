package ManagerAndTrainee;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected double specialAllowance = 250.80;
	protected double hra = 1000.50;
	
	public Employee (long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}

	protected void calculateSalary () {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println ("Salary: " + salary);
	}
	
	protected void calculateTransportAllowance () {
		double transportAllowance = basicSalary * .10;
		System.out.println ("Transport Alloowance: " + transportAllowance);
	}
}
