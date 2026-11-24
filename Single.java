// Одноэлементная аннотация
import java.lang.annotation.*;
import java.lang.reflect.*;

class Single {
	
	@MySingle(11)
	public static void myMeth() {
		
		Single ob = new Single();

		try {
			Method m = ob.getClass().getMethod("myMeth");

			MySingle anno = m.getAnnotation(MySingle.class);

			System.out.println(anno.value() + " " + anno.xyz());

		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
	int value();
	int xyz() default 0;
}
