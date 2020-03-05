package prob;
import java.util.Arrays;
public class rev {

	public static void main(String[] args) {
		int x[] = {1,2,3,4,5,6,7,8};
		int temp1;
		int temp2;
		for(int i=0; i<x.length/2; i++) {
			temp1 = x[i];
			temp2 = x[x.length-i-1];
			x[i] = temp2;
			x[x.length-i-1] = temp1;} 
		 System.out.println(Arrays.toString(x));
	}
}