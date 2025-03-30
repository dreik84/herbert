// Пример использования аннотации @Deprecated
class AnnoDemo {
	public static void main(String[] args) {
		MyClass myObj = new MyClass("test");
		System.out.println(myObj.getMsg());
	}
}
// Пометить класс как устаревший
@Deprecated class MyClass {
	private String msg;

	MyClass(String m) { msg = m; }

	// Пометить метод внутри класса как устаревший
	@Deprecated String getMsg() { return msg; }
}
