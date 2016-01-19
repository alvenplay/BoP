package Release_VIII.A_Chapter_6.P8_Test_Stack;

public class Stack {
	int stck[] = new int[10];
	int tos;
	
	Stack() {
		tos = -1;
	}
	
	void push(int item) {
		if(tos==9) {
			System.out.println("Stos jest pelny");
		} else {
			stck[++tos] = item;
		}
	}
	
	int pop() {
		if(tos<0) {
			System.out.println("Stos jest pusty");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
