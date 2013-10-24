package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemoLab1 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField note;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public static void main(String[] args) {
		ButtonDemoLab1 buttonGui = new ButtonDemoLab1();
		buttonGui.setVisible(true);
	}

	public ButtonDemoLab1() {
		setSize(WIDTH, HEIGHT);
		setLocation(30, 30);
		addWindowListener(new WindowDestroyer());
		setTitle("ButtonDemoLab");
		Container contentPane = getContentPane();

		contentPane.setLayout(new FlowLayout());

		JButton stopButton = new JButton("Forward");
		// stopButton.addActionListener(this);
		contentPane.add(stopButton);

		JButton goButton = new JButton("Backward");
		// goButton.addActionListener(this);
		contentPane.add(goButton);

		note = new JTextField(20);
		contentPane.add(note);
	}

	private class WindowDestroyer extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	// public void actionPerformed(ActionEvent e) {
	// Container contentPane = getContentPane();
	// if (e.getActionCommand().equals("Red")) {
	// contentPane.setBackground(Color.RED);
	// } else if (e.getActionCommand().equals("Green")) {
	// contentPane.setBackground(Color.GREEN);
	// }
	// }
}
