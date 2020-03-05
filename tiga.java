package prob;
import java.util.Scanner;
public class tiga {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int pcounter = 0;
		int ncounter = 0;
		int ocounter = 0;
		int ecounter = 0;
		int zcounter = 0;
		for(int i=0;i<20;i++) {
		System.out.println("Enter number: ");	
		int numbah = myObj.nextInt();
		if (numbah < 0) {
			ncounter +=1;
		}
		else if (numbah == 0) {
			zcounter += 1;
		}
		else if (numbah > 0) {
			pcounter += 1;
			if (numbah % 2 == 0) {
				ecounter += 1;
			}
			else if (numbah % 2 == 1) {
				ocounter += 1;
			}
		}
		
		}
		System.out.println("number of positive numbers is: " + pcounter);
		System.out.println("number of negative numbers is: " + ncounter);
		System.out.println("number of odd numbers is: " + ocounter);
		System.out.println("number of even numbers is: " + ecounter);
		System.out.println("number of zero numbers is: " + zcounter);
	}

}
