// Простой пример использования рекурсии
class Recursion {
	public static void main(String[] args) {
		
		Factorial f = new Factorial();

		System.out.println("Факториал 3 равен " + f.fact(3));
		System.out.println("Факториал 4 равен " + f.fact(4));
		System.out.println("Факториал 5 равен " + f.fact(5));
	}
}

class Factorial {
	
	int fact(int n) {

		if (n == 1) return n;

		return n * fact(n - 1);
	}
}
