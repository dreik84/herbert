// Демонстрация работы операции ?
class Ternary {
	public static void main(String[] args) {
		int i, k;

		i = 10;
		k = i < 0 ? -i : i; // abs
		System.out.println("Abs " + i + " equals " + k);

		i = -10;
		k = i < 0 ? -i : i; // abs
		System.out.println("Abs " + i + " equals " + k);
	}
}
