class Client implements Callback {
	public static void main(String[] args) {
		
		Callback c = new Client();
		AnotherClient ac = new AnotherClient();
		c.callback(2);
		//c.nonIfaceMeth();
		c = ac;
		c.callback(2);


	}

	public void callback(int param) {
		System.out.println("callback() вызывается со значением " + param);
	}

	void nonIfaceMeth() {
		System.out.println("собственный метод класса");
	}
}

class AnotherClient implements Callback {
	
	public void callback(int p) {
		System.out.println("callback() from AnotherCallback");
	}
}

interface Callback {
	void callback(int param);
}
