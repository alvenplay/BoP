package Additional_Projects_Class;

public class C4_P1_Byte_Shift {

	public static void main(String[] args) {
		int y, z;
		y = z = 700;
		
		for(int i = 1; i<=10; i++, y>>=1, z<<=1) {
			System.out.println(i +"\t" +y +"\t" +z);
		}

	}

}
