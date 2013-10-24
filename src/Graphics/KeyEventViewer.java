package Graphics;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class KeyEventViewer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;

	public KeyEventViewer() {
		super();
		setSize(WIDTH, HEIGHT);
		setLocation(30, 40);

		// register the window listener to close the window
		WindowCloser appListener = new WindowCloser();
		addWindowListener(appListener);

		// register the mouse listener to respond to all mouse events
		KeyHandler keyListener = new KeyHandler();
		addKeyListener(keyListener);
	}

	private class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	private class KeyHandler extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			System.out.println("KEY EVENT: Key Pressed");
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyReleased(e);
			System.out.println("KEY EVENT: Key Released");
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyTyped(e);
			System.out.println("KEY EVENT: Key Typed");
		}
		
	}
	
	public static void main(String[] args) {
		KeyEventViewer myWindow = new KeyEventViewer();
		myWindow.setVisible(true);
	}
}
