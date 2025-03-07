// Запись и последующее чтение двоичных данных
import java.io.*;

class RWData {
	public static void main(String[] args) {
		int i = 10;
		double d = 1023.56;
		boolean b = true;

		// Записать ряд значений
		try (DataOutputStream dataOut =
				new DataOutputStream(new FileOutputStream("testdata")))
		{
			System.out.println("Запись " + i);
			dataOut.writeInt(i);
			
			System.out.println("Запись " + d);                                                       dataOut.writeDouble(d);

			System.out.println("Запись " + b);                                                       dataOut.writeBoolean(b);

			System.out.println("Запись " + 12.2 * 7.4);
			dataOut.writeDouble(12.2 * 7.4);
		}
		catch (IOException exc) {
			System.out.println("Ошибка при записи");
			return;
		}

		System.out.println();

		// Прочитать ранее записаные значения
		try (DataInputStream dataIn =
                                new DataInputStream(new FileInputStream("testdata")))
		{
			i = dataIn.readInt();
			System.out.println("Чтение " + i);

			d = dataIn.readDouble();
			System.out.println("Чтение " + d);

			b = dataIn.readBoolean();
			System.out.println("Чтение " + b);

			d = dataIn.readDouble();
			System.out.println("Чтение " + d);
		}
		catch (IOException exc) {
                        System.out.println("Ошибка при чтении");
                }
	}
}
