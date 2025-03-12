// В этой программе вычисляется среднее значение
import java.io.*;

class AvgNums {
	public static void main(String[] args) throws IOException {
		// Создать экземпляр BufferedReader с использованием System.in
		BufferedReader br = new BufferedReader(new 
			InputStreamReader(System.in, System.console().charset()));

		String str;
		int n;
		double sum = 0.0;
		double avg, t;

		System.out.println("Сколько чисел вы будете вводить: ");
		str = br.readLine();

		try {
			n = Integer.parseInt(str); // строка в int
		}
		catch (NumberFormatException exc) {
			System.out.println("Недопустимый формат");
			n = 0;
		}

		System.out.println("Введите " + n + " значений");
		for (int i = 0; i < n; i++) {
			System.out.print(": ");
			str = br.readLine();
			try {
				t = Double.parseDouble(str); // строка в double
			}
			catch (NumberFormatException exc) {
				System.out.println("Недопустимый формат");
				t = 0.0;
			}
			sum += t;
		}
		avg = sum / n;
		System.out.println("Среднее значение равно " + avg);
	}
}
