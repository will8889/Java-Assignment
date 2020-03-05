package prob;
import java.util.Arrays;

public class tujuh {

	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9,10};
		int plus = 0;
		if(x.length % 2 == 1)plus += 1;
		int first[] = new int [x.length/2];
		int second[] = new int [x.length/2+plus];
		
		
		for(int i=0; i<x.length;i++) {
			if(i<=x.length/2-1) {
				first[i] = x[i];}
			else if(i>x.length/2-1) {
				second[i-x.length/2] = x[i];
				}
			}
		
		System.out.println("The first array is: " + Arrays.toString(first));
		System.out.println("The second array is: " + Arrays.toString(second));
		

	}

}
