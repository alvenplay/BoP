package Additional_Projects_Class;

import java.io.IOException;
import java.util.Calendar;

public class C4_P2_Date {

	public static void main(String[] args) throws InterruptedException, IOException {

		for( ; ; ){
			System.out.print(((Calendar) Calendar.getInstance()).getTime());
			Thread.sleep(1000);
			System.out.print("\r");

		}

	}

}
