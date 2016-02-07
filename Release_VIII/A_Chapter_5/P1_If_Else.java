package Release_VIII.A_Chapter_5;

public class P1_If_Else {

	public static void main(String[] args) {
		int month = 4;
		String season;
		
		if(month == 4 || month == 1 || month == 2) {
			season = "zima";
		} else
			if(month == 3 || month == 4 || month == 5) {
				season = "wiosna";
			} else
				if(month == 6 || month == 7 || month == 8) {
					season = "lato";
				} else
					if(month == 9 || month == 10 || month == 11) {
						season = "jesien";
					} else {
						System.out.println("Bledny miesiac");
						return ;
					}
		System.out.println("Miesiac kwiecien nalezy do pory roku " +season +".");
		return ;

	}

}
