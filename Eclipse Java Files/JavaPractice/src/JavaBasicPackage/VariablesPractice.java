package JavaBasicPackage;
public class VariablesPractice {

	public static void main(String[] args) {
		
		//Question 1
		int q1v1, q1v2;
		q1v1 = 2;
		q1v2 = 3;
		int q1v3 = q1v1 + q1v2;
		System.out.println (q1v3);
		
		//Question 2
		double q2v1, q2v2;
		q2v1 = 10.5;
		q2v2 = 20.2;
		double q2v3 = q2v1 + q2v2;
		System.out.println (q2v3);
		
		//Question 3
		int q3v1 = 1;
		double q3v2 = 2.5;
		double q3v3 = q3v1 + q3v2;
		System.out.println (q3v3);
		
		//Question 4
		double q4v1 = 5;
		int q4v2 = 2;
		double q4v3 = q4v1 / q4v2;
		System.out.println (q4v3);
		/*Initially having the larger variable be an integer risks
		losing some of the correct number because it converts it to 
		a whole number. By changing the larger variable to a double,
		the variable that holds the result of the division must also
		be a double. This would return the correct value.
		*/
		
		//Question 5
		double q5v1 = 7.5;
		double q5v2 = 5.5;
		double q5v3 = q5v1 / q5v2;
		System.out.println (q5v3);
		q5v3 = (int) q5v3;
		System.out.println (q5v3);
		
		//Question 6
		int x = 5;
		int y = 6;
		double q = y / x;
		System.out.println (q);
		q = y;
		System.out.println (q);
		/*An integer cannot be type casted to a double. Rather it can
		be assigned to another variable of type double.
		*/
		
		//Question 7
		int CONSTANT = 5;
		int q7v1 = 25 / CONSTANT;
		System.out.println (q7v1);
		
		//Question 8
		double SALES_TAX = 0.07;
		double coffee = 2.99;
		double latte = 3.99;
		double milkshake = 4.99;
		double subtotal = (coffee * 3) + (latte * 4) + (milkshake * 2);
		double totalSale = subtotal + (subtotal * SALES_TAX);
		System.out.printf("%.2f", totalSale);
	}
}
