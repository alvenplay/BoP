package Release_VIII.A_Chapter_3;

public class R18_ThreeDMatrix {

	public static void main(String[] args) {
		int ThreeD[][][] = new int[3][4][5];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				for(int k=0; k<5; k++) {
					ThreeD[i][j][k] = i*j*k;
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=1; j<4; j++) {
				for(int k=1; k<5; k++) {
					System.out.print(ThreeD[i][j][k] +" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
