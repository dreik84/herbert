// Аргументы переменной длины и неоднозначность
class VarArgs3 {
	
	static void vaTest(int ... v) {
		// 
	}

	static void vaTest(int n, int ... v) {
		// 
	}

	static void vaTest(boolean ... v) {
		//
	}

	public static void main(String[] args) {
		
		vaTest(true, false, false); // нормально
		vaTest(1, 2, 3);            // неоднозначность
		vaTest();                   // неоднозначность
	}
}
