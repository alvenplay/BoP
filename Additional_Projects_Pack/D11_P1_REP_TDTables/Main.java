package Additional_Projects_Pack.D11_P1_REP_TDTables;

public class Main {

	public static void main(String[] args) {
		int table[][] = new int[4][];
		table[0] = new int[1];
		table[1] = new int[2];
		table[2] = new int[3];
		table[3] = new int[4];
		
		int i,j,k=0;
		
		for(i=0;i<4;i++) {
			for(j=0;j<i+1;j++) {
				table[i][j] = k++;
			}
		}
		
		for(i=0;i<4;i++) {
			for(j=0;j<i+1;j++) {
				System.out.print(table[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
