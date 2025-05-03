// Демонстрация использования кнопок и обработки событий
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo implements ActionListener {
	JLabel jlab;

	ButtonDemo() {
		
		JFrame jfrm = new JFrame("A Button Example");
		
		jfrm.setLayout(new FlowLayout());

		jfrm.setSize(220, 200);

		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton jbtnUp = new JButton("Up");
       		JButton jbtnDown = new JButton("Down");

		// Добавить прослушиватели событий
		jbtnUp.addActionListener(this);
		jbtnDown.addActionListener(this);

		jfrm.add(jbtnUp);
		jfrm.add(jbtnDown);

		jlab = new JLabel("Press a button.");

		jfrm.add(jlab);
	
		jfrm.setVisible(true);		
	}

	// Обработать события кнопок
	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("Up")) jlab.setText("You pressed up");
		else jlab.setText("You pressed down");
	}

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ButtonDemo();
			}
		});
	}
}
