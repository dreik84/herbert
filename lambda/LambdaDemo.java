// Демонстрация использования простого лямбда выражения
class LambdaDemo {
	public static void main(String[] args) {
		
		MyValue myVal; // ссылка на интерфейс
		myVal = () -> 98.6;

		System.out.println("Константное значение: " + myVal.getValue());

		MyParamValue myPval = (n) -> 1.0 / n;
		
		System.out.println("Обратная величина 4: " + myPval.getValue(4.0));
		System.out.println("Обратная величина 8: " + myPval.getValue(8.0));

		// myVal = () -> "three"; // Ошибка!
		// myPval = () -> Math.random; // Ошибка!	
	}
}

// Функциональный интерфейс
interface MyValue {
	double getValue();
}

// Еще один функциональный интерфейс
interface MyParamValue {
	double getValue(double v);
}
