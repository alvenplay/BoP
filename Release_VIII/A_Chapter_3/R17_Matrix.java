package Release_VIII.A_Chapter_3;

public class R17_Matrix {

	public static void main(String[] args) {
		double m[][] = {
			{0*0, 0*1, 0*2, 0*3},
			{0*1, 1*1, 1*2, 1*3},
			{0*2, 1*2, 2*2, 2*3},
			{0*3, 1*3, 3*2, 3*3}
		};
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
		}
	}

}
