package Release_VIII.A_Chapter_3;

public class P1_Light_Speed {

	public static void main(String[] args) {
		int lightspeed = 299792;
		long days, sec, dis;
		
		days = 1000;
		sec = days * 24 * 60 * 60;
		dis = lightspeed * sec;
		
		System.out.println("In " +days +" light fly " +dis +" km.");

	}

}
