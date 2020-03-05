package prob;

public class empat {

	public static void main(String[] args) {
		int sum = 0;
		int x[] = {1,2,3,4,5};
		int multiplysum = x[0];
		for (int i=0; i<x.length;i++) {
			sum += x[i];
		}
		for (int i=0;i<x.length-1;i++) {
			multiplysum = multiplysum * x[i+1];
		}
		System.out.println("The sum of the array is: " + sum);
		System.out.println("The product of the array is: " + multiplysum);
	}

}
