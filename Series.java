public interface Series {
	int getNext();         // возврат следующего числа в последовательности
	
	// Возвращает массис, содержащий следующие n элементов
	default int[] getNextArray(int n) {
		int[] vals = new int[n];

		for (int i = 0; i < n; i++) vals[i] = getNext();

		return vals;
	}

	void reset();          // сброс
	void setStart(int x);  // установка начального значения
}
