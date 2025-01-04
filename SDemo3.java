class SDemo3 {
	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock("Внутри конструктора");

		System.out.println("Квадратный корень 2: " + StaticBlock.rootOf2);
		System.out.println("Квадратный корень 3: " + StaticBlock.rootOf3);
	}
}


// Использование статического блока
class StaticBlock {
	static double rootOf2;
	static double rootOf3;

	static {  // этот блок выполняется при загрузке класса
		System.out.println("Внутри статического блока");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);
	}

	StaticBlock(String msg) {
		System.out.println(msg);
	}
}
