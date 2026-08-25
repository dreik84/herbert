// Демонстрация применения finally
class FinallyDemo {
	
	// генерация исключения внутри метода
	static void procA() {
		try {
			System.out.println("Внутри метода procA");
			throw new RuntimeException("Демонстрация");
		} finally {
			System.out.println("Блок finally метода procA");
		}
	}

	// возврат управления изнутри блока try
	static void procB() {
		try {
			System.out.println("Внутри метода procB");
			return;
		} finally {
			System.out.println("Блок finally метода procB");
		}
	}

	// обычный блок try
	static void procC() {
		try {
                        System.out.println("Внутри метода procC");
                } finally {
                        System.out.println("Блок finally метода procC");
                }
	}

	public static void main(String[] args) {
		try {
			procA();
		} catch(Exception e) {
			System.out.println("Исключение перехвачено");
		}

		procB();
		procC();
	}
}
