package Release_VIII.B_Chapter_12.R11_Single;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value();
}

public class Single {
	
	@MySingle(100)
	public static void myMeth() {
		Single ob = new Single();
		
		try{
			Method m = ob.getClass().getMethod("myMeth");
			
			MySingle ms = m.getAnnotation(MySingle.class);
			
			System.out.println(ms.value());
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono podanej metody");
		}
	}
	public static void main(String[] args) {
		myMeth();

	}

}
