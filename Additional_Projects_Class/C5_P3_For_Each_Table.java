package Additional_Projects_Class;

public class C5_P3_For_Each_Table {

	public static void main(String[] args) {
		int cache[][][] = new int [11][11][11];
		int add=0, value=0;
		
		for(int i=0; i<11; i++)
			for(int j=0; j<11; j++)
				for(int k=0; k<11; k++)
					cache[i][j][k] = add++;
		
		for(int i[][] : cache)
			for(int j[] : i)
				for(int k : j)
					value+=k;
		
		System.out.println("Suma wartosci w tablicy to : " +value);

	}

}
