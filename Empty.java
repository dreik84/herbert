// Части цикла for могут быть пустыми
class Empty {
	public static void main(String[] args) {
		int i;

		for (i = 0; i < 10; ) {  // выражение итерации отсутствует
			System.out.println("Проход #" + i);
			i++;  // инкрементирование переменной управления циклом
		}

		i = 0; // вынести инициализацию за пределы цикла

		for (; i < 10; ) {
			System.out.println("Pass #" + i);
			i++;
		}

		for (;;) break;  // бесконечный цикл
		
		int sum = 0;

		for (i = 1; i <= 5; sum += i++);  // цикл без тела
	}	
}
