// Демонстрация использования ссылки на метод экземпляра
class MethodRefDemo2 {
	public static void main(String[] args) {
		boolean result;
		MyIntNum myNum = new MyIntNum(12);
		MyIntNum myNum2 = new MyIntNum(16);

		IntPredicate ip = myNum::isFactor;
		result = ip.test(3);
		if (result) 
		     System.out.println("3 является делителем " + myNum.getNum());

		ip = myNum2::isFactor;                                                                 result = ip.test(3);                                                                   if (!result)                                                                                System.out.println("3 не является делителем " + myNum2.getNum());
	}
}

// Функциональный интерфейс для предикатов
interface IntPredicate {
	boolean test(int n);
}

class MyIntNum {
	private int v;

	MyIntNum(int x) { v = x; }

	int getNum() { return v; }
	boolean isFactor(int n) { return (v % n) == 0; }
}
