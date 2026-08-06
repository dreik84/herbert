// Пример вложенного интерфейса

class NestedIfDemo {
	public static void main(String[] args) {
		
		A.NestedIf nif = new B();

		if (nif.isNotNegative(10))
			System.out.println("10 не является отрицательным");

		if (nif.isNotNegative(-12))
                        System.out.println("это не будет выводиться");
	}
}

class A {
	
	public interface NestedIf {
		boolean isNotNegative(int x);
	}
}

class B implements A.NestedIf {
	
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}	
}
