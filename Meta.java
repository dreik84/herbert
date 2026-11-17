// Аннотации
import java.lang.annotation.*;
import java.lang.reflect.*;

class Meta {
	
	@MyAnno(str = "Пример аннотации 2", val = 10)
	public static void myMeth(String str, int i) {
		
		Meta ob = new Meta();

		try {
			//Class<?> c = ob.getClass();
			Class<?> c = Meta.class;

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

	String str();
	int val();
}
