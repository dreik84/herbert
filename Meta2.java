// Получение всех аннотаций
import java.lang.annotation.*;
import java.lang.reflect.*;

@MyAnno(str = "Meta2", val = 99)
@What(description = "Class annotation")
class Meta2 {
	
	@What(description = "Аннотация метода")
	@MyAnno(str = "Пример аннотации 2", val = 10)
	public static void myMeth() {
		
		Meta2 ob = new Meta2();

		try {
			//Class<?> c = ob.getClass();
			//Class<?> c = Meta2.class;
			
			Annotation[] annos = ob.getClass().getAnnotations();

			for (Annotation a : annos)
				System.out.println(a);

			System.out.println();

			Method m = ob.getClass().getMethod("myMeth");

			annos = m.getAnnotations();

			for (Annotation a : annos)
                                System.out.println(a);

                        System.out.println();

			
		} catch(NoSuchMethodException e) {
			System.out.println("Метод не найден");
		}
	}

	public static void main(String[] args) {
		myMeth();
	}
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
	String description();
}
