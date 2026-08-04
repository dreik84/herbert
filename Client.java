class Client implements Callback {
	public static void main(String[] args) {
		
		Client c = new Client();	
		c.callback(2);
		c.nonIfaceMeth();

	}

	public void callback(int param) {
		System.out.println("callback() вызывается со значением " + param);
	}

	void nonIfaceMeth() {
		System.out.println("собственный метод класса");
	}
}

interface Callback {
	void callback(int param);
}
