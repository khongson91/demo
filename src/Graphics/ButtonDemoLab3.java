package Graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemoLab3 extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField note;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public static void main(String[] args) {
		ButtonDemoLab3 buttonGui = new ButtonDemoLab3();
		buttonGui.setVisible(true);
	}

	public ButtonDemoLab3() {
		setSize(WIDTH, HEIGHT);
		setLocation(30, 30);
		addWindowListener(new WindowDestroyer());
		setTitle("Forwards or Backwards?");
		Container contentPane = getContentPane();

		contentPane.setLayout(new FlowLayout());

		JButton stopButton = new JButton("Green");
		stopButton.addActionListener(this);
		contentPane.add(stopButton);

		JButton goButton = new JButton("Red");
		goButton.addActionListener(this);
		contentPane.add(goButton);

		note = new JTextField(20);
		note.setText("type here");
		contentPane.add(note);
	}

	private class WindowDestroyer extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();

		if (e.getActionCommand().equals("Green")) {
			contentPane.setBackground(Color.GREEN);
			StringBuffer text = new StringBuffer(note.getText());
			note.setText(text.reverse().toString());
			
		} else if (e.getActionCommand().equals("Red")) {
			contentPane.setBackground(Color.RED);
			StringBuffer text = new StringBuffer(note.getText());
			note.setText(text.reverse().toString());
		}
	}
}
