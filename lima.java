package prob;

public class lima {

	public static void main(String[] args) {
		int x[] = {1,2,3,4,5};
		int lowest = x[0];
		int highest = x[0];
		
		for (int i=1;i<x.length;++i) {
			if (lowest > x[i]) 
				{lowest = x[i];}
			if (highest < x[i]) 
				{highest = x[i];}
	}
		
		System.out.println("the lowest is: " + lowest);
		System.out.println("the highest is: " + highest);

	}}
