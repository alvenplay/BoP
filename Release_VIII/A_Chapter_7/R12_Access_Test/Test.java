package Release_VIII.A_Chapter_7.R12_Access_Test;

public class Test {
	private int values[] = new int[10];
	private int tos;
	
	Test() {
		this.tos = -1;
	}
	
	void push(int item) {
		if(tos==9) {
			System.out.println("Stos jest pelny.");
		} else {
			values[++tos] = item;
		}
	}
	
	int pup() {
		if(tos==-1) {
			System.out.println("Stos jest pusty.");
			return 0;
		} else {
			return values[tos--];
		}
	}
}
