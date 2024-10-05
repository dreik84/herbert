// Программа поиска простых чисел от 2 до 100
class PrimeNumbers {
	public static void main(String[] args) {
		
		for (var i = 2; i <= 100; i++) { 
			var isPrime = true;
		
			for (var j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) System.out.print(i + " ");
		}
	}
}
