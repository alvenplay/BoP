package Release_VIII.A_Chapter_3;

public class R16_TwoDimAgain {

	public static void main(String[] args) {
		int twoD[][] = new int[6][];
			twoD[0] = new int[1];
			twoD[1] = new int[2];
			twoD[2] = new int[3];
			twoD[3] = new int[4];
			twoD[4] = new int[5];
			twoD[5] = new int[6];
		int k=0;
		
		for(int i=0; i<6; i++, k=1) {
			for(int j=0; j<i+1; j++) {
				twoD[i][j] = k++;
			}
		}
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print(twoD[i][j] +" ");
			}
			System.out.println();
		}

	}

}
