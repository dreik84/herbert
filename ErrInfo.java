class ErrInfo {
	public static void main(String[] args) {
		ErrorInfo err = new ErrorInfo();
		Err e;
		e = err.getErrorInfo(2);
		System.out.println(e.msg + " , уровень серьёзности: " + e.severity);
		e = err.getErrorInfo(19);
                System.out.println(e.msg + " , уровень серьёзности: " + e.severity);
	}
}

// Возвращает объект определённый программистом
class Err {
	String msg;   // сообщение об ошибке
	int severity; // код, отображающий уровень ошибки
	
	Err(String m, int s) {
		msg = m;
		severity = s;
	}
}

class ErrorInfo {
	String[] msgs = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Диск переполнен",
		"Индекс вышел за границы"
	};
	int[] howBad = { 3, 3, 2, 4 };

	Err getErrorInfo(int i) {
		if (i >= 0 & i < msgs.length) return new Err(msgs[i], howBad[i]);
		else return new Err("Несуществующий код ошибки", 0);
	}
}
