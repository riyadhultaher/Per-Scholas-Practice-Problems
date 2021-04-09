package ManagerAndTrainee;

public class Manager extends Employee {

	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
	// Added override method so it can say Manager Salary
	protected void calculateSalary () {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println ("Manager Salary: " + salary);
	}
	
	protected void calculateTransportAllowance () {
		double transportAllowance = basicSalary * .15;
		System.out.println ("Manager Transport Alloowance: " + transportAllowance);
	}
}
