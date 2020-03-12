package dem0;
import java.util.Scanner;
import java.util.Arrays;

public class myUtilities {

	public void inputValues(int[] a, int n) {
		Scanner myObj = new Scanner(System.in);
		for(int i=0; i<n;++i) {
			System.out.println("input array number " +(i+1)+ ": ");
			a[i] = myObj.nextInt();}
	}
	
	public String printValues(int[] q) {
		return Arrays.toString(q);
	} 
	
	public void checkValues(int[] p, int n) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Input number to check: ");
		int check = myObj.nextInt();
		int counter = 0;
		for(int i=0;i<n;i++) {
			if(check == p[i]) {
				counter +=1;}}
		if(counter > 0) System.out.println("The number is in the array");
		else System.out.println("The number is not in the array");
}
	
	public void countArrayValues(int[] p,int n) {
		int zero = 0;
		int pos = 0;
		int neg = 0;
		int odd = 0;
		int even = 0;
		for(int i=0;i<n;++i) {
			if (p[i] == 0) zero+=1;
			else if(p[i] < 0) neg+=1;
			else if(p[i] > 0) {
				pos+=1;
				if (p[i] % 2 == 0) {
					even+=1;}
				else if (p[i] % 2 == 1) { 
					odd+=1;}
			}
		}
		System.out.println("\ntotal positive number: ");
		System.out.println(pos);
		System.out.println("total negative number: ");
		System.out.println(neg);
		System.out.println("total odd number: ");
		System.out.println(odd);
		System.out.println("total even number: ");
		System.out.println(even);
		System.out.println("total zero number: ");
		System.out.println(zero);
			}
	
	public void arraySum (int[] p,int n) {
		int sum = 0;
		int multiplysum = 1;
		for (int i=0; i<n;i++) {
			sum += p[i];
			multiplysum = multiplysum * p[i];
		}
		System.out.println("The sum of the array is: " + sum);
		System.out.println("The product of the array is: " + multiplysum);
	}
	
	public void smallLarge (int[] p, int n) {
		int lowest = p[0];
		int highest = p[0];
		
		for (int i=1;i<n;++i) {
			if (lowest > p[i]) 
				{lowest = p[i];}
			if (highest < p[i]) 
				{highest = p[i];}
	}
		
		System.out.println("the lowest is: " + lowest);
		System.out.println("the highest is: " + highest);
	}
	
	public void reverseSame (int[] p, int n) {
		int y[] = new int [n];
		int a = 0;
		for(int i=n-1; i>=0; --i) {
			y[a] = p[i];
			a++;
		}
		System.out.println(Arrays.toString(p));
		System.out.println(Arrays.toString(y));
		if(Arrays.equals(p, y)) {
			System.out.println("same");}
		else System.out.println("not same");
	}
	
	public void splitArray (int[] p, int n) {
		int plus = 0;
		if(n % 2 == 1)plus += 1;
		int first[] = new int [n/2];
		int second[] = new int [n/2+plus];
		
		
		for(int i=0; i<n;i++) {
			if(i<=n/2-1) {
				first[i] = p[i];}
			else if(i>n/2-1) {
				second[i-n/2] = p[i];
				}
			}
		
		System.out.println("The first array is: " + Arrays.toString(first));
		System.out.println("The second array is: " + Arrays.toString(second));
	}
	public void splitHighestValue (int[] p, int n) {
		int highest = 0;
		int temp;
		int temp2;
		int secondhighest = 0;
		for(int i=0;i<n;i++) {
			//loop to find the highest number in array
			if(highest < p[i]) highest = p[i];
		}
		//second loop to get second highest in array
		for(int i=0;i<n;i++) {
			temp = secondhighest;
			if(secondhighest < p[i]) secondhighest = p[i];
			if(secondhighest == highest) secondhighest = temp;}
		int[] z = new int [n+1];
		for(int i=0;i<n;++i) {
			z[i] = p[i];}
		for(int i=0; i<z.length; ++i) {
			if(i>=z.length-2)
			if(z[i] == highest) {
				temp=highest-secondhighest;
				z[i] = secondhighest;
				z[i+1] = temp;
			} 
			if(i<z.length-2) {
				if(z[i] == highest) {
					temp=highest-secondhighest;
					z[i] = secondhighest;
					temp2 = z[i+1];
					z[i+1] = temp;
					for(int x=i+2;x+1<z.length-1;++x) {
						temp= z[x];
						z[x] = temp2;
						temp2 = temp;
					}
					//for the last one because i didn't know how to loop it
					temp = z[z.length-2];
					z[z.length-2] = temp2;
					z[z.length-1] = temp;
				}
				}
	}
		System.out.println("Output: " + Arrays.toString(z));
	}
	
	public void shiftArray (int[] p, int n) {
		int temp1;
		int temp2;
		System.out.println("before shifting: " + Arrays.toString(p));
		for(int i=0; i<n-1; i++) {
			temp1 = p[i];
			temp2 = p[n-1];
			p[i] = temp2;
			p[n-1] = temp1;
		}
		System.out.println("\nafter shifting: " + Arrays.toString(p));
	}
	
	public void sortArray (int[] p, int n) {	
		int temp;
		for (int i=0; i<n;++i) {
			for (int j=i+1; j<n; ++j) {
				if (p[i] > p[j]) {
					temp = p[i];
					p[i] = p[j];
					p[j] = temp;}
				}
		}
		System.out.println("sorted list: " + Arrays.toString(p));
	}
}