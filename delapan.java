package prob;
import java.util.Scanner;
import java.util.Arrays;

public class delapan {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int arr[] = new int [6];
		int highest = 0;
		int temp;
		int temp2;
		int secondhighest = 0;
		for(int i=0;i<5;i++) {
			//loop to fing the highest number in array
			System.out.println("Enter number: ");	
			int numbah = myObj.nextInt();
			arr[i] = numbah;
			if(highest < arr[i]) highest = arr[i];
		}
		//second loop to get second highest in array
		for(int i=0;i<arr.length-1;i++) {
			temp = secondhighest;
			if(secondhighest < arr[i]) secondhighest = arr[i];
			if(secondhighest == highest) secondhighest = temp;
		}
		//condition before splitting the biggest number
		for(int i=0; i<arr.length; ++i) {
			if(i>=arr.length-2)
			if(arr[i] == highest) {
				temp=highest-secondhighest;
				arr[i] = secondhighest;
				arr[i+1] = temp;
			} 
			if(i<arr.length-2) {
				if(arr[i] == highest) {
					temp=highest-secondhighest;
					arr[i] = secondhighest;
					temp2 = arr[i+1];
					arr[i+1] = temp;
					for(int x=i+2;x+1<arr.length-1;++x) {
						temp= arr[x];
						arr[x] = temp2;
						temp2 = temp;
					}
					//for the last one because i didn't know how to loop it
					temp = arr[arr.length-2];
					arr[arr.length-2] = temp2;
					arr[arr.length-1] = temp;
					
				
			}
		}

	}
		System.out.println("Output: " + Arrays.toString(arr));
}
}//sorry its to complicated because i tried to use only 1 array
