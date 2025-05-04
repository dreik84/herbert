// Демонстрация использования текстового поля
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {
	
	JTextField jtf;
	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;

	TFDemo() {
		JFrame jfrm = new JFrame("Use a Text Field");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240, 240);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Создать текстовое поле
		jtf = new JTextField(10);

		// Установить команду действий для текстового поля
		jtf.setActionCommand("myTF");

		jbtnRev = new JButton("Reverse");

		// Добавить прослушиватели событий
		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);

		jlabPrompt = new JLabel("Enter text: ");
		jlabContents = new JLabel("");

		jfrm.add(jlabPrompt);
		jfrm.add(jtf);
		jfrm.add(jbtnRev);
		jfrm.add(jlabContents);

		jfrm.setVisible(true);
	}

	// Обработка событий кнопок
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Reverse")) {
			// Была нажата кнопка
			String orgStr = jtf.getText();
			String resStr = "";

			// Изменить порядок следования символов
			for (int i = orgStr.length() - 1; i >= 0; i--)
				resStr += orgStr.charAt(i);

			// Сохранить результирующую строку в текстовом поле
			jtf.setText(resStr);
		} else {
			jlabContents.setText("You pressed ENTER. Text is: " + 
					jtf.getText());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TFDemo();
			}
		});
	}
}
