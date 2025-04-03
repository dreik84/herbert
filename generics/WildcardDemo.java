// Демонстрация использования подстановочного знака
class WildcardDemo {
	public static void main(String[] args) {
		NumericFns<Integer> iOb = new NumericFns<Integer>(6);
		NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
		NumericFns<Long> lOb = new NumericFns<Long>(5L);

		System.out.println("Сравнение iOb и dOb");
		if (iOb.absEqual(dOb)) System.out.println("Абсолютные значения равны");
		else System.out.println("Абсолютные значения отличаются");

		System.out.println();

		System.out.println("Сравнение iOb и lOb");                                             if (iOb.absEqual(lOb)) System.out.println("Абсолютные значения равны");                else System.out.println("Абсолютные значения отличаются");
	}
}

// Использование подстановочного знака
class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}

	double reciprocal() {
		return 1 / num.doubleValue();
	}

	double fraction() {
		return num.doubleValue() - num.intValue();
	}

	boolean absEqual(NumericFns<?> ob) {
		if (Math.abs(num.doubleValue()) == 
				Math.abs(ob.num.doubleValue())) return true;
		return false;
	}
}
