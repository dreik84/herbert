// Использование стандартного метода
class DefaultMethodDemo {
	public static void main(String[] args) {
		MyIFImp obj = new MyIFImp();

		System.out.println("Идентификатор пользователя " + obj.getUserID());
		System.out.println("Идентификатор администратора " + obj.getAdminID());
	}
}

public interface MyIF {
	// Это "нормальный" метод интерфейса
	int getUserID();

	// Это стандартный метод
	default int getAdminID() {
		return 1;
	}
}

// Реализация MyIF
class MyIFImp implements MyIF {
	// Необходимо реализовать только метод getUserID()
	public int getUserID() {
		return 100;
	}
}



