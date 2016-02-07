package Additional_Projects_Class;

public class C3_P1_TimesTable {

	public static void main(String[] args) {
		int size = 10;
		int Times[][] = new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				Times[i][j] = i*j;
			}
		}
		
		for(int i=1; i<size; i++) {
			for(int j=1; j<size; j++) {
					System.out.print(Times[i][j] +"\t");
			}
			System.out.println();
		}

	}

}
