package prob;

public class ascii {

	public static void main(String[] args) {
		int mask1 = '\u00CF';
		int mask2 = '\u0030';
		int ascii = 60;
		int decimal = 5;
		int dec = ascii & mask1;
		int asc = decimal | mask2;
		
		System.out.printf("Ascii from decimal >> %d", asc);
		System.out.printf("\nDecimal from Ascii >> %d", dec);

	}

}
