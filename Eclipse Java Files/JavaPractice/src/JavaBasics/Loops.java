package JavaBasics;


public class Loops {

	public static void main(String[] args) {
		
		//Question 1
		for (int q1i = 1; q1i <= 10; q1i ++) {
			System.out.println (q1i);
		}
		
		//Question 2
		int q2i = 10;
		
		while (q2i <= 100) {
			System.out.println (q2i);
			q2i = q2i + 10;
		}
		
		//Question 3
		int q3i = 1;
		
		do {
			System.out.println (q3i);
			q3i ++;
		} while (q3i <= 10);
	
		//Question 4
		for (int q4i = 1; q4i <= 100; q4i ++) {
			if (q4i > 25 && q4i < 75) {
				continue;
			}
			if (q4i % 5 == 0) {
				System.out.println (q4i);
			}
		}
		
		//Question 5
		for (int q5i = 1; q5i <= 100; q5i ++) {
			if (q5i > 50) {
				break;
			}
			if (q5i % 5 == 0) {
				System.out.println (q5i);
			}
		}
	
		//Question 6
		for (int q6i = 1; q6i <= 2; q6i ++) {
			System.out.printf ("Week %d:", q6i);
			System.out.println ();
			
			for (int q6j = 1; q6j <= 5; q6j ++) {
				System.out.printf ("Day %d:", q6j);
				System.out.println ();
			}
		}
	
		//Question 7
		for (int q7i = 10; q7i <= 200; q7i ++) {
			int q7j = q7i;
			int reversedNum = 0;
			
			do {
				int lastDigit = q7j % 10;
				reversedNum = reversedNum * 10 + lastDigit;
				q7j /= 10;
			} while (q7j != 0);
			
			if (q7i == reversedNum) {
				System.out.println (q7i);
			}
			else {
				continue;
			}
		}
		
		//Question 8
		int q8i = 0;
		int q8j = 1;
		int q8k = 0;
		int temp = 0;
		int limit = 50;
		
		System.out.println (q8i);
		System.out.println (q8j);
		
		while (q8k <= limit) {
			q8k = q8i + q8j;
			temp = q8j;
			q8j = q8k;
			q8i = temp;
			
			if (q8k >= limit) {
				break;
			}
			System.out.println (q8k);
		}
		
		//Question 9
		for (int q9i = 0; q9i < 5; q9i ++) {
			System.out.printf ("Outer loop: %d", q9i);
			System.out.println ();
			
			for (int q9j = 0; q9j < 5; q9j ++) {
				System.out.printf ("Inner loop: %d", q9j);
				System.out.println ();
			}
		}
	}
}
