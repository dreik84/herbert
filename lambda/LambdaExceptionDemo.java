import java.io.*;

class LambdaExceptionDemo {
	public static void main(String[] args) {
		
		MyIOAction myIO = (rdr) -> {
			int ch = rdr.read(); // может сгенерировать исключение

			// ...
			return true;
		};
	}
}

interface MyIOAction {
	boolean ioAction(Reader rdr) throws IOException;
}
