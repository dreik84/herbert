// Реализация интерфейса Series
class ByTwos implements Series {
	int start;
	int val;
	int prev;

	ByTwos() {
		start = 0;
		val = 0;
		prev = -2;
	}

	public int getNext() {
		val += 2;
		return val;
	}

	public void reset() {
		val = start;
		prev = start - 2;
	}

	public void setStart(int x) {
		start = x;		
		val = x;
		prev = x - 2;
	}

	int getPrevious() {
		return prev;
	}
}
