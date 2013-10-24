package Graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;
import javax.swing.*;

public class SlideDemo extends JFrame implements ChangeListener, ActionListener {
	
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	private JLabel text;
	private JSlider redBar, greenBar, blueBar;
	public int redValue, greenValue, blueValue;
	SlideDemo parent;

	public static void main(String[] args) {
		SlideDemo slideGui = new SlideDemo();
		slideGui.setVisible(true);
	}

	public SlideDemo() {
		setSize(WIDTH, HEIGHT);
		parent = this;
		setLocation(30, 30);
		setTitle("Color Window Creator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel slider = new JPanel();
		slider.setLayout(new GridLayout(0, 3));

		redBar = new JSlider(JSlider.VERTICAL, 0, 255, 0);
		redBar.setPreferredSize(new Dimension(100, 30));
		redBar.addChangeListener(this);
		redBar.setPaintLabels(true);
		redBar.setPaintTicks(true);
		redBar.setMajorTickSpacing(30);
		redBar.setMinorTickSpacing(5);

		greenBar = new JSlider(JSlider.VERTICAL, 0, 255, 0);
		greenBar.setPreferredSize(new Dimension(100, 30));
		greenBar.addChangeListener(this);
		greenBar.setPaintLabels(true);
		greenBar.setPaintTicks(true);
		greenBar.setMajorTickSpacing(30);
		greenBar.setMinorTickSpacing(5);

		blueBar = new JSlider(JSlider.VERTICAL, 0, 255, 0);
		blueBar.setPreferredSize(new Dimension(100, 30));
		blueBar.addChangeListener(this);
		blueBar.setPaintLabels(true);
		blueBar.setPaintTicks(true);
		blueBar.setMajorTickSpacing(30);
		blueBar.setMinorTickSpacing(5);

		slider.add(redBar);
		slider.add(greenBar);
		slider.add(blueBar);

		JButton create = new JButton("Create");
		create.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new NewJFrame(parent);
			}
		});
		contentPane.add(slider, BorderLayout.WEST);
		contentPane.add(create, BorderLayout.EAST);
	}

	class NewJFrame extends JFrame {

		private static final long serialVersionUID = 1L;

		public NewJFrame(JFrame parent) {
			setSize(400, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("Popup Window");
			Container container = this.getContentPane();
			container.setBackground(new Color(redValue, greenValue, blueValue));
			text = new JLabel("red: " + redValue + " green: " + greenValue
					+ " blue: " + blueValue);
			container.add(text);
			setLocationRelativeTo(parent);

			setVisible(true);
		}
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == redBar) {
			redValue = redBar.getValue();
		} else if (arg0.getSource() == greenBar) {
			greenValue = greenBar.getValue();
		} else if (arg0.getSource() == blueBar) {
			blueValue = blueBar.getValue();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}