// Проверка, являеся ли число простым
class FindPrime {
	public static void main(String[] args) {
		
		int num;
		boolean isPrime;

		num = 14;
		isPrime = (num < 2) ? false : true;

		for (int i = 2; i <= num / i; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) System.out.println(num + " is prime");
		else System.out.println(num + " is not prime");
	}
}
