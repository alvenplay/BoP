package Release_VIII.A_Chapter_5;

public class P5_Switch_String {

	public static void main(String[] args) {
		String str = "dwa";
		
		switch(str) {
			case "jeden":
				System.out.println("jeden");
				break;
			case "dwa":
				System.out.println("dwa");
				break;
			case "trzy":
				System.out.println("trzy");
				break;
			default:
				System.out.println("Brak dopasowania.");
		}

	}

}
