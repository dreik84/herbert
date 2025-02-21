public interface Series {
	int getNext();         // возврат следующего числа в последовательности
	
	// Возвращает массис, содержащий следующие n элементов
	default int[] getNextArray(int n) {
		return getArray(n);
	}

	default int[] skipAndGetNextArray(int skip, int n) {
		// Пропустить указанное количество элементов
		getArray(skip);

		return getArray(n);
	}

	// Закрытый метод
	private int[] getArray(int n) {
		int[] vals = new int[n];

		for (int i = 0; i < n; i++) vals[i] = getNext();

		return vals;
	}

	void reset();          // сброс
	void setStart(int x);  // установка начального значения
}
