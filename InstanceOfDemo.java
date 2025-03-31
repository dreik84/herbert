// Демонстрация работы традиционной операции instanceof
class InstanceOfDemo {
	public static void main(String[] args) {
		Alpha alpha = new Alpha();
		Beta beta = new Beta();
		Gamma gamma = new Gamma();

		if (alpha instanceof Alpha) // true
			System.out.println("alpha является экземпляром Alpha");
		
		if (beta instanceof Beta) // true
			System.out.println("beta является экземпляром Beta");

		if (gamma instanceof Gamma) // true
			System.out.println("Gamma является экземпляром Gamma");


		if (beta instanceof Alpha) // true
			System.out.println("beta также является экземпляром Alpha");

		if (gamma instanceof Alpha) // true
			System.out.println("gamma также является экземпляром Alpha");


		// if (gamma instanceof Beta) // false

		alpha = beta;

		if (alpha instanceof Beta) { // true
			System.out.println("alpha может быть приведена к Beta");
			beta = (Beta) alpha;
		}

		if (alpha instanceof Gamma) // false
	}
}

class Alpha {
	//
}
class Beta extends Alpha {
	//
}
class Gamma extends Alpha {
	//
}
