// Простая программа Swing
import javax.swing.*;

public class SwingDemo {
	
	SwingDemo() {
		
		// Создать контейнер JFrame
		JFrame jfrm = new JFrame("A Simple Swing Application");

		// Установить начальные размеры фрейма
		jfrm.setSize(275, 100);

		// Прекратить работу когда пользователь закрывает приложение
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Создать текстовую метку
		JLabel jlab = new JLabel(" GUI programming with Swing.");

		// Добавить метку на панель содержимого
		jfrm.add(jlab);

		// Отобразить фреймы
		jfrm.setVisible(true);
	}

	public static void main(String[] args) {
		
		// Создать фреймы в потоке диспечеризации событий
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}	
		});
	}
}
