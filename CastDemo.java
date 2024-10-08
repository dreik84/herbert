// Демонстрация приведений
class CastDemo {
	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;
		
		x = 10.0;
		y = 3.0;

		i = (int) (x / y); // приведение double к int ( усечение )
		System.out.println("Целочисленный результат x / y: " + i);

		i = 100;
		b = (byte) i; // здесь информация не теряется
		System.out.println("Значение b: " + b);

		i = 257;
		b = (byte) i; // на этот раз информация утрачивается
		System.out.println("Значение b: " + b);

		b = 88; // код ASCII для X
		ch = (char) b;
		System.out.println("Значение ch: " + ch);
	}
}
