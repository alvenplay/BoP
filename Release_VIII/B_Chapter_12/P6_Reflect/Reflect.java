package Release_VIII.B_Chapter_12.P6_Reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

public class Reflect {
	@MyAnno(str = "Przykladowa adnotacja", val=100)
	public static void myMeth() {
		Reflect ob = new Reflect();
		
		try {
			Class<? extends Reflect> c = ob.getClass();
			
			Method m = c.getMethod("myMeth");
			
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() + " " +anno.val());
		} catch(NoSuchMethodException e){
			System.out.println("Nie znaleziono metody");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}

}
