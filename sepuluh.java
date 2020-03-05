package prob;
import java.util.Arrays;
public class sepuluh {

	public static void main(String[] args) {
		int x[] = {10,2,3,4,5,6,7,1,8,9};
		
		int a;
		int temp;
		for (int i=0; i<x.length;++i) {
			for (int j=i+1; j<x.length; ++j) {
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;}
				}
		

		}
		System.out.println("sorted list: " + Arrays.toString(x));
}
}