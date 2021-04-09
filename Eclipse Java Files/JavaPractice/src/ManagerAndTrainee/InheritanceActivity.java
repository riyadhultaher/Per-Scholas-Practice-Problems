package ManagerAndTrainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		Employee m = new Manager (126534, "Peter", "Chennai India", 237844, 65000);
		m.calculateSalary();
		m.calculateTransportAllowance();
		
		Employee t = new Trainee (29846, "Jack", "Mumbai India", 442085, 45000);
		t.calculateSalary();
		t.calculateTransportAllowance();
	}
}
