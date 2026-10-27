// Перечисление сортов яблок

	class EnumDemo {
		public static void main(String[] args) {
			
			Apple ap;
			ap = Apple.RedDel;

			System.out.println("Значение ap: " + ap);

			ap = Apple.GoldenDel;

			if (ap == Apple.GoldenDel)
				System.out.println("ap содержит " + ap);

			switch (ap) {
				case Jonathan:
					System.out.println("Джонатан");
					break;
				case GoldenDel:
					System.out.println("Голден Делишес");
					break;
			}
		}
	}

enum Apple {
	RedDel, GoldenDel, Jonathan
}

