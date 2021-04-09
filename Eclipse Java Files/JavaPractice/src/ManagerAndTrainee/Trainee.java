package ManagerAndTrainee;

public class Trainee extends Employee {

	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		this.basicSalary = salary;
	}
	
	// Added override method so it can say Trainee Salary
	protected void calculateSalary () {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println ("Trainee Salary: " + salary);
	}
	
	protected void calculateTransportAllowance () {
		double transportAllowance = basicSalary * .10;
		System.out.println ("Trainee Transport Alloowance: " + transportAllowance);
	}
}
