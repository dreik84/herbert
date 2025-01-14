// Аргументы неопределенной длины, перегрузка и неоднозначность
class VarArgs4 {
	
	// Параметр переменной длины типа int
	static void vaTest(int ... v) {
		// ...	
	}

	// Параметр переменной длины типа boolean
        static void vaTest(boolean ... v) {
                // ...
        }

	public static void main(String[] args) {
		vaTest(1, 2, 3);             // Нормально
		vaTest(true, false, false);  // Нормально
		vaTest();                    // Ошибка: Неоднозначность!
	}
}
