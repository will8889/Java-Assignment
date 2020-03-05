package prob;

public class alphabet {

	public static void main(String[] args) {
		int mask1 = '\u00DF'; 
		int mask2 = '\u0020';
		int char1 = 'b'; 
		int char2 = 'B';
		int uc = char1 & mask1;//from small to capital
		int lc = char2 | mask2;//capital letter to small
				
		System.out.printf("%c", uc);
		System.out.printf("%c", lc);

}
}
