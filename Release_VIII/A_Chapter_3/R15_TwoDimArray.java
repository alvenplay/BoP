package Release_VIII.A_Chapter_3;

public class R15_TwoDimArray {

	public static void main(String[] args) {
		int two[][] = new int[4][5];
		int k = 0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				two[i][j] = k++;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(two[i][j] +" ");
			}
			System.out.println();
		}

	}

}
