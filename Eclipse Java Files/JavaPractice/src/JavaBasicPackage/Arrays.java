package JavaBasicPackage;
public class Arrays {

	public static void main(String[] args) {
		
		//Question 1
		int q1a [] = {1, 2, 3};
		
		for (int q1i = 0; q1i < q1a.length; q1i ++) {
			System.out.println (q1a [q1i]);
		}

		//Question 2
		int q2a [] = {13, 5, 7, 68, 2};
		int q2m = q2a.length / 2;
		System.out.println (q2a [q2m]);
	
		//Question 3
		String q3a [] = {"Red", "Green", "Blue", "Yellow"};
		System.out.println (q3a.length);
		String q3aa [] = q3a.clone();
		
		System.out.println (java.util.Arrays.toString (q3a));
		System.out.println (java.util.Arrays.toString(q3aa));

		//Question 4
		int q4a [] = new int [5];
		
		for (int q4i = 0; q4i < q4a.length; q4i ++) {
			q4a [q4i] = (int)(Math.random () * 100) + 1;
		}
		System.out.println (q4a [0]);
		System.out.println (q4a [q4a.length - 1]);
		
		//Question 5
		int q5a [] = new int [5];
		
		for (int q5i = 0; q5i < q5a.length; q5i ++) {
			q5a [q5i] = q5i;
			System.out.println (q5a [q5i]);
		}
	
		//Question 6
		int q6a [] = new int [5];
		
		for (int q6i = 0; q6i < q6a.length; q6i ++) {
			q6a [q6i] = q6i * 2;
			System.out.println (q6a [q6i]);
		}
	
		//Question 7
		int q7a [] = new int [5];
		
		for (int q7i = 0; q7i < q7a.length; q7i ++) {
			if (q7a.length / 2 == q7i) {
				continue;
			}
			q7a [q7i] = q7i;
			System.out.println (q7a [q7i]);
		}
		
		//Question 8
		String q8a [] = {"Zero", "One", "Two", "Three", "Four"};
		System.out.println (java.util.Arrays.toString (q8a));
		int q8m = q8a.length / 2;
		String q8t = q8a [0];
		q8a [0] = q8a [q8m];
		q8a [q8m] = q8t;
		System.out.println (java.util.Arrays.toString (q8a));
	
		//Question 9
		int q9a [] = {4, 2, 9, 13, 1};
		int max = 0;
		int temp = 0;
		System.out.println (java.util.Arrays.toString(q9a));
		
		for (int q9i = 0; q9i < q9a.length; q9i ++) {
			if (q9a [q9i] > max) {
				max = q9a [q9i];
				temp = q9a [q9a.length - 1];
				q9a [q9a.length - 1] = q9a [q9i];
				q9a [q9i] = temp;
			}
		}
		System.out.println (java.util.Arrays.toString(q9a));
	
		//Question 10
		Object [] q10a = {0, "One", "Two", "Three", 4.0};
		System.out.println (java.util.Arrays.toString(q10a));
	}
}
