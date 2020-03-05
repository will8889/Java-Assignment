package prob;
import java.util.Scanner;
import java.util.Arrays;
public class sembilan {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int arr[] = new int [5];
		int temp1;
		int temp2;
		for(int i=0;i<5;i++) {
			System.out.println("Enter number: ");	
			int numbah = myObj.nextInt();
			arr[i] = numbah;
		}
		System.out.println("before shifting: " + Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			temp1 = arr[i];
			temp2 = arr[arr.length-1];
			arr[i] = temp2;
			arr[arr.length-1] = temp1;
		}
		System.out.println("\nafter shifting: " + Arrays.toString(arr));
	}
}