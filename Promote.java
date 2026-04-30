// Правила повышения типов
class Promote {
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		long l = 340000;
		float f = 5.67f;
		double d = .1234;

		double result = f * (l - b) + (i / c) - (d * s);
		System.out.println(f * (l -b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
	}
}
