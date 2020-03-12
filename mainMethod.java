package dem0;

import java.util.Scanner;

public class ma1n {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("input array size: ");
		int answer = myObj.nextInt();
		int arr[] = new int[answer];
		myUtilities m = new myUtilities();
		m.inputValues(arr, answer);
		System.out.println("what question do you want to solve?: ");
		int answer2 = myObj.nextInt();
		//1
		if(answer2 == 1) {
		System.out.println(m.printValues(arr));}
		//2
		else if(answer2 == 2) {
		m.checkValues(arr, answer);}
		//3
		else if(answer2 == 3) {
		m.countArrayValues(arr, answer);}
		//4
		else if(answer2 == 4) {
		m.arraySum(arr, answer);}
		//5
		else if(answer2 == 5) {
		m.smallLarge(arr, answer);}
		//6
		else if(answer2 == 6) {
		m.reverseSame(arr, answer);}
		//7
		else if(answer2 == 7) {
		m.splitArray(arr, answer);}
		//8
		else if(answer2 == 8) {
		m.splitHighestValue(arr, answer);}
		//9
		else if(answer2 == 9) {
		m.shiftArray(arr, answer);}
		//10
		else if(answer2 == 10) {
		m.sortArray(arr, answer);}
		else System.out.println("question not found");
	}

}
