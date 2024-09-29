// Побочные эффекты могут быть важны
class SideEffects {
	public static void main(String[] args) {
		int i;

		i = 0;
		// Здесь i все равно инкрементируется
		if (false & (++i < 100))
			System.out.println("Не отображается");

		System.out.println("Оператор if выполняется: " + i); // i => 1

		// В данном случае i не инкрементируется
		if (false && (++i < 100))
			System.out.println("Не отображается");

		System.out.println("Оператор if выполняется: " + i); // i => 1
	}
}
