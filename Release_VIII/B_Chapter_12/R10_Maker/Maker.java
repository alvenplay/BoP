package Release_VIII.B_Chapter_12.R10_Maker;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMaker { }

public class Maker {
	
	@MyMaker
	public static void myMeth() {
		Maker ob = new Maker();
		
		try {
			Method m = ob.getClass().getMethod("myMeth");
			
			if(m.isAnnotationPresent(MyMaker.class)) {
				System.out.println("Adnotacja MyMaker istnieje.");
			}
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody.");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}

}
