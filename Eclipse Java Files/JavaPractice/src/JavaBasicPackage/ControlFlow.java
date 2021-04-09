package JavaBasicPackage;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		
		//Question 1
		int q1x = 15;
		
		if (q1x < 10) {
			System.out.println (q1x);
		}
	
		//Question 2
		int q2x = 15;
		
		if (q2x < 10) {
			System.out.println ("Less than 10");
		}
		else {
			System.out.println ("Greater than 10");
		}
	
		//Question 3
		int q3x = 50;
		
		if (q3x < 10) {
			System.out.println ("Less than 10");
		}
		else if (q3x > 10 && q3x < 20) {
			System.out.println ("Between 10 and 20");
		}
		else if (q3x >= 20) {
			System.out.println ("Greater than or equal to 20");
		}
		/*
		 * As per the question, this program will not print anything
		 * out if the input given was 10.
		 */
		
		//Question 4
		int q4x = 5;
		
		if (q4x < 10 || q4x > 20) {
			System.out.println ("Out of range");
		}
		else {
			System.out.println ("In range");
		}
	
		//Question 5
		Scanner scanner = new Scanner (System.in);
		System.out.print ("Enter a score: ");
		int input = scanner.nextInt();
		
		if (input >= 90 && input <= 100) {
			System.out.println ("A");
		}
		else if (input >= 80 && input <= 89) {
			System.out.println ("B");
		}
		else if (input >= 70 && input <= 79) {
			System.out.println ("C");
		}
		else if (input >= 60 && input <= 69) {
			System.out.println ("D");
		}
		else if (input < 60 && input >= 0) {
			System.out.println ("F");
		}
		else {
			System.out.println ("Score out of range");
		}
	
		//Question 6
		System.out.print ("Enter a number day of the week: ");
		int day = scanner.nextInt();
		
		switch (day) {
			case 1 :
				System.out.println ("Sunday");
				break;
			case 2 :
				System.out.println ("Monday");
				break;
			case 3 :
				System.out.println ("Tuesday");
				break;
			case 4 :
				System.out.println ("Wednesday");
				break;
			case 5 :
				System.out.println ("Thursday");
				break;
			case 6 :
				System.out.println ("Friday");
				break;
			case 7 :
				System.out.println ("Saturday");
				break;
			default :
				System.out.println ("Out of range");
		}
	}
}
