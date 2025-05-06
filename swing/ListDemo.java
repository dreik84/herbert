// Демонстрация использования простого компонента JList

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener {
	
	JList<String> jlst;
	JLabel jlab;
	JScrollPane jscrlp;

	// Создать массив имен
	String[] names = { "Sherry", "Jon", "Rachel",
			   "Sasha", "Josselyn", "Randy",
			   "Tom", "Mary", "Ken",
			   "Andrew", "Matt", "Todd" };
	ListDemo() {
		
		JFrame jfrm = new JFrame("JList Demo");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(200, 200);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Создать JList
		jlst = new JList<String>(names);

		// Установить режим выбора одиночного элемента
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		jlab = new JLabel("Please choose a name");
		
		// Добавить обработчик выбора в списке
		jlst.addListSelectionListener(this);

		jfrm.add(jscrlp);
		jfrm.add(jlab);

		jfrm.setVisible(true);
	}

	public void valueChanged(ListSelectionEvent le) {
		
		// Получить индекс выбраного элемента
		int idx = jlst.getSelectedIndex();

		if (idx != -1) jlab.setText("Current selection: " + names[idx]);
		else jlab.setText("Please choose a name");
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ListDemo();
			}
		});
	}
}
