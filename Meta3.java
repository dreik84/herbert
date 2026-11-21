// Аннотинорование с использованием стандарных (default) значений
import java.lang.annotation.*;
import java.lang.reflect.*;

class Meta3 {
	
	@MyAnno()
	public static void myMeth(String str, int i) {
		
		Meta3 ob = new Meta3();

		try {
			//Class<?> c = ob.getClass();
			Class<?> c = Meta3.class;

			Method m = c.getMethod("myMeth", String.class, int.class);

			MyAnno anno = m.getAnnotation(MyAnno.class);

			System.out.println(anno.str() + " " + anno.val());

		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден");
		}
	}

	public static void main(String[] args) {
		myMeth("test", 1);
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

	String str() default "Тест";
	int val() default 999;
}
