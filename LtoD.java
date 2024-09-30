// Демонстрация автоматического преобразования
class LtoD {
	public static void main(String[] args) {
		long L;
		double D;

		L = 10000000L;
		D = L; // автоматическое преобразование из long в double
		System.out.println("L и D: " + L + " " + D);

		D = 10000000.0;
		L = D; // Не разрешено !!!
		System.out.println("L и D: " + L + " " + D);
	}
}
