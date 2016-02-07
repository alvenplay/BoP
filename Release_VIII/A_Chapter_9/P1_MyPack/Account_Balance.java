package Release_VIII.A_Chapter_9.P1_MyPack;

public class Account_Balance {

	public static void main(String[] args) {
		Balance current[] = new Balance[3];
		
		current[0] = new Balance("J. K. Rowling", 123.23);
		current[1] = new Balance("Willhelm Tell", 157.00);
		current[2] = new Balance("Tom Jackson", -12.23);
		
		for(int i=0; i<3; i++) current[i].show();
	}

}
