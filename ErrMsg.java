class ErrMsg {
	public static void main(String[] args) {
		ErrorMsg err = new ErrorMsg();

		System.out.println(err.getErrorMsg(2));
		System.out.println(err.getErrorMsg(19));
	}
}


// Возвращение объекта типа String
class ErrorMsg {
	String[] msgs = {
		"Ошибка вывода",
		"Ошибка ввода",
		"Диск переполнен",
		"Индекс вышел за границы"
	};

	// Возвращает сообщение об ошибке
	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length) return msgs[i];
		else return "Несуществующий код ошибки";
	}
}
