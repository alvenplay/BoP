package Release_VIII.B_Chapter_12.P8_Reflect_Annot;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}

@What(description = "Klasa testowa adnotacji")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

	@What(description = "Metoda testowa adnotacji")
	@MyAnno(str = "Testowanie", val = 100)
	public static void myMeth() {
		Meta2 ob = new Meta2();
		
		try {
			Annotation annos[] = ob.getClass().getAnnotations();
			
			System.out.println("Wszystkie annotacje Meta2: ");
			for(Annotation a : annos)
				System.out.println(a);
			
			System.out.println();
			
			Method m = ob.getClass().getMethod("myMeth");
			annos = m.getAnnotations();
			
			System.out.println("Wszystkie annotacje myMeth: ");
			for(Annotation a : annos)
				System.out.println(a);
			
		} catch(NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody");
		}
	}
	
	public static void main(String[] args) {
		myMeth();
	}

}
