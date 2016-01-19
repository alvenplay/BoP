package Release_VIII.A_Chapter_7.R16_Stack;

public class Test {
	private int[] values;
	private int tos;
	
	Test(int size) {
		values = new int[size];
		tos = -1;
	}
	
	void push(int item) {
		if(tos == values.length-1) {
			System.out.println("Stos jest pelny.");
		} else {
			values[++tos] = item;
		}
	}
	
	int pop() {
		if(tos<0) {
			System.out.println("Stos jest pusty.");
			return 0;
		} else {
			return values[tos--];
		}
	}
	
	int size() {
		return values.length;
	}
}
