package prob;
import java.util.Arrays;
public class enam {

	public static void main(String[] args) {
		int x[] = {1,2,3,2,1};
		int y[] = new int [x.length];
		int a = 0;
		for(int i=x.length-1; i>=0; --i) {
			y[a] = x[i];
			a++;
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		if(Arrays.equals(x, y)) {
			System.out.println("same");
		}
		}
	}


