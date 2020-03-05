package prob;

import java.util.Scanner;

public class dua {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		int arr[] = new int [10];
		for(int i=0;i<10;i++) {
		System.out.println("Enter number: ");	
		int numbah = myObj.nextInt();
		arr[i] = numbah;}
		System.out.println("Enter number to check: ");
		int numbah = myObj.nextInt();
		int counter = 0;
		for(int i=0;i<10;i++) {
			if(numbah == arr[i]) {
				counter +=1;
			}
		}
		if(counter > 0) {
			System.out.println("Number is present in array");
		}
		else System.out.println("Number is not present in array");{}
	}

}
