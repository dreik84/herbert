class StaticError {
	int denom = 3;          // нормальная переменная экземпляра
	static int val = 1024;  // статическая переменная
	
	// Ошибка доступа к нестатической переменной
	static int valDivDenom() {
		return val/denom; // Не скомпилируется
	}
}
