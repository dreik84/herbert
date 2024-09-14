/*
 * Программа для расчета фактического веса на Луне
 */
class MoonWeight {
	public static void main(String[] args) {
		double myWeight = 75.0; // вес на Земле
		double ratio = 0.17;    // коэффициент весов
		
		double res = myWeight * ratio;
		System.out.println(myWeight + " - " + res);
	}
}
