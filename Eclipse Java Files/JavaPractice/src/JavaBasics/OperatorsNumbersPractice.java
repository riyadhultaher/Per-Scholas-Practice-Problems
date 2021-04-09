package JavaBasics;


public class OperatorsNumbersPractice {

	public static void main(String[] args) {
		
		//Question 1
		/* 
		 * 1
		 * 1000
		 * 100001
		 * 1001110
		 * 1100010011
		 * 1000010011000011
		 */
		
		//Question 2
		/* 
		 * 2
		 * 9
		 * 52
		 * 114
		 * 543
		 * 11367
		 */
		
		//Question 3
		int q3x = 88;
		String q3s = Integer.toBinaryString(q3x);
		q3x = q3x << 1;
		System.out.println (q3s); 
		System.out.println (q3x);
		/* 
		 * 18, 1001
		 * 34, 10001
		 * 176, 1011000
		 */
		
		//Question 4
		int q4x = 32456;
		String q4s = Integer.toBinaryString(q4x);
		q4x = q4x >> 2;
		System.out.println (q4s); 
		System.out.println (q4x);
		/*
		 * 56, 11100001
		 * 388, 11000010011
		 * 8114, 111111011001000
		 */
		
		//Question 5
		int q5x = 7;
		int q5y = 17;
		int q5z = q5x & q5y;
		System.out.println (q5z);
		q5z = q5x | q5y;
		System.out.println (q5z);
		/* 
		 * 1
		 * 23
		 */
		
		//Question 6
		int q6x = 2;
		System.out.println (q6x);
		q6x ++;
		System.out.println (q6x);
		
		//Question 7
		int q7x = 1;
		q7x = q7x + 1;
		System.out.println (q7x);
		q7x ++;
		System.out.println (q7x);
		++ q7x;
		System.out.println (q7x);
		
		//Question 8
		int q8x = 5;
		int q8y = 8;
		int sum = q8y + (q8x ++);
		System.out.println (sum);
	}
}
