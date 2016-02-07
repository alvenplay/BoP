package Release_VIII.A_Chapter_7.R10_Rec_Test;

public class Recursion {

	public static void main(String[] args) {
		RecTest rt = new RecTest(10);
		
		for(int i=0; i<10; i++) {
			rt.values[i] = i;
		}
		rt.printArray(10);

	}

}
