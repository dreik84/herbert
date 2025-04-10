class LambdaDemo3 {
	public static void main(String[] args) {
		
		StringTest isIn = (a, b) -> a.indexOf(b) != -1;
		String str = "This is a test";
		System.out.println("Проверяемая строка: " + str);

		if (isIn.test(str, "is a")) System.out.println("Строка is a найдена");
		else System.out.println("Строка не is a найдена");

		if (isIn.test(str, "xyz")) System.out.println("Строка 'xyz' найдена");                 else System.out.println("Строка 'xyz' не найдена");
	}
}

// Функциональный интерфейс проверяющий строки
interface StringTest {
	boolean test(String aStr, String bStr);
}	
