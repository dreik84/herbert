// Неожиданное повышение типов
class PromDemo {
	public static void main(String[] args) {
		byte b;
		int i;

		b = 10;
		i = b * b; // Привидение не требуется, результат повышен до int
		
		b = 10;
		b = (byte) (b * b); // Здесь требуется приведение
		
		System.out.println("i и b: " + i + " " + b);
	}
}
