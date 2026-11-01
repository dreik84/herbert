// Использование встроенных методов перечислений

class EnumDemo4 {
	public static void main(String[] args) {
		
		Apple ap, ap2, ap3;
		System.out.println("Все порядковые номера перечисления Apple:");

		//Apple[] allApples = Apple.values();

		for (Apple a :Apple.values())
			System.out.println(a + " " + a.ordinal());

		ap = Apple.RedDel;
		ap2 = Apple.GoldenDel;
		ap3 = Apple.RedDel;

		System.out.println();

		System.out.println(ap.compareTo(ap2));
		System.out.println(ap.compareTo(ap3));

		if (ap.equals(ap2))
			System.out.println("Ошибка");

		if (ap.equals(ap3))
                        System.out.println(ap + " равно " + ap3);
		
		if (ap == ap3)
                        System.out.println(ap + " == " + ap3);
	}
}

enum Apple {
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
