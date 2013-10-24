package Graphics;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PanelDemo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;

	public static void main(String[] args) {
		PanelDemo radioGui = new PanelDemo();
		radioGui.setVisible(true);
	}

	public PanelDemo() {
		setSize(WIDTH, HEIGHT);
		setLocation(30, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Panel with Radio Buttons");

		JPanel radioButtonPanel = new JPanel();
		radioButtonPanel.setBackground(Color.white);
		radioButtonPanel.setLayout(new GridLayout(0, 3));

		JRadioButton redRadioButton = new JRadioButton("Red", true);
		redRadioButton.addActionListener(this);
		radioButtonPanel.add(redRadioButton);

		JRadioButton blueRadioButton = new JRadioButton("Blue", false);
		blueRadioButton.addActionListener(this);
		radioButtonPanel.add(blueRadioButton);

		JRadioButton greenRadioButton = new JRadioButton("Green", false);
		greenRadioButton.addActionListener(this);
		radioButtonPanel.add(greenRadioButton);

		ButtonGroup colourChoices = new ButtonGroup();
		colourChoices.add(redRadioButton);
		colourChoices.add(blueRadioButton);
		colourChoices.add(greenRadioButton);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.RED);
		contentPane.add(radioButtonPanel, BorderLayout.EAST);
	}

	public void actionPerformed(ActionEvent e) {
		Container contentPane = getContentPane();
		if (e.getActionCommand().equals("Red")) {
			contentPane.setBackground(Color.RED);
		} else if (e.getActionCommand().equals("Green")) {
			contentPane.setBackground(Color.GREEN);
		} else if (e.getActionCommand().equals("Blue")) {
			contentPane.setBackground(Color.BLUE);
		}
	}
}
