// Пример захвата локальной переменной
class VarCapture {
	public static void main(String[] args) {
		
		// Локальная переменная
		int num = 10;

		MyFunc myLambda = (n) -> {
			
			// Использовать переменную разрешено
			int v = num + n;

			// num++; // Ошибка! Попытка изменить значение переменной
			
			return v;
		};

		System.out.println(myLambda.func(8));

		// num = 9; // Ошибка!
	}
}

interface MyFunc {
	int func(int n);
}
