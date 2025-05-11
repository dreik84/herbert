import java.io.*;

/**
 * В этом классе демонстрируется использование 
 * документирующих комментариев.
 * @author Herbert Schildt
 * @version 1.2
 */
public class SquareNum {
	
	/**
	 * Этот метод возвращает квадрат числа num.
	 * Описание содержит несколько строк.
	 * Количество строк может быть произвольным.
	 * @param num Значение возводимое в квадрат.
	 * @return Квадрат числа num.
	 */
	public double square(double num) {
		return num * num;
	}

	/**
	 * Этот метод вводит число от пользователя.
	 * @return Введенное значение типа double.
	 * @throws IOException Возникает в случае ошибки при вводе.
	 * @see IOException
	 */
	public double getNumber() throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader inData = new BufferedReader(isr);
		String str;

		str = inData.readLine();
		return (new Double(str)).doubleValue();
	}

	/**
	 * Этот метод демонстрирует применение square().
	 * @param args Не используется.
	 * @throws IOException Возникает в случае ошибки при вводе.
	 * @see IOExeption
	 */
	public static void main(String[] args) throws IOException {
		
		SquareNum ob = new SquareNum();
		double val;

		System.out.println("Введите значение для возведения в квадрат: ");
		
		val = ob.getNumber();
		val = ob.square(val);

		System.out.println("Результат возведения в квадрат: " + val);
	}
}
