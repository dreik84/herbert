// Демонстрация применения нескольких конструкций catch
class MultipleCatches {
	public static void main(String[] args) {
		
		try {
			int a = args.length;
			System.out.println("a = " + a);

			int b = 42 / a;
			int[] c = { 1 };
			c[42] = 99;
		
		//} catch(Exception e) {
		//	System.out.println("Перехват обощенного исключения");
		} catch(ArithmeticException e) {
			System.out.println("Деление на ноль " + e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Выход за пределы массива " + e);
		} catch(Exception e) {
                        System.out.println("Перехват обощенного исключения");
                }

		System.out.println("После блоков catch");
	}
}
