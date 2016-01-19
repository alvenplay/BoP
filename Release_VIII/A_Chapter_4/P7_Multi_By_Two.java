package Release_VIII.A_Chapter_4;

public class P7_Multi_By_Two {

	public static void main(String[] args) {
		int num = 0xF;
		
		for(int i=0; i<4; i++) {
			num <<= 1;
			System.out.println(num);
		}

	}

}
