import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public static void main(String[] args) {
		new App();

	}
	public App() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setTitle("GPA Calculator");
		System.out.println("Launched");
		frame.setVisible(true);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		frame.add(panel, BorderLayout.CENTER);
	}

}
