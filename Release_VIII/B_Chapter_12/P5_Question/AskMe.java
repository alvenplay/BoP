package Release_VIII.B_Chapter_12.P5_Question;

public class AskMe {
	static void answer(Answers result) {
		switch (result) {
			case NO:
				System.out.println("NIE");
				break;
			case YES:
				System.out.println("TAK");
				break;
			case MAYBE:
				System.out.println("MOZE");
				break;
			case LATER:
				System.out.println("POZNIEJ");
				break;
			case SOON:
				System.out.println("WKROTCE");
				break;
			case NEVER:
				System.out.println("NIGDY");
				break;
		}
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		
	}

}
