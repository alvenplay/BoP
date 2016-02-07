package Release_VIII.A_Chapter_7.R10_Rec_Test;

public class RecTest {
	int values[];
	
	RecTest(int size) {
		values = new int[size];
	}
	
	void printArray(int i) {
		if(i==0) {
			return;
		} else {
			printArray(i-1);
			System.out.println("[" +(i-1) +"] " +values[i-1]);
		}
	}
}
